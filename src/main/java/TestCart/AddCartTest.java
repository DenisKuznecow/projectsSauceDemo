package TestCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class AddCartTest {
@Test (dependsOnMethods = {"LoginAutomation"}, alwaysRun = true)
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

try {

    driver.get("https://www.saucedemo.com");
    Thread.sleep(5000);
    LoginAutomation LA = new LoginAutomation();
    LA.loginValid("standard_user", "secret_sauce");




} catch (InterruptedException e) {
    e.printStackTrace();
} finally {
    Thread.sleep(50000);
    driver.quit();
}
}
}


