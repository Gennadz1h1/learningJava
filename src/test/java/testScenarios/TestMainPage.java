package testScenarios;

import constans.LoginPageElements;
import constans.MainPageElements;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainPage extends MainPage {

    @Test
    @DisplayName("Verify count of elements in User Dropdown")
    public void checkCountOfElementsInUserDropdown() {
        loginIfRequired();
        LoginPageElements loginPageElements = new LoginPageElements();
        MainPageElements mainPageElements = new MainPageElements();
        int count = takeSizeOfDropdown(loginPageElements.headerUserName,mainPageElements.elementsOfUserDropdown);
        assertEquals(mainPageElements.countOfElementsInUserDropdown,count, "Invalid count of elements in User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of User Dropdown are correct")
    public void checkListOfElementsInUserDropdown() {
        loginIfRequired();
        LoginPageElements loginPageElements = new LoginPageElements();
        MainPageElements mainPageElements = new MainPageElements();
        List<String> listOfElements = takeTextFromAllElementsFromDropdown(loginPageElements.headerUserName,mainPageElements.elementsOfUserDropdown);
        assertEquals(mainPageElements.listOfUserDropdown,listOfElements, "Invalid List of User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of Navigation tabs are correct")
    public void checkListOfNavigationTabs() {
        loginIfRequired();
        MainPageElements mainPageElements = new MainPageElements();
        List<String> listOfElements = takeTextFromAllNavigationTabs(mainPageElements.elementsOfNavigationTabs);
        assertEquals(mainPageElements.listOfNavigationTabs,listOfElements, "Invalid List of Navigation tabs");
    }
}
