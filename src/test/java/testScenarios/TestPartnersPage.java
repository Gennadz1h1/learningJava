package testScenarios;

import constans.PartnersPageVariables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PartnersPage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPartnersPage extends PartnersPage {
    PartnersPageVariables partnersPageVariables = new PartnersPageVariables();

    @Test
    @DisplayName("Verify that background color of Open Manual button before hovering = 'Completely Transparent'")
    public void checkBackgroundColorOfOpenManualButtonBeforeHovering() {
        assertEquals(partnersPageVariables.backgroundColorCompletelyTransparent,getBackgroundColorOfManualButton(), "Background color isn't white");
    }

    @Test
    @DisplayName("Verify that background color of Open Manual button after hovering = 'dark gray'")
    public void checkBackgroundColorOfOpenManualButtonAfterHovering() {
        hoverToOpenManualButton();
        assertEquals(partnersPageVariables.backgroundColorDarkGray,getBackgroundColorOfManualButton(), "Background color isn't dark-gray");
    }
}
