package testScenarios;

import constants.SearchPageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSearchPage extends SearchPage {
     SearchPageConstants searchPageConstants = new SearchPageConstants();

    @Test
    @DisplayName("Verify that user is redirected to the Search page after searching city")
    public void checkThatUserIsRedirectedToTheSearchPage() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertEquals(searchPageConstants.searchPageName,getSearchPageName(),"User isn't redirected to the search page");
    }

    @Test
    @DisplayName("Verify that value from Search field in the search page is equal to the entered city")
    public void checkThatCityInSearchFieldIsCorrectTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertEquals(searchPageConstants.cityBarcelona, getAttributeFromSearchField(searchPageConstants.valueAttribute), "City isn't equal to the entered city");
    }

    @Test
    @DisplayName("Verify that all cities from list on the search page are equal to the entered city")
    public void checkCitiesListFromSearchPageTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertTrue(allCitiesStartWithEnteredCity(searchPageConstants.cityBarcelona), "Cities from list aren't equal to the entered city");
    }

    @Test
    @DisplayName("Verify that weather parameters include temperature")
    public void checkThatWeatherParametersIncludeTemperatureTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertTrue(allParametersFromListContainTemperatureParameter(), "Weather parameters don't include temperature");
    }

    @Test
    @DisplayName("Verify that weather parameters include cloud")
    public void checkThatWeatherParametersIncludeCloudTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertTrue(allParametersFromListContainCloudParameter(), "Weather parameters don't include cloud");
    }

    @Test
    @DisplayName("Verify that weather parameters include wind")
    public void checkThatWeatherParametersIncludeWindTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertTrue(allParametersFromListContainWindParameter(), "Weather parameters don't include wind");
    }

    @Test
    @DisplayName("Verify that weather parameters include pressure")
    public void checkThatWeatherParametersIncludePressureTest() {
        fillSearchInput(searchPageConstants.cityBarcelona);
        assertTrue(allParametersFromListContainPressureParameter(), "Weather parameters don't include pressure");
    }

}
