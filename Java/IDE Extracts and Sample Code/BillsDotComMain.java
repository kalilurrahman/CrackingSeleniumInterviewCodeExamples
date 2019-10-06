import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComMain {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#s2id_unsecured_debt a.select2-choice")
    @CacheLookup
    private WebElement _3999930000;

    @FindBy(css = "a[href='/company/about?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(2) div.container.text-center.sonar-effect div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement askBillAQuestion;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement badCredit1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement badCredit2;

    @FindBy(css = "a[href='/credit/bad-credit?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement badCreditAdvice;

    @FindBy(css = "a[href='/debt/debt-consolidation/best-debt-consolidation-companies/debt-consolidation-companies?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement bestConsolidationCompanies;

    @FindBy(css = "#cssmenu ul li:nth-of-type(2) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bestPersonalLoanCompanies1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bestPersonalLoanCompanies2;

    @FindBy(css = "a.navbar-brand")
    @CacheLookup
    private WebElement billsCom;

    @FindBy(css = "a[href='/iq?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement billsIq;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement borrowingMoney1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement borrowingMoney2;

    @FindBy(css = "a[href='/personal-finance/guide?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement budgetGuide;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement budgeting1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement budgeting2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(1) a.text-left")
    @CacheLookup
    private WebElement buyAHome1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement buyAHome2;

    @FindBy(css = "a[href='/company/careers?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement careers;

    @FindBy(css = "a[href='/mortgage/refinance/cash-out-refinance?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement cashoutRefinance;

    @FindBy(css = "a[href='/mortgage/refinance/cash-out-refinance/cash-out-refinance-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement cashoutRefinanceCalculator;

    @FindBy(css = "a[href='/paying-off-debt/debt-consolidation/consolidate-debt?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement consolidateDebtCredit;

    @FindBy(css = "a[href='/company/contact?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) a")
    @CacheLookup
    private WebElement credit;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement credit1;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(3) div:nth-of-type(3) div:nth-of-type(2) div:nth-of-type(2) h3 a")
    @CacheLookup
    private WebElement credit2;

    @FindBy(css = "a[href='/credit/credit-cards/7-credit-card-mistakes?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement creditCardMistakes7;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(3) a")
    @CacheLookup
    private WebElement creditCards1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement creditCards2;

    @FindBy(css = "a[href='/credit/bad-credit/credit-repair?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement creditRepairBasics;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(1) a")
    @CacheLookup
    private WebElement creditReport1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement creditReport2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement creditScore1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement creditScore2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(3) a")
    @CacheLookup
    private WebElement debtConsolidation1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement debtConsolidation2;

    @FindBy(css = "a[href='/debt/tools/debt-consolidation-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement debtConsolidationCalculator;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(5) a")
    @CacheLookup
    private WebElement debtHelp1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(5) a")
    @CacheLookup
    private WebElement debtHelp2;

    @FindBy(css = "a[href='/debt-navigator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement debtNavigator;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(1) a")
    @CacheLookup
    private WebElement debtRelief1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement debtRelief2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement debtSettlement1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement debtSettlement2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(7) a.text-left")
    @CacheLookup
    private WebElement debtTools1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(7) a")
    @CacheLookup
    private WebElement debtTools2;

    @FindBy(css = "a[href='/mortgage/a-deed-in-lieu-of-foreclosure-vs-a-short-sale?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement deedInLieuVsShortSale;

    @FindBy(css = "a[href='/financial-health/savings/emergency-fund-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement emergencyFundCalculator;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(1) div.container div.get-dropdown-container.col-md-12 div:nth-of-type(2) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement expertFinancialAdvice;

    @FindBy(css = "a[href='/mortgage/home-purchase/fha-loans?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement fhaLoans;

    @FindBy(css = "a[href='/financial-health?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement financialHealth;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) a")
    @CacheLookup
    private WebElement financialHealth;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(6) a")
    @CacheLookup
    private WebElement financialHealthBlog1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(6) a")
    @CacheLookup
    private WebElement financialHealthBlog2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(1) a")
    @CacheLookup
    private WebElement financialHealthSurvey1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement financialHealthSurvey2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(5) a")
    @CacheLookup
    private WebElement financialPlanning1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(5) a")
    @CacheLookup
    private WebElement financialPlanning2;

    @FindBy(css = "#element-118543 div.ctabluepanel div:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement financialhealthscore1;

    @FindBy(css = "#element-118543 div.ctabluepanel div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement financialhealthscore2;

    @FindBy(css = "a[href='https://www.bills.com/user/forgot-password/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=BillsSEO']")
    @CacheLookup
    private WebElement forgotYourPasswordClickHere;

    @FindBy(css = "a[href='https://www.bills.com/debt-navigator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=BillsSEO']")
    @CacheLookup
    private WebElement getACheckUpWithDebt;

    @FindBy(css = "a[href='/mortgage/mortgage-tips-part2-getting-an-affordable-mortgage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement getAnAffordableMortgage;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(2) div.container.text-center.sonar-effect div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement getDebtHelp;

    @FindBy(css = "button.btn.btn-warning.btn-lg")
    @CacheLookup
    private WebElement getEstimate;

    @FindBy(css = "#element-118543 div.ctabluepanel div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement getStarted;

    @FindBy(css = "#element-118543 div.ctabluepanel div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement getYourFinancialHealthScore1;

    @FindBy(id = "s2id_autogen4")
    @CacheLookup
    private WebElement getYourFinancialHealthScore2;

    @FindBy(css = "#s2id_current_or_past_due div.select2-drop.select2-display-none div.select2-search.select2-search-hidden.select2-offscreen input.select2-input[type='text']")
    @CacheLookup
    private WebElement getYourFinancialHealthScore3;

    @FindBy(id = "current_or_past_due")
    @CacheLookup
    private WebElement getYourFinancialHealthScore4;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(2) div.container.text-center.sonar-effect div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement getYourRateNow;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement harpProgram1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement harpProgram2;

    @FindBy(css = "a[href='/mortgage/reversemortgage/home-equity-conversion-mortgage/hecm?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement hecm;

    @FindBy(css = "a[href='/mortgage/mortgage-affordability-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement homeAffordabilityCalculator;

    @FindBy(css = "a[href='/mortgage/refinance/home-equity-line?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement homeEquityLoanOverview;

    @FindBy(id = "s2id_autogen1")
    @CacheLookup
    private WebElement howMuchDoYouOwe1;

    @FindBy(css = "#s2id_unsecured_debt div.select2-drop.select2-display-none.select2-with-searchbox div.select2-search input.select2-input[type='text']")
    @CacheLookup
    private WebElement howMuchDoYouOwe2;

    @FindBy(id = "unsecured_debt")
    @CacheLookup
    private WebElement howMuchDoYouOwe3;

    @FindBy(css = "a[href='/paying-off-debt/debt-consolidation/how-to-consolidate-bad-credit-debt?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement howToConsolidateBadCreditDebt;

    @FindBy(css = "a[href='/credit/credit-score/understanding-your-credit-score?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement howYourCreditScoreWorks;

    @FindBy(css = "a[href='http://www.nmlsconsumeraccess.org?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=BillsSEO']")
    @CacheLookup
    private WebElement httpwwwNmlsconsumeraccessOrg;

    @FindBy(css = "a.pan.lnk_signup")
    @CacheLookup
    private WebElement joinNow;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement keepMeSignedIn1;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement keepMeSignedIn2;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement keepMeSignedIn3;

    @FindBy(id = "password")
    @CacheLookup
    private WebElement keepMeSignedIn4;

    @FindBy(name = "remember")
    @CacheLookup
    private WebElement keepMeSignedIn5;

    @FindBy(id = "user-login-button")
    @CacheLookup
    private WebElement logIn;

    @FindBy(id = "user-login")
    @CacheLookup
    private WebElement logIn1;

    @FindBy(css = "a[href='/login/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement logIn2;

    @FindBy(css = "a[href='/debt/debt-management/get-a-loan/low-interest-personal-loans?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement lowInterestPersonalLoans;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(1) div.container div.get-dropdown-container.col-md-12 div:nth-of-type(2) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement lowMortgageRates;

    @FindBy(css = "a[href='/debt/debt-consolidation/bill-consolidation/low-interest-bill-consolidation-loans?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement lowinterestConsolidationLoans;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(3) div:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(2) h3 a")
    @CacheLookup
    private WebElement manageDebt;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement managingDebt1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement managingDebt2;

    @FindBy(css = "a[href='/company/press-releases/media-coverage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement mediaCoverage;

    @FindBy(css = "a[href='/credit/credit-score/minimum-credit-score?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement minimumCreditScoreForHomeLoan;

    @FindBy(css = "a[href='/mortgage/minimum-credit-score-mortgage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement minimumCreditScoreMortgage;

    @FindBy(css = "a[href='/debt/tools/debt-repayment-calculator/minimum-payment-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement minimumPaymentCalculator;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mortgage;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mortgage1;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) h3 a")
    @CacheLookup
    private WebElement mortgage2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(6) a")
    @CacheLookup
    private WebElement mortgageLenderReview1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(6) a")
    @CacheLookup
    private WebElement mortgageLenderReview2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(5) a")
    @CacheLookup
    private WebElement mortgageRates1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(5) a")
    @CacheLookup
    private WebElement mortgageRates2;

    @FindBy(css = "a[href='/mortgage/refinance/no-cost-mortgage-refinancing?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement noCostMortgageRefinance;

    private final String pageLoadedText = "com receives financial compensation from referrals we make to providers of different financial service products";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='/debt-payoff-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement payOffDebt;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) a")
    @CacheLookup
    private WebElement payOffDebt;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(3) div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(2) h3 a")
    @CacheLookup
    private WebElement personalFinance;

    @FindBy(css = "#cssmenu ul li:nth-of-type(2) div.l2 div.container ul.container li:nth-of-type(3) a")
    @CacheLookup
    private WebElement personalLoanCalculator1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement personalLoanCalculator2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(2) div.l2 div.container ul.container li:nth-of-type(1) a")
    @CacheLookup
    private WebElement personalLoanRates1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement personalLoanRates2;

    @FindBy(css = "a[href='/personal-loans?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement personalLoans;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(2) a")
    @CacheLookup
    private WebElement personalLoans;

    @FindBy(css = "a[href='/privacypolicy?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement privacyPolicy1;

    @FindBy(css = "a[href='https://media.bills.com/privacy-notice.pdf']")
    @CacheLookup
    private WebElement privacyPolicy2;

    @FindBy(css = "a[href='/mortgage/refinance/refinancing-a-home?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement reasonsForRefinancing;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(2) a.text-left")
    @CacheLookup
    private WebElement refinance1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement refinance2;

    @FindBy(css = "a[href='/mortgage/refinance/calculator-mortgage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement refinanceCalculator;

    @FindBy(css = "a[href='/mortgage/refinance/refinance-arm?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement refinancingAnArm;

    @FindBy(css = "#cssmenu ul li:nth-of-type(3) div.l2 div.container ul.container li:nth-of-type(3) a.text-left")
    @CacheLookup
    private WebElement reverseMortgage1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement reverseMortgage2;

    @FindBy(css = "a[href='/mortgage/reversemortgage/how-does-a-reverse-mortgage-work?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement reverseMortgageQualifying;

    @FindBy(css = "div:nth-of-type(3) div.home-page.main-template section:nth-of-type(1) div.container div.get-dropdown-container.col-md-12 div:nth-of-type(2) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement ridOfYourDebtFaster;

    @FindBy(css = "a[href='/safe-secure?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement safeAndSecure;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(3) a")
    @CacheLookup
    private WebElement savings1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement savings2;

    @FindBy(id = "site_search")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "#s2id_current_or_past_due a.select2-choice")
    @CacheLookup
    private WebElement select1;

    @FindBy(css = "#s2id_state a.select2-choice")
    @CacheLookup
    private WebElement select2;

    @FindBy(css = "#signup_modal div.modal-dialog div.modal-content div:nth-of-type(2) div div:nth-of-type(2) form.user-signup-form input:nth-of-type(3)")
    @CacheLookup
    private WebElement signUp;

    @FindBy(css = "nav.navbar.navbar-default.navbar-fixed-top.header_wrapper div.container div:nth-of-type(1) div.user-nav a:nth-of-type(2)")
    @CacheLookup
    private WebElement signUp1;

    @FindBy(css = "a[href='/signup/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement signUp2;

    @FindBy(css = "input.btn.btn-warning.btn-xs")
    @CacheLookup
    private WebElement signUp3;

    @FindBy(name = "subscribeEmail")
    @CacheLookup
    private WebElement signUpForTheBills;

    @FindBy(css = "#main div:nth-of-type(3) div.container div:nth-of-type(1) div:nth-of-type(1) table.mtl.mbl.footer-accredits tbody tr td:nth-of-type(4) a")
    @CacheLookup
    private WebElement siteIsListedInDunnAnd;

    @FindBy(css = "a[title='Site is secured by verisign']")
    @CacheLookup
    private WebElement siteIsSecuredByVerisign;

    @FindBy(css = "a[href='/sitemap/siteindex?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement sitemap;

    @FindBy(css = "a[href='/mortgage/refinance/2018-refinance-mortgage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement stillGoodReasonsToRefinanceIn;

    @FindBy(css = "a[href='/company/team?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement team;

    @FindBy(css = "a[href='/company/terms-of-use?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement termsOfUse1;

    @FindBy(css = "a[href='/terms-of-use/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement termsOfUse2;

    @FindBy(css = "nav.navbar.navbar-default.navbar-fixed-top.header_wrapper div.container div:nth-of-type(2) div:nth-of-type(1) button")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "a[href='//privacy.truste.com/privacy-seal/validation?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&rid=42d5d06c-c2ce-4a1b-8910-2bf6aeedf98a']")
    @CacheLookup
    private WebElement truste;

    @FindBy(css = "a[href='/mortgage/refinance/refinance-from-fha-to-conventional-loan?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement twoReasonsToRefinanceFromFha;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(6) a")
    @CacheLookup
    private WebElement typesOfDebt1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(6) a")
    @CacheLookup
    private WebElement typesOfDebt2;

    @FindBy(css = "a[href='/credit/credit-score/how-to-improve-your-credit-score?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement waysToImproveYourCredit7;

    @FindBy(css = "a[href='/debt/tools/ways-to-save?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement waysToSaveMoney;

    @FindBy(id = "s2id_autogen3")
    @CacheLookup
    private WebElement whatStateDoYouLiveIn1;

    @FindBy(css = "#s2id_state div.select2-drop.select2-display-none.select2-with-searchbox div.select2-search input.select2-input[type='text']")
    @CacheLookup
    private WebElement whatStateDoYouLiveIn2;

    @FindBy(id = "state")
    @CacheLookup
    private WebElement whatStateDoYouLiveIn3;

    @FindBy(css = "a[href='/personal-finance/bitcoin/will-bitcoin-fail?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement willBitcoinFail;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead1;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead2;

    @FindBy(name = "confirm_password")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead3;

    public BillsDotComMain() {
    }

    public BillsDotComMain(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComMain(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComMain(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 30000 39999 Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain click39999Link30000() {
        _3999930000.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Ask Bill A Question Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickAskBillAQuestionLink() {
        askBillAQuestion.click();
        return this;
    }

    /**
     * Click on Bad Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBadCredit1Link() {
        badCredit1.click();
        return this;
    }

    /**
     * Click on Bad Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBadCredit2Link() {
        badCredit2.click();
        return this;
    }

    /**
     * Click on Bad Credit Advice Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBadCreditAdviceLink() {
        badCreditAdvice.click();
        return this;
    }

    /**
     * Click on Best Consolidation Companies Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBestConsolidationCompaniesLink() {
        bestConsolidationCompanies.click();
        return this;
    }

    /**
     * Click on Best Personal Loan Companies Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBestPersonalLoanCompanies1Link() {
        bestPersonalLoanCompanies1.click();
        return this;
    }

    /**
     * Click on Best Personal Loan Companies Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBestPersonalLoanCompanies2Link() {
        bestPersonalLoanCompanies2.click();
        return this;
    }

    /**
     * Click on Bills.com Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBillsComLink() {
        billsCom.click();
        return this;
    }

    /**
     * Click on Bills Iq Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBillsIqLink() {
        billsIq.click();
        return this;
    }

    /**
     * Click on Borrowing Money Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBorrowingMoney1Link() {
        borrowingMoney1.click();
        return this;
    }

    /**
     * Click on Borrowing Money Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBorrowingMoney2Link() {
        borrowingMoney2.click();
        return this;
    }

    /**
     * Click on Budget Guide Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBudgetGuideLink() {
        budgetGuide.click();
        return this;
    }

    /**
     * Click on Budgeting Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBudgeting1Link() {
        budgeting1.click();
        return this;
    }

    /**
     * Click on Budgeting Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBudgeting2Link() {
        budgeting2.click();
        return this;
    }

    /**
     * Click on Buy A Home Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBuyAHome1Link() {
        buyAHome1.click();
        return this;
    }

    /**
     * Click on Buy A Home Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickBuyAHome2Link() {
        buyAHome2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Cashout Refinance Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCashoutRefinanceCalculatorLink() {
        cashoutRefinanceCalculator.click();
        return this;
    }

    /**
     * Click on Cashout Refinance Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCashoutRefinanceLink() {
        cashoutRefinance.click();
        return this;
    }

    /**
     * Click on Consolidate Debt Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickConsolidateDebtCreditLink() {
        consolidateDebtCredit.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCredit1Link() {
        credit1.click();
        return this;
    }

    /**
     * Click on Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCredit2Link() {
        credit2.click();
        return this;
    }

    /**
     * Click on 7 Credit Card Mistakes Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditCardMistakesLink7() {
        creditCardMistakes7.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditCards1Link() {
        creditCards1.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditCards2Link() {
        creditCards2.click();
        return this;
    }

    /**
     * Click on Credit Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditLink() {
        credit.click();
        return this;
    }

    /**
     * Click on Credit Repair Basics Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditRepairBasicsLink() {
        creditRepairBasics.click();
        return this;
    }

    /**
     * Click on Credit Report Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditReport1Link() {
        creditReport1.click();
        return this;
    }

    /**
     * Click on Credit Report Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditReport2Link() {
        creditReport2.click();
        return this;
    }

    /**
     * Click on Credit Score Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditScore1Link() {
        creditScore1.click();
        return this;
    }

    /**
     * Click on Credit Score Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickCreditScore2Link() {
        creditScore2.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtConsolidation1Link() {
        debtConsolidation1.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtConsolidation2Link() {
        debtConsolidation2.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtConsolidationCalculatorLink() {
        debtConsolidationCalculator.click();
        return this;
    }

    /**
     * Click on Debt Help Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtHelp1Link() {
        debtHelp1.click();
        return this;
    }

    /**
     * Click on Debt Help Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtHelp2Link() {
        debtHelp2.click();
        return this;
    }

    /**
     * Click on Debt Navigator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtNavigatorLink() {
        debtNavigator.click();
        return this;
    }

    /**
     * Click on Debt Relief Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtRelief1Link() {
        debtRelief1.click();
        return this;
    }

    /**
     * Click on Debt Relief Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtRelief2Link() {
        debtRelief2.click();
        return this;
    }

    /**
     * Click on Debt Settlement Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtSettlement1Link() {
        debtSettlement1.click();
        return this;
    }

    /**
     * Click on Debt Settlement Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtSettlement2Link() {
        debtSettlement2.click();
        return this;
    }

    /**
     * Click on Debt Tools Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtTools1Link() {
        debtTools1.click();
        return this;
    }

    /**
     * Click on Debt Tools Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDebtTools2Link() {
        debtTools2.click();
        return this;
    }

    /**
     * Click on Deed In Lieu Vs. Short Sale Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickDeedInLieuVsShortSaleLink() {
        deedInLieuVsShortSale.click();
        return this;
    }

    /**
     * Click on Emergency Fund Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickEmergencyFundCalculatorLink() {
        emergencyFundCalculator.click();
        return this;
    }

    /**
     * Click on Expert Financial Advice Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickExpertFinancialAdviceLink() {
        expertFinancialAdvice.click();
        return this;
    }

    /**
     * Click on Fha Loans Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFhaLoansLink() {
        fhaLoans.click();
        return this;
    }

    /**
     * Click on Financial Health Blog Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthBlog1Link() {
        financialHealthBlog1.click();
        return this;
    }

    /**
     * Click on Financial Health Blog Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthBlog2Link() {
        financialHealthBlog2.click();
        return this;
    }

    /**
     * Click on Financial Health Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthLink() {
        financialHealth.click();
        return this;
    }

    /**
     * Click on Financial Health Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthLink() {
        financialHealth.click();
        return this;
    }

    /**
     * Click on Financial Health Survey Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthSurvey1Link() {
        financialHealthSurvey1.click();
        return this;
    }

    /**
     * Click on Financial Health Survey Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialHealthSurvey2Link() {
        financialHealthSurvey2.click();
        return this;
    }

    /**
     * Click on Financial Planning Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialPlanning1Link() {
        financialPlanning1.click();
        return this;
    }

    /**
     * Click on Financial Planning Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialPlanning2Link() {
        financialPlanning2.click();
        return this;
    }

    /**
     * Click on Financialhealthscore Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialhealthscore1Link() {
        financialhealthscore1.click();
        return this;
    }

    /**
     * Click on Financialhealthscore Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickFinancialhealthscore2Link() {
        financialhealthscore2.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Click Here. Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickForgotYourPasswordClickHereLink() {
        forgotYourPasswordClickHere.click();
        return this;
    }

    /**
     * Click on Get A Check Up With Debt Navigator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetACheckUpWithDebtLink() {
        getACheckUpWithDebt.click();
        return this;
    }

    /**
     * Click on Get An Affordable Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetAnAffordableMortgageLink() {
        getAnAffordableMortgage.click();
        return this;
    }

    /**
     * Click on Get Debt Help Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetDebtHelpLink() {
        getDebtHelp.click();
        return this;
    }

    /**
     * Click on Get Estimate Button.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetEstimateButton() {
        getEstimate.click();
        return this;
    }

    /**
     * Click on Get Started Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetStartedLink() {
        getStarted.click();
        return this;
    }

    /**
     * Click on Get Your Rate Now Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickGetYourRateNowLink() {
        getYourRateNow.click();
        return this;
    }

    /**
     * Click on Harp Program Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHarpProgram1Link() {
        harpProgram1.click();
        return this;
    }

    /**
     * Click on Harp Program Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHarpProgram2Link() {
        harpProgram2.click();
        return this;
    }

    /**
     * Click on Hecm Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHecmLink() {
        hecm.click();
        return this;
    }

    /**
     * Click on Home Affordability Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHomeAffordabilityCalculatorLink() {
        homeAffordabilityCalculator.click();
        return this;
    }

    /**
     * Click on Home Equity Loan Overview Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHomeEquityLoanOverviewLink() {
        homeEquityLoanOverview.click();
        return this;
    }

    /**
     * Click on How To Consolidate Bad Credit Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHowToConsolidateBadCreditDebtLink() {
        howToConsolidateBadCreditDebt.click();
        return this;
    }

    /**
     * Click on How Your Credit Score Works Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHowYourCreditScoreWorksLink() {
        howYourCreditScoreWorks.click();
        return this;
    }

    /**
     * Click on Httpwww.nmlsconsumeraccess.org Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickHttpwwwNmlsconsumeraccessOrgLink() {
        httpwwwNmlsconsumeraccessOrg.click();
        return this;
    }

    /**
     * Click on Join Now Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickJoinNowLink() {
        joinNow.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLogIn1Link() {
        logIn1.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLogIn2Link() {
        logIn2.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Low Interest Personal Loans Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLowInterestPersonalLoansLink() {
        lowInterestPersonalLoans.click();
        return this;
    }

    /**
     * Click on Low Mortgage Rates Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLowMortgageRatesLink() {
        lowMortgageRates.click();
        return this;
    }

    /**
     * Click on Lowinterest Consolidation Loans Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickLowinterestConsolidationLoansLink() {
        lowinterestConsolidationLoans.click();
        return this;
    }

    /**
     * Click on Manage Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickManageDebtLink() {
        manageDebt.click();
        return this;
    }

    /**
     * Click on Managing Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickManagingDebt1Link() {
        managingDebt1.click();
        return this;
    }

    /**
     * Click on Managing Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickManagingDebt2Link() {
        managingDebt2.click();
        return this;
    }

    /**
     * Click on Media Coverage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMediaCoverageLink() {
        mediaCoverage.click();
        return this;
    }

    /**
     * Click on Minimum Credit Score For Home Loan Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMinimumCreditScoreForHomeLoanLink() {
        minimumCreditScoreForHomeLoan.click();
        return this;
    }

    /**
     * Click on Minimum Credit Score Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMinimumCreditScoreMortgageLink() {
        minimumCreditScoreMortgage.click();
        return this;
    }

    /**
     * Click on Minimum Payment Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMinimumPaymentCalculatorLink() {
        minimumPaymentCalculator.click();
        return this;
    }

    /**
     * Click on Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgage1Link() {
        mortgage1.click();
        return this;
    }

    /**
     * Click on Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgage2Link() {
        mortgage2.click();
        return this;
    }

    /**
     * Click on Mortgage Lender Review Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgageLenderReview1Link() {
        mortgageLenderReview1.click();
        return this;
    }

    /**
     * Click on Mortgage Lender Review Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgageLenderReview2Link() {
        mortgageLenderReview2.click();
        return this;
    }

    /**
     * Click on Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgageLink() {
        mortgage.click();
        return this;
    }

    /**
     * Click on Mortgage Rates Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgageRates1Link() {
        mortgageRates1.click();
        return this;
    }

    /**
     * Click on Mortgage Rates Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickMortgageRates2Link() {
        mortgageRates2.click();
        return this;
    }

    /**
     * Click on No Cost Mortgage Refinance Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickNoCostMortgageRefinanceLink() {
        noCostMortgageRefinance.click();
        return this;
    }

    /**
     * Click on Pay Off Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPayOffDebtLink() {
        payOffDebt.click();
        return this;
    }

    /**
     * Click on Pay Off Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPayOffDebtLink() {
        payOffDebt.click();
        return this;
    }

    /**
     * Click on Personal Finance Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalFinanceLink() {
        personalFinance.click();
        return this;
    }

    /**
     * Click on Personal Loan Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoanCalculator1Link() {
        personalLoanCalculator1.click();
        return this;
    }

    /**
     * Click on Personal Loan Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoanCalculator2Link() {
        personalLoanCalculator2.click();
        return this;
    }

    /**
     * Click on Personal Loan Rates Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoanRates1Link() {
        personalLoanRates1.click();
        return this;
    }

    /**
     * Click on Personal Loan Rates Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoanRates2Link() {
        personalLoanRates2.click();
        return this;
    }

    /**
     * Click on Personal Loans Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoansLink() {
        personalLoans.click();
        return this;
    }

    /**
     * Click on Personal Loans Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPersonalLoansLink() {
        personalLoans.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPrivacyPolicy1Link() {
        privacyPolicy1.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickPrivacyPolicy2Link() {
        privacyPolicy2.click();
        return this;
    }

    /**
     * Click on Reasons For Refinancing Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickReasonsForRefinancingLink() {
        reasonsForRefinancing.click();
        return this;
    }

    /**
     * Click on Refinance Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickRefinance1Link() {
        refinance1.click();
        return this;
    }

    /**
     * Click on Refinance Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickRefinance2Link() {
        refinance2.click();
        return this;
    }

    /**
     * Click on Refinance Calculator Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickRefinanceCalculatorLink() {
        refinanceCalculator.click();
        return this;
    }

    /**
     * Click on Refinancing An Arm Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickRefinancingAnArmLink() {
        refinancingAnArm.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickReverseMortgage1Link() {
        reverseMortgage1.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickReverseMortgage2Link() {
        reverseMortgage2.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Qualifying Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickReverseMortgageQualifyingLink() {
        reverseMortgageQualifying.click();
        return this;
    }

    /**
     * Click on Rid Of Your Debt Faster Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickRidOfYourDebtFasterLink() {
        ridOfYourDebtFaster.click();
        return this;
    }

    /**
     * Click on Safe And Secure Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSafeAndSecureLink() {
        safeAndSecure.click();
        return this;
    }

    /**
     * Click on Savings Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSavings1Link() {
        savings1.click();
        return this;
    }

    /**
     * Click on Savings Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSavings2Link() {
        savings2.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Select Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSelect1Link() {
        select1.click();
        return this;
    }

    /**
     * Click on Select Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSelect2Link() {
        select2.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSignUp1Link() {
        signUp1.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSignUp2Link() {
        signUp2.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSignUp3Button() {
        signUp3.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSignUpButton() {
        signUp.click();
        return this;
    }

    /**
     * Click on Site Is Listed In Dunn And Bradstreets Power Profiles Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSiteIsListedInDunnAndLink() {
        siteIsListedInDunnAnd.click();
        return this;
    }

    /**
     * Click on Site Is Secured By Verisign Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSiteIsSecuredByVerisignLink() {
        siteIsSecuredByVerisign.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Still Good Reasons To Refinance In 2018 Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickStillGoodReasonsToRefinanceInLink() {
        stillGoodReasonsToRefinanceIn.click();
        return this;
    }

    /**
     * Click on Team Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTeamLink() {
        team.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTermsOfUse1Link() {
        termsOfUse1.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTermsOfUse2Link() {
        termsOfUse2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Truste Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTrusteLink() {
        truste.click();
        return this;
    }

    /**
     * Click on Two Reasons To Refinance From Fha To Conventional Loan Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTwoReasonsToRefinanceFromFhaLink() {
        twoReasonsToRefinanceFromFha.click();
        return this;
    }

    /**
     * Click on Types Of Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTypesOfDebt1Link() {
        typesOfDebt1.click();
        return this;
    }

    /**
     * Click on Types Of Debt Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickTypesOfDebt2Link() {
        typesOfDebt2.click();
        return this;
    }

    /**
     * Click on 7 Ways To Improve Your Credit Score Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickWaysToImproveYourCreditLink7() {
        waysToImproveYourCredit7.click();
        return this;
    }

    /**
     * Click on Ways To Save Money Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickWaysToSaveMoneyLink() {
        waysToSaveMoney.click();
        return this;
    }

    /**
     * Click on Will Bitcoin Fail Link.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain clickWillBitcoinFailLink() {
        willBitcoinFail.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain fill() {
        setKeepMeSignedIn1TextField();
        setKeepMeSignedIn2TextField();
        setHowMuchDoYouOwe1TextField();
        setHowMuchDoYouOwe2TextField();
        setHowMuchDoYouOwe3DropDownListField();
        setGetYourFinancialHealthScore2TextField();
        setGetYourFinancialHealthScore3TextField();
        setGetYourFinancialHealthScore4DropDownListField();
        setWhatStateDoYouLiveIn1TextField();
        setWhatStateDoYouLiveIn2TextField();
        setWhatStateDoYouLiveIn3DropDownListField();
        setSignUpForTheBillsTextField();
        setKeepMeSignedIn3TextField();
        setKeepMeSignedIn4PasswordField();
        setKeepMeSignedIn5CheckboxField();
        setYouCertifyThatYouHaveRead1PasswordField();
        setYouCertifyThatYouHaveRead2PasswordField();
        setYouCertifyThatYouHaveRead3PasswordField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore1TextField() {
        return setGetYourFinancialHealthScore1TextField(data.get("GET_YOUR_FINANCIAL_HEALTH_SCORE_1"));
    }

    /**
     * Set value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore1TextField(String getYourFinancialHealthScore1Value) {
        getYourFinancialHealthScore1.click();
        return this;
    }

    /**
     * Set default value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore2TextField() {
        return setGetYourFinancialHealthScore2TextField(data.get("GET_YOUR_FINANCIAL_HEALTH_SCORE_2"));
    }

    /**
     * Set value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore2TextField(String getYourFinancialHealthScore2Value) {
        getYourFinancialHealthScore2.sendKeys(getYourFinancialHealthScore2Value);
        return this;
    }

    /**
     * Set default value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore3TextField() {
        return setGetYourFinancialHealthScore3TextField(data.get("GET_YOUR_FINANCIAL_HEALTH_SCORE_3"));
    }

    /**
     * Set value to Get Your Financial Health Score Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore3TextField(String getYourFinancialHealthScore3Value) {
        getYourFinancialHealthScore3.sendKeys(getYourFinancialHealthScore3Value);
        return this;
    }

    /**
     * Set default value to Get Your Financial Health Score Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore4DropDownListField() {
        return setGetYourFinancialHealthScore4DropDownListField(data.get("GET_YOUR_FINANCIAL_HEALTH_SCORE_4"));
    }

    /**
     * Set value to Get Your Financial Health Score Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setGetYourFinancialHealthScore4DropDownListField(String getYourFinancialHealthScore4Value) {
        new Select(getYourFinancialHealthScore4).selectByVisibleText(getYourFinancialHealthScore4Value);
        return this;
    }

    /**
     * Set default value to How Much Do You Owe Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe1TextField() {
        return setHowMuchDoYouOwe1TextField(data.get("HOW_MUCH_DO_YOU_OWE_1"));
    }

    /**
     * Set value to How Much Do You Owe Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe1TextField(String howMuchDoYouOwe1Value) {
        howMuchDoYouOwe1.sendKeys(howMuchDoYouOwe1Value);
        return this;
    }

    /**
     * Set default value to How Much Do You Owe Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe2TextField() {
        return setHowMuchDoYouOwe2TextField(data.get("HOW_MUCH_DO_YOU_OWE_2"));
    }

    /**
     * Set value to How Much Do You Owe Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe2TextField(String howMuchDoYouOwe2Value) {
        howMuchDoYouOwe2.sendKeys(howMuchDoYouOwe2Value);
        return this;
    }

    /**
     * Set default value to How Much Do You Owe Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe3DropDownListField() {
        return setHowMuchDoYouOwe3DropDownListField(data.get("HOW_MUCH_DO_YOU_OWE_3"));
    }

    /**
     * Set value to How Much Do You Owe Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setHowMuchDoYouOwe3DropDownListField(String howMuchDoYouOwe3Value) {
        new Select(howMuchDoYouOwe3).selectByVisibleText(howMuchDoYouOwe3Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn1TextField() {
        return setKeepMeSignedIn1TextField(data.get("KEEP_ME_SIGNED_IN_1"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn1TextField(String keepMeSignedIn1Value) {
        keepMeSignedIn1.sendKeys(keepMeSignedIn1Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn2TextField() {
        return setKeepMeSignedIn2TextField(data.get("KEEP_ME_SIGNED_IN_2"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn2TextField(String keepMeSignedIn2Value) {
        keepMeSignedIn2.sendKeys(keepMeSignedIn2Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn3TextField() {
        return setKeepMeSignedIn3TextField(data.get("KEEP_ME_SIGNED_IN_3"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn3TextField(String keepMeSignedIn3Value) {
        keepMeSignedIn3.sendKeys(keepMeSignedIn3Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn4PasswordField() {
        return setKeepMeSignedIn4PasswordField(data.get("KEEP_ME_SIGNED_IN_4"));
    }

    /**
     * Set value to Keep Me Signed In Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn4PasswordField(String keepMeSignedIn4Value) {
        keepMeSignedIn4.sendKeys(keepMeSignedIn4Value);
        return this;
    }

    /**
     * Set Keep Me Signed In Checkbox field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setKeepMeSignedIn5CheckboxField() {
        if (!keepMeSignedIn5.isSelected()) {
            keepMeSignedIn5.click();
        }
        return this;
    }

    /**
     * Set default value to Sign Up For The Bills Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setSignUpForTheBillsTextField() {
        return setSignUpForTheBillsTextField(data.get("SIGN_UP_FOR_THE_BILLS"));
    }

    /**
     * Set value to Sign Up For The Bills Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setSignUpForTheBillsTextField(String signUpForTheBillsValue) {
        signUpForTheBills.sendKeys(signUpForTheBillsValue);
        return this;
    }

    /**
     * Set default value to What State Do You Live In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn1TextField() {
        return setWhatStateDoYouLiveIn1TextField(data.get("WHAT_STATE_DO_YOU_LIVE_IN_1"));
    }

    /**
     * Set value to What State Do You Live In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn1TextField(String whatStateDoYouLiveIn1Value) {
        whatStateDoYouLiveIn1.sendKeys(whatStateDoYouLiveIn1Value);
        return this;
    }

    /**
     * Set default value to What State Do You Live In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn2TextField() {
        return setWhatStateDoYouLiveIn2TextField(data.get("WHAT_STATE_DO_YOU_LIVE_IN_2"));
    }

    /**
     * Set value to What State Do You Live In Text field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn2TextField(String whatStateDoYouLiveIn2Value) {
        whatStateDoYouLiveIn2.sendKeys(whatStateDoYouLiveIn2Value);
        return this;
    }

    /**
     * Set default value to What State Do You Live In Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn3DropDownListField() {
        return setWhatStateDoYouLiveIn3DropDownListField(data.get("WHAT_STATE_DO_YOU_LIVE_IN_3"));
    }

    /**
     * Set value to What State Do You Live In Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setWhatStateDoYouLiveIn3DropDownListField(String whatStateDoYouLiveIn3Value) {
        new Select(whatStateDoYouLiveIn3).selectByVisibleText(whatStateDoYouLiveIn3Value);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead1PasswordField() {
        return setYouCertifyThatYouHaveRead1PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_1"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead1PasswordField(String youCertifyThatYouHaveRead1Value) {
        youCertifyThatYouHaveRead1.sendKeys(youCertifyThatYouHaveRead1Value);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead2PasswordField() {
        return setYouCertifyThatYouHaveRead2PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_2"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead2PasswordField(String youCertifyThatYouHaveRead2Value) {
        youCertifyThatYouHaveRead2.sendKeys(youCertifyThatYouHaveRead2Value);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead3PasswordField() {
        return setYouCertifyThatYouHaveRead3PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_3"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain setYouCertifyThatYouHaveRead3PasswordField(String youCertifyThatYouHaveRead3Value) {
        youCertifyThatYouHaveRead3.sendKeys(youCertifyThatYouHaveRead3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt submit() {
        clickSignUpButton();
        BillsDotComDebt target = new BillsDotComDebt(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset default value from Get Your Financial Health Score Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetGetYourFinancialHealthScore4DropDownListField() {
        return unsetGetYourFinancialHealthScore4DropDownListField(data.get("GET_YOUR_FINANCIAL_HEALTH_SCORE_4"));
    }

    /**
     * Unset value from Get Your Financial Health Score Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetGetYourFinancialHealthScore4DropDownListField(String getYourFinancialHealthScore4Value) {
        new Select(getYourFinancialHealthScore4).deselectByVisibleText(getYourFinancialHealthScore4Value);
        return this;
    }

    /**
     * Unset default value from How Much Do You Owe Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetHowMuchDoYouOwe3DropDownListField() {
        return unsetHowMuchDoYouOwe3DropDownListField(data.get("HOW_MUCH_DO_YOU_OWE_3"));
    }

    /**
     * Unset value from How Much Do You Owe Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetHowMuchDoYouOwe3DropDownListField(String howMuchDoYouOwe3Value) {
        new Select(howMuchDoYouOwe3).deselectByVisibleText(howMuchDoYouOwe3Value);
        return this;
    }

    /**
     * Unset Keep Me Signed In Checkbox field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetKeepMeSignedIn5CheckboxField() {
        if (keepMeSignedIn5.isSelected()) {
            keepMeSignedIn5.click();
        }
        return this;
    }

    /**
     * Unset default value from What State Do You Live In Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetWhatStateDoYouLiveIn3DropDownListField() {
        return unsetWhatStateDoYouLiveIn3DropDownListField(data.get("WHAT_STATE_DO_YOU_LIVE_IN_3"));
    }

    /**
     * Unset value from What State Do You Live In Drop Down List field.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain unsetWhatStateDoYouLiveIn3DropDownListField(String whatStateDoYouLiveIn3Value) {
        new Select(whatStateDoYouLiveIn3).deselectByVisibleText(whatStateDoYouLiveIn3Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the BillsDotComMain class instance.
     */
    public BillsDotComMain verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
