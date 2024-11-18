package constans;

import org.openqa.selenium.By;

import java.util.List;

public class MainPageElements {
    public int countOfElementsInUserDropdown = 5;
    public List<String> listOfUserDropdown = List.of(new String[]{"My services", "My API keys", "My payments", "My profile", "Logout"});
    public List<String> listOfNavigationTabs = List.of(new String[]{"New Products", "Services", "API keys", "Billing plans", "Payments", "Block logs", "My orders", "My profile", "Ask a question"});
    public final By elementsOfUserDropdown = By.xpath("//ul[@class='dropdown-menu dropdown-visible']//a[contains(@href, '')]");
    public final By elementsOfNavigationTabs = By.xpath("//ul[@class='nav nav-tabs pull-left']//a[contains(@href, '')]");
}
