package testScenarios;

import constans.MainPageVariables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainPage extends MainPage {
    MainPageVariables mainPageVariables = new MainPageVariables();

    @Test
    @DisplayName("Verify count of elements in User Dropdown")
    public void checkCountOfElementsInUserDropdown() {
        assertEquals(mainPageVariables.countOfElementsInUserDropdown,getSizeOfDropdownFromUserDropdown(), "Invalid count of elements in User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of User Dropdown are correct")
    public void checkListOfElementsInUserDropdown() {
        assertEquals(mainPageVariables.listOfUserDropdown,getTextFromAllElementsFromUserDropdown(), "Invalid List of User Dropdown");
    }

    @Test
    @DisplayName("Verify that List of Navigation tabs are correct")
    public void checkListOfNavigationTabs() {
        assertEquals(mainPageVariables.listOfNavigationTabs,getTextFromAllNavigationTabsInMainPage(), "Invalid List of Navigation tabs");
    }

}
