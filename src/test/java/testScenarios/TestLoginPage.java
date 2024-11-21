package testScenarios;

import constans.LoginPageElements;
import constans.LoginPageVariables;
import pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoginPage extends LoginPage {
    LoginPageElements loginPageElements = new LoginPageElements();
    LoginPageVariables loginPageVariables = new LoginPageVariables();

    @Test
    @DisplayName("Verify that user can sign in to application using valid credentials")
     public void checkLoginWithValidCredentials() {
        acceptCookieOnTheSignInPage();
        fillSignInFormOnSignInPage();
        assertEquals(getText(loginPageElements.headerUserName), loginPageVariables.userName, "User can't sign in to application using valid credentials");
    }
}

