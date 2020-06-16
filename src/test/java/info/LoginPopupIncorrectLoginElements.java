package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginPopupIncorrectLoginElements {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.clickPlayButton(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void loginPopupTitleTest() throws Exception {
        assertTrue(casinoPage.getLoginPopupTitleElement().isDisplayed());
        assertTrue(casinoPage.getLoginPopupTitleElement().isEnabled());
        assertEquals(casinoPage.getTextLoginPopupTitleElement(), exampleBundle.getString("login_title_popup"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void loginButtonPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getLoginButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getLoginButtonPopupElement().isEnabled());
        assertEquals(casinoPage.getTextLoginButtonPopupElement(), exampleBundle.getString("login_button_popup"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void joinNowButtonPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isEnabled());
        assertEquals(casinoPage.getTextJoinNowButtonPopupElement(), exampleBundle.getString("join_now_button_popup"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void joinNowLinkPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isDisplayed());
        assertTrue(casinoPage.getJoinNowButtonPopupElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void lostPasswordPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getLostPasswordLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextLostPasswordLoginPopupElement(), exampleBundle.getString("lost_password_popup"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void hereIncorrectPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getHereLinkIncorrectLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getHereLinkIncorrectLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextHereLinkIncorrectLoginPopupElement(), exampleBundle.getString("here_incorrect_login_popup"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void customerSupportTeamIncorrectPopupLoginTest() throws Exception {
        assertTrue(casinoPage.getCustomerSupportTeamLinkIncorrectLoginPopupElement().isDisplayed());
        assertTrue(casinoPage.getCustomerSupportTeamLinkIncorrectLoginPopupElement().isEnabled());
        assertEquals(casinoPage.getTextCustomerSupportTeamLinkIncorrectLoginPopupElement(), exampleBundle.getString("customer_support_team_incorrect_login_popup"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void messageTextIncorrectPopupLoginTest() throws Exception {
        assertEquals(casinoPage.getTextIncorrectLoginMessagePopupElement(), exampleBundle.getString("incorrect_login_message"));
    }


}


