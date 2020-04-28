package info;

import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class BannersUnloggedActions {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        casinoPage = new CasinoPage();
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        casinoPage.close();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = {"CUR2"})
    public void bannerOpenGameActionTest() throws Exception {
        casinoPage.clickBanner(casinoPage.getBannerAutotestOpenGameElement());
        assertTrue(casinoPage.getLoginPopupElement().isDisplayed());
    }


  }


