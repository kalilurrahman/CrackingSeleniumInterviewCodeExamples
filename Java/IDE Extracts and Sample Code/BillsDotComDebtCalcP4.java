import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP4 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    @FindBy(css = "div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) form.question-form.columns.large-12.small-12.medium-12.text-center div.columns.large-9.medium-12.small-11.small-landscape-10.small-centered.large-centered.medium-centered.text-center div.row ul.button-group.own_home-cnt.horizontal-button-group li:nth-of-type(2) button.dark-blue")
    @CacheLookup
    private WebElement no;

    private final String pageLoadedText = "Do you own a home";

    private final String pageUrl = "/debt-navigator/question/own-home?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(css = "div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) form.question-form.columns.large-12.small-12.medium-12.text-center div.columns.large-9.medium-12.small-11.small-landscape-10.small-centered.large-centered.medium-centered.text-center div.row ul.button-group.own_home-cnt.horizontal-button-group li:nth-of-type(1) button.dark-blue")
    @CacheLookup
    private WebElement yes;

    public BillsDotComDebtCalcP4() {
    }

    public BillsDotComDebtCalcP4(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP4(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP4(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on No Button.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 clickNoButton() {
        no.click();
        return this;
    }

    /**
     * Click on Yes Button.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 clickYesButton() {
        yes.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP4 class instance.
     */
    public BillsDotComDebtCalcP4 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
