package pages;

import constants.MainPageConstants;
import elements.MainPageElements;
import constants.SearchPageConstants;
import elements.SearchPageElements;
import java.util.List;

public class SearchPage extends BasePage{
    MainPageElements mainPageElements = new MainPageElements();
    SearchPageElements searchPageElements = new SearchPageElements();
    SearchPageConstants searchPageConstants = new SearchPageConstants();

    public void fillSearchInput(String value) {
        fillSearchField(mainPageElements.searchField,value);
    }

    public String getAttributeFromSearchField(String attribute){
        return getAttributeFromElement(searchPageElements.searchInput, attribute);
    }

    public String getSearchPageName(){
        return getText(searchPageElements.nameSearchPage);
    }

    public List<String> getTextFromAllCitiesInList(){
       return  getTextFromAllElements(searchPageElements.namesFromTable);
    }

    public boolean allCitiesStartWithEnteredCity(String value) {
        return allStartWithValue(getTextFromAllCitiesInList(),value);
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
