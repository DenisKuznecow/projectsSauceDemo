package TestCart;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RequiredChecks {
    WebDriver driver;

    @BeforeSuite
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Parameters({"username","incorrectpassword"})
    @Test(description="Performs an unsuccessful login and checks the resulting error message")
    public void testLoginNOK(String username, String incorrectpassword) {

        LoginPage lp = new LoginPage(driver);
        ErrorPage ep = lp.incorrectLogin(username, incorrectpassword);
        Assert.assertEquals(ep.getErrorText(), "The username and password could not be verified.");
    }

    @AfterSuite
    public void tearDown() {

        driver.quit();
    }
}
