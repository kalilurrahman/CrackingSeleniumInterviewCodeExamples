import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillsDotComDebtCalcP12 {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "address")
    @CacheLookup
    private WebElement address;

    @FindBy(id = "back")
    @CacheLookup
    private WebElement back;

    @FindBy(id = "personal_information_skip")
    @CacheLookup
    private WebElement clickToSeeYourResults;

    @FindBy(css = "a[href='mailto:customercare@bills.com']")
    @CacheLookup
    private WebElement customercarebillsCom;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email;

    @FindBy(css = "div:nth-of-type(1) div:nth-of-type(2) div:nth-of-type(1) div:nth-of-type(2) div.large-12.medium-12.small-12.columns div.large-10.medium-12.small-12.large-centered.columns div.row form.columns.large-7.large-centered.small-12.medium-8.medium-centered div:nth-of-type(7) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement importantTermsPleaseClickHere;

    @FindBy(css = "a[href='/']")
    @CacheLookup
    private WebElement logodefault;

    @FindBy(id = "first_name")
    @CacheLookup
    private WebElement name;

    @FindBy(css = "#piModalDisclaimer p.text a:nth-of-type(3)")
    @CacheLookup
    private WebElement networkPartners;

    private final String pageLoadedText = "Click to see your results&nbsp;&nbsp;&nbsp; &nbsp;";

    private final String pageUrl = "/debt-navigator/question/personal-information?unique_identifier=dn&utm_medium=partner&utm_source=dn_debt-navigator&utm_campaign=dn_debt-navigator";

    @FindBy(id = "phone")
    @CacheLookup
    private WebElement phoneNumber;

    @FindBy(id = "last_name")
    @CacheLookup
    private WebElement pleaseEnterAValidLastName;

    @FindBy(id = "date_month")
    @CacheLookup
    private WebElement pleaseEnterAValidPhoneNumber1;

    @FindBy(id = "date_day")
    @CacheLookup
    private WebElement pleaseEnterAValidPhoneNumber2;

    @FindBy(id = "date_year")
    @CacheLookup
    private WebElement pleaseEnterAValidPhoneNumber3;

    @FindBy(id = "zip_code")
    @CacheLookup
    private WebElement pleaseEnterAValidZipCode;

    @FindBy(css = "#piModalDisclaimer p.text a:nth-of-type(2)")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "#piModalDisclaimer p.text a:nth-of-type(1)")
    @CacheLookup
    private WebElement termsOfUseAgreement;

    public BillsDotComDebtCalcP12() {
    }

    public BillsDotComDebtCalcP12(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public BillsDotComDebtCalcP12(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public BillsDotComDebtCalcP12(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Back Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Click To See Your Results Button.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickClickToSeeYourResultsButton() {
        clickToSeeYourResults.click();
        return this;
    }

    /**
     * Click on Customercarebills.com Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickCustomercarebillsComLink() {
        customercarebillsCom.click();
        return this;
    }

    /**
     * Click on Important Terms Please Click Here Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickImportantTermsPleaseClickHereLink() {
        importantTermsPleaseClickHere.click();
        return this;
    }

    /**
     * Click on Logodefault Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickLogodefaultLink() {
        logodefault.click();
        return this;
    }

    /**
     * Click on Network Partners Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickNetworkPartnersLink() {
        networkPartners.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Terms Of Use Agreement Link.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 clickTermsOfUseAgreementLink() {
        termsOfUseAgreement.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 fill() {
        setNameTextField();
        setPleaseEnterAValidLastNameTextField();
        setEmailEmailField();
        setPhoneNumberTextField();
        setAddressTextField();
        setPleaseEnterAValidZipCodeTextField();
        setPleaseEnterAValidPhoneNumber1TextField();
        setPleaseEnterAValidPhoneNumber2TextField();
        setPleaseEnterAValidPhoneNumber3TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Address Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setAddressTextField() {
        return setAddressTextField(data.get("ADDRESS"));
    }

    /**
     * Set value to Address Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setAddressTextField(String addressValue) {
        address.sendKeys(addressValue);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setEmailEmailField() {
        return setEmailEmailField(data.get("EMAIL"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setEmailEmailField(String emailValue) {
        email.sendKeys(emailValue);
        return this;
    }

    /**
     * Set default value to Name Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setNameTextField() {
        return setNameTextField(data.get("NAME"));
    }

    /**
     * Set value to Name Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setNameTextField(String nameValue) {
        name.sendKeys(nameValue);
        return this;
    }

    /**
     * Set default value to Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPhoneNumberTextField() {
        return setPhoneNumberTextField(data.get("PHONE_NUMBER"));
    }

    /**
     * Set value to Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPhoneNumberTextField(String phoneNumberValue) {
        phoneNumber.sendKeys(phoneNumberValue);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Last Name Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidLastNameTextField() {
        return setPleaseEnterAValidLastNameTextField(data.get("PLEASE_ENTER_A_VALID_LAST_NAME"));
    }

    /**
     * Set value to Please Enter A Valid Last Name Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidLastNameTextField(String pleaseEnterAValidLastNameValue) {
        pleaseEnterAValidLastName.sendKeys(pleaseEnterAValidLastNameValue);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber1TextField() {
        return setPleaseEnterAValidPhoneNumber1TextField(data.get("PLEASE_ENTER_A_VALID_PHONE_NUMBER_1"));
    }

    /**
     * Set value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber1TextField(String pleaseEnterAValidPhoneNumber1Value) {
        pleaseEnterAValidPhoneNumber1.sendKeys(pleaseEnterAValidPhoneNumber1Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber2TextField() {
        return setPleaseEnterAValidPhoneNumber2TextField(data.get("PLEASE_ENTER_A_VALID_PHONE_NUMBER_2"));
    }

    /**
     * Set value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber2TextField(String pleaseEnterAValidPhoneNumber2Value) {
        pleaseEnterAValidPhoneNumber2.sendKeys(pleaseEnterAValidPhoneNumber2Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber3TextField() {
        return setPleaseEnterAValidPhoneNumber3TextField(data.get("PLEASE_ENTER_A_VALID_PHONE_NUMBER_3"));
    }

    /**
     * Set value to Please Enter A Valid Phone Number Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidPhoneNumber3TextField(String pleaseEnterAValidPhoneNumber3Value) {
        pleaseEnterAValidPhoneNumber3.sendKeys(pleaseEnterAValidPhoneNumber3Value);
        return this;
    }

    /**
     * Set default value to Please Enter A Valid Zip Code Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidZipCodeTextField() {
        return setPleaseEnterAValidZipCodeTextField(data.get("PLEASE_ENTER_A_VALID_ZIP_CODE"));
    }

    /**
     * Set value to Please Enter A Valid Zip Code Text field.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 setPleaseEnterAValidZipCodeTextField(String pleaseEnterAValidZipCodeValue) {
        pleaseEnterAValidZipCode.sendKeys(pleaseEnterAValidZipCodeValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the BillsDotComDebtCalcPInfo class instance.
     */
    public BillsDotComDebtCalcPInfo submit() {
        clickClickToSeeYourResultsButton();
        BillsDotComDebtCalcPInfo target = new BillsDotComDebtCalcPInfo(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 verifyPageLoaded() {
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
     * @return the BillsDotComDebtCalcP12 class instance.
     */
    public BillsDotComDebtCalcP12 verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
