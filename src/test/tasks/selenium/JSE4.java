package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE4 {

    private WebDriver driver;
    private WebElement element;

    @Before
    public void before() {
        driver = new ChromeDriver();
        element = driver.findElement(By.id("id"));
    }

    @Test
    public void example() {
        /*
         * Что выполнит этот код?
         */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='2px groove green'", element);
    }
}