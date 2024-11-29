package testScenarios;

import constants.MainPageConstants;
import constants.SearchPageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSearchPage extends SearchPage {
     SearchPageConstants searchPageConstants = new SearchPageConstants();
     MainPageConstants mainPageConstants = new MainPageConstants();

    @Test
    @DisplayName("Verify that user is redirected to the Search page after searching city")
    public void checkThatUserIsRedirectedToTheSearchPage() {
        fillSearchInput();
        assertEquals(searchPageConstants.searchPageName,getSearchPageName(),"User isn't redirected to the search page");
    }

    @Test
    @DisplayName("Verify that value from Search field in the search page is equal to the entered city")
    public void checkThatCityInSearchFieldIsCorrect() {
        fillSearchInput();
        assertEquals(mainPageConstants.city, getAttributeFromSearchField(), "City isn't equal to the entered city");
    }

    @Test
    @DisplayName("Verify that all cities from list on the search page are equal to the entered city")
    public void checkCitiesListFromSearchPage() {
        fillSearchInput();
        assertTrue(allCitiesStartWithEnteredCity(), "Cities from list aren't equal to the entered city");
    }

    @Test
    @DisplayName("Verify that weather parameters include temperature")
    public void checkThatWeatherParametersIncludeTemperature() {
        fillSearchInput();
        assertTrue(allParametersFromListContainTemperatureParameter(), "Weather parameters don't include temperature");
    }

    @Test
    @DisplayName("Verify that weather parameters include cloud")
    public void checkThatWeatherParametersIncludeCloud() {
        fillSearchInput();
        assertTrue(allParametersFromListContainCloudParameter(), "Weather parameters don't include cloud");
    }

    @Test
    @DisplayName("Verify that weather parameters include wind")
    public void checkThatWeatherParametersIncludeWind() {
        fillSearchInput();
        assertTrue(allParametersFromListContainWindParameter(), "Weather parameters don't include wind");
    }

    @Test
    @DisplayName("Verify that weather parameters include pressure")
    public void checkThatWeatherParametersIncludePressure() {
        fillSearchInput();
        assertTrue(allParametersFromListContainPressureParameter(), "Weather parameters don't include pressure");
    }

}
