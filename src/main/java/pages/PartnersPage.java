package pages;

import constans.PartnersPageElements;
import org.junit.jupiter.api.BeforeEach;

public class PartnersPage extends BasePage{
    PartnersPageElements partnersPageElements = new PartnersPageElements();

    @BeforeEach
    public void redirectToPartnersPage(){
        click(partnersPageElements.elementOfPartnersTab);
    }

    public String getBackgroundColorOfManualButton(){
        return getBackgroundColorOfElement(partnersPageElements.elementOfOpenManualButton);
    }

    public void hoverToOpenManualButton(){
        hoverToElement(partnersPageElements.elementOfOpenManualButton);
    }



}
