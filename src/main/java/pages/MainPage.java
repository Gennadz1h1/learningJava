package pages;

import constans.LoginPageElements;
import constans.MainPageElements;
import java.util.List;

public class MainPage extends BasePage{
    MainPageElements mainPageElements = new MainPageElements();
    LoginPageElements loginPageElements = new LoginPageElements();

    public int getSizeOfDropdownFromUserDropdown(){
        return    getSizeOfDropdown(loginPageElements.headerUserName,mainPageElements.elementsOfUserDropdown);
    }

    public List<String> getTextFromAllElementsFromUserDropdown() {
       return getTextFromAllElementsFromDropdown(loginPageElements.headerUserName,mainPageElements.elementsOfUserDropdown);
    }

    public List<String> getTextFromAllNavigationTabsInMainPage(){
        return getTextFromAllElements(mainPageElements.elementsOfNavigationTabs);
    }

    public void clickOnTheMapsButton(){
        this.click(mainPageElements.elementOfButtonMaps);
    }

}
