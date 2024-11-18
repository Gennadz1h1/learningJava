package pages;

import org.openqa.selenium.By;
import java.util.List;

public class MainPage extends LoginPage{

    public List<String> takeTextFromAllNavigationTabs(By locator) {
        return takeTextFromAllElements(locator);
    }

}
