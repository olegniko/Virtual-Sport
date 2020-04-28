package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BannersLoggedActions {

    CasinoPage casinoPage;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }



    @Test(groups = {"CUR2"})
    public void bannerNoneActionTest() throws Exception {
        casinoPage.clickBanner(casinoPage.getBannerAutotestOpenGameElement());
        casinoPage.driverWait(10);
        assertTrue(casinoPage.getCrossInGameElement().isDisplayed());
        assertTrue(casinoPage.getCrossInGameElement().isEnabled());
    }

}


