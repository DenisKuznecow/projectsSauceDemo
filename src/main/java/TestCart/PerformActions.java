package TestCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class PerformActions {
    private WebDriver driver;

    public void ErrorPage(WebDriver driver) {

        this.driver = driver;
    }

    public String getErrorText() {

        return driver.findElement(By.className("error")).getText();
    }

}
