package core;

import hooks.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;
import java.util.stream.Collectors;

public class Browser extends Hooks {

    public List<WebElement> getAllElements(By list) {
        WebElement webElement = waitForElementToBeVisible(list);
        return webElement.findElements(list);
    }

    public String getCssValue(By locator, String value){
        waitForElementToBeVisible(locator);
        return waitForElementToBeVisible(locator).getCssValue(value);
    }

    public String getText(By locator) {
        WebElement webElement = waitForElementToBeVisible(locator);
        return webElement.getText();
    }

    public List<String> getTextsFromElements(List<WebElement> elements) {
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void hoverToElement(By locator) {
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

    public Browser sendKeys(By locator, String value) {
        WebElement element = this.waitForElementToBeVisible(locator);
        element.sendKeys(value);
        return this;
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForWebElementToBeVisible(WebElement webElement) {
        return wait.until(ExpectedConditions.visibilityOf(webElement));
    }

}
