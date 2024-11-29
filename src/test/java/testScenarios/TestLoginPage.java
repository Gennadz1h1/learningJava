package testScenarios;

import elements.LoginPageElements;
import constants.LoginPageConstants;
import pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoginPage extends LoginPage {
    LoginPageElements loginPageElements = new LoginPageElements();
    LoginPageConstants loginPageConstants = new LoginPageConstants();

    @Test
    @DisplayName("Verify that user can sign in to application using valid credentials")
     public void checkLoginWithValidCredentials() {
        acceptCookieOnTheSignInPage();
        fillSignInFormOnSignInPage();
        assertEquals(getText(loginPageElements.userNameHeader), loginPageConstants.userName, "User can't sign in to application using valid credentials");
    }
}

