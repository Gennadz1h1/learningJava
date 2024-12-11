package testScenarios;

import constants.PartnersPageConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.PartnersPage;
import url.Url;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPartnersPage extends PartnersPage {
    PartnersPageConstants partnersPageConstants = new PartnersPageConstants();
    Url url = new Url();

    @Test
    @DisplayName("Verify that background color of Open Manual button before hovering = 'Completely Transparent'")
    public void checkBackgroundColorOfOpenManualButtonBeforeHoveringTest() {
        assertEquals(partnersPageConstants.completelyTransparentBackgroundColor,getBackgroundColorOfManualButton(partnersPageConstants.backgroundColor), "Background color isn't white");
    }

    @Test
    @DisplayName("Verify that background color of Open Manual button after hovering = 'dark gray'")
    public void checkBackgroundColorOfOpenManualButtonAfterHoveringTest() {
        hoverToOpenManualButton();
        assertEquals(partnersPageConstants.darkGrayBackgroundColor,getBackgroundColorOfManualButton(partnersPageConstants.backgroundColor), "Background color isn't dark-gray");
    }

    @Test
    @DisplayName("Verify that user is redirected to the Partners page'")
    public void checkThatUserIsRedirectedToPartnersPageTest() {
        assertEquals(partnersPageConstants.pageName,getPageName(), "User isn't redirected to the Partners page");
    }

    @Test
    @DisplayName("Verify that all sections from navigation list exist on the Partners page'")
    public void checkThatAllSectionsExistOnPartnersPageTest() {
        assertEquals(getTextFromLeftNavigationList(),getTextFromRightNavigationList(), "all sections from navigation list don't exist on the Partners page");
    }

    @Test
    @DisplayName("Verify that user is redirected to the Partners page'")
    public void checkThatUserIsRedirectedToBitbucketPageTest() {
        assertEquals(url.bitbucketPageURL,getCurrentURLAfterClickingOnBitbucketButton(), "User isn't redirected to the Bitbucket page");
    }

    @Test
    @DisplayName("Verify that android section is visible after clicking on the Android tab'")
    public void checkThatAndroidSectionIsVisibleTest() {
        assertTrue(androidSectionIsVisible(), "android section isn't visible after clicking on the Android tab");
    }

    @Test
    @DisplayName("Verify that python section is visible after clicking on the Android tab'")
    public void checkThatPythonSectionIsVisibleTest() {
        assertTrue(pythonSectionIsVisible(), "Python section isn't visible after clicking on the Android tab");
    }

    @Test
    @DisplayName("Verify that PHP section is visible after clicking on the Android tab'")
    public void checkThatPhpSectionIsVisibleTest() {
        assertTrue(phpSectionIsVisible(), "PHP section isn't visible after clicking on the Android tab");
    }



}
