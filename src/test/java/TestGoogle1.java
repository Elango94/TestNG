import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class TestGoogle1 {
    public TestLeaf testLeaf;
    public OpenAmazon openAmazon;
    public WebDriver driver;

    public TestGoogle1() {
        testLeaf = new TestLeaf();
        openAmazon = new OpenAmazon();
    }

    @BeforeSuite
    public void driverInit() {
        driver = new ChromeDriver();

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

}
