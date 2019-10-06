import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DuckDuckGo {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "logo_homepage_link")
    @CacheLookup
    private WebElement aboutDuckduckgoLearnMore1;

    @FindBy(id = "logo_homepage_link")
    @CacheLookup
    private WebElement aboutDuckduckgoLearnMore2;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(4) ul.nav-menu__list ul:nth-of-type(4) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(6) div:nth-of-type(1) div:nth-of-type(1) div.js-onboarding-ed-button-small-1 a.btn.onboarding-ed__button-small.ddg-extension-hide")
    @CacheLookup
    private WebElement addDuckduckgoToChrome1;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(6) div:nth-of-type(2) div:nth-of-type(1) div.js-onboarding-ed-button-small-2 a.btn.onboarding-ed__button-small.ddg-extension-hide")
    @CacheLookup
    private WebElement addDuckduckgoToChrome2;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(6) div:nth-of-type(3) div:nth-of-type(1) div.js-onboarding-ed-button-small-3 a.btn.onboarding-ed__button-small.ddg-extension-hide")
    @CacheLookup
    private WebElement addDuckduckgoToChrome3;

    @FindBy(css = "a.btn.onboarding-ed__button.ddg-extension-hide")
    @CacheLookup
    private WebElement addDuckduckgoToChrome4;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(4) ul.nav-menu__list ul:nth-of-type(2) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement appAndExtension;

    @FindBy(css = "a.onboarding-ed__arrow.js-onboarding-ed-arrow")
    @CacheLookup
    private WebElement arrow;

    @FindBy(css = "a[href='/bangs']")
    @CacheLookup
    private WebElement bangSearchShortcuts;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) span.popout-trig.js-popout.header__clickable.header__label.js-hl-button div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body div:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement blog;

    @FindBy(css = "a[href='/hiring']")
    @CacheLookup
    private WebElement careers;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(1) ul li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement getOurAppExtensionprotectYour;

    @FindBy(css = "a[href='https://help.duckduckgo.com/']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a.tag-home__link.js-tag-item-link")
    @CacheLookup
    private WebElement helpSpreadDuckduckgo;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(4) ul.nav-menu__list ul:nth-of-type(3) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement helpSpreadPrivacy;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(2) ul.text-left li:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement inPrivacyDonations1900000;

    @FindBy(css = "a.no-visited.js-acp-footer-link")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(2) ul.text-left li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement learnWhyReducingTrackingIsImportant;

    @FindBy(css = "a[href='/settings']")
    @CacheLookup
    private WebElement otherSettings;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(2) ul.text-left li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement over33BillionAnonymousSearches;

    private final String pageLoadedText = "We don’t store your search history";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='/press']")
    @CacheLookup
    private WebElement pressKit;

    @FindBy(css = "a[href='https://spreadprivacy.com/']")
    @CacheLookup
    private WebElement privacyBlog;

    @FindBy(css = "a[href='https://duckduckgo.com/newsletter']")
    @CacheLookup
    private WebElement privacyCrashCourse;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(1) ul li:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement privacyInYourInboxstayProtectedAnd;

    @FindBy(css = "a[href='/privacy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='https://duckduckgo.com/']")
    @CacheLookup
    private WebElement privateSearch;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(1) ul li:nth-of-type(3) a:nth-of-type(2)")
    @CacheLookup
    private WebElement protectYourDevicescheckOutOurPrivacy;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) span.popout-trig.js-popout.header__clickable.header__label.js-hl-button div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement reddit1;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(4) ul.nav-menu__list ul:nth-of-type(5) li:nth-of-type(4) a")
    @CacheLookup
    private WebElement reddit2;

    @FindBy(css = "#search_form_homepage_top input:nth-of-type(2)")
    @CacheLookup
    private WebElement s1;

    @FindBy(id = "search_button_homepage")
    @CacheLookup
    private WebElement s2;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement shortcutsToOtherSitesToSearch1;

    @FindBy(id = "search_form_input_homepage")
    @CacheLookup
    private WebElement shortcutsToOtherSitesToSearch2;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) span.header__clickable.js-hl-button span:nth-of-type(2) div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body nav section:nth-of-type(1) ul li:nth-of-type(4) a:nth-of-type(2)")
    @CacheLookup
    private WebElement spreadDuckduckgohelpYourFriendsAndFamily;

    @FindBy(css = "a[href='https://start.duckduckgo.com']")
    @CacheLookup
    private WebElement startDuckduckgoCom;

    @FindBy(css = "a[href='https://duckduckgo.merchmadeeasy.com/']")
    @CacheLookup
    private WebElement store;

    @FindBy(css = "a.onboarding-ed__arrow-teaser.js-onboarding-ed-teaser")
    @CacheLookup
    private WebElement teaser22x;

    @FindBy(css = "a[href='/settings#theme']")
    @CacheLookup
    private WebElement themes;

    @FindBy(css = "a.btn.onboarding-ed__button.onboarding-ed__tweet-button.js-onboarding-ed-tweet-button")
    @CacheLookup
    private WebElement tweetCometotheduckside;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) span.popout-trig.js-popout.header__clickable.header__label.js-hl-button div.modal.modal--popout.modal--popout--bottom-left.modal--popout--sm.js-popout-main div.modal__box div.modal__body div:nth-of-type(1) a:nth-of-type(2)")
    @CacheLookup
    private WebElement twitter1;

    @FindBy(css = "#pg-index div.site-wrapper.site-wrapper--home.js-site-wrapper div:nth-of-type(4) ul.nav-menu__list ul:nth-of-type(5) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement twitter2;

    @FindBy(css = "#search_form_homepage_top input:nth-of-type(3)")
    @CacheLookup
    private WebElement x1;

    @FindBy(id = "search_form_input_clear")
    @CacheLookup
    private WebElement x2;

    public DuckDuckGo() {
    }

    public DuckDuckGo(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public DuckDuckGo(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public DuckDuckGo(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Duckduckgo Learn More Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAboutDuckduckgoLearnMore1Link() {
        aboutDuckduckgoLearnMore1.click();
        return this;
    }

    /**
     * Click on About Duckduckgo Learn More Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAboutDuckduckgoLearnMore2Link() {
        aboutDuckduckgoLearnMore2.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on Add Duckduckgo To Chrome Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAddDuckduckgoToChrome1Link() {
        addDuckduckgoToChrome1.click();
        return this;
    }

    /**
     * Click on Add Duckduckgo To Chrome Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAddDuckduckgoToChrome2Link() {
        addDuckduckgoToChrome2.click();
        return this;
    }

    /**
     * Click on Add Duckduckgo To Chrome Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAddDuckduckgoToChrome3Link() {
        addDuckduckgoToChrome3.click();
        return this;
    }

    /**
     * Click on Add Duckduckgo To Chrome Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAddDuckduckgoToChrome4Link() {
        addDuckduckgoToChrome4.click();
        return this;
    }

    /**
     * Click on App And Extension Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickAppAndExtensionLink() {
        appAndExtension.click();
        return this;
    }

    /**
     * Click on Arrow Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickArrowLink() {
        arrow.click();
        return this;
    }

    /**
     * Click on Bang Search Shortcuts Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickBangSearchShortcutsLink() {
        bangSearchShortcuts.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickBlogLink() {
        blog.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickCareersLink() {
        careers.click();
        return this;
    }

    /**
     * Click on Get Our App Extensionprotect Your Data On Every Device. Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickGetOurAppExtensionprotectYourLink() {
        getOurAppExtensionprotectYour.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Help Spread Duckduckgo Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickHelpSpreadDuckduckgoLink() {
        helpSpreadDuckduckgo.click();
        return this;
    }

    /**
     * Click on Help Spread Privacy Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickHelpSpreadPrivacyLink() {
        helpSpreadPrivacy.click();
        return this;
    }

    /**
     * Click on 1900000 In Privacy Donations Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickInPrivacyDonationsLink1900000() {
        inPrivacyDonations1900000.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickLearnMoreLink() {
        learnMore.click();
        return this;
    }

    /**
     * Click on Learn Why Reducing Tracking Is Important. Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickLearnWhyReducingTrackingIsImportantLink() {
        learnWhyReducingTrackingIsImportant.click();
        return this;
    }

    /**
     * Click on Other Settings Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickOtherSettingsLink() {
        otherSettings.click();
        return this;
    }

    /**
     * Click on Over 33 Billion Anonymous Searches. Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickOver33BillionAnonymousSearchesLink() {
        over33BillionAnonymousSearches.click();
        return this;
    }

    /**
     * Click on Press Kit Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPressKitLink() {
        pressKit.click();
        return this;
    }

    /**
     * Click on Privacy Blog Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPrivacyBlogLink() {
        privacyBlog.click();
        return this;
    }

    /**
     * Click on Privacy Crash Course Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPrivacyCrashCourseLink() {
        privacyCrashCourse.click();
        return this;
    }

    /**
     * Click on Privacy In Your Inboxstay Protected And Informed With Our Privacy Newsletters. Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPrivacyInYourInboxstayProtectedAndLink() {
        privacyInYourInboxstayProtectedAnd.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Private Search Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickPrivateSearchLink() {
        privateSearch.click();
        return this;
    }

    /**
     * Click on Protect Your Devicescheck Out Our Privacy Device Guides. Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickProtectYourDevicescheckOutOurPrivacyLink() {
        protectYourDevicescheckOutOurPrivacy.click();
        return this;
    }

    /**
     * Click on Reddit Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickReddit1Link() {
        reddit1.click();
        return this;
    }

    /**
     * Click on Reddit Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickReddit2Link() {
        reddit2.click();
        return this;
    }

    /**
     * Click on S Button.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickS1Button() {
        s1.click();
        return this;
    }

    /**
     * Click on S Button.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickS2Button() {
        s2.click();
        return this;
    }

    /**
     * Click on Spread Duckduckgohelp Your Friends And Family Join The Duck Side Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickSpreadDuckduckgohelpYourFriendsAndFamilyLink() {
        spreadDuckduckgohelpYourFriendsAndFamily.click();
        return this;
    }

    /**
     * Click on Start.duckduckgo.com Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickStartDuckduckgoComLink() {
        startDuckduckgoCom.click();
        return this;
    }

    /**
     * Click on Store Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickStoreLink() {
        store.click();
        return this;
    }

    /**
     * Click on Teaser22x Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickTeaser22xLink() {
        teaser22x.click();
        return this;
    }

    /**
     * Click on Themes Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickThemesLink() {
        themes.click();
        return this;
    }

    /**
     * Click on Tweet Cometotheduckside Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickTweetCometotheducksideLink() {
        tweetCometotheduckside.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickTwitter1Link() {
        twitter1.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickTwitter2Link() {
        twitter2.click();
        return this;
    }

    /**
     * Click on X Button.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickX1Button() {
        x1.click();
        return this;
    }

    /**
     * Click on X Button.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo clickX2Button() {
        x2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo fill() {
        setShortcutsToOtherSitesToSearch1TextField();
        setShortcutsToOtherSitesToSearch2TextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Shortcuts To Other Sites To Search Off Duckduckgolearn More Text field.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo setShortcutsToOtherSitesToSearch1TextField() {
        return setShortcutsToOtherSitesToSearch1TextField(data.get("SHORTCUTS_TO_OTHER_SITES_TO_SEARCH_1"));
    }

    /**
     * Set value to Shortcuts To Other Sites To Search Off Duckduckgolearn More Text field.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo setShortcutsToOtherSitesToSearch1TextField(String shortcutsToOtherSitesToSearch1Value) {
        shortcutsToOtherSitesToSearch1.sendKeys(shortcutsToOtherSitesToSearch1Value);
        return this;
    }

    /**
     * Set default value to Shortcuts To Other Sites To Search Off Duckduckgolearn More Text field.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo setShortcutsToOtherSitesToSearch2TextField() {
        return setShortcutsToOtherSitesToSearch2TextField(data.get("SHORTCUTS_TO_OTHER_SITES_TO_SEARCH_2"));
    }

    /**
     * Set value to Shortcuts To Other Sites To Search Off Duckduckgolearn More Text field.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo setShortcutsToOtherSitesToSearch2TextField(String shortcutsToOtherSitesToSearch2Value) {
        shortcutsToOtherSitesToSearch2.sendKeys(shortcutsToOtherSitesToSearch2Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo submit() {
        clickSButton();
        DuckDuckGo target = new DuckDuckGo(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo verifyPageLoaded() {
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
     * @return the DuckDuckGo class instance.
     */
    public DuckDuckGo verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
