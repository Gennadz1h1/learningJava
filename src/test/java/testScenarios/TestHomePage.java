package testScenarios;

import constants.HomePageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestHomePage extends HomePage {

    HomePageConstants homePageConstants = new HomePageConstants();

    @Test
    @DisplayName("Verify that user is redirected to the Home page after clicking on the logo")
    public void checkThatUserIsRedirectedToTheSearchPageTest() {
        clickOnLogo();
        assertEquals(homePageConstants.searchPageName,getTextFromHomePageName(),"User isn't redirected to the home page");
    }

    @Test
    @DisplayName("Verify that all cities from dropdown on the home page are equal to the entered city")
    public void checkCitiesListFromSearchPageTest() {
        clickOnLogo();
        fillSearchInput(homePageConstants.cityMadrid);
        assertTrue(allCitiesStartWithEnteredCity(homePageConstants.cityMadrid), "Cities from dropdown on the home page are equal to the entered city");
    }
}
