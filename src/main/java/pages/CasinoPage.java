package pages;


import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static helper.Browser.takeSnapShot;

public class CasinoPage extends MainPage {
    public static Logger logger;

    public CasinoPage() throws Exception {
        super();
        initLogger("Elements and Methods");
    }

    public static void initLogger(String name) {
        logger = Logger.getLogger(name);
    }

    public static void info(String message) {
        logger.info(message);
    }

    public static void error(String message) {
        logger.error(message);
    }


    @FindBy(css = "input[data-id='auth_login']")
    protected WebElement loginFieldHeaderElement;
    @FindBy(css = "input[data-id='auth_login_password']")
    protected WebElement passwordFieldHeaderElement;
    @FindBy(xpath = "//button[contains(@class,'auth-form__submit')]")
    protected WebElement loginButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'auth-form__join-button')]")
    protected WebElement joinNowButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'auth-form__input-helper')]")
    protected WebElement lostPasswordHeaderElement;
    @FindBy(css = "div[id='any_message']")
    protected WebElement incorrectLoginMessageElement;
    @FindBy(css = "div[id='any_message'] button")
    protected WebElement incorrectLoginMessageOkButtonElement;
    @FindBy(xpath = "//*[@id='simplemodal-container']")
    protected WebElement loginMessageElement;
    @FindBy(xpath = "//div[@id='header_container']//descendant::a[@title='Marathonbet']")
    protected WebElement marathonbetIconHeaderElement;
    @FindBy(xpath = "//div[@id='header_container']//a[contains(@class,'logout')]")
    protected WebElement logoutButtonHeaderElement;
    @FindBy(xpath = "//a[contains(@class,'deposit')]")
    protected WebElement depositButtonHeaderElement;
    @FindBy(xpath = "//span[contains(@class,'marathon_icons-profile')]")
    protected WebElement myAccountButtonHeaderElement;
    @FindBy(xpath = "//span[@data-punter-balance-type='main']//ancestor::a/span")
    protected WebElement balanceNumberHeaderElement;
    @FindBy(xpath = "//span[@data-punter-balance-type='main']//ancestor::a")
    protected WebElement balanceCurrencyHeaderElement;

    @FindBy(xpath = "//section[contains(@class,'not-found')]//h2")
    protected WebElement notFoundTitle404Element;
    @FindBy(xpath = "//section[contains(@class,'not-found')]//p")
    protected WebElement notFoundBody404Element;
    @FindBy(xpath = "//section[contains(@class,'not-found')]//a")
    protected WebElement notFoundButton404Element;


    @FindBy(xpath = "//slick//parent::div//a[@ng-click='banner.bannerAction()']")
    protected WebElement bannerAutotestOpenGameElement;
    @FindBy(xpath = "//virtual-sports-game//span[normalize-space(text()) = 'oleg Autotest Betradar']")
    protected WebElement betradarGameElement;
    @FindBy(xpath = "//virtual-sports-game//span[normalize-space(text()) = 'oleg Autotest Betradar']")
    protected WebElement mgGameElement;

    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]")
    protected WebElement loginPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-modal-header__close')]")
    protected WebElement loginPopupCrossElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//h2[contains(@class,'title')]")
    protected WebElement loginPopupTitleElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//input[@name='login']")
    protected WebElement loginFieldLoginPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//input[@name='login_password']")
    protected WebElement passwordFieldLoginPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//a[contains(@class,'lostpass')]")
    protected WebElement lostPasswordLoginPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//button[contains(@class,'login')]")
    protected WebElement loginButtonPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//div[contains(@class,'gi-login-form')]//a[contains(@class,'join')]")
    protected WebElement joinNowButtonPopupElement;
    @FindBy(xpath = "//div[@id='errorMessage']//p")
    protected WebElement incorrectLoginMessagePopupElement;
    @FindBy(xpath = "//div[@id='errorMessage']//button//span")
    protected WebElement incorrectLoginMessageOkButtonPopupElement;
    @FindBy(xpath = "//div[@id='errorMessage']//a[contains(@href,'forgottenpassword.htm')]")
    protected WebElement hereLinkIncorrectLoginPopupElement;
    @FindBy(xpath = "//div[@id='errorMessage']//span[contains(@data-show-help,'/contact_us')]")
    protected WebElement customerSupportTeamLinkIncorrectLoginPopupElement;
    @FindBy(xpath = "//div[@id='rc-anchor-alert']")
    protected WebElement captchaPopupElement;
    @FindBy(xpath = "//div[@id='login-popup']//iframe[contains(@src,'www.google.com/recaptcha')]")
    protected WebElement iFrameCaptchaPopupElement;


    @FindBy(xpath = "//div[@class='tooltip invalid-tooltip'][1]")
    protected WebElement loginRequiredElement;
    @FindBy(xpath = "//div[@class='tooltip invalid-tooltip'][2]")
    protected WebElement passwordRequiredElement;

    @FindBy(xpath = "//launcher-popup//div[contains(@class,'gi-modal-header__close')]")
    protected WebElement crossInGameElement;
    @FindBy(xpath = "//iframe[contains(@class,'game-popup__container__iframe')]")
    protected WebElement iFrameGame;
    @FindBy(xpath = "//span[@class='gi-iframe-modal__error ng-binding ng-scope']")
    protected WebElement errorLaunchingGameElement;


    public WebElement getLoginFieldHeaderElement() { return loginFieldHeaderElement; }
    public WebElement getPasswordFieldHeaderElement() { return passwordFieldHeaderElement; }
    public WebElement getLoginButtonHeaderElement() { return loginButtonHeaderElement; }
    public WebElement getJoinNowButtonHeaderElement() { return joinNowButtonHeaderElement; }
    public WebElement getLostPasswordHeaderElement() { return lostPasswordHeaderElement; }
    public WebElement getIncorrectLoginMessageElement() { return incorrectLoginMessageElement; }
    public WebElement getLoginMessageElement() { return loginMessageElement; }
    public WebElement getIncorrectLoginMessageOkButtonElement() { return incorrectLoginMessageOkButtonElement; }
    public WebElement getMarathonbetIconHeaderElement() { return marathonbetIconHeaderElement; }
    public WebElement getLogoutButtonHeaderElement() { return logoutButtonHeaderElement; }
    public WebElement getDepositButtonHeaderElement() { return depositButtonHeaderElement; }
    public WebElement getMyAccountButtonHeaderElement() { return myAccountButtonHeaderElement; }
    public WebElement getBalanceNumberHeaderElement() { return balanceNumberHeaderElement; }
    public WebElement getBalanceCurrencyHeaderElement() { return balanceCurrencyHeaderElement; }

    public WebElement getBannerAutotestOpenGameElement() { return bannerAutotestOpenGameElement; }
    public WebElement getMgGameElement() { return mgGameElement; }
    public WebElement getBetradarGameElement() {return betradarGameElement; }

    public WebElement getNotFoundTitle404Element() { return notFoundTitle404Element; }
    public WebElement getNotFoundBody404Element() { return notFoundBody404Element; }
    public WebElement getNotFoundButton404Element() { return notFoundButton404Element; }

    public WebElement getLoginRequiredElement() { return loginRequiredElement; }
    public WebElement getPasswordRequiredElement() { return passwordRequiredElement; }
    public WebElement getLoginPopupElement() { return loginPopupElement; }
    public WebElement getLoginPopupCrossElement() { return loginPopupCrossElement; }
    public WebElement getLoginPopupTitleElement() { return loginPopupTitleElement; }
    public WebElement getLoginFieldLoginPopupElement() { return loginFieldLoginPopupElement; }
    public WebElement getPasswordFieldLoginPopupElement() { return passwordFieldLoginPopupElement; }
    public WebElement getLostPasswordLoginPopupElement() { return lostPasswordLoginPopupElement; }
    public WebElement getLoginButtonPopupElement() { return loginButtonPopupElement; }
    public WebElement getJoinNowButtonPopupElement() { return joinNowButtonPopupElement; }
    public WebElement getIncorrectLoginMessagePopupElement() { return incorrectLoginMessagePopupElement; }
    public WebElement getCaptchaPopupElement() { return captchaPopupElement; }
    public WebElement getiFrameCaptchaPopupElement() { return iFrameCaptchaPopupElement; }
    public WebElement getIncorrectLoginMessageOkButtonPopupElement() { return incorrectLoginMessageOkButtonPopupElement; }
    public WebElement getHereLinkIncorrectLoginPopupElement() { return hereLinkIncorrectLoginPopupElement; }
    public WebElement getCustomerSupportTeamLinkIncorrectLoginPopupElement() { return customerSupportTeamLinkIncorrectLoginPopupElement; }


    public WebElement getCrossInGameElement() { return crossInGameElement; }
    public WebElement getiFrameGame() { return iFrameGame; }
    public WebElement getErrorLaunchingGameElement() { return errorLaunchingGameElement; }





    public String getTextIncorrectLoginMessagePopupElement() { return incorrectLoginMessagePopupElement.getText(); }
    public String getTextLoginFieldHeaderElement() { return loginFieldHeaderElement.getAttribute("placeholder"); }
    public String getTextPasswordFieldHeaderElement() { return passwordFieldHeaderElement.getAttribute("placeholder"); }
    public String getTextLoginButtonHeaderElement() { return loginButtonHeaderElement.getText(); }
    public String getTextJoinNowButtonHeaderElement() { return joinNowButtonHeaderElement.getText(); }
    public String getTextLostPasswordHeaderElement() { return lostPasswordHeaderElement.getText(); }
    public String getTextLogoutButtonHeaderElement() { return logoutButtonHeaderElement.getText(); }
    public String getTextDepositButtonHeaderElement() { return depositButtonHeaderElement.getText(); }
    public String getTextMyAccountButtonHeaderElement() { return myAccountButtonHeaderElement.getText(); }
    public String getTextBalanceNumberHeaderElement() { return balanceNumberHeaderElement.getText(); }
    public String getTextBalanceCurrencyHeaderElement() { return balanceCurrencyHeaderElement.getText(); }
    public String getTextLoginPopupTitleElement() { return loginPopupTitleElement.getText(); }
    public String getTextLoginFieldLoginPopupElement() { return loginFieldLoginPopupElement.getAttribute("placeholder"); }
    public String getTextPasswordFieldLoginPopupElement() { return passwordFieldLoginPopupElement.getAttribute("placeholder"); }
    public String getTextHereLinkIncorrectLoginPopupElement() { return hereLinkIncorrectLoginPopupElement.getText(); }
    public String getTextCustomerSupportTeamLinkIncorrectLoginPopupElement() { return customerSupportTeamLinkIncorrectLoginPopupElement.getText(); }

    public String getTextNotFoundTitle404Element() { return notFoundTitle404Element.getText(); }
    public String getTextNotFoundBody404Element() { return notFoundBody404Element.getText(); }
    public String getTextNotFoundButton404Element() { return notFoundButton404Element.getText(); }
    public String getTextLostPasswordLoginPopupElement() { return lostPasswordLoginPopupElement.getText(); }
    public String getTextLoginButtonPopupElement() { return loginButtonPopupElement.getText(); }
    public String getTextJoinNowButtonPopupElement() { return joinNowButtonPopupElement.getText(); }


    public void fillLoginInHeader(String login) throws Exception {
        waitIfElementIsEnabledFluent(getLoginFieldHeaderElement(), 20, 2);
        getLoginFieldHeaderElement().sendKeys(login);
    }

    public void fillPasswordInHeader(String password) throws Exception {
        waitIfElementIsEnabledFluent(getPasswordFieldHeaderElement(), 20, 2);
        getPasswordFieldHeaderElement().sendKeys(password);
    }

    public void clickLoginButtonInHeader() throws Exception {
        clickIfElementIsClickableFluent(getLoginButtonHeaderElement());
    }

    public void login(String login, String password) throws Exception {
        logger.info("Login is started");
        fillLoginInHeader(login);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        fillPasswordInHeader(password);
        passwordFieldHeaderElement.sendKeys(Keys.TAB);
        clickLoginButtonInHeader();
        logger.info(("Data in login = '" + login + "' and password ='" + password + "' is entered, login button is clicked"));
    }


    public void correctLogin(String login, String password) throws Exception {
        logger.info("Login with correct data is started");
        fillLoginInHeader(login);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        fillPasswordInHeader(password);
        loginFieldHeaderElement.sendKeys(Keys.TAB);
        clickLoginButtonInHeader();
        logger.info(("Data in login = '" + login + "' and password ='" + password + "' is entered, login button is clicked"));
        waitIfElementIsEnabledFluent(getDepositButtonHeaderElement(), 20, 2);
        logger.info(("Login is successful"));
    }

    public void correctLoginByPopup(String login, String password) throws Exception {
        logger.info("Login with correct data is started");
        fillLoginInPopup(login);
        loginFieldLoginPopupElement.sendKeys(Keys.TAB);
        fillPasswordInPopup(password);
        clickLoginButtonInPopup();
        logger.info(("Data in login = '" + login + "' and password ='" + password + "' is entered, login button is clicked"));
        waitIfElementIsEnabledFluent(getDepositButtonHeaderElement(), 30, 2);
        logger.info(("Login is successful"));
    }



    public void fillLoginInPopup(String login) throws Exception {
        waitIfElementIsClickableFluent(getLoginFieldLoginPopupElement());
        getLoginFieldLoginPopupElement().sendKeys(login);
    }

    public void fillPasswordInPopup(String password) throws Exception {
        waitIfElementIsClickableFluent(getPasswordFieldLoginPopupElement());
        getPasswordFieldLoginPopupElement().sendKeys(password);
    }

    public void clickLoginButtonInPopup() throws Exception {
        clickIfElementIsClickableFluent(getLoginButtonPopupElement());
    }

    public void loginByPopup(String login, String password) throws Exception {
        logger.info("Login is started");
        fillLoginInPopup(login);
        loginFieldLoginPopupElement.sendKeys(Keys.TAB);
        fillPasswordInPopup(password);
        clickLoginButtonInPopup();
        logger.info("Data in login = '" + login + "' and password ='" + password + "' is entered, login button is clicked");
    }

    public void clickPlayButton(WebElement element) throws Exception {
        clickIfElementIsClickableFluent(element);
        logger.info("Play button is clicked");
    }


    public void closeGame() throws Exception {
        waitIfElementIsClickableFluent(getCrossInGameElement(), 30, 2);
        logger.info("Cross in game is clickable");
        clickIfElementIsClickableFluent(getCrossInGameElement());
        logger.info("Click cross in game is made");
    }


    public void waitForBanner(WebElement element) throws Exception {
        try {
            waitIfElementIsClickableFluent(element, 35, 1);
            logger.info("Banner is clickable");
        } catch (Exception e1) {
            logger.error("Banner isn't clickable");
            takeSnapShot();
        }
    }


    public void clickBanner(WebElement element) throws Exception {
        try {
            clickIfElementIsClickableFluent(element);
            logger.info("Click Banner is made");
        } catch (Exception e1) {
            logger.error("Click Banner isn't made");
            takeSnapShot();
        }
    }



    public void closeLoginPopup() throws Exception {
        waitIfElementIsClickableFluent(getLoginPopupCrossElement());
        clickIfElementIsClickableFluent(getLoginPopupCrossElement());
        logger.info("Login popup cross is clicked");
    }


    public void closeIncorectLoginMessage() throws Exception {
        waitIfElementIsClickableFluent(getIncorrectLoginMessageOkButtonElement());
        if (getIncorrectLoginMessageOkButtonElement().isDisplayed()) {
            logger.info("Incorrect login message popup is displayed");
        } else {
            logger.error("Incorrect login message popup isn't displayed");
            takeSnapShot();
        }
        clickIfElementIsClickableFluent(getIncorrectLoginMessageOkButtonElement());
        logger.info("Click OK button Incorrect Login Message Popup is made");
    }

    public void closeAndVerifyIncorectLoginPopupMessage() throws Exception {

        waitIfElementIsClickableFluent(getIncorrectLoginMessageOkButtonPopupElement());
        if (getIncorrectLoginMessageOkButtonPopupElement().isDisplayed()) {
            logger.info("Incorrect login message popup is displayed");
        } else {
            logger.error("Incorrect login message popup isn't displayed");
            takeSnapShot();
        }
        clickIfElementIsClickableFluent(getIncorrectLoginMessageOkButtonPopupElement());
        logger.info("Click OK button Incorrect Login Message Popup is made");
    }

    public void clickElement(WebElement element) throws Exception {
        clickIfElementIsClickableFluent(element);
        logger.info("Click " + element + "is made");
    }


}



