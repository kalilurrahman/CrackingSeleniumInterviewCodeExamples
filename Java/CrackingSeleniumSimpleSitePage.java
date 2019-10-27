import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrackingSeleniumSimpleSitePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(name = "Name")
    @CacheLookup
    private WebElement contactName;

    @FindBy(name = "Email")
    @CacheLookup
    private WebElement contactEmail;

    @FindBy(name = "Message")
    @CacheLookup
    private WebElement contactMessage;

    @FindBy(css = "button.contact-form-button")
    @CacheLookup
    private WebElement send;

    private final String pageLoadedText = "Get Your own FREE website";

    private final String pageUrl = "/443702024";

    public CrackingSeleniumSimpleSitePage() {

    }

    public CrackingSeleniumSimpleSitePage(WebDriver driver) {
        this();
        this.driver = driver;


    }

    public CrackingSeleniumSimpleSitePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public CrackingSeleniumSimpleSitePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }


    /**
     * Click on Contact Link.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage clickContactName() {
        contactName.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage clickContactEmail() {
        contactEmail.click();
        return this;
    }

    /**
     * Click on Get Your Own Free Website. Click Here Link.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage clickContactMessage() {
        contactMessage.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage clickSendButton() {
        send.click();
        return this;
    }

    public CrackingSeleniumSimpleSitePage setContactName(String contactname){
        contactName.sendKeys((contactname));
        return this;
    }

    public CrackingSeleniumSimpleSitePage setContactEmail(String contactemail){
        contactEmail.sendKeys((contactemail));
        return this;
    }

    public CrackingSeleniumSimpleSitePage setContactMessage(String contactmsg){
        contactMessage.sendKeys((contactmsg));
        return this;
    }
    public CrackingSeleniumSimpleSitePage setContactName(){
        return this;
    }

    public CrackingSeleniumSimpleSitePage setContactEmail(){
        return this;
    }

    public CrackingSeleniumSimpleSitePage setContactMessage(){
        return this;
    }

    public void SubmitData(String contactname,String contactemail,String contactmsg)
    {
        contactName.sendKeys((contactname));
        contactEmail.sendKeys((contactemail));
        contactMessage.sendKeys((contactmsg));
        send.click();
    }

    /**
     * Fill every fields in the page.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage fill() {
        setContactName();
        setContactEmail();
        setContactMessage();
        return this;
    }
    /**
     * Submit the form to target page.
     *
     * @return the CrackingSeleniumSimpleSitePage class instance.
     */
    public CrackingSeleniumSimpleSitePage submit() {
        clickSendButton();
        CrackingSeleniumSimpleSitePage target = new CrackingSeleniumSimpleSitePage(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

}
