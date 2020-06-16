package info;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CasinoPage;

import static helper.Browser.exampleBundle;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class FooterElements {

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
    public void aboutUsEnabledTest() throws Exception {
        assertTrue(casinoPage.getAboutUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getAboutUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAboutUsFooterElement(), exampleBundle.getString("about_us_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void privacyPolicyEnabledTest() throws Exception {
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isDisplayed());
        assertTrue(casinoPage.getPrivacyPolicyFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPrivacyPolicyFooterElement(), exampleBundle.getString("privacy_policy_footer"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void contactUsEnabledTest() throws Exception {
        assertTrue(casinoPage.getContactUsFooterElement().isDisplayed());
        assertTrue(casinoPage.getContactUsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextContactUsFooterElement(), exampleBundle.getString("contact_us_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void paymentsEnabledTest() throws Exception {
        assertTrue(casinoPage.getPaymentsFooterElement().isDisplayed());
        assertTrue(casinoPage.getPaymentsFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPaymentsFooterElement(), exampleBundle.getString("payments_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void mobileSiteEnabledTest() throws Exception {
        assertTrue(casinoPage.getMobileSiteFooterElement().isDisplayed());
        assertTrue(casinoPage.getMobileSiteFooterElement().isEnabled());
        assertEquals(casinoPage.getTextMobileSiteFooterElement(), exampleBundle.getString("mobile_site_footer"));
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void affiliatesCUREnabledTest() throws Exception {
        assertTrue(casinoPage.getAffiliatesCURFooterElement().isDisplayed());
        assertTrue(casinoPage.getAffiliatesCURFooterElement().isEnabled());
        assertEquals(casinoPage.getTextAffiliatesCURFooterElement(), exampleBundle.getString("affiliates_cur_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void ourPartnersEnabledTest() throws Exception {
        assertTrue(casinoPage.getOurParntersFooterElement().isDisplayed());
        assertTrue(casinoPage.getOurParntersFooterElement().isEnabled());
        assertEquals(casinoPage.getTextOurParntersFooterElement(), exampleBundle.getString("our_partners_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void partnershipHistoryEnabledTest() throws Exception {
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isDisplayed());
        assertTrue(casinoPage.getPartnreshipHistoryFooterElement().isEnabled());
        assertEquals(casinoPage.getTextPartnreshipHistoryFooterElement(), exampleBundle.getString("partnership_history_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void helpEnabledTest() throws Exception {
        assertTrue(casinoPage.getHelpFooterElement().isDisplayed());
        assertTrue(casinoPage.getHelpFooterElement().isEnabled());
        assertEquals(casinoPage.getTextHelpFooterElement(), exampleBundle.getString("help_footer"));
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void manCityEnabledTest() throws Exception {
        assertTrue(casinoPage.getManCityElement().isDisplayed());
        assertTrue(casinoPage.getManCityElement().isEnabled());
    }

   /* @Test(groups = {"CUR2"})
    public void sevillaEnabledTest() throws Exception {
        assertTrue(casinoPage.getSevillaElement().isDisplayed());
        assertTrue(casinoPage.getSevillaElement().isEnabled());
    }*/

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void gironaEnabledTest() throws Exception {
        assertTrue(casinoPage.getGironaElement().isDisplayed());
        assertTrue(casinoPage.getGironaElement().isEnabled());
    }

   /* @Test(groups = {"CUR2"})
    public void dinamoEnabledTest() throws Exception {
        assertTrue(casinoPage.getDinamoElement().isDisplayed());
        assertTrue(casinoPage.getDinamoElement().isEnabled());
    }*/

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void karpatyEnabledTest() throws Exception {
        assertTrue(casinoPage.getKarpatyElement().isDisplayed());
        assertTrue(casinoPage.getKarpatyElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void zaragozaEnabledTest() throws Exception {
        assertTrue(casinoPage.getZaragozaElement().isDisplayed());
        assertTrue(casinoPage.getZaragozaElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void visaIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getVisaIconElement().isDisplayed());
        assertTrue(casinoPage.getVisaIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void mastercardIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getMastercardIconElement().isDisplayed());
        assertTrue(casinoPage.getMastercardIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void maestroIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getMaestroIconElement().isDisplayed());
        assertTrue(casinoPage.getMaestroIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void bankTransferIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getBankTransferIconElement().isDisplayed());
        assertTrue(casinoPage.getBankTransferIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void skrillIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getSkrillIconElement().isDisplayed());
        assertTrue(casinoPage.getSkrillIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void netellerIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getNetellerIconElement().isDisplayed());
        assertTrue(casinoPage.getNetellerIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void paySafeCardIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getPaySafeCardIconElement().isDisplayed());
        assertTrue(casinoPage.getPaySafeCardIconElement().isEnabled());
    }



    @Test(groups = {"EN", "RU", "PL","EC"})
    public void ecoPayzIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getEcoPayzIconElement().isDisplayed());
        assertTrue(casinoPage.getEcoPayzIconElement().isEnabled());
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void bitcoinEnabledTest() throws Exception {
        assertTrue(casinoPage.getBitcoinIconElement().isDisplayed());
        assertTrue(casinoPage.getBitcoinIconElement().isEnabled());
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void rgtDonorIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getRgtDonorIconElement().isDisplayed());
        assertTrue(casinoPage.getRgtDonorIconElement().isEnabled());
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void facebookIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getFacebookIconElement().isDisplayed());
        assertTrue(casinoPage.getFacebookIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void twitterIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getTwitterIconElement().isDisplayed());
        assertTrue(casinoPage.getTwitterIconElement().isEnabled());
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void ageRestrictionIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getAgeRestrictionIconElement().isDisplayed());
        assertTrue(casinoPage.getAgeRestrictionIconElement().isEnabled());
    }

    @Test(groups = {"EN", "RU", "PL","EC"})
    public void gamingLicensingIconEnabledTest() throws Exception {
        assertTrue(casinoPage.getGamblingLicensingIconElement().isDisplayed());
        assertTrue(casinoPage.getGamblingLicensingIconElement().isEnabled());
    }


    @Test(groups = {"EN", "RU", "PL","EC"})
    public void shutterstockLinkEnabledTest() throws Exception {
        assertTrue(casinoPage.getShutterstockLinkElement().isDisplayed());
        assertTrue(casinoPage.getShutterstockLinkElement().isEnabled());
    }


}
