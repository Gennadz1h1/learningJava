package pages;

import constants.HomePageConstants;
import elements.HomePageElements;

import java.util.List;

public class HomePage extends BasePage{
    HomePageElements homePageElements = new HomePageElements();

    public void clickOnLogo(){
        click(homePageElements.logo);
    }

    public String getTextFromHomePageName(){
        return getText(homePageElements.homePageName);
    }

    public void fillSearchInput(String value) {
        fillSearchField(homePageElements.searchInput,value);
    }

    public List<String> getTextFromAllCitiesFromDropdown(){
        return  getTextFromAllElements(homePageElements.searchCitiesInDropdownMenu);
    }

    public boolean allCitiesStartWithEnteredCity(String value){
        return allStartWithValue(getTextFromAllCitiesFromDropdown(),value);
    }
}
