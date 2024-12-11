package elements;

import org.openqa.selenium.By;

public class MainPageElements {
    public final By navigationTabElements = By.xpath("//ul[@class='nav nav-tabs pull-left']//a[contains(@href, '')]");
    public final By mapsButton = By.xpath("//li[@id='desktop-menu']//a[text()='Maps']");
    public final By searchField = By.xpath("//div[@id='desktop-menu']//input[@placeholder='Weather in your city']");
    public final By supportTab = By.xpath("//div[@id='support-dropdown']");
    public final By supportDropdownElements = By.xpath("//ul[@id= 'support-dropdown-menu']//a[contains(@href, '')]");
    public final By userDropdownElements = By.xpath("//ul[@id='user-dropdown-menu']//a[contains(@href, '')]");

}
