package core;

import hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Browser extends Hooks {


    public void anotherWindowIsOpened(){
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public List<WebElement> getAllElements(By list) {
        WebElement webElement = waitForElementToBeVisible(list);
        return webElement.findElements(list);
    }

    public String getAttributeFromElement(By locator, String attribute){
        WebElement webElement = waitForElementToBeVisible(locator);
        return webElement.getAttribute(attribute);
    }

    public String getCssValue(By locator, String value){
        waitForElementToBeVisible(locator);
        return waitForElementToBeVisible(locator).getCssValue(value);
    }

    public String getText(By locator) {
        WebElement webElement = waitForElementToBeVisible(locator);
        return webElement.getText();
    }

    public List<String> getTexts(List<WebElement> elements) {
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public String getCurrentURL(By locator){
        waitForElementToBeVisible(locator);
        return driver.getCurrentUrl();
    }

    public Boolean elementIsVisible(By locator){
        return  (Boolean) js.executeScript(
                "var elem = arguments[0];" +
                        "var rect = elem.getBoundingClientRect();" +
                        "return (rect.top >= 0 && rect.left >= 0 && rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && rect.right <= (window.innerWidth || document.documentElement.clientWidth));",
                waitForElementToBeVisible(locator));
    }

    public void hover(By locator) {
        waitForElementToBeVisible(locator);
        actions.moveToElement(waitForElementToBeVisible(locator)).perform();
    }

    public Browser click(By locator) {
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(locator));
        signInButton.click();
        return this;
    }

    public Browser click(WebElement element) {
        element.click();
        return this;
    }

    public void sendKeys(By locator, String value) {
        WebElement element = this.waitForElementToBeVisible(locator);
        element.sendKeys(value);
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForWebElementToBeVisible(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
