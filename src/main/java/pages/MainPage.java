package pages;

import elements.LoginPageElements;
import elements.MainPageElements;

import java.util.List;

public class MainPage extends BasePage{
    MainPageElements mainPageElements = new MainPageElements();
    LoginPageElements loginPageElements = new LoginPageElements();

    public int getSizeOfDropdownFromUserDropdown(){
        return    getSizeOfDropdown(loginPageElements.userNameHeader,mainPageElements.userDropdownElements);
    }

    public int getSizeOfDropdownFromSupportDropdown(){
        return    getSizeOfDropdown(mainPageElements.supportTab,mainPageElements.supportDropdownElements);
    }

    public List<String> getTextFromAllElementsFromUserDropdown() {
       return getTextFromAllElementsFromDropdown(loginPageElements.userNameHeader,mainPageElements.userDropdownElements);
    }

    public List<String> getTextFromAllNavigationTabsInMainPage(){
        return getTextFromAllElements(mainPageElements.navigationTabElements);
    }

    public List<String> getTextFromAllElementsFromSupportDropdown() {
        return getTextFromAllElementsFromDropdown(mainPageElements.supportTab,mainPageElements.supportDropdownElements);
    }

    public void clickOnTheMapsButton(){
        this.click(mainPageElements.mapsButton);
    }

}
