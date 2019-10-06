import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP2 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "button.dark-purple")
    @CacheLookup
    private WebElement fullTime;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    @FindBy(css = "button.light-skyblue")
    @CacheLookup
    private WebElement notEmployed;

    @FindBy(css = "button.light-seagreen")
    @CacheLookup
    private WebElement other;

    private final String pageLoadedText = "";

    private final String pageUrl = "/debt-navigator/question/employment-status?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(css = "button.light-purple")
    @CacheLookup
    private WebElement partTime;

    @FindBy(css = "button.dark-seagreen")
    @CacheLookup
    private WebElement retired;

    @FindBy(css = "button.dark-skyblue")
    @CacheLookup
    private WebElement selfEmployed;

    public BillsDotComDebtCalcP2() {
    }

    public BillsDotComDebtCalcP2(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP2(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP2(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Full Time Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickFullTimeButton() {
        fullTime.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on Not Employed Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickNotEmployedButton() {
        notEmployed.click();
        return this;
    }

    /**
     * Click on Other Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickOtherButton() {
        other.click();
        return this;
    }

    /**
     * Click on Part Time Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickPartTimeButton() {
        partTime.click();
        return this;
    }

    /**
     * Click on Retired Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickRetiredButton() {
        retired.click();
        return this;
    }

    /**
     * Click on Self Employed Button.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 clickSelfEmployedButton() {
        selfEmployed.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP2 class instance.
     */
    public BillsDotComDebtCalcP2 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
