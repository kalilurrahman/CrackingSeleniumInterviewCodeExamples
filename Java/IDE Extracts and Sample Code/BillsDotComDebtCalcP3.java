import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP3 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(id = "annual_income_continue")
    @CacheLookup
    private WebElement continue;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    private final String pageLoadedText = "Continue&nbsp;&nbsp;&nbsp;&nbsp;";

    private final String pageUrl = "/debt-navigator/question/income?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    public BillsDotComDebtCalcP3() {
    }

    public BillsDotComDebtCalcP3(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP3(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP3(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP3 class instance.
     */
    public BillsDotComDebtCalcP3 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Continue Button.
     *
     * @return the BillsDotComDebtCalcP3 class instance.
     */
    public BillsDotComDebtCalcP3 clickContinueButton() {
        continue.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP3 class instance.
     */
    public BillsDotComDebtCalcP3 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 submit() {
        clickContinueButton();
        BillsDotComDebtCalcP4 target = new BillsDotComDebtCalcP4(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP3 class instance.
     */
    public BillsDotComDebtCalcP3 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP3 class instance.
     */
    public BillsDotComDebtCalcP3 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
