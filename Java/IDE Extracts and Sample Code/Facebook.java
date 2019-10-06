import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='Read our blog, discover the resource centre and find job opportunities.']")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "u_0_k")
    @CacheLookup
    private WebElement accessibilityHelp;

    @FindBy(css = "a[title='View your activity log']")
    @CacheLookup
    private WebElement activityLog;

    @FindBy(css = "a._41ug")
    @CacheLookup
    private WebElement adchoices;

    @FindBy(id = "u_0_17")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "a[title='Make your next career move to our brilliant company.']")
    @CacheLookup
    private WebElement careers;

    @FindBy(id = "cookie-use-link")
    @CacheLookup
    private WebElement cookiePolicy;

    @FindBy(css = "a[title='Learn about cookies and Facebook.']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "a._8esh")
    @CacheLookup
    private WebElement createAPage;

    @FindBy(css = "a[title='Advertise on Facebook']")
    @CacheLookup
    private WebElement createAd;

    @FindBy(css = "a[title='Create a Page']")
    @CacheLookup
    private WebElement createPage;

    @FindBy(id = "u_0_m")
    @CacheLookup
    private WebElement custom1;

    @FindBy(id = "u_0_o")
    @CacheLookup
    private WebElement custom2;

    @FindBy(id = "u_0_u")
    @CacheLookup
    private WebElement custom3;

    @FindBy(id = "u_0_w")
    @CacheLookup
    private WebElement custom4;

    @FindBy(id = "u_0_y")
    @CacheLookup
    private WebElement custom5;

    @FindBy(id = "day")
    @CacheLookup
    private WebElement custom6;

    @FindBy(id = "month")
    @CacheLookup
    private WebElement custom7;

    @FindBy(id = "year")
    @CacheLookup
    private WebElement custom8;

    @FindBy(name = "sex")
    @CacheLookup
    private List<WebElement> custom9;

    private final String customValue = "-1";

    @FindBy(id = "privacy-link")
    @CacheLookup
    private WebElement dataPolicy;

    @FindBy(css = "a[title='Develop on our platform.']")
    @CacheLookup
    private WebElement developers;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement emailOrPhone;

    @FindBy(css = "a[title='Spanish']")
    @CacheLookup
    private WebElement espaol;

    @FindBy(css = "a[title='Go to Facebook home']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "a[title='Facebook Lite for Android.']")
    @CacheLookup
    private WebElement facebookLite;

    @FindBy(name = "sex")
    @CacheLookup
    private List<WebElement> female;

    private final String femaleValue = "1";

    @FindBy(css = "a[href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")
    @CacheLookup
    private WebElement forgottenAccount;

    @FindBy(css = "a[title='Donate to worthy causes.']")
    @CacheLookup
    private WebElement fundraisers;

    @FindBy(css = "a[title='Check out Facebook games.']")
    @CacheLookup
    private WebElement games;

    @FindBy(css = "a[title='Browse our Groups directory.']")
    @CacheLookup
    private WebElement groups;

    @FindBy(css = "a[title='Visit our Help Centre.']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[title='Take a look at Instagram']")
    @CacheLookup
    private WebElement instagram;

    @FindBy(css = "a[title='Browse our Local Lists directory.']")
    @CacheLookup
    private WebElement local;

    @FindBy(css = "a[title='Browse our places directory.']")
    @CacheLookup
    private WebElement locations;

    @FindBy(id = "u_0_4")
    @CacheLookup
    private WebElement logIn1;

    @FindBy(css = "a[title='Log in to Facebook']")
    @CacheLookup
    private WebElement logIn2;

    @FindBy(name = "sex")
    @CacheLookup
    private List<WebElement> male;

    private final String maleValue = "2";

    @FindBy(css = "a[title='Browse our Marketplace product directory.']")
    @CacheLookup
    private WebElement marketplace;

    @FindBy(css = "a[title='Take a look at Messenger.']")
    @CacheLookup
    private WebElement messenger;

    @FindBy(id = "u_0_r")
    @CacheLookup
    private WebElement mobileNumberOrEmailAddress;

    @FindBy(css = "a[href='/pages/category/']")
    @CacheLookup
    private WebElement pageCategories;

    private final String pageLoadedText = "Facebook helps you connect and share with the people in your life";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='Browse our Pages directory.']")
    @CacheLookup
    private WebElement pages;

    @FindBy(id = "pass")
    @CacheLookup
    private WebElement password;

    @FindBy(css = "a[title='Browse our people directory.']")
    @CacheLookup
    private WebElement people;

    @FindBy(css = "a[title='Take a look at popular places on Facebook.']")
    @CacheLookup
    private WebElement places;

    @FindBy(css = "a[title='Learn about your privacy and Facebook.']")
    @CacheLookup
    private WebElement privacy;

    @FindBy(id = "u_0_i")
    @CacheLookup
    private WebElement sectionsOfThisPage;

    @FindBy(css = "a[title='Browse our Facebook Services directory.']")
    @CacheLookup
    private WebElement services;

    @FindBy(css = "a[title='View and edit your Facebook settings.']")
    @CacheLookup
    private WebElement settings;

    @FindBy(id = "u_0_15")
    @CacheLookup
    private WebElement signUp1;

    @FindBy(id = "u_0_18")
    @CacheLookup
    private WebElement signUp2;

    @FindBy(css = "a[title='Sign up for Facebook']")
    @CacheLookup
    private WebElement signUp3;

    @FindBy(id = "terms-link")
    @CacheLookup
    private WebElement terms1;

    @FindBy(css = "a[title='Review our terms and policies.']")
    @CacheLookup
    private WebElement terms2;

    @FindBy(css = "#captcha div:nth-of-type(2) a")
    @CacheLookup
    private WebElement whyAmISeeingThis;

    @FindBy(name = "preferred_pronoun")
    @CacheLookup
    private WebElement yourPronounIsVisibleToEveryone1;

    @FindBy(id = "u_0_13")
    @CacheLookup
    private WebElement yourPronounIsVisibleToEveryone2;

    public Facebook() {
    }

    public Facebook(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Facebook(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Facebook(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Accessibility Help Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickAccessibilityHelpLink() {
        accessibilityHelp.click();
        return this;
    }

    /**
     * Click on Activity Log Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickActivityLogLink() {
        activityLog.click();
        return this;
    }

    /**
     * Click on Adchoices Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickAdchoicesLink() {
        adchoices.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Cookie Policy Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCookiePolicyLink() {
        cookiePolicy.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Create A Page Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCreateAPageLink() {
        createAPage.click();
        return this;
    }

    /**
     * Click on Create Ad Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCreateAdLink() {
        createAd.click();
        return this;
    }

    /**
     * Click on Create Page Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickCreatePageLink() {
        createPage.click();
        return this;
    }

    /**
     * Click on Data Policy Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickDataPolicyLink() {
        dataPolicy.click();
        return this;
    }

    /**
     * Click on Developers Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickDevelopersLink() {
        developers.click();
        return this;
    }

    /**
     * Click on Espaol Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickEspaolLink() {
        espaol.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Facebook Lite Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickFacebookLiteLink() {
        facebookLite.click();
        return this;
    }

    /**
     * Click on Forgotten Account Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickForgottenAccountLink() {
        forgottenAccount.click();
        return this;
    }

    /**
     * Click on Fundraisers Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickFundraisersLink() {
        fundraisers.click();
        return this;
    }

    /**
     * Click on Games Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickGamesLink() {
        games.click();
        return this;
    }

    /**
     * Click on Groups Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickGroupsLink() {
        groups.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Instagram Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickInstagramLink() {
        instagram.click();
        return this;
    }

    /**
     * Click on Local Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickLocalLink() {
        local.click();
        return this;
    }

    /**
     * Click on Locations Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickLocationsLink() {
        locations.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickLogIn1Link() {
        logIn1.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickLogIn2Link() {
        logIn2.click();
        return this;
    }

    /**
     * Click on Marketplace Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickMarketplaceLink() {
        marketplace.click();
        return this;
    }

    /**
     * Click on Messenger Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickMessengerLink() {
        messenger.click();
        return this;
    }

    /**
     * Click on Page Categories Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickPageCategoriesLink() {
        pageCategories.click();
        return this;
    }

    /**
     * Click on Pages Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickPagesLink() {
        pages.click();
        return this;
    }

    /**
     * Click on People Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickPeopleLink() {
        people.click();
        return this;
    }

    /**
     * Click on Places Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickPlacesLink() {
        places.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickPrivacyLink() {
        privacy.click();
        return this;
    }

    /**
     * Click on Sections Of This Page Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickSectionsOfThisPageLink() {
        sectionsOfThisPage.click();
        return this;
    }

    /**
     * Click on Services Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickServicesLink() {
        services.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickSignUp1Button() {
        signUp1.click();
        return this;
    }

    /**
     * Click on Sign Up Button.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickSignUp2Button() {
        signUp2.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickSignUp3Link() {
        signUp3.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickTerms1Link() {
        terms1.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickTerms2Link() {
        terms2.click();
        return this;
    }

    /**
     * Click on Why Am I Seeing This Link.
     *
     * @return the Facebook class instance.
     */
    public Facebook clickWhyAmISeeingThisLink() {
        whyAmISeeingThis.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Facebook class instance.
     */
    public Facebook fill() {
        setEmailOrPhoneEmailField();
        setPasswordPasswordField();
        setCustom1TextField();
        setCustom2TextField();
        setMobileNumberOrEmailAddressTextField();
        setCustom3TextField();
        setCustom4TextField();
        setCustom5PasswordField();
        setCustom6DropDownListField();
        setCustom7DropDownListField();
        setCustom8DropDownListField();
        setFemaleRadioButtonField();
        setMaleRadioButtonField();
        setCustom9RadioButtonField();
        setYourPronounIsVisibleToEveryone1TextField();
        setYourPronounIsVisibleToEveryone2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Facebook class instance.
     */
    public Facebook fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom1TextField() {
        return setCustom1TextField(data.get("CUSTOM_1"));
    }

    /**
     * Set value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom1TextField(String custom1Value) {
        custom1.sendKeys(custom1Value);
        return this;
    }

    /**
     * Set default value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom2TextField() {
        return setCustom2TextField(data.get("CUSTOM_2"));
    }

    /**
     * Set value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom2TextField(String custom2Value) {
        custom2.sendKeys(custom2Value);
        return this;
    }

    /**
     * Set default value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom3TextField() {
        return setCustom3TextField(data.get("CUSTOM_3"));
    }

    /**
     * Set value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom3TextField(String custom3Value) {
        custom3.sendKeys(custom3Value);
        return this;
    }

    /**
     * Set default value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom4TextField() {
        return setCustom4TextField(data.get("CUSTOM_4"));
    }

    /**
     * Set value to Custom Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom4TextField(String custom4Value) {
        custom4.sendKeys(custom4Value);
        return this;
    }

    /**
     * Set default value to Custom Password field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom5PasswordField() {
        return setCustom5PasswordField(data.get("CUSTOM_5"));
    }

    /**
     * Set value to Custom Password field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom5PasswordField(String custom5Value) {
        custom5.sendKeys(custom5Value);
        return this;
    }

    /**
     * Set default value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom6DropDownListField() {
        return setCustom6DropDownListField(data.get("CUSTOM_6"));
    }

    /**
     * Set value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom6DropDownListField(String custom6Value) {
        new Select(custom6).selectByVisibleText(custom6Value);
        return this;
    }

    /**
     * Set default value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom7DropDownListField() {
        return setCustom7DropDownListField(data.get("CUSTOM_7"));
    }

    /**
     * Set value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom7DropDownListField(String custom7Value) {
        new Select(custom7).selectByVisibleText(custom7Value);
        return this;
    }

    /**
     * Set default value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom8DropDownListField() {
        return setCustom8DropDownListField(data.get("CUSTOM_8"));
    }

    /**
     * Set value to Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom8DropDownListField(String custom8Value) {
        new Select(custom8).selectByVisibleText(custom8Value);
        return this;
    }

    /**
     * Set default value to Custom Radio Button field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setCustom9RadioButtonField() {
        for (WebElement el : custom9) {
            if (el.getAttribute("value").equals(custom9Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Email Or Phone Email field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setEmailOrPhoneEmailField() {
        return setEmailOrPhoneEmailField(data.get("EMAIL_OR_PHONE"));
    }

    /**
     * Set value to Email Or Phone Email field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setEmailOrPhoneEmailField(String emailOrPhoneValue) {
        emailOrPhone.sendKeys(emailOrPhoneValue);
        return this;
    }

    /**
     * Set default value to Female Radio Button field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setFemaleRadioButtonField() {
        for (WebElement el : female) {
            if (el.getAttribute("value").equals(femaleValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Male Radio Button field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setMaleRadioButtonField() {
        for (WebElement el : male) {
            if (el.getAttribute("value").equals(maleValue)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Mobile Number Or Email Address Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setMobileNumberOrEmailAddressTextField() {
        return setMobileNumberOrEmailAddressTextField(data.get("MOBILE_NUMBER_OR_EMAIL_ADDRESS"));
    }

    /**
     * Set value to Mobile Number Or Email Address Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setMobileNumberOrEmailAddressTextField(String mobileNumberOrEmailAddressValue) {
        mobileNumberOrEmailAddress.sendKeys(mobileNumberOrEmailAddressValue);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setPasswordPasswordField() {
        return setPasswordPasswordField(data.get("PASSWORD"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setPasswordPasswordField(String passwordValue) {
        password.sendKeys(passwordValue);
        return this;
    }

    /**
     * Set default value to Your Pronoun Is Visible To Everyone Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setYourPronounIsVisibleToEveryone1TextField() {
        return setYourPronounIsVisibleToEveryone1TextField(data.get("YOUR_PRONOUN_IS_VISIBLE_TO_EVERYONE_1"));
    }

    /**
     * Set value to Your Pronoun Is Visible To Everyone Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setYourPronounIsVisibleToEveryone1TextField(String yourPronounIsVisibleToEveryone1Value) {
        new Select(yourPronounIsVisibleToEveryone1).selectByVisibleText(yourPronounIsVisibleToEveryone1Value);
        return this;
    }

    /**
     * Set default value to Your Pronoun Is Visible To Everyone Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setYourPronounIsVisibleToEveryone2TextField() {
        return setYourPronounIsVisibleToEveryone2TextField(data.get("YOUR_PRONOUN_IS_VISIBLE_TO_EVERYONE_2"));
    }

    /**
     * Set value to Your Pronoun Is Visible To Everyone Text field.
     *
     * @return the Facebook class instance.
     */
    public Facebook setYourPronounIsVisibleToEveryone2TextField(String yourPronounIsVisibleToEveryone2Value) {
        yourPronounIsVisibleToEveryone2.sendKeys(yourPronounIsVisibleToEveryone2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Facebook class instance.
     */
    public Facebook submit() {
        clickLogInButton();
        Facebook target = new Facebook(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset default value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom6DropDownListField() {
        return unsetCustom6DropDownListField(data.get("CUSTOM_6"));
    }

    /**
     * Unset value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom6DropDownListField(String custom6Value) {
        new Select(custom6).deselectByVisibleText(custom6Value);
        return this;
    }

    /**
     * Unset default value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom7DropDownListField() {
        return unsetCustom7DropDownListField(data.get("CUSTOM_7"));
    }

    /**
     * Unset value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom7DropDownListField(String custom7Value) {
        new Select(custom7).deselectByVisibleText(custom7Value);
        return this;
    }

    /**
     * Unset default value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom8DropDownListField() {
        return unsetCustom8DropDownListField(data.get("CUSTOM_8"));
    }

    /**
     * Unset value from Custom Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetCustom8DropDownListField(String custom8Value) {
        new Select(custom8).deselectByVisibleText(custom8Value);
        return this;
    }

    /**
     * Unset default value from Your Pronoun Is Visible To Everyone Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetYourPronounIsVisibleToEveryoneDropDownListField() {
        return unsetYourPronounIsVisibleToEveryoneDropDownListField(data.get("YOUR_PRONOUN_IS_VISIBLE_TO_EVERYONE"));
    }

    /**
     * Unset value from Your Pronoun Is Visible To Everyone Drop Down List field.
     *
     * @return the Facebook class instance.
     */
    public Facebook unsetYourPronounIsVisibleToEveryoneDropDownListField(String yourPronounIsVisibleToEveryoneValue) {
        new Select(yourPronounIsVisibleToEveryone).deselectByVisibleText(yourPronounIsVisibleToEveryoneValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Facebook class instance.
     */
    public Facebook verifyPageLoaded() {
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
     * @return the Facebook class instance.
     */
    public Facebook verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
