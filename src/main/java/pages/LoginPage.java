package pages;

import constants.Credentials;
import elements.LoginPageElements;


public class LoginPage extends BasePage {
    LoginPageElements loginPageElements = new LoginPageElements();
    Credentials credentials = new Credentials();

    @Override
    public void loginIfRequired() {
        if (!isElementPresent(loginPageElements.signInButton)) {
            acceptCookieOnTheSignInPage();
            fillSignInFormOnSignInPage();
        } else {
            System.out.println("Skipping login...");
        }
    }

    public void acceptCookieOnTheSignInPage(){
        acceptCookie(loginPageElements.acceptCookiesButton);
    }

    public void fillSignInFormOnSignInPage() {
        visibilityOfElementAfterClickingOnButton(loginPageElements.signInButton, loginPageElements.signInWindowHeader);
        fillEmailField(credentials.userEmail, loginPageElements.emailField);
        fillPasswordField(credentials.password, loginPageElements.passwordField);
        clickOnSubmitButton(loginPageElements.submitButton);
    }

}
