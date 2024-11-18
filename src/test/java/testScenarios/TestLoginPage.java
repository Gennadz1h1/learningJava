package testScenarios;
import constans.Credentials;
import constans.LoginPageElements;
import pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLoginPage extends LoginPage {


    @Test
    @DisplayName("Verify that user can sign in to application using valid credentials")
    public void checkLoginWithValidCredentials() {
        Credentials credentials = new Credentials();
        LoginPageElements loginPageElements = new LoginPageElements();
        acceptCookie();
        fillSignInForm(credentials.user, credentials.password);
        assertEquals(takeText(loginPageElements.headerUserName), loginPageElements.userName, "User can't sign in to application using valid credentials");
    }
}

