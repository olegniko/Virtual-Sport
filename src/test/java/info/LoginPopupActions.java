package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class LoginPopupActions {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUpMethod() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.clickElement(casinoPage.getBetradarGameElement());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownMethod() {
        casinoPage.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }



    @Test(groups = {"EN", "RU", "PL","EC"})
    public void clickLostPasswordTest() throws Exception {
        casinoPage.clickElement(casinoPage.getLostPasswordLoginPopupElement());
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("forgot_password_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void clickJoinNowTest() throws Exception {
        casinoPage.clickElement(casinoPage.getJoinNowButtonPopupElement());
        casinoPage.driverWait(2);
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("join_now_url"));
    }



    @Test(groups = {"EN", "RU", "PL","EC"})
    public void clickHereIncorrectLoginTest() throws Exception {
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        casinoPage.clickElement(casinoPage.getHereLinkIncorrectLoginPopupElement());
        casinoPage.driverWait(2);
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("forgot_password_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void clickCustomSupportTeamIncorrectLoginTest() throws Exception {
        casinoPage.loginByPopup(exampleBundle.getString("incorrect_login"), exampleBundle.getString("correct_password"));
        casinoPage.driverWait(2);
        casinoPage.clickElement(casinoPage.getCustomerSupportTeamLinkIncorrectLoginPopupElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("customer_support_team"));
    }




}


