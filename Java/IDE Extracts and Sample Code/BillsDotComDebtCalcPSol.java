import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcPSol {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.button.primary.radius.small")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    private final String pageLoadedText = "Can require many more years to complete than other options";

    private final String pageUrl = "/debt-navigator/offer?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    public BillsDotComDebtCalcPSol() {
    }

    public BillsDotComDebtCalcPSol(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcPSol(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcPSol(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the BillsDotComDebtCalcPSol class instance.
     */
    public BillsDotComDebtCalcPSol clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcPSol class instance.
     */
    public BillsDotComDebtCalcPSol clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcPSol class instance.
     */
    public BillsDotComDebtCalcPSol verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcPSol class instance.
     */
    public BillsDotComDebtCalcPSol verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
