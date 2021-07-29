# ChallengingDom


Challenging DOM
This is example of End-to-End Testing for Challenging DOM webpage (https://the-internet.herokuapp.com/challenging_dom)

Have following main tests inlcuded into repo:
1. Validation of HomePage title
2. Validation of Challenging Dom header 
3.  Validation of Challenging Dom Paragraph text
4.  Validation of Side Buttons
5.  Validatio DOM Table Structure 
6.  Validation of DOM table header
7. Validation of DOM table data
8. Validation of GitHub Hyperlink
9.  Sample validation of test on Mobile, Tablet and Desktop mode
10.  Running tests on chrome and firefox browsers.

<h1> Installation: </h1>
<h3> Pre-Condition: </h3> 
User should have Java, IntelliJ IDEA, Git and maven installed

Clone the git Repo by running following command on git bash:
git clone https://github.com/riteshsrivastava1/ChallengingDom.git

once clonned then launch IntelliJ IDEA and open the ChallengingDom project.
Perform maven install to get all required dependencies by running :
mvn clean install

<h1> Code structure: </h1>
Repository is using TestNG framework and is being categories as follow: 

pageobject properties are kept under 'pageobject' package i.e src/main/java/pageobjects/..

testdata is being maintained under 'dataProvider' package i.e src/main/java/dataProvider/..

helper utilities methods are kept under 'Util' package i.e src/test/java/Util/..

and all tests are kept under 'Tests' package i.e. i.e src/test/java/Tests/..

testNG suits are maintained at src/testngsuites

<h1> Running a test: </h1> 
to run test on chrome browser right click on chromesuite.xml and select Run.

to run test on firefox browser right click on firefoxsuite.xml and select Run.
