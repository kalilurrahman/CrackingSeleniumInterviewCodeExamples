import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP10 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "button.dark-orange")
    @CacheLookup
    private WebElement _620Fair580580;

    @FindBy(css = "button.light-orange")
    @CacheLookup
    private WebElement _680Good620620;

    @FindBy(css = "button.light-green")
    @CacheLookup
    private WebElement _740VeryGood680;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "button.dark-green")
    @CacheLookup
    private WebElement excellent740740;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    private final String pageLoadedText = "How would you rate your credit score";

    private final String pageUrl = "/debt-navigator/question/credit-score?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(css = "button.light-red")
    @CacheLookup
    private WebElement poor580580;

    public BillsDotComDebtCalcP10() {
    }

    public BillsDotComDebtCalcP10(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP10(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP10(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 580 620 Fair 580 620 Fair Button.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 click620Fair580Button580() {
        _620Fair580580.click();
        return this;
    }

    /**
     * Click on 620 680 Good 620 680 Good Button.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 click680Good620Button620() {
        _680Good620620.click();
        return this;
    }

    /**
     * Click on 680 740 Very Good 680 740 Very Good Button.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 click740VeryGoodButton680() {
        _740VeryGood680.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on 740 Excellent 740 Excellent Button.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 clickExcellent740Button740() {
        excellent740740.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on 580 Poor 580 Poor Button.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 clickPoor580Button580() {
        poor580580.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP10 class instance.
     */
    public BillsDotComDebtCalcP10 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
