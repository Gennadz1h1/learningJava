package testScenarios;

import constants.APIPageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.APIPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAPIPage extends APIPage {

    APIPageConstants apiPageConstants = new APIPageConstants();

    @Test
    @DisplayName("Verify that user is redirected to the API page after clicking on the API tab ")
    public void checkThatUserIsRedirectedToAPIPage() {
        assertEquals(apiPageConstants.searchPageName,getAPIPageName(),"User isn't redirected to the API page");
    }

    @Test
    @DisplayName("Verify that all sections on the API page are correct")
    public void checkSectionsListFromAPIPage() {
        assertEquals(apiPageConstants.sections,getTextFromAllSections(),"Sections on the API page aren't correct");
    }

    @Test
    @DisplayName("Verify that user is redirected to the Pricing page after clicking on the get button on the Solar section ")
    public void checkThatUserIsRedirectedToPricingPage() {
        assertEquals(apiPageConstants.solarEnergyPageURL,getCurrentURLAfterClickingOnGetButtonsOnSolarSection(),"User isn't redirected to the Pricing page");
    }

}
