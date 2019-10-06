import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcPAction {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "div:nth-of-type(1) div:nth-of-type(2) div.offer div.offer-details div:nth-of-type(1) div.row div.column.large-12 a")
    @CacheLookup
    private WebElement compareAllSolutions1;

    @FindBy(css = "div:nth-of-type(1) div:nth-of-type(2) div.offer div.offer-details div:nth-of-type(2) div:nth-of-type(7) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement compareAllSolutions2;

    @FindBy(id = "how-it-works")
    @CacheLookup
    private WebElement howItWorks;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    @FindBy(id = "chart-values-type")
    @CacheLookup
    private WebElement optimizePaymentspaidOffMar2021jun2023mar2024dec20240;

    private final String pageLoadedText = "Keep your monthly payments constant and eliminate one debt after another until all your accounts are paid off and you are debt free";

    private final String pageUrl = "/debt-navigator/offer/optimize-payments?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(id = "view-more")
    @CacheLookup
    private WebElement viewMore;

    public BillsDotComDebtCalcPAction() {
    }

    public BillsDotComDebtCalcPAction(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcPAction(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcPAction(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Compare All Solutions Link.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction clickCompareAllSolutions1Link() {
        compareAllSolutions1.click();
        return this;
    }

    /**
     * Click on Compare All Solutions Link.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction clickCompareAllSolutions2Link() {
        compareAllSolutions2.click();
        return this;
    }

    /**
     * Click on How It Works Link.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction clickHowItWorksLink() {
        howItWorks.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on View More Link.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction clickViewMoreLink() {
        viewMore.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction fill() {
        setOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField();
        return this;
    }

    /**
     * Set default value to Optimize Paymentspaid Off Mar2021jun2023mar2024dec20240 Drop Down List field.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction setOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField() {
        return setOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField(data.get("OPTIMIZE_PAYMENTSPAID_OFF_MAR2021JUN2023MAR2024DEC20240"));
    }

    /**
     * Set value to Optimize Paymentspaid Off Mar2021jun2023mar2024dec20240 Drop Down List field.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction setOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField(String optimizePaymentspaidOffMar2021jun2023mar2024dec20240Value) {
        new Select(optimizePaymentspaidOffMar2021jun2023mar2024dec20240).selectByVisibleText(optimizePaymentspaidOffMar2021jun2023mar2024dec20240Value);
        return this;
    }

    /**
     * Unset default value from Optimize Paymentspaid Off Mar2021jun2023mar2024dec20240 Drop Down List field.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction unsetOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField() {
        return unsetOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField(data.get("OPTIMIZE_PAYMENTSPAID_OFF_MAR2021JUN2023MAR2024DEC20240"));
    }

    /**
     * Unset value from Optimize Paymentspaid Off Mar2021jun2023mar2024dec20240 Drop Down List field.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction unsetOptimizePaymentspaidOffMar2021jun2023mar2024dec20240DropDownListField(String optimizePaymentspaidOffMar2021jun2023mar2024dec20240Value) {
        new Select(optimizePaymentspaidOffMar2021jun2023mar2024dec20240).deselectByVisibleText(optimizePaymentspaidOffMar2021jun2023mar2024dec20240Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcPAction class instance.
     */
    public BillsDotComDebtCalcPAction verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
