import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcPInfo {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "add-tradeline-button")
    @CacheLookup
    private WebElement addAnAccount;

    @FindBy(css = "a.back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "a.edit_button")
    @CacheLookup
    private WebElement edit;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    private final String pageLoadedText = "Will Be Included In Solution Comparison";

    private final String pageUrl = "/debt-navigator/verify_information?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(css = "a.delete")
    @CacheLookup
    private WebElement remove;

    @FindBy(id = "see-my-solutions")
    @CacheLookup
    private WebElement seeMySolutions;

    public BillsDotComDebtCalcPInfo() {
    }

    public BillsDotComDebtCalcPInfo(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcPInfo(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcPInfo(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Add An Account Button.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickAddAnAccountButton() {
        addAnAccount.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Edit Link.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickEditLink() {
        edit.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on Remove Link.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickRemoveLink() {
        remove.click();
        return this;
    }

    /**
     * Click on See My Solutions Button.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo clickSeeMySolutionsButton() {
        seeMySolutions.click();
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebtCalcPSol class instance.
     */
    public BillsDotComDebtCalcPSol submit() {
        clickAddAnAccountButton();
        BillsDotComDebtCalcPSol target = new BillsDotComDebtCalcPSol(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
