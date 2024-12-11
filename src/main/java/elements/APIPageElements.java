package elements;

import org.openqa.selenium.By;

public class APIPageElements {
    public final By apiTabElement = By.xpath("//ul[@class='desktop']//a[text()='API']");
    public final By homePageName = By.xpath("//div[@class='topic']//h1[@class='breadcrumb-title']");
    public final By sectionElements = By.xpath("//div[@class='container']//section[contains(@id, '')]//h2[@class = 'headline first-child text-color']");
    public final By getButtonsOnSolarSection = By.xpath("//div[@class='container']//section[contains(@id, 'solar')]//a[contains(@class , 'btn_block orange round')]");
    public final By pricingPageName = By.xpath("//div[@class='topic']//h1[text()='Pricing']");
}
