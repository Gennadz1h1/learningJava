package pages;

import elements.PartnersPageElements;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;

public class PartnersPage extends BasePage{
    PartnersPageElements partnersPageElements = new PartnersPageElements();

    @BeforeEach
    public void redirectToPartnersPage(){
        click(partnersPageElements.partnersTabElement);
    }

    public boolean androidSectionIsVisible(){
        click(partnersPageElements.phpTabFromDocumentationList);
        return isElementFullyVisible(partnersPageElements.phpSection);
    }

    public void clickOnBitbucketButton(){
        click(partnersPageElements.seeOnBitbucketButton);
    }

    public String getCurrentURLAfterClickingOnBitbucketButton() {
        clickOnBitbucketButton();
        switchToAnotherWindow(getMainWindowHandle());
        return getCurrentURL(partnersPageElements.bitbucketPage);
    }

    public String getBackgroundColorOfManualButton(String backgroundValue){
        return getCssValue(partnersPageElements.openManualButton, backgroundValue);
    }

    public List<String> getTextFromLeftNavigationList(){
        return  getTextFromAllElements(partnersPageElements.leftNavigationList);
    }

    public List<String> getTextFromRightNavigationList(){
        return  getTextFromAllElements(partnersPageElements.rightNavigationList);
    }

    public String getPageName(){
        return getText(partnersPageElements.partnersPageName);
    }

    public void hoverToOpenManualButton(){
        hover(partnersPageElements.openManualButton);
    }

    public boolean pythonSectionIsVisible(){
        click(partnersPageElements.pythonTabFromDocumentationList);
        return isElementFullyVisible(partnersPageElements.pythonSection);
    }

    public boolean phpSectionIsVisible(){
        click(partnersPageElements.phpTabFromDocumentationList);
        return isElementFullyVisible(partnersPageElements.phpSection);
    }

}
