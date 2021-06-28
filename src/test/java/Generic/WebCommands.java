package Generic;

import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class WebCommands {
    private static WebDriver driver = null;

    public static void openHotels() {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.hotels.com/");
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void sleep(int milSec) {
        try {
            Thread.sleep(milSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement getElement(By locator) {
        // wait for 30sec before declaring element is not found
        Wait fWait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });

        return element;
    }

    public String getElementText(By locator) {
        return getElement(locator).getText();
    }

    public void clickThis(By locator) {
        getElement(locator).click();
    }

    public WebElement getElement(String xPath) {
        return getDriver().findElement(By.xpath(xPath));
    }

    public List<WebElement> getElements(By locator) {
        // wait for 30sec before declaring element is not found
        Wait fWait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Elements are not found within 30 seconds");

        List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return elements;
    }

}
