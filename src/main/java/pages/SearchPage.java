package pages;

import constants.MainPageConstants;
import elements.MainPageElements;
import constants.SearchPageConstants;
import elements.SearchPageElements;
import java.util.List;

public class SearchPage extends BasePage{
    MainPageElements mainPageElements = new MainPageElements();
    MainPageConstants mainPageConstants = new MainPageConstants();
    SearchPageElements searchPageElements = new SearchPageElements();
    SearchPageConstants searchPageConstants = new SearchPageConstants();

    public void fillSearchInput() {
        fillSearchField(mainPageElements.searchField,mainPageConstants.city);
    }

    public String getAttributeFromSearchField(){
        return getAttributeFromElement(searchPageElements.searchInput, "value");
    }

    public String getSearchPageName(){
        return getText(searchPageElements.nameSearchPage);
    }

    public List<String> getTextFromAllCitiesInList(){
       return  getTextFromAllElements(searchPageElements.namesFromTable);
    }

    public boolean allCitiesStartWithEnteredCity(){
        return allStartWithValue(getTextFromAllCitiesInList(),mainPageConstants.city);
    }

    public List<String> getTextFromAllParametersOfWeather(){
        return  getTextFromAllElements(searchPageElements.parametersElements);
    }

    public boolean allParametersFromListContainTemperatureParameter(){
        return allContainValue(getTextFromAllParametersOfWeather(), searchPageConstants.temperatureParameterWeather);
    }

    public boolean allParametersFromListContainCloudParameter(){
        return allContainValue(getTextFromAllParametersOfWeather(), searchPageConstants.cloudParameterWeather);
    }

    public boolean allParametersFromListContainPressureParameter(){
        return allContainValue(getTextFromAllParametersOfWeather(), searchPageConstants.pressureParameterWeather);
    }

    public boolean allParametersFromListContainWindParameter(){
        return allContainValue(getTextFromAllParametersOfWeather(), searchPageConstants.windParameterWeather);
    }

}
