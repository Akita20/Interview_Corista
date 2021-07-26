package utilis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /*
    Method to assert title
     */
    public static void titleVerification(String expectedTitle) {
        String actualTitle = Driver.get().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }


    // create method name: wait
    // converting milliseconds to seconds
    // handle checked exception
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("something happened in  sleep method");
        }

    }

    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elementText = new ArrayList<>();
        for (WebElement el : list) {
            elementText.add(el.getText());
        }
        return elementText;

    }

    public static void switchToWindows(String targetTitle) {
        String origin = Driver.get().getWindowHandle();
        for (String handle : Driver.get().getWindowHandles()) {
            Driver.get().switchTo().window(handle);
            if (Driver.get().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.get().switchTo().window(origin);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(element).perform();
    }

    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public static WebElement waitForClickability(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), timeout);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    // get element text as a string
    public static List<String> getElementText(List<WebElement> webElementList) {
        // placeholder empty list of web element
        List<String> webElementAsString = new ArrayList<>();
        // Looping through list of web elements and storing text into
        for (WebElement each : webElementList) {
            webElementAsString.add(each.getText());
        }
        // returning final List<String>
        return webElementAsString;
    }
    public static void clickElement(String xpath) {
        waitUntilClickable(getElement(xpath)).click();
    }
    public static WebElement waitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static WebElement getElement(String xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
        return wait.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath(xpath)));
    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
