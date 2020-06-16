package info;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BetGamesTvGame;

import static helper.Browser.exampleBundle;
import static helper.Browser.takeSnapShot;
import static helper.ListenerSuite.suiteOfTests;
import static org.testng.Assert.assertTrue;


public class BetradarReal {

    BetGamesTvGame betGamesTvGame;
  /*  String oldBalanceInHeader;
    String bet;
    String possibleWin;
    String newBalanceInHeader;
    Double expectedBalance;
    String oldBalanceInHeaderFormat;
    String newBalanceInGame;
    String win;*/


    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        suiteOfTests.info(getClass().getSimpleName() + " is started");
        betGamesTvGame = new BetGamesTvGame();
        betGamesTvGame.correctLogin(exampleBundle.getString("correct_login"), exampleBundle.getString("correct_password"));

    }

  /*  @BeforeMethod(alwaysRun = true)
    public void setUpMethod() throws Exception {
        oldBalanceInHeader = betGamesTvGame.getBalance();
        oldBalanceInHeaderFormat=betGamesTvGame.deleteCommaInStr(oldBalanceInHeader);
        System.out.println("Old Balance in header is " + oldBalanceInHeaderFormat);
        betGamesTvGame.clickElement(betGamesTvGame.getBetGamesTvSearchResultGameElement());
    }
*/



   /* @AfterMethod(alwaysRun = true)
    public void tearDownMethod() throws Exception {

    }*/

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        betGamesTvGame.close();
        suiteOfTests.info(getClass().getSimpleName() + " is finished");
    }


     @Test(groups = {"EN", "RU", "PL","EC"}, priority = 1)
    public void crossInGameBetGamesTvRealTest() throws Exception {
        Double oldBalanceInHeader;
        String bet;
        String possibleWin;
        Double newBalanceInHeader;
        Double expectedBalance;
        String result;

        oldBalanceInHeader = betGamesTvGame.getAndFormatBalanceToDouble();
        System.out.println("Old Balance in header is " + oldBalanceInHeader);
        betGamesTvGame.clickElement(betGamesTvGame.getBetradarGameElement());
        betGamesTvGame.driverWait(5);
        betGamesTvGame.waitElement(betGamesTvGame.getCrossInGameElement());
        assertTrue(betGamesTvGame.getCrossInGameElement().isDisplayed());
        assertTrue(betGamesTvGame.getCrossInGameElement().isEnabled());
        betGamesTvGame.closeGame();

        betGamesTvGame.refreshPage();
        betGamesTvGame.driverWait(5);
        newBalanceInHeader = betGamesTvGame.getAndFormatBalanceToDouble();

        System.out.println("New Balance in header is " + newBalanceInHeader);
        assertTrue(newBalanceInHeader.equals(oldBalanceInHeader));
    }

    @Test(groups = {"EN", "RU", "PL","EC"}, priority = 2)
    public void betOnRedSpeedyRealTest() throws Exception {
        Double oldBalanceInHeader;
        String bet;
        String possibleWin;
        Double newBalanceInHeader;
        Double expectedBalance;
        String result;

        oldBalanceInHeader = betGamesTvGame.getAndFormatBalanceToDouble();
        System.out.println("Old Balance in header is " + oldBalanceInHeader);
        betGamesTvGame.clickElement(betGamesTvGame.getBetradarGameElement());
        String parentWindow = betGamesTvGame.getParentWindow();
        betGamesTvGame.switchToFrame(betGamesTvGame.getiFrameGame());
        betGamesTvGame.waitElement(betGamesTvGame.getBetInEuroSpeedy7());

        assertTrue(betGamesTvGame.getTextStakeAmountSpeedy7().equals("0€"));
        betGamesTvGame.waitIfElementIsEnabledFluent(betGamesTvGame.getSelectStakeMessageSpeedy7(), 10, 1);

        betGamesTvGame.clickElement(betGamesTvGame.getBetInEuroSpeedy7());
        possibleWin = betGamesTvGame.getTextPossibleWinRedSpeedy7();
        String possibleWinNumber = betGamesTvGame.removeLastSymbol(possibleWin);
        System.out.println("Possible win is " + possibleWin);
        assertTrue(betGamesTvGame.getTextStakeAmountSpeedy7().equals("1€"));

        betGamesTvGame.clickElement(betGamesTvGame.getChooseRedSpeedy7());
       /* if (betGamesTvGame.getTextBetButtonTextSpeedy7().equals("1€") {
            betGamesTvGame.getTextTotalCashoutSpeedy7().equals("1€"))
        } else
            betGamesTvGame.clickElement(betGamesTvGame.getChooseRedSpeedy7());*/

        betGamesTvGame.waitIfElementIsEnabledFluent(betGamesTvGame.getStakeAmountMessageSpeedy7(), 25, 1);
        /*bet = betGamesTvGame.getTextStakeAmountMessageSpeedy7();
        String betNumber = betGamesTvGame.removeLastSymbol(bet);
        System.out.println("Bet is " + bet);*/

        betGamesTvGame.waitIfElementIsEnabledFluent(betGamesTvGame.getBetAcceptedMessageSpeedy7(), 25, 1);
        System.out.println("Bet is accepted ");

        bet = betGamesTvGame.getTextBetButtonTextSpeedy7();
        String betNumber = betGamesTvGame.removeLastSymbol(bet);
        System.out.println("Bet is " + bet);

        betGamesTvGame.waitIfOneOfElementsAreVisible(betGamesTvGame.getLoseMessageMessageSpeedy7(), betGamesTvGame.getWinMessageSpeedy7(), 40, 1);
   //     betGamesTvGame.waitIfElementIsEnabled(betGamesTvGame.getBetButtonTextSpeedy7());
        result = betGamesTvGame.getTextBetButtonTextSpeedy7();
        System.out.println("Result is " + result);
        if (result.equals(bet)) {
            takeSnapShot();
            System.out.println("Bet is lose");
            expectedBalance = betGamesTvGame.round(oldBalanceInHeader - Double.parseDouble(betNumber),2);
            System.out.println("Expected balance is " + expectedBalance);
        } else {
            betGamesTvGame.clickIfElementIsClickableFluent(betGamesTvGame.getTotalCashoutSpeedy7());
            takeSnapShot();
            System.out.println("Bet is win");
            expectedBalance = betGamesTvGame.round(oldBalanceInHeader - Double.parseDouble(betNumber) + (Double.parseDouble(possibleWinNumber)),2);

            System.out.println("Expected balance is " + expectedBalance);
        }


        betGamesTvGame.switchToParentFrame(parentWindow);
        betGamesTvGame.closeGame();
        betGamesTvGame.refreshPage();
        betGamesTvGame.driverWait(5);
        newBalanceInHeader = betGamesTvGame.getAndFormatBalanceToDouble();
        System.out.println("New Balance in header is " + newBalanceInHeader);
        assertTrue(newBalanceInHeader.equals(expectedBalance));
    }


}
