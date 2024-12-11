package elements;

import org.openqa.selenium.By;

public class LoginPageElements {
    public final By signInButton = By.xpath("//ul[@id='first-level-nav']//a[contains(@href, 'home/sign_in')]");
    public final By signInWindowHeader = By.xpath("//h3[text()='Sign In To Your Account']");
    public final By emailField = By.xpath("(//input[@id='user_email'])[1]");
    public final By passwordField = By.xpath("//input[@id='user_password']");
    public final By submitButton = By.xpath("//input[@value='Submit']");
    public final By acceptCookiesButton = By.xpath("//button[@data-request='onAccept']"); // example
    public final By userNameHeader = By.xpath("//div[@class='inner-user-container']");

}
