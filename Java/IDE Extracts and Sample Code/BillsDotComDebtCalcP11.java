import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP11 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(id = "monthly_payment_continue")
    @CacheLookup
    private WebElement continue;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    private final String pageLoadedText = "Total amount you can pay per month to pay off your debt";

    private final String pageUrl = "/debt-navigator/question/monthly-payment?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    public BillsDotComDebtCalcP11() {
    }

    public BillsDotComDebtCalcP11(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP11(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP11(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP11 class instance.
     */
    public BillsDotComDebtCalcP11 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the BillsDotComDebtCalcP11 class instance.
     */
    public BillsDotComDebtCalcP11 clickContinueButton() {
        continue.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP11 class instance.
     */
    public BillsDotComDebtCalcP11 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 submit() {
        clickContinueButton();
        BillsDotComDebtCalcP12 target = new BillsDotComDebtCalcP12(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP11 class instance.
     */
    public BillsDotComDebtCalcP11 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP11 class instance.
     */
    public BillsDotComDebtCalcP11 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
