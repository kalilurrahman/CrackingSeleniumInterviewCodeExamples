import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EPFLReport {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a.current")
    @CacheLookup
    private WebElement _2018;

    @FindBy(css = "a.moreBttn.center")
    @CacheLookup
    private WebElement browseThroughTheAnnualReport;

    @FindBy(css = "a[href='/en']")
    @CacheLookup
    private WebElement english;

    @FindBy(css = "a[href='/fr']")
    @CacheLookup
    private WebElement french;

    @FindBy(css = "a[href='/de']")
    @CacheLookup
    private WebElement german;

    private final String pageLoadedText = "Browse through the annual report";

    private final String pageUrl = "/en";

    public EPFLReport() {
    }

    public EPFLReport(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public EPFLReport(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public EPFLReport(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Browse Through The Annual Report Link.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport clickBrowseThroughTheAnnualReportLink() {
        browseThroughTheAnnualReport.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on French Link.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport clickFrenchLink() {
        french.click();
        return this;
    }

    /**
     * Click on German Link.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport clickGermanLink() {
        german.click();
        return this;
    }

    /**
     * Click on 2018 Link.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport clickLink2018() {
        _2018.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the EPFLReport class instance.
     */
    public EPFLReport verifyPageLoaded() {
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
     * @return the EPFLReport class instance.
     */
    public EPFLReport verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
