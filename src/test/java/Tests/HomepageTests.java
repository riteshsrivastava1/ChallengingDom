package Tests;

import Util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import pageobjects.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class HomepageTests extends TestBase {

    private Homepage homepage;

    @BeforeMethod
    public void setUpEnvBeforeTest() {
        homepage = new Homepage(getDriver()).openHomePage();
    }

    @Test(groups = "mobile", description = "sample homepage test - mobile", priority = 0)
    public void mobileTest() {
        testPageHeading();
    }

    @Test(groups = "tablet", description = "sample homepage test - tablet", priority = 1)
    public void tabletTest() {
        testPageHeading();
        testChallengingDomHeader();
    }

    @Test(groups = "desktop", description = "sample homepage test - desktop", priority = 3)
    public void desktopTest() {
        testPageHeading();
        testChallengingDomHeader();
        testValidateDomTableStructure();
    }

   @Test(groups = "desktop", description = "test to validate Dom Table Header row columns headings, expected data is provided via data provider",
           dataProvider ="testData-TableHeader" , dataProviderClass=dataProvider.tableData.class , priority = 4)
    public void testValidateDomTableHeader(String scenario, String [] testDataSet) {
        Assert.assertEquals(homepage.getTableRows().size(), 11 );
        WebElement headerRow = homepage.getTableRows().get(0);
        List<WebElement> Cols = headerRow.findElements(By.tagName("th"));
        Assert.assertEquals(Cols.size(), 7);
        for(int i=0; i<Cols.size(); i++)
        {
            Assert.assertEquals(Cols.get(i).getText(), testDataSet[i], "Validate" + scenario + "for row " +i);
        }
    }

    @Test(groups = "desktop", description = "test to validate Challenging Dom Table data of all rows, expected data is provided via data provider",
            dataProvider ="testData-TableData" , dataProviderClass=dataProvider.tableData.class , priority = 4)
    public void testValidateDomTableData(String scenario,int rowNum, String [] testDataSet) {
        Assert.assertEquals(homepage.getTableRows().size(), 11 );
            List<WebElement> Cols = homepage.getTableRows().get(rowNum).findElements(By.tagName("td"));
            Assert.assertEquals(Cols.size(), 7);
            for(int col=0; col<Cols.size(); col++) {
                Assert.assertEquals(Cols.get(col).getText(), testDataSet[col],
                        "Validate Header Column number of " + col);
            }
    }

    @Test(groups = {"desktop", "tablet"}, description = "test to Challenging Dom table structure")
    private void testValidateDomTableStructure() {
        Assert.assertEquals(homepage.getTableRows().size(), 11 ,"table row size validation");

        for(int i=1; i<homepage.getTableRows().size(); i++) {
            WebElement row = homepage.getTableRows().get(i);
            Assert.assertEquals(row.findElements(By.tagName("td")).size(), 7,
                    "table Header row Column size validation");
        }
    }

    @Test(groups = "desktop", description = "test to validate Side dynamic buttons, expected data is provided via data provider",
            dataProvider ="testData-Button" , dataProviderClass=dataProvider.tableData.class , priority = 5)
    private void testValidateButtons(int buttonIndex, String btnText, String btnColor) {
        Assert.assertEquals(homepage.getButton().size(), 3 ,"To validation Button index of " + buttonIndex);
        Assert.assertEquals(Color.fromString(homepage.getButton().get(buttonIndex).getCssValue("background-color")).asHex(),
                 btnColor ,"To validation Button index of " + buttonIndex);
        homepage.getButton().get(buttonIndex).click();
    }

    @Test(groups = {"desktop", "tablet", "mobile"},  description = "test to validate Homepage Heading/Title")
    private void testPageHeading() {
        Assert.assertEquals(homepage.getPageTitle(), "The Internet" , "Page Title validation");
    }

    @Test(groups = {"desktop", "tablet", "mobile"}, description = "test to validate Challenging Dom Header text")
    private void testChallengingDomHeader() {
        Assert.assertEquals(homepage.getChallengingDomHeader(), "Challenging DOM",
                "Challenging DOM Header validation" );
    }

    @Test(groups = "desktop", description = "test to validate Challenging Dom Para text",
            dataProvider ="testData-Para" , dataProviderClass=dataProvider.tableData.class , priority = 5)
    private void testChallengingDomPara(String paraText) {
        Assert.assertEquals(homepage.getChallengingDomPara(), paraText, "Challenging DOM Para validation" );
    }

    @Test(groups = {"desktop", "tablet"}, description = "test to validate presence of GitHub Image on right hand corer and navigation link" )
    private void testGitHubImg() throws InterruptedException {
        Assert.assertEquals(homepage.getGitHubImg().getAttribute("alt"), "Fork me on GitHub",
                "Challenging DOM Para validation" );
        homepage.getGitHubImg().click();
        wait(20);
        Assert.assertTrue((homepage.getPageTitle().contains("GitHub - saucelabs")), "Page Title validation");
    }

}