import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP1 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "button.dark-red")
    @CacheLookup
    private WebElement highStressmyDebtIsOverwhelming;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    @FindBy(css = "button.light-green")
    @CacheLookup
    private WebElement lowStressiCanOftenPay;

    @FindBy(css = "button.dark-orange")
    @CacheLookup
    private WebElement mildStressimGettingConcernedThat;

    @FindBy(css = "button.light-red")
    @CacheLookup
    private WebElement moderateStressimStrugglingAndHave;

    @FindBy(css = "button.dark-green")
    @CacheLookup
    private WebElement noStressiPayMyCredit;

    private final String pageLoadedText = "I'm struggling and have sometimes missed my minimum payments";

    private final String pageUrl = "/debt-navigator/question/financial-level?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator&utm_medium=partner&debt=18000.00?vt_session_id=8D3CFDB0DC5B11E99E82BC764E10386B&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator&utm_medium=partner&debt=18000.00";

    @FindBy(css = "button.light-orange")
    @CacheLookup
    private WebElement someStressiAmComfortablyMaking;

    public BillsDotComDebtCalcP1() {
    }

    public BillsDotComDebtCalcP1(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP1(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP1(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on High Stressmy Debt Is Overwhelming And I Cant Afford My Minimum Payments Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickHighStressmyDebtIsOverwhelmingButton() {
        highStressmyDebtIsOverwhelming.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on Low Stressi Can Often Pay More Than My Minimum Payments Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickLowStressiCanOftenPayButton() {
        lowStressiCanOftenPay.click();
        return this;
    }

    /**
     * Click on Mild Stressim Getting Concerned That I May Not Make My Minimum Payments Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickMildStressimGettingConcernedThatButton() {
        mildStressimGettingConcernedThat.click();
        return this;
    }

    /**
     * Click on Moderate Stressim Struggling And Have Sometimes Missed My Minimum Payments Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickModerateStressimStrugglingAndHaveButton() {
        moderateStressimStrugglingAndHave.click();
        return this;
    }

    /**
     * Click on No Stressi Pay My Credit Cards Off In Full Every Month Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickNoStressiPayMyCreditButton() {
        noStressiPayMyCredit.click();
        return this;
    }

    /**
     * Click on Some Stressi Am Comfortably Making My Minimum Payments Button.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 clickSomeStressiAmComfortablyMakingButton() {
        someStressiAmComfortablyMaking.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP1 class instance.
     */
    public BillsDotComDebtCalcP1 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
