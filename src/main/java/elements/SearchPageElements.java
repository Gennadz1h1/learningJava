package elements;

import org.openqa.selenium.By;

public class SearchPageElements {
    public final By searchInput = By.xpath("//form[@id='searchform']//input[@id='search_str']");// need to get @value
    public final By namesFromTable = By.xpath("//table[@class='table']//a[contains(@href, 'city')]"); //need to get text from these elements. Check contains in assert
    public final By nameSearchPage = By.xpath("//div[@class='container']//h2[@class='headline first-child text-color']");
    public final By parametersElements = By.xpath("//p[contains(text(), 'temperature')]");
}
