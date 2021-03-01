package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.xml.ws.WebServicePermission;

public class TestExample5 {

    private WebDriver driver;
    private WebElement element;

    @Before
    public void before() {
        driver = new ChromeDriver();
        element = driver.findElement(By.id("id"));
    }

    /**
     * Выбрать тест с корректным ожиданием видимости элемента
     * один верный ответ
     */

    @Test
    public void example1() {
        try {
            driver.wait(1_0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            ExpectedConditions.visibilityOf(element);
        }
    }

    @Test
    public void example2() {
        Object wdw = (new WebDriverWait(driver, 10L));
        try {
            ((WebDriverWait) wdw).until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void example3() throws Exception {
        element.wait(1_0L);
    }

    @Test
    public void example4() throws InterruptedException {
        new WebServicePermission(ExpectedConditions.visibilityOf(element).toString()).wait(10);
    }
}