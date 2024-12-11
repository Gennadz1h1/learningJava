package core;

import hooks.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Browser extends Hooks {

//    public void anotherWindowIsOpened(){
//        wait.until(driver -> driver.getWindowHandles().size() > 1);
//        Set<String> handles = driver.getWindowHandles();
//        for (String handle : handles) {
//            if (!handle.equals(driver.getWindowHandle())) {
//                driver.switchTo().window(handle);
//                break;
//            }
//        }
//    }

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

    public String getMainWindowHandle() {
        return driver.getWindowHandle();
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

    public Boolean isElementFullyVisibleJS(By locator){
        return  (Boolean) js.executeScript(
                "var elem = arguments[0];" +
                        "var rect = elem.getBoundingClientRect();" +
                        "return (rect.top >= 0 && rect.left >= 0 && rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) && rect.right <= (window.innerWidth || document.documentElement.clientWidth));",
                waitForElementToBeVisible(locator));
    }

    public Boolean isElementFullyVisible(By locator){
        try {
            waitForWebElementToBeVisible(waitForElementToBeVisible(locator));
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void hover(By locator) {
        waitForElementToBeVisible(locator);
        actions.moveToElement(waitForElementToBeVisible(locator)).perform();
    }

    public Browser click(By locator) {
        waitForElementToBeClickable(locator).click();
        return this;
    }

    public Browser click(WebElement element) {
        element.click();
        return this;
    }

    public void closeAllExceptMainWindow(String mainHandle) {
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                driver.close();
            }
        }
        driver.switchTo().window(mainHandle);
    }

    public void sendKeys(By locator, String value) {
        WebElement element = this.waitForElementToBeVisible(locator);
        element.sendKeys(value);
    }

    public void switchToAnotherWindow(String mainHandle) {
        wait.until(driver -> driver.getWindowHandles().size() > 1);
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (!handle.equals(mainHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    public void switchToMainWindow(String mainHandle) {
        driver.switchTo().window(mainHandle);
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForWebElementToBeVisible(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
