package pages;

import constans.Credentials;
import constans.LoginPageElements;


public class LoginPage extends BasePage {
    LoginPageElements loginPageElements = new LoginPageElements();
    Credentials credentials = new Credentials();

    @Override
    public void loginIfRequired() {
        if (!isElementPresent(loginPageElements.buttonSignIn)) {
            acceptCookieOnTheSignInPage();
            fillSignInFormOnSignInPage();
        } else {
            System.out.println("Skipping login...");
        }
    }

    public void acceptCookieOnTheSignInPage(){
        acceptCookie(loginPageElements.buttonAccept);
    }

    public void fillSignInFormOnSignInPage() {
        visibilityOfElementAfterClickingOnButton(loginPageElements.buttonSignIn, loginPageElements.headerSignInWindow);
        fillSignInForm(credentials.user, credentials.password, loginPageElements.fieldEmail, loginPageElements.fieldPassword, loginPageElements.buttonSubmit);
    }

}
