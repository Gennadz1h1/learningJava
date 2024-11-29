package pages;

import constants.HomePageConstants;
import elements.HomePageElements;

import java.util.List;

public class HomePage extends BasePage{
    HomePageElements homePageElements = new HomePageElements();
    HomePageConstants homePageConstants = new HomePageConstants();

    public void clickOnLogo(){
        click(homePageElements.logo);
    }

    public String getTextFromHomePageName(){
        return getText(homePageElements.homePageName);
    }

    public void fillSearchInput() {
        fillSearchField(homePageElements.searchInput,homePageConstants.city);
    }

    public List<String> getTextFromAllCitiesFromDropdown(){
        return  getTextFromAllElements(homePageElements.searchCitiesInDropdownMenu);
    }

    public boolean allCitiesStartWithEnteredCity(){
        return allStartWithValue(getTextFromAllCitiesFromDropdown(),homePageConstants.city);
    }
}
