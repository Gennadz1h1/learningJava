package pages;

import constants.Credentials;
import elements.LoginPageElements;
import core.Browser;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;

import java.util.List;

// реализация работы с дропдауном и прочее повторяющиеся фун-ти.
public class BasePage extends Browser {
    Credentials credentials = new Credentials();
    LoginPageElements loginPageElements = new LoginPageElements();

    @BeforeEach
    public void loginIfRequired() {
        if (isElementPresent(loginPageElements.signInButton)) {
            acceptCookie(loginPageElements.acceptCookiesButton);
            visibilityOfElementAfterClickingOnButton(loginPageElements.signInButton, loginPageElements.signInWindowHeader);
            fillEmailField(credentials.userEmail, loginPageElements.emailField);
            fillPasswordField(credentials.password, loginPageElements.passwordField);
            clickOnSubmitButton(loginPageElements.submitButton);
        } else {
            System.out.println("Skipping login...");
        }
    }

    public void acceptCookie(By locator) {
        try {
            this.click(locator);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Cookie acceptance button not found. Skipping acceptance.");
        }
    }

    public boolean allStartWithValue(List<String> list, String value){
        return list.stream()
                .allMatch(c -> c.startsWith(value));
    }

    public boolean allContainValue(List<String> list, String value){
        return list.stream()
                .allMatch(c -> c.contains(value));
    }

    public void clickOnSubmitButton(By submitButtonLocator) {
        click(submitButtonLocator);
    }

    public int getSizeOfDropdown(By buttonLocator, By dropdownElementsLocator) {
        click(buttonLocator);
        return getTexts(getAllElements(dropdownElementsLocator)).size();
    }

    public List<String> getTextFromAllElementsFromDropdown(By locator, By dropdownElementsLocator) {
        click(locator);
        return getTexts(getAllElements(dropdownElementsLocator));
    }

    public List<String> getTextFromAllElements(By locator) {
        return getTexts(getAllElements(locator));
    }

    public boolean isElementPresent(By locator) {
        try {
            waitForElementToBeVisible(locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void fillEmailField(String userName, By userNameInputLocator) {
        sendKeys(userNameInputLocator, userName);
    }

    public void fillPasswordField(String password, By passwordInputLocator) {
        sendKeys(passwordInputLocator, password);
    }

    public void fillSearchField(By searchLocator, String value) {
        sendKeys(searchLocator, value);
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void visibilityOfElementAfterClickingOnButton(By buttonLocator, By elementLocator) {
        this.click(buttonLocator)
                .waitForElementToBeVisible(elementLocator);
    }


}

