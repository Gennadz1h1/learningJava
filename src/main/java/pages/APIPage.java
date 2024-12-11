package pages;

import elements.APIPageElements;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class APIPage extends BasePage {
    APIPageElements apiPageElements = new APIPageElements();

    @BeforeEach
    public void redirectToAPIPage(){
        click(apiPageElements.apiTabElement);
    }

    public String getAPIPageName(){
        return getText(apiPageElements.homePageName);
    }

    public List<String> getTextFromAllSections(){
        return  getTextFromAllElements(apiPageElements.sectionElements);
    }

    public String getCurrentURLAfterClickingOnGetButtonsOnSolarSection() {
        click(apiPageElements.getButtonsOnSolarSection);
        return getCurrentURL(apiPageElements.pricingPageName);
    }

}
