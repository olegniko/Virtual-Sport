package info;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Page404 {

    CasinoPage casinoPage;


    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        casinoPage = new CasinoPage();
        casinoPage.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));
        casinoPage.enterUrl(exampleBundle.getString("404_url"));
    }


    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        casinoPage.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


    @Test(groups = { "CUR2"})
    public void url404Test() throws Exception {
        String currentUrl=casinoPage.getUrl();
        assertEquals(currentUrl,exampleBundle.getString("404_url_result"));
    }


}


