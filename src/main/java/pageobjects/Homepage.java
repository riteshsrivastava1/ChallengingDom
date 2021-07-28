package pageobjects;

import com.google.common.collect.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static constants.URLs.HOMEPAGE;
import static helpers.WaitHelper.waitForPageLoad;

public class Homepage extends PageObject {

    By challengingDomHeading=By.xpath("//div[@class=\"example\"]/h3");
    By challengingDomPara = By.xpath("//*[@id=\"content\"]/div/p");
    By domTable = By.xpath("//div[@class=\"large-10 columns\"]/table/thead");
    By sideButtons = By.xpath("//div[@class='large-2 columns']//a");
    By gitHubImage = By.xpath("//img[contains(@src, '/img/forkme_right_green_007200.png')]");

    public Homepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,  this);
    }

    public Homepage openHomePage() {
        driver.get(HOMEPAGE);
        waitForPageLoad(driver);
        return new Homepage(driver);
    }

    public String getPageTitle(){
        return    driver.getTitle();
    }

    public String getChallengingDomHeader(){
        return    driver.findElement(challengingDomHeading).getText();
    }

    public String getChallengingDomPara(){
        return driver.findElement(challengingDomPara).getText();
    }
    public List<WebElement> getTableRows(){
        WebElement table = driver.findElement(domTable);
        List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
        return tableRows;
    }

    public List<WebElement> getButton(){
        return driver.findElements(sideButtons);
    }

    public WebElement getGitHubImg(){
        return driver.findElement(gitHubImage);
    }
}
