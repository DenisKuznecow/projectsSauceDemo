package TestCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PageObjectTestApplication {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        if(!driver.getTitle().equals("Good Test")) {
            driver.get("http://saucedemo.com");
        }
    }

    public ErrorPage incorrectLogin(String username, String password) {

        driver.findElement(By.id("user-name")).sendKeys("test");
        driver.findElement(By.id("password")).sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"login-button\"]]")).click();
        return new ErrorPage(driver);
    }

    public HomePage correctLogin(String username, String password) {

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        return new HomePage(driver);
    }
}
