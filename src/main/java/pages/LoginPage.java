package pages;

import constans.Credentials;
import constans.LoginPageElements;

public class LoginPage extends BasePage {
    LoginPageElements loginPageElements = new LoginPageElements();
    Credentials credentials = new Credentials();
    public static boolean shouldLogin = true;

    public void acceptCookie(){
        try {
            this.click(loginPageElements.buttonAccept);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Cookie acceptance button not found. Skipping acceptance.");
        }
    }

    public void loginIfRequired() {
        if (shouldLogin) {
            acceptCookie();
            fillSignInForm(credentials.user, credentials.password);
        } else {
            System.out.println("Skipping login...");
        }
    }
    public void fillSignInForm(String userName, String password) {
        this.click(loginPageElements.buttonSignIn)
                .waitForElementToBeVisible(loginPageElements.headerSignInWindow);
        this.sendKeys(loginPageElements.fieldEmail, userName)
                .sendKeys(loginPageElements.fieldPassword, password)
                .click(loginPageElements.buttonSubmit);
    }

}
