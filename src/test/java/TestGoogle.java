import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestGoogle {
    public TestLeaf testLeaf;
    public OpenAmazon openAmazon;
    public WebDriver driver;
    public ExtentReports extentReports;
    public ExtentTest extentTest;

    public TestGoogle() {
        testLeaf = new TestLeaf();
        openAmazon = new OpenAmazon();
    }

    @BeforeSuite
    public void driverInit() {

        driver = new ChromeDriver();
    }

    public void setUp() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("D:/IntelliiJ/Code/SeleniumMaven/TestNG/test-output/extent-report");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
        extentTest.warning("a");

    }

    @Test(priority = 0)
    public void runGoogle() {
        testLeaf.openGoogle(driver);
    }

    @Test(priority = 1)
    public void runAmazon() {
        openAmazon.openAmazon(driver);
    }

    @AfterSuite
    public void driverEnd() {
        driver.close();
    }

    public void tearDown() {
        extentReports.flush();
    }

}
