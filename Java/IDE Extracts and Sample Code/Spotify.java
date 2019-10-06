import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Spotify {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://www.spotify.com/in/about-us/contact/']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='https://www.spotify.com/in/legal/privacy-policy/#s3']")
    @CacheLookup
    private WebElement aboutAds;

    @FindBy(css = "a[href='https://spotifyforbrands.com/']")
    @CacheLookup
    private WebElement brands;

    @FindBy(css = "a[href='https://www.spotify.com/in/legal/cookies-policy/']")
    @CacheLookup
    private WebElement cookies;

    @FindBy(css = "a[href='https://developer.spotify.com/']")
    @CacheLookup
    private WebElement developers;

    @FindBy(css = "a[href='https://www.spotify.com/in/download/']")
    @CacheLookup
    private WebElement download;

    @FindBy(css = "a[href='https://artists.spotify.com/']")
    @CacheLookup
    private WebElement forArtists;

    @FindBy(css = "a[href='https://newsroom.spotify.com/']")
    @CacheLookup
    private WebElement forTheRecord;

    @FindBy(css = "a[href='https://www.spotify.com/in/free/']")
    @CacheLookup
    private WebElement freeMobileApp;

    @FindBy(id = "generic-btn-premium")
    @CacheLookup
    private WebElement getSpotifyFree;

    @FindBy(css = "..m-in.l-en.page-homepage.is-loggedout.reboot.index-homepage. div:nth-of-type(2) div header.mh-header-hover.mh-default-z-index.svelte-1uvwsus.mh-transparent.mh-semitransparent-top.mh-fixed div.mh-container.svelte-1uvwsus nav.mh-desktop.svelte-4ldyho ul.svelte-4ldyho li:nth-of-type(2) a.mh-header-primary.svelte-yew4z8")
    @CacheLookup
    private WebElement help1;

    @FindBy(css = "..m-in.l-en.page-homepage.is-loggedout.reboot.index-homepage. div:nth-of-type(3) footer.mh-footer-hover.svelte-ox727r nav.svelte-ox727r div:nth-of-type(2) dl:nth-of-type(3) dd:nth-of-type(1) a.mh-footer-primary.svelte-12h6dnj")
    @CacheLookup
    private WebElement help2;

    @FindBy(css = "a.mh-footer-secondary.svelte-1ouzkfx.mh-compact")
    @CacheLookup
    private WebElement india;

    @FindBy(css = "a[href='https://investors.spotify.com/']")
    @CacheLookup
    private WebElement investors;

    @FindBy(css = "a[href='https://www.spotifyjobs.com/']")
    @CacheLookup
    private WebElement jobs;

    @FindBy(css = "a[href='https://www.spotify.com/in/legal/']")
    @CacheLookup
    private WebElement legal;

    @FindBy(css = "a[href='https://www.spotify.com/in/account/overview/']")
    @CacheLookup
    private WebElement logIn;

    private final String pageLoadedText = "";

    private final String pageUrl = "/in/";

    @FindBy(css = "a[href='https://www.spotify.com/in/premium/?checkout=false']")
    @CacheLookup
    private WebElement premium;

    @FindBy(css = "a[href='https://www.spotify.com/in/privacy/']")
    @CacheLookup
    private WebElement privacyCenter;

    @FindBy(css = "a[href='https://www.spotify.com/in/legal/privacy-policy/']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='https://www.spotify.com/in/signup/']")
    @CacheLookup
    private WebElement signUp;

    @FindBy(css = "a.mh-header-primary.svelte-18o1xvt")
    @CacheLookup
    private WebElement spotify1;

    @FindBy(css = "a.mh-footer-primary.svelte-18o1xvt")
    @CacheLookup
    private WebElement spotify2;

    @FindBy(css = "button.mh-header-primary.svelte-v64zdx.mh-menu-closed")
    @CacheLookup
    private WebElement toggleNavigation;

    @FindBy(css = "a[href='https://spotifyforvendors.com/']")
    @CacheLookup
    private WebElement vendors;

    @FindBy(css = "a[href='https://www.spotify.com/in/redirect/webplayerlink/']")
    @CacheLookup
    private WebElement webPlayer;

    public Spotify() {
    }

    public Spotify(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Spotify(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Spotify(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Ads Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickAboutAdsLink() {
        aboutAds.click();
        return this;
    }

    /**
     * Click on About Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Brands Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickBrandsLink() {
        brands.click();
        return this;
    }

    /**
     * Click on Cookies Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickCookiesLink() {
        cookies.click();
        return this;
    }

    /**
     * Click on Developers Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickDevelopersLink() {
        developers.click();
        return this;
    }

    /**
     * Click on Download Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickDownloadLink() {
        download.click();
        return this;
    }

    /**
     * Click on For Artists Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickForArtistsLink() {
        forArtists.click();
        return this;
    }

    /**
     * Click on For The Record Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickForTheRecordLink() {
        forTheRecord.click();
        return this;
    }

    /**
     * Click on Free Mobile App Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickFreeMobileAppLink() {
        freeMobileApp.click();
        return this;
    }

    /**
     * Click on Get Spotify Free Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickGetSpotifyFreeLink() {
        getSpotifyFree.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickHelp1Link() {
        help1.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickHelp2Link() {
        help2.click();
        return this;
    }

    /**
     * Click on India Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickIndiaLink() {
        india.click();
        return this;
    }

    /**
     * Click on Investors Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickInvestorsLink() {
        investors.click();
        return this;
    }

    /**
     * Click on Jobs Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickJobsLink() {
        jobs.click();
        return this;
    }

    /**
     * Click on Legal Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickLegalLink() {
        legal.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickLogInLink() {
        logIn.click();
        return this;
    }

    /**
     * Click on Premium Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickPremiumLink() {
        premium.click();
        return this;
    }

    /**
     * Click on Privacy Center Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickPrivacyCenterLink() {
        privacyCenter.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Sign Up Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickSignUpLink() {
        signUp.click();
        return this;
    }

    /**
     * Click on Spotify Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickSpotify1Link() {
        spotify1.click();
        return this;
    }

    /**
     * Click on Spotify Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickSpotify2Link() {
        spotify2.click();
        return this;
    }

    /**
     * Click on Toggle Navigation Button.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickToggleNavigationButton() {
        toggleNavigation.click();
        return this;
    }

    /**
     * Click on Vendors Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickVendorsLink() {
        vendors.click();
        return this;
    }

    /**
     * Click on Web Player Link.
     *
     * @return the Spotify class instance.
     */
    public Spotify clickWebPlayerLink() {
        webPlayer.click();
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Spotify class instance.
     */
    public Spotify verifyPageLoaded() {
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
     * @return the Spotify class instance.
     */
    public Spotify verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
