import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebt {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='/company/about?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement badCredit1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement badCredit2;

    @FindBy(css = "#cssmenu ul li:nth-of-type(2) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bestPersonalLoanCompanies1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(2) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bestPersonalLoanCompanies2;

    @FindBy(css = "a.navbar-brand")
    @CacheLookup
    private WebElement billsCom;

    @FindBy(css = ".overviewdebt-payoff-calculator div:nth-of-type(3) ol.breadcrumb li div span a")
    @CacheLookup
    private WebElement billsCom;

    @FindBy(css = "#cssmenu ul li:nth-of-type(1) div.l2 div.container ul.container li:nth-of-type(4) a")
    @CacheLookup
    private WebElement borrowingMoney1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(1) ul.dropdown-menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement borrowingMoney2;

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

    @FindBy(css = "a[href='/company/contact?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='/credit?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement credit;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) a")
    @CacheLookup
    private WebElement credit;

    @FindBy(css = "#cssmenu ul li:nth-of-type(5) div.l2 div.container ul.container li:nth-of-type(3) a")
    @CacheLookup
    private WebElement creditCards1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(5) ul.dropdown-menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement creditCards2;

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

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(7) ul li:nth-of-type(1) a")
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

    @FindBy(css = "a[href='https://www.bills.com/user/forgot-password/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=BillsSEO']")
    @CacheLookup
    private WebElement forgotYourPasswordClickHere;

    @FindBy(css = "a.btn.btn-warning.btn-xs.cta-button")
    @CacheLookup
    private WebElement getStarted1;

    @FindBy(id = "dn_get_started")
    @CacheLookup
    private WebElement getStarted2;

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

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(2) a")
    @CacheLookup
    private WebElement managingDebt1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement managingDebt2;

    @FindBy(css = "a[href='/company/press-releases/media-coverage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement mediaCoverage;

    @FindBy(css = "a[href='/mortgage?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement mortgage;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mortgage;

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

    private final String pageLoadedText = "You&nbsp;are left uninformed about how different debt solutions work,&nbsp;their potential impact on your credit, and other pros and cons";

    private final String pageUrl = "/debt-payoff-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B";

    @FindBy(css = "a[href='/debt-payoff-calculator?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement payOffDebt;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) a")
    @CacheLookup
    private WebElement payOffDebt;

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

    @FindBy(css = "#signup_modal div.modal-dialog div.modal-content div:nth-of-type(2) div div:nth-of-type(2) form.user-signup-form input:nth-of-type(3)")
    @CacheLookup
    private WebElement signUp;

    @FindBy(css = ".overviewdebt-payoff-calculator nav.navbar.navbar-default.navbar-fixed-top.header_wrapper div.container div:nth-of-type(1) div.user-nav a:nth-of-type(2)")
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

    @FindBy(css = "a[href='/company/team?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement team;

    @FindBy(css = "a[href='/company/terms-of-use?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement termsOfUse1;

    @FindBy(css = "a[href='/terms-of-use/?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B']")
    @CacheLookup
    private WebElement termsOfUse2;

    @FindBy(css = ".overviewdebt-payoff-calculator nav.navbar.navbar-default.navbar-fixed-top.header_wrapper div.container div:nth-of-type(2) div:nth-of-type(1) button")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "a[href='//privacy.truste.com/privacy-seal/validation?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&rid=42d5d06c-c2ce-4a1b-8910-2bf6aeedf98a']")
    @CacheLookup
    private WebElement truste;

    @FindBy(css = "#cssmenu ul li:nth-of-type(4) div.l2 div.container ul.container li:nth-of-type(6) a")
    @CacheLookup
    private WebElement typesOfDebt1;

    @FindBy(css = "#mobile-navbar ul.nav.navbar-nav li:nth-of-type(4) ul.dropdown-menu li:nth-of-type(6) a")
    @CacheLookup
    private WebElement typesOfDebt2;

    @FindBy(name = "email")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead1;

    @FindBy(name = "password")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead2;

    @FindBy(name = "confirm_password")
    @CacheLookup
    private WebElement youCertifyThatYouHaveRead3;

    public BillsDotComDebt() {
    }

    public BillsDotComDebt(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebt(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebt(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Us Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Bad Credit Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBadCredit1Link() {
        badCredit1.click();
        return this;
    }

    /**
     * Click on Bad Credit Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBadCredit2Link() {
        badCredit2.click();
        return this;
    }

    /**
     * Click on Best Personal Loan Companies Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBestPersonalLoanCompanies1Link() {
        bestPersonalLoanCompanies1.click();
        return this;
    }

    /**
     * Click on Best Personal Loan Companies Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBestPersonalLoanCompanies2Link() {
        bestPersonalLoanCompanies2.click();
        return this;
    }

    /**
     * Click on Bills.com Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBillsComLink() {
        billsCom.click();
        return this;
    }

    /**
     * Click on Bills.com Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBillsComLink() {
        billsCom.click();
        return this;
    }

    /**
     * Click on Borrowing Money Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBorrowingMoney1Link() {
        borrowingMoney1.click();
        return this;
    }

    /**
     * Click on Borrowing Money Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBorrowingMoney2Link() {
        borrowingMoney2.click();
        return this;
    }

    /**
     * Click on Budgeting Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBudgeting1Link() {
        budgeting1.click();
        return this;
    }

    /**
     * Click on Budgeting Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBudgeting2Link() {
        budgeting2.click();
        return this;
    }

    /**
     * Click on Buy A Home Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBuyAHome1Link() {
        buyAHome1.click();
        return this;
    }

    /**
     * Click on Buy A Home Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickBuyAHome2Link() {
        buyAHome2.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Cashout Refinance Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCashoutRefinanceCalculatorLink() {
        cashoutRefinanceCalculator.click();
        return this;
    }

    /**
     * Click on Cashout Refinance Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCashoutRefinanceLink() {
        cashoutRefinance.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditCards1Link() {
        creditCards1.click();
        return this;
    }

    /**
     * Click on Credit Cards Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditCards2Link() {
        creditCards2.click();
        return this;
    }

    /**
     * Click on Credit Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditLink() {
        credit.click();
        return this;
    }

    /**
     * Click on Credit Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditLink() {
        credit.click();
        return this;
    }

    /**
     * Click on Credit Report Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditReport1Link() {
        creditReport1.click();
        return this;
    }

    /**
     * Click on Credit Report Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditReport2Link() {
        creditReport2.click();
        return this;
    }

    /**
     * Click on Credit Score Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditScore1Link() {
        creditScore1.click();
        return this;
    }

    /**
     * Click on Credit Score Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickCreditScore2Link() {
        creditScore2.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtConsolidation1Link() {
        debtConsolidation1.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtConsolidation2Link() {
        debtConsolidation2.click();
        return this;
    }

    /**
     * Click on Debt Consolidation Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtConsolidationCalculatorLink() {
        debtConsolidationCalculator.click();
        return this;
    }

    /**
     * Click on Debt Help Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtHelp1Link() {
        debtHelp1.click();
        return this;
    }

    /**
     * Click on Debt Help Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtHelp2Link() {
        debtHelp2.click();
        return this;
    }

    /**
     * Click on Debt Navigator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtNavigatorLink() {
        debtNavigator.click();
        return this;
    }

    /**
     * Click on Debt Relief Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtRelief1Link() {
        debtRelief1.click();
        return this;
    }

    /**
     * Click on Debt Relief Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtRelief2Link() {
        debtRelief2.click();
        return this;
    }

    /**
     * Click on Debt Settlement Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtSettlement1Link() {
        debtSettlement1.click();
        return this;
    }

    /**
     * Click on Debt Settlement Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtSettlement2Link() {
        debtSettlement2.click();
        return this;
    }

    /**
     * Click on Debt Tools Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtTools1Link() {
        debtTools1.click();
        return this;
    }

    /**
     * Click on Debt Tools Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickDebtTools2Link() {
        debtTools2.click();
        return this;
    }

    /**
     * Click on Fha Loans Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFhaLoansLink() {
        fhaLoans.click();
        return this;
    }

    /**
     * Click on Financial Health Blog Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthBlog1Link() {
        financialHealthBlog1.click();
        return this;
    }

    /**
     * Click on Financial Health Blog Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthBlog2Link() {
        financialHealthBlog2.click();
        return this;
    }

    /**
     * Click on Financial Health Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthLink() {
        financialHealth.click();
        return this;
    }

    /**
     * Click on Financial Health Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthLink() {
        financialHealth.click();
        return this;
    }

    /**
     * Click on Financial Health Survey Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthSurvey1Link() {
        financialHealthSurvey1.click();
        return this;
    }

    /**
     * Click on Financial Health Survey Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialHealthSurvey2Link() {
        financialHealthSurvey2.click();
        return this;
    }

    /**
     * Click on Financial Planning Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialPlanning1Link() {
        financialPlanning1.click();
        return this;
    }

    /**
     * Click on Financial Planning Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickFinancialPlanning2Link() {
        financialPlanning2.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Click Here. Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickForgotYourPasswordClickHereLink() {
        forgotYourPasswordClickHere.click();
        return this;
    }

    /**
     * Click on Get Started Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickGetStarted1Button() {
        getStarted1.click();
        return this;
    }

    /**
     * Click on Get Started Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickGetStarted2Button() {
        getStarted2.click();
        return this;
    }

    /**
     * Click on Harp Program Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickHarpProgram1Link() {
        harpProgram1.click();
        return this;
    }

    /**
     * Click on Harp Program Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickHarpProgram2Link() {
        harpProgram2.click();
        return this;
    }

    /**
     * Click on Hecm Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickHecmLink() {
        hecm.click();
        return this;
    }

    /**
     * Click on Home Affordability Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickHomeAffordabilityCalculatorLink() {
        homeAffordabilityCalculator.click();
        return this;
    }

    /**
     * Click on Httpwww.nmlsconsumeraccess.org Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickHttpwwwNmlsconsumeraccessOrgLink() {
        httpwwwNmlsconsumeraccessOrg.click();
        return this;
    }

    /**
     * Click on Join Now Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickJoinNowLink() {
        joinNow.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickLogIn1Link() {
        logIn1.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickLogIn2Link() {
        logIn2.click();
        return this;
    }

    /**
     * Click on Log In Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickLogInButton() {
        logIn.click();
        return this;
    }

    /**
     * Click on Managing Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickManagingDebt1Link() {
        managingDebt1.click();
        return this;
    }

    /**
     * Click on Managing Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickManagingDebt2Link() {
        managingDebt2.click();
        return this;
    }

    /**
     * Click on Media Coverage Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMediaCoverageLink() {
        mediaCoverage.click();
        return this;
    }

    /**
     * Click on Mortgage Lender Review Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageLenderReview1Link() {
        mortgageLenderReview1.click();
        return this;
    }

    /**
     * Click on Mortgage Lender Review Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageLenderReview2Link() {
        mortgageLenderReview2.click();
        return this;
    }

    /**
     * Click on Mortgage Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageLink() {
        mortgage.click();
        return this;
    }

    /**
     * Click on Mortgage Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageLink() {
        mortgage.click();
        return this;
    }

    /**
     * Click on Mortgage Rates Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageRates1Link() {
        mortgageRates1.click();
        return this;
    }

    /**
     * Click on Mortgage Rates Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickMortgageRates2Link() {
        mortgageRates2.click();
        return this;
    }

    /**
     * Click on Pay Off Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPayOffDebtLink() {
        payOffDebt.click();
        return this;
    }

    /**
     * Click on Pay Off Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPayOffDebtLink() {
        payOffDebt.click();
        return this;
    }

    /**
     * Click on Personal Loan Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoanCalculator1Link() {
        personalLoanCalculator1.click();
        return this;
    }

    /**
     * Click on Personal Loan Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoanCalculator2Link() {
        personalLoanCalculator2.click();
        return this;
    }

    /**
     * Click on Personal Loan Rates Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoanRates1Link() {
        personalLoanRates1.click();
        return this;
    }

    /**
     * Click on Personal Loan Rates Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoanRates2Link() {
        personalLoanRates2.click();
        return this;
    }

    /**
     * Click on Personal Loans Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoansLink() {
        personalLoans.click();
        return this;
    }

    /**
     * Click on Personal Loans Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPersonalLoansLink() {
        personalLoans.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPrivacyPolicy1Link() {
        privacyPolicy1.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickPrivacyPolicy2Link() {
        privacyPolicy2.click();
        return this;
    }

    /**
     * Click on Refinance Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickRefinance1Link() {
        refinance1.click();
        return this;
    }

    /**
     * Click on Refinance Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickRefinance2Link() {
        refinance2.click();
        return this;
    }

    /**
     * Click on Refinance Calculator Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickRefinanceCalculatorLink() {
        refinanceCalculator.click();
        return this;
    }

    /**
     * Click on Refinancing An Arm Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickRefinancingAnArmLink() {
        refinancingAnArm.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickReverseMortgage1Link() {
        reverseMortgage1.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickReverseMortgage2Link() {
        reverseMortgage2.click();
        return this;
    }

    /**
     * Click on Reverse Mortgage Qualifying Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickReverseMortgageQualifyingLink() {
        reverseMortgageQualifying.click();
        return this;
    }

    /**
     * Click on Safe And Secure Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSafeAndSecureLink() {
        safeAndSecure.click();
        return this;
    }

    /**
     * Click on Savings Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSavings1Link() {
        savings1.click();
        return this;
    }

    /**
     * Click on Savings Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSavings2Link() {
        savings2.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSignUp1Link() {
        signUp1.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSignUp2Link() {
        signUp2.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSignUp3Button() {
        signUp3.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSignUpButton() {
        signUp.click();
        return this;
    }

    /**
     * Click on Site Is Listed In Dunn And Bradstreets Power Profiles Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSiteIsListedInDunnAndLink() {
        siteIsListedInDunnAnd.click();
        return this;
    }

    /**
     * Click on Site Is Secured By Verisign Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSiteIsSecuredByVerisignLink() {
        siteIsSecuredByVerisign.click();
        return this;
    }

    /**
     * Click on Sitemap Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickSitemapLink() {
        sitemap.click();
        return this;
    }

    /**
     * Click on Team Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTeamLink() {
        team.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTermsOfUse1Link() {
        termsOfUse1.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTermsOfUse2Link() {
        termsOfUse2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Truste Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTrusteLink() {
        truste.click();
        return this;
    }

    /**
     * Click on Types Of Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTypesOfDebt1Link() {
        typesOfDebt1.click();
        return this;
    }

    /**
     * Click on Types Of Debt Link.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt clickTypesOfDebt2Link() {
        typesOfDebt2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt fill() {
        setKeepMeSignedIn1TextField();
        setKeepMeSignedIn2TextField();
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
     * @return the BillsDotComDebtCalculator class instance.
     */
    public BillsDotComDebtCalculator fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn1TextField() {
        return setKeepMeSignedIn1TextField(data.get("KEEP_ME_SIGNED_IN_1"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn1TextField(String keepMeSignedIn1Value) {
        keepMeSignedIn1.sendKeys(keepMeSignedIn1Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn2TextField() {
        return setKeepMeSignedIn2TextField(data.get("KEEP_ME_SIGNED_IN_2"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn2TextField(String keepMeSignedIn2Value) {
        keepMeSignedIn2.sendKeys(keepMeSignedIn2Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn3TextField() {
        return setKeepMeSignedIn3TextField(data.get("KEEP_ME_SIGNED_IN_3"));
    }

    /**
     * Set value to Keep Me Signed In Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn3TextField(String keepMeSignedIn3Value) {
        keepMeSignedIn3.sendKeys(keepMeSignedIn3Value);
        return this;
    }

    /**
     * Set default value to Keep Me Signed In Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn4PasswordField() {
        return setKeepMeSignedIn4PasswordField(data.get("KEEP_ME_SIGNED_IN_4"));
    }

    /**
     * Set value to Keep Me Signed In Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn4PasswordField(String keepMeSignedIn4Value) {
        keepMeSignedIn4.sendKeys(keepMeSignedIn4Value);
        return this;
    }

    /**
     * Set Keep Me Signed In Checkbox field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setKeepMeSignedIn5CheckboxField() {
        if (!keepMeSignedIn5.isSelected()) {
            keepMeSignedIn5.click();
        }
        return this;
    }

    /**
     * Set default value to Sign Up For The Bills Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setSignUpForTheBillsTextField() {
        return setSignUpForTheBillsTextField(data.get("SIGN_UP_FOR_THE_BILLS"));
    }

    /**
     * Set value to Sign Up For The Bills Text field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setSignUpForTheBillsTextField(String signUpForTheBillsValue) {
        signUpForTheBills.sendKeys(signUpForTheBillsValue);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead1PasswordField() {
        return setYouCertifyThatYouHaveRead1PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_1"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead1PasswordField(String youCertifyThatYouHaveRead1Value) {
        youCertifyThatYouHaveRead1.sendKeys(youCertifyThatYouHaveRead1Value);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead2PasswordField() {
        return setYouCertifyThatYouHaveRead2PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_2"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead2PasswordField(String youCertifyThatYouHaveRead2Value) {
        youCertifyThatYouHaveRead2.sendKeys(youCertifyThatYouHaveRead2Value);
        return this;
    }

    /**
     * Set default value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead3PasswordField() {
        return setYouCertifyThatYouHaveRead3PasswordField(data.get("YOU_CERTIFY_THAT_YOU_HAVE_READ_3"));
    }

    /**
     * Set value to You Certify That You Have Read And Agree To The Terms Of Use And Privacy Policy Password field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt setYouCertifyThatYouHaveRead3PasswordField(String youCertifyThatYouHaveRead3Value) {
        youCertifyThatYouHaveRead3.sendKeys(youCertifyThatYouHaveRead3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebtCalculator class instance.
     */
    public BillsDotComDebtCalculator submit() {
        clickSignUpButton();
        BillsDotComDebtCalculator target = new BillsDotComDebtCalculator(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset Keep Me Signed In Checkbox field.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt unsetKeepMeSignedIn5CheckboxField() {
        if (keepMeSignedIn5.isSelected()) {
            keepMeSignedIn5.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt verifyPageLoaded() {
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
     * @return the BillsDotComDebt class instance.
     */
    public BillsDotComDebt verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
