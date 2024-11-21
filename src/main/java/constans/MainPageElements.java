package constans;

import org.openqa.selenium.By;

public class MainPageElements {
    public final By elementsOfUserDropdown = By.xpath("//ul[@class='dropdown-menu dropdown-visible']//a[contains(@href, '')]");
    public final By elementsOfNavigationTabs = By.xpath("//ul[@class='nav nav-tabs pull-left']//a[contains(@href, '')]");
    public final By elementOfButtonMaps = By.xpath("//li[@id='desktop-menu']//a[text()='Maps']");

}
