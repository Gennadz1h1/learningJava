package elements;

import org.openqa.selenium.By;

public class PartnersPageElements {
    public final By partnersTabElement = By.xpath("//ul[@class='desktop']//a[contains(text(), 'Partner')]");
    public final By openManualButton = By.xpath("//section[@id='google2']//a[contains(text(), 'Open')]");
    public final By partnersPageName = By.xpath("//div[@class='container']//h1[@class='breadcrumb-title']");
    public final By androidTabFromDocumentationList = By.xpath("//div[@class='doc-container']//a[contains(text() ,'Android')]");
    public final By pythonTabFromDocumentationList = By.xpath("//div[@class='doc-container']//a[contains(text() ,'Python')]");
    public final By phpTabFromDocumentationList = By.xpath("//div[@class='doc-container']//a[contains(text() ,'PHP')]");
    public final By androidSection = By.xpath("//div[@class='doc-container']//section[@id='android']");
    public final By pythonSection = By.xpath("//div[@class='doc-container']//section[@id='python']");
    public final By phpSection = By.xpath("//div[@class='doc-container']//section[@id='php']");
    public final By seeOnBitbucketButton = By.xpath("//section[@id='android']//a[contains(@href, 'bitbucket')]");
    public final By leftNavigationList = By.xpath("//div[@class='doc-container']/div/nav/ul/li/a[contains(@href, '')]");
    public final By rightNavigationList = By.xpath("//div[@class='doc-container']//section[contains(@id, '')]/h2");
    public final By bitbucketPage = By.xpath("//div[@id='error']");
}
