package elements;

import org.openqa.selenium.By;

public class HomePageElements {
    public final By logo = By.xpath("//li[@class='logo']");
    public final By homePageName = By.xpath("//div[@class='section where-to']//span[@class='orange-text']");
    public final By searchInput = By.xpath("//div[@class='search']//input[@placeholder='Search city']");
    public final By searchCitiesInDropdownMenu = By.xpath("//ul[@class='search-dropdown-menu']/li/span[1]");
}
