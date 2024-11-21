package pages;

import constans.Credentials;
import constans.LoginPageElements;
import core.Browser;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import java.util.List;
// реализация работы с дропдауном и прочее повторяющиеся фун-ти
public class BasePage extends Browser {
    Credentials credentials = new Credentials();
    LoginPageElements loginPageElements = new LoginPageElements();

    @BeforeEach
    public void loginIfRequired() {
        if (isElementPresent(loginPageElements.buttonSignIn)) {
            acceptCookie(loginPageElements.buttonAccept);
            visibilityOfElementAfterClickingOnButton(loginPageElements.buttonSignIn, loginPageElements.headerSignInWindow);
            fillSignInForm(credentials.user, credentials.password, loginPageElements.fieldEmail, loginPageElements.fieldPassword, loginPageElements.buttonSubmit);
        } else {
            System.out.println("Skipping login...");
        }
    }

    public void acceptCookie(By locator){
        try {
            this.click(locator);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Cookie acceptance button not found. Skipping acceptance.");
        }
    }

    public String getBackgroundColorOfElement(By locator){
        return getCssValue(locator, "background-color");
    }

    public int getSizeOfDropdown(By locator, By locatorsOfDropdownElements) {
        click(locator);
        return getTextsFromElements(getAllElements(locatorsOfDropdownElements)).size();
    }

    public List<String > getTextFromAllElementsFromDropdown(By locator, By locatorsOfDropdownElements) {
        click(locator);
        return getTextsFromElements(getAllElements(locatorsOfDropdownElements));
    }

    public List<String> getTextFromAllElements(By locator) {
        return getTextsFromElements(getAllElements(locator));
    }

    public boolean isElementPresent(By locator) {
        try {
            waitForElementToBeVisible(locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void fillSignInForm(String userName, String password, By locatorOfUserName, By locatorOfPassword, By locatorOfSubmitButton) {
        this.sendKeys(locatorOfUserName, userName)
                .sendKeys(locatorOfPassword, password)
                .click(locatorOfSubmitButton);
    }

    public void visibilityOfElementAfterClickingOnButton(By locatorOfButton, By locatorOfElement){
        this.click(locatorOfButton)
                .waitForElementToBeVisible(locatorOfElement);
    }



}

