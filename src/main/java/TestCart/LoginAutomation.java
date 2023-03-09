package TestCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class LoginAutomation {
WebDriver driver = new ChromeDriver();
    WebElement username=driver.findElement(By.id("//*[@id=\"user-name\"]"));
    WebElement password=driver.findElement(By.id("//*[@id=\"password\"]"));
    WebElement enterLogin= driver.findElement(By. xpath("//*[@id=\"login-button\"]"));




    @Test
    public void loginValid (String login, String pass) {
        username.sendKeys(login);
        password.sendKeys(pass);
        enterLogin.click();


    }

}