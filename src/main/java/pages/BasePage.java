package pages;

import core.Browser;
import org.openqa.selenium.By;
import java.util.List;

public class BasePage extends Browser {
    // реализация работы с дропдауном и прочее повторяющиеся фун-ти

    public List<String > takeTextFromAllElementsFromDropdown(By locator, By locatorsOfDropdownElements) {
        click(locator);
        return takeTextFromAllElements(locatorsOfDropdownElements);
    }

    public int takeSizeOfDropdown(By locator, By locatorsOfDropdownElements) {
        click(locator);
        return takeTextFromAllElements(locatorsOfDropdownElements).size();
    }



}

