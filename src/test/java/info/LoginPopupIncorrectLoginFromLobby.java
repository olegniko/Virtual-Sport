package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class LoginPopupIncorrectLoginFromLobby {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
    }


    @AfterClass(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void incorectLoginTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void incorectPasswordTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("correct_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void incorectLoginAndPasswordTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("incorrect_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void blankLoginAndPasswordTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup("", "");
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void blankLoginTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup("", exampleBundle.getString("correct_password"));
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void blankPasswordTest() throws Exception {
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
        casinoPage.loginByPopup(exampleBundle.getString("correct_login"), "");
        assertTrue(casinoPage.getIncorrectLoginMessagePopupElement().isDisplayed());
        casinoPage.closeLoginPopup();
    }

}


