package testScenarios;

import constants.MainPageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainPage extends MainPage {
    MainPageConstants mainPageConstants = new MainPageConstants();

    @Test
    @DisplayName("Verify count of elements in User Dropdown")
    public void checkCountOfElementsInUserDropdown() {
        assertEquals(mainPageConstants.elementsInUserDropdownCount,getSizeOfDropdownFromUserDropdown(), "Invalid count of elements in User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of User Dropdown are correct")
    public void checkListOfElementsInUserDropdown() {
        assertEquals(mainPageConstants.userDropdownList,getTextFromAllElementsFromUserDropdown(), "Invalid List of User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of Navigation tabs are correct")
    public void checkListOfNavigationTabs() {
        assertEquals(mainPageConstants.navigationTabsList,getTextFromAllNavigationTabsInMainPage(), "Invalid List of Navigation tabs");
    }

    @Test
    @DisplayName("Verify count of elements in User Dropdown")
    public void checkCountOfElementsInSupportDropdown() {
        assertEquals(mainPageConstants.elementsInSupportDropdownCount,getSizeOfDropdownFromSupportDropdown(), "Invalid count of elements in User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of Support Dropdown are correct")
    public void checkListOfElementsInSupportDropdown() {
        assertEquals(mainPageConstants.supportDropdownList,getTextFromAllElementsFromSupportDropdown(), "Invalid List of User Dropdown");
    }


}
