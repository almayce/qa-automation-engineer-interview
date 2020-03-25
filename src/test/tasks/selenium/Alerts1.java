package selenium;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

    /**
     * Что произойдет в каждом из четырех примеров?
    */

    private WebDriver driver;
    private WebElement element;

    @Before
    public void before() {
        driver = new ChromeDriver();
        element = driver.findElement(By.id("id"));
    }

    public void example1() {
        switchToAlert().accept();
    }

    public void example2() {
        switchToAlert().dismiss();
    }

    public void example3() {
        switchToAlert().getText();
    }

    public void example4() {
        switchToAlert().sendKeys("Text");
    }

    private Alert switchToAlert()  {
        return driver.switchTo().alert();
    }
}
