package info;


import org.testng.annotations.*;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;


public class FooterElementLinks {

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
    public void tearDownClass() {
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void aboutUsLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getAboutUsFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("about_us_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void privacyPolicyLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getPrivacyPolicyFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("privacy_policy_footer_url"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void contactUsLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getContactUsFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("contact_us_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void paymentsLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getPaymentsFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("payments_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void mobileSiteLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getMobileSiteFooterElement());
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("mobile_site_footer_url"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void affiliatesLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getAffiliatesCURFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("affiliates_cur_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void ourPartnersLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getOurParntersFooterElement());
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("our_partners_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void partnershipHistoryLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getPartnreshipHistoryFooterElement());
        String url = casinoPage.getUrl();
        assertEquals(url, exampleBundle.getString("partnership_history_footer_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void helpLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getHelpFooterElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("help_footer_url"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void manCityLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getManCityElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("man_city_url"));
    }

   /* @Test(groups = {"CUR2"})
    public void sevilyaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getSevillaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("sevilya_url"));
    }*/

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void gironaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getGironaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("girona_url"));
    }



     @Test(groups = {"EN", "RU", "PL","EC"})
    public void karpatyLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getKarpatyElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("karpaty_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void zaragozaLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getZaragozaElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("zaragoza_url"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void facebookLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getFacebookIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("facebook_url"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void twitterLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getTwitterIconElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("twitter_url"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void shutterstockLinkLinkTest() throws Exception {
        casinoPage.clickElement(casinoPage.getShutterstockLinkElement());
        String url = casinoPage.getNextTabUrlPage();
        assertEquals(url, exampleBundle.getString("shutterstockLink_url"));
    }

}

