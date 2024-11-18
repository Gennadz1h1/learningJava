package constans;

import org.openqa.selenium.By;

public class LoginPageElements {
    public String userName = "Henadz";
    public final By buttonSignIn = By.xpath("//ul[@id='first-level-nav']//a[contains(@href, 'home/sign_in')]");
    public final By headerSignInWindow = By.xpath("//h3[text()='Sign In To Your Account']");
    public final By fieldEmail = By.xpath("(//input[@id='user_email'])[1]");
    public final By fieldPassword = By.xpath("//input[@id='user_password']");
    public final By buttonSubmit = By.xpath("//input[@value='Submit']");
    public final By buttonAccept = By.xpath("//button[@data-request='onAccept']");
    public final By headerUserName = By.xpath("//div[@class='inner-user-container']");
}
