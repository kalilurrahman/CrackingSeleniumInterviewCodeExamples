import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleDeveloper {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='//console.actions.google.com']")
    @CacheLookup
    private WebElement actionsOnGoogleConsole;

    @FindBy(css = "a.gb_4.gb_9f.gb_We.gb_tb")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/admob']")
    @CacheLookup
    private WebElement admob1;

    @FindBy(css = "a[href='https://developers.google.com/admob']")
    @CacheLookup
    private WebElement admob2;

    @FindBy(css = "#gc-wrapper devsite-footer-utility.devsite-footer div.devsite-footer-utility nav:nth-of-type(1) ul.devsite-footer-sites-list li:nth-of-type(5) a.devsite-footer-sites-link.gc-analytics-event")
    @CacheLookup
    private WebElement allProducts;

    @FindBy(css = "a.gb_cc.gb_za.gb_bc")
    @CacheLookup
    private WebElement allYourBrandAccounts;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(1) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(2) a")
    @CacheLookup
    private WebElement android1;

    @FindBy(css = "a[href='https://developer.android.com/']")
    @CacheLookup
    private WebElement android2;

    @FindBy(css = "#gc-wrapper devsite-footer-utility.devsite-footer div.devsite-footer-utility nav:nth-of-type(1) ul.devsite-footer-sites-list li:nth-of-type(1) a.devsite-footer-sites-link.gc-analytics-event")
    @CacheLookup
    private WebElement android3;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(1) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement androidDevSummit2019October;

    @FindBy(css = "a[href='https://twitter.com/search?q=%23AndroidDevSummit&src=typd']")
    @CacheLookup
    private WebElement androiddevsummit;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(3) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a.button.button-white.")
    @CacheLookup
    private WebElement applyNow;

    @FindBy(css = "a[href='https://twitter.com/search?q=%23BetterTogether&src=typd']")
    @CacheLookup
    private WebElement bettertogether;

    @FindBy(css = "a[href='https://developers.googleblog.com']")
    @CacheLookup
    private WebElement blog1;

    @FindBy(css = "a[href='https://developers.googleblog.com/']")
    @CacheLookup
    private WebElement blog2;

    @FindBy(css = "a[href='//googledevelopers.blogspot.com']")
    @CacheLookup
    private WebElement blog3;

    @FindBy(css = "a[href='//cast.google.com/publish']")
    @CacheLookup
    private WebElement castSdkDeveloperConsole;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(3) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement celebratingAppMakersWorldwide;

    @FindBy(css = "a.gb_bb.gb_7a.gb_gg")
    @CacheLookup
    private WebElement change;

    @FindBy(css = "a[href='//developer.chrome.com/home']")
    @CacheLookup
    private WebElement chrome;

    @FindBy(css = "a[href='//chrome.google.com/webstore/developer/dashboard']")
    @CacheLookup
    private WebElement chromeWebStoreDashboard;

    @FindBy(css = "a[href='?authuser=1']")
    @CacheLookup
    private WebElement cit199625thReunioncit9625ReuniongmailCom;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(1) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(3) a")
    @CacheLookup
    private WebElement cloudPlatform1;

    @FindBy(css = "a[href='https://cloud.google.com/']")
    @CacheLookup
    private WebElement cloudPlatform2;

    @FindBy(css = "a[href='/community']")
    @CacheLookup
    private WebElement developerCommunities1;

    @FindBy(css = "a[href='https://developers.google.com/community']")
    @CacheLookup
    private WebElement developerCommunities2;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(3) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement developerStudentClubLeads2019;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(2) a")
    @CacheLookup
    private WebElement developerStudentClubs1;

    @FindBy(css = "a[href='https://developers.google.com/community/dsc']")
    @CacheLookup
    private WebElement developerStudentClubs2;

    @FindBy(css = "#gc-wrapper devsite-footer-linkboxes.devsite-footer nav.devsite-footer-linkboxes.nocontent ul.devsite-footer-linkboxes-list li:nth-of-type(2) ul.devsite-footer-linkbox-list li:nth-of-type(6) a.devsite-footer-linkbox-link.gc-analytics-event")
    @CacheLookup
    private WebElement developerStudentClubs3;

    @FindBy(css = "a[href='/events']")
    @CacheLookup
    private WebElement events1;

    @FindBy(css = "a[href='https://developers.google.com/events']")
    @CacheLookup
    private WebElement events2;

    @FindBy(css = "a[href='//www.facebook.com/Google-Developers-967415219957038']")
    @CacheLookup
    private WebElement facebook;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(1) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(4) a")
    @CacheLookup
    private WebElement firebase1;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(1) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(2) ul.devsite-tabs-dropdown-section. li:nth-of-type(2) a")
    @CacheLookup
    private WebElement firebase2;

    @FindBy(css = "div.devsite-wrapper devsite-book-nav nav.devsite-book-nav.devsite-nav.nocontent div:nth-of-type(2) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(4) a.devsite-nav-title.gc-analytics-event.")
    @CacheLookup
    private WebElement firebase3;

    @FindBy(css = "div.devsite-wrapper devsite-book-nav nav.devsite-book-nav.devsite-nav.nocontent div:nth-of-type(2) div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(11) a.devsite-nav-title.gc-analytics-event.")
    @CacheLookup
    private WebElement firebase4;

    @FindBy(css = "#gc-wrapper devsite-footer-utility.devsite-footer div.devsite-footer-utility nav:nth-of-type(1) ul.devsite-footer-sites-list li:nth-of-type(3) a.devsite-footer-sites-link.gc-analytics-event")
    @CacheLookup
    private WebElement firebase5;

    @FindBy(css = "a[href='//console.firebase.google.com']")
    @CacheLookup
    private WebElement firebaseConsole;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(1) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement firebaseSummit2019September26;

    @FindBy(css = "a[href='https://twitter.com/search?q=%23FirebaseSummit&src=typd']")
    @CacheLookup
    private WebElement firebasesummit;

    @FindBy(css = "a[href='//flutter.dev']")
    @CacheLookup
    private WebElement flutter1;

    @FindBy(css = "a[href='https://flutter.dev/']")
    @CacheLookup
    private WebElement flutter2;

    @FindBy(css = "a[href='https://events.withgoogle.com/imakeapps/registrations/new/?utm_source=devsite&utm_medium=hpp&utm_campaign=imakeapps_july18']")
    @CacheLookup
    private WebElement getFeatured;

    @FindBy(css = "a.gb_4.gb_cg.gbp1.gb_We.gb_tb")
    @CacheLookup
    private WebElement googleAccount;

    @FindBy(css = "a[href='/google-ads']")
    @CacheLookup
    private WebElement googleAds1;

    @FindBy(css = "a[href='https://developers.google.com/google-ads']")
    @CacheLookup
    private WebElement googleAds2;

    @FindBy(css = "a[href='/google-ads/api']")
    @CacheLookup
    private WebElement googleAdsApi1;

    @FindBy(css = "a[href='https://developers.google.com/google-ads/api']")
    @CacheLookup
    private WebElement googleAdsApi2;

    @FindBy(css = "a[href='/analytics']")
    @CacheLookup
    private WebElement googleAnalytics1;

    @FindBy(css = "a[href='https://developers.google.com/analytics']")
    @CacheLookup
    private WebElement googleAnalytics2;

    @FindBy(css = "a[href='//console.developers.google.com']")
    @CacheLookup
    private WebElement googleApiConsole;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(3) a")
    @CacheLookup
    private WebElement googleBusinessGroups1;

    @FindBy(css = "a[href='https://developers.google.com/community/gbg']")
    @CacheLookup
    private WebElement googleBusinessGroups2;

    @FindBy(css = "#gc-wrapper devsite-footer-linkboxes.devsite-footer nav.devsite-footer-linkboxes.nocontent ul.devsite-footer-linkboxes-list li:nth-of-type(2) ul.devsite-footer-linkbox-list li:nth-of-type(2) a.devsite-footer-linkbox-link.gc-analytics-event")
    @CacheLookup
    private WebElement googleBusinessGroups3;

    @FindBy(css = "#gc-wrapper devsite-footer-utility.devsite-footer div.devsite-footer-utility nav:nth-of-type(1) ul.devsite-footer-sites-list li:nth-of-type(4) a.devsite-footer-sites-link.gc-analytics-event")
    @CacheLookup
    private WebElement googleCloudPlatform;

    @FindBy(css = "a[href='//console.cloud.google.com']")
    @CacheLookup
    private WebElement googleCloudPlatformConsole;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(1) ul.devsite-tabs-dropdown-section. li:nth-of-type(1) a")
    @CacheLookup
    private WebElement googleDeveloperGroups1;

    @FindBy(css = "a[href='https://developers.google.com/community/gdg']")
    @CacheLookup
    private WebElement googleDeveloperGroups2;

    @FindBy(css = "#gc-wrapper devsite-footer-linkboxes.devsite-footer nav.devsite-footer-linkboxes.nocontent ul.devsite-footer-linkboxes-list li:nth-of-type(2) ul.devsite-footer-linkbox-list li:nth-of-type(3) a.devsite-footer-linkbox-link.gc-analytics-event")
    @CacheLookup
    private WebElement googleDeveloperGroups3;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(1) ul.devsite-breadcrumb-list li:nth-of-type(1) a.devsite-breadcrumb-link.gc-analytics-event")
    @CacheLookup
    private WebElement googleDevelopers;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(2) ul.devsite-tabs-dropdown-section. li:nth-of-type(1) a")
    @CacheLookup
    private WebElement googleDevelopersExperts1;

    @FindBy(css = "a[href='https://developers.google.com/community/experts']")
    @CacheLookup
    private WebElement googleDevelopersExperts2;

    @FindBy(css = "#gc-wrapper devsite-footer-linkboxes.devsite-footer nav.devsite-footer-linkboxes.nocontent ul.devsite-footer-linkboxes-list li:nth-of-type(2) ul.devsite-footer-linkbox-list li:nth-of-type(4) a.devsite-footer-linkbox-link.gc-analytics-event")
    @CacheLookup
    private WebElement googleDevelopersExperts3;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(2) ul.devsite-tabs-dropdown-section. li:nth-of-type(3) a")
    @CacheLookup
    private WebElement googleDevelopersLaunchpad1;

    @FindBy(css = "a[href='https://developers.google.com/community/launchpad']")
    @CacheLookup
    private WebElement googleDevelopersLaunchpad2;

    @FindBy(css = "a[href='/pay']")
    @CacheLookup
    private WebElement googlePay1;

    @FindBy(css = "a[href='https://developers.google.com/pay']")
    @CacheLookup
    private WebElement googlePay2;

    @FindBy(css = "a[href='//developer.android.com/distribute/']")
    @CacheLookup
    private WebElement googlePlay1;

    @FindBy(css = "a[href='https://developer.android.com/distribute/']")
    @CacheLookup
    private WebElement googlePlay2;

    @FindBy(css = "a[href='//developer.android.com/google/play/billing/']")
    @CacheLookup
    private WebElement googlePlayBilling1;

    @FindBy(css = "a[href='https://developer.android.com/google/play/billing/']")
    @CacheLookup
    private WebElement googlePlayBilling2;

    @FindBy(css = "a[href='//play.google.com/apps/publish']")
    @CacheLookup
    private WebElement googlePlayConsole;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(2) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement indieGamesShowcaseEurope;

    @FindBy(css = "a[href='/interactive-media-ads']")
    @CacheLookup
    private WebElement interactiveMediaAds1;

    @FindBy(css = "a[href='https://developers.google.com/interactive-media-ads']")
    @CacheLookup
    private WebElement interactiveMediaAds2;

    @FindBy(css = "a.gb_Ob.gb_0b")
    @CacheLookup
    private WebElement kalilurRahmanrahmanKalilurgmailComDefault;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row devsite-language-selector devsite-select.devsite-language-selector-menu div.devsite-select button.devsite-select-toggle")
    @CacheLookup
    private WebElement language1;

    @FindBy(css = "#gc-wrapper devsite-footer-utility.devsite-footer div.devsite-footer-utility nav:nth-of-type(2) devsite-language-selector devsite-select.devsite-language-selector-menu div.devsite-select button.devsite-select-toggle")
    @CacheLookup
    private WebElement language2;

    @FindBy(name = "language")
    @CacheLookup
    private WebElement languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1;

    @FindBy(name = "language")
    @CacheLookup
    private WebElement languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2;

    @FindBy(css = "#gc-wrapper devsite-footer-linkboxes.devsite-footer nav.devsite-footer-linkboxes.nocontent ul.devsite-footer-linkboxes-list li:nth-of-type(2) ul.devsite-footer-linkbox-list li:nth-of-type(5) a.devsite-footer-linkbox-link.gc-analytics-event")
    @CacheLookup
    private WebElement launchpad;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(1) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a.button.button-white.")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(1) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a.button.button-white.")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(2) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a.button.button-white.")
    @CacheLookup
    private WebElement learnMore3;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(2) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a.button.button-white.")
    @CacheLookup
    private WebElement learnMore4;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(3) div.devsite-landing-row-group div:nth-of-type(2) div:nth-of-type(2) div.devsite-landing-row-item-body div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement learnMore5;

    @FindBy(css = "a[href='//cloud.google.com/maps-platform/']")
    @CacheLookup
    private WebElement mapsPlatform1;

    @FindBy(css = "a[href='https://cloud.google.com/maps-platform/']")
    @CacheLookup
    private WebElement mapsPlatform2;

    @FindBy(css = "a[href='//medium.com/google-developers']")
    @CacheLookup
    private WebElement medium;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(5) a.devsite-icon.devsite-icon-arrow-drop-down")
    @CacheLookup
    private WebElement more;

    private final String pageLoadedText = "October 23-24 | Sunnyvale, CA, USA\" data-category=\"Homepage Promo Banner\" data-label=\"Android Dev Summit 2019, Main title\" data-action=\"link\">";

    private final String pageUrl = "/";

    @FindBy(css = "a.gb_Ib")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a[href='//policies.google.com/privacy']")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(1) a:nth-of-type(1)")
    @CacheLookup
    private WebElement products1;

    @FindBy(css = "a[href='https://developers.google.com/products']")
    @CacheLookup
    private WebElement products2;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(1) ul.devsite-breadcrumb-list li:nth-of-type(2) a.devsite-breadcrumb-link.gc-analytics-event")
    @CacheLookup
    private WebElement products3;

    @FindBy(css = "#gc-wrapper div.devsite-main-content devsite-content article.devsite-article article.devsite-article-inner div:nth-of-type(2) section:nth-of-type(2) div.devsite-landing-row-group div:nth-of-type(1) div:nth-of-type(2) div.devsite-landing-row-item-body a")
    @CacheLookup
    private WebElement reasonsToPublishYour16;

    @FindBy(css = "a[href='/search']")
    @CacheLookup
    private WebElement search1;

    @FindBy(css = "a[href='https://developers.google.com/search']")
    @CacheLookup
    private WebElement search2;

    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a[href='//services.google.com/fb/forms/googledevelopersnewsletter/?utm_medium=referral&utm_source=google-products&utm_team=googledevs&utm_campaign=201611-newsletter-launch']")
    @CacheLookup
    private WebElement subscribe;

    @FindBy(css = "a[href='//www.tensorflow.org']")
    @CacheLookup
    private WebElement tensorflow1;

    @FindBy(css = "a[href='https://www.tensorflow.org/']")
    @CacheLookup
    private WebElement tensorflow2;

    @FindBy(css = "a[href='/terms/site-terms']")
    @CacheLookup
    private WebElement terms;

    @FindBy(css = "a[href='//twitter.com/googledevs']")
    @CacheLookup
    private WebElement twitter;

    @FindBy(css = "a[href='/events/?utm_source=devsite&utm_medium=hpp&utm_campaign=events_section']")
    @CacheLookup
    private WebElement viewAll;

    @FindBy(css = "a[href='/web']")
    @CacheLookup
    private WebElement web1;

    @FindBy(css = "a[href='https://developers.google.com/web']")
    @CacheLookup
    private WebElement web2;

    @FindBy(css = "a[href='/web/fundamentals/engage-and-retain/push-notifications']")
    @CacheLookup
    private WebElement webPushAndNotificationApis1;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement webPushAndNotificationApis2;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement webPushAndNotificationApis3;

    @FindBy(css = "a[href='https://developers.google.com/web/fundamentals/engage-and-retain/push-notifications']")
    @CacheLookup
    private WebElement webPushAndNotificationApis4;

    @FindBy(css = "div.devsite-wrapper devsite-header div.devsite-header--inner div:nth-of-type(1) div.devsite-top-logo-row-wrapper div.devsite-top-logo-row div:nth-of-type(2) div.devsite-header-upper-tabs devsite-tabs.upper-tabs div.devsite-tabs-wrapper tab:nth-of-type(3) div.devsite-tabs-dropdown div.devsite-tabs-dropdown-content div:nth-of-type(2) ul.devsite-tabs-dropdown-section. li:nth-of-type(2) a")
    @CacheLookup
    private WebElement womenTechmakers1;

    @FindBy(css = "div.devsite-wrapper devsite-book-nav nav.devsite-book-nav.devsite-nav.nocontent div:nth-of-type(2) div:nth-of-type(2) ul:nth-of-type(2) li:nth-of-type(5) a.devsite-nav-title.gc-analytics-event.")
    @CacheLookup
    private WebElement womenTechmakers2;

    @FindBy(css = "a[href='//www.womentechmakers.com']")
    @CacheLookup
    private WebElement womenTechmakers3;

    @FindBy(css = "a[href='/youtube']")
    @CacheLookup
    private WebElement youtube1;

    @FindBy(css = "a[href='https://developers.google.com/youtube']")
    @CacheLookup
    private WebElement youtube2;

    @FindBy(css = "a[href='//www.youtube.com/user/GoogleDevelopers']")
    @CacheLookup
    private WebElement youtube3;

    public GoogleDeveloper() {
    }

    public GoogleDeveloper(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public GoogleDeveloper(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public GoogleDeveloper(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Actions On Google Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickActionsOnGoogleConsoleLink() {
        actionsOnGoogleConsole.click();
        return this;
    }

    /**
     * Click on Add Account Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    /**
     * Click on Admob Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAdmob1Link() {
        admob1.click();
        return this;
    }

    /**
     * Click on Admob Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAdmob2Link() {
        admob2.click();
        return this;
    }

    /**
     * Click on All Products Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAllProductsLink() {
        allProducts.click();
        return this;
    }

    /**
     * Click on All Your Brand Accounts Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAllYourBrandAccountsLink() {
        allYourBrandAccounts.click();
        return this;
    }

    /**
     * Click on Android Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAndroid1Link() {
        android1.click();
        return this;
    }

    /**
     * Click on Android Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAndroid2Link() {
        android2.click();
        return this;
    }

    /**
     * Click on Android Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAndroid3Link() {
        android3.click();
        return this;
    }

    /**
     * Click on Android Dev Summit 2019 October 2324 Sunnyvale Ca Usa Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAndroidDevSummit2019OctoberLink() {
        androidDevSummit2019October.click();
        return this;
    }

    /**
     * Click on Androiddevsummit Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickAndroiddevsummitLink() {
        androiddevsummit.click();
        return this;
    }

    /**
     * Click on Apply Now Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickApplyNowLink() {
        applyNow.click();
        return this;
    }

    /**
     * Click on Bettertogether Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickBettertogetherLink() {
        bettertogether.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickBlog1Link() {
        blog1.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickBlog2Link() {
        blog2.click();
        return this;
    }

    /**
     * Click on Blog Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickBlog3Link() {
        blog3.click();
        return this;
    }

    /**
     * Click on Cast Sdk Developer Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickCastSdkDeveloperConsoleLink() {
        castSdkDeveloperConsole.click();
        return this;
    }

    /**
     * Click on Celebrating App Makers Worldwide Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickCelebratingAppMakersWorldwideLink() {
        celebratingAppMakersWorldwide.click();
        return this;
    }

    /**
     * Click on Change Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickChangeLink() {
        change.click();
        return this;
    }

    /**
     * Click on Chrome Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickChromeLink() {
        chrome.click();
        return this;
    }

    /**
     * Click on Chrome Web Store Dashboard Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickChromeWebStoreDashboardLink() {
        chromeWebStoreDashboard.click();
        return this;
    }

    /**
     * Click on Cit 1996 25th Reunioncit96.25.reuniongmail.com Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickCit199625thReunioncit9625ReuniongmailComLink() {
        cit199625thReunioncit9625ReuniongmailCom.click();
        return this;
    }

    /**
     * Click on Cloud Platform Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickCloudPlatform1Link() {
        cloudPlatform1.click();
        return this;
    }

    /**
     * Click on Cloud Platform Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickCloudPlatform2Link() {
        cloudPlatform2.click();
        return this;
    }

    /**
     * Click on Developer Communities Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperCommunities1Link() {
        developerCommunities1.click();
        return this;
    }

    /**
     * Click on Developer Communities Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperCommunities2Link() {
        developerCommunities2.click();
        return this;
    }

    /**
     * Click on 2019 Developer Student Club Leads Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperStudentClubLeadsLink2019() {
        developerStudentClubLeads2019.click();
        return this;
    }

    /**
     * Click on Developer Student Clubs Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperStudentClubs1Link() {
        developerStudentClubs1.click();
        return this;
    }

    /**
     * Click on Developer Student Clubs Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperStudentClubs2Link() {
        developerStudentClubs2.click();
        return this;
    }

    /**
     * Click on Developer Student Clubs Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickDeveloperStudentClubs3Link() {
        developerStudentClubs3.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickEvents1Link() {
        events1.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickEvents2Link() {
        events2.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFacebookLink() {
        facebook.click();
        return this;
    }

    /**
     * Click on Firebase Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebase1Link() {
        firebase1.click();
        return this;
    }

    /**
     * Click on Firebase Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebase2Link() {
        firebase2.click();
        return this;
    }

    /**
     * Click on Firebase Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebase3Link() {
        firebase3.click();
        return this;
    }

    /**
     * Click on Firebase Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebase4Link() {
        firebase4.click();
        return this;
    }

    /**
     * Click on Firebase Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebase5Link() {
        firebase5.click();
        return this;
    }

    /**
     * Click on Firebase Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebaseConsoleLink() {
        firebaseConsole.click();
        return this;
    }

    /**
     * Click on Firebase Summit 2019 September 26 Madrid Spain Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebaseSummit2019September26Link() {
        firebaseSummit2019September26.click();
        return this;
    }

    /**
     * Click on Firebasesummit Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFirebasesummitLink() {
        firebasesummit.click();
        return this;
    }

    /**
     * Click on Flutter Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFlutter1Link() {
        flutter1.click();
        return this;
    }

    /**
     * Click on Flutter Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickFlutter2Link() {
        flutter2.click();
        return this;
    }

    /**
     * Click on Get Featured Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGetFeaturedLink() {
        getFeatured.click();
        return this;
    }

    /**
     * Click on Google Account Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAccountLink() {
        googleAccount.click();
        return this;
    }

    /**
     * Click on Google Ads Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAds1Link() {
        googleAds1.click();
        return this;
    }

    /**
     * Click on Google Ads Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAds2Link() {
        googleAds2.click();
        return this;
    }

    /**
     * Click on Google Ads Api Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAdsApi1Link() {
        googleAdsApi1.click();
        return this;
    }

    /**
     * Click on Google Ads Api Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAdsApi2Link() {
        googleAdsApi2.click();
        return this;
    }

    /**
     * Click on Google Analytics Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAnalytics1Link() {
        googleAnalytics1.click();
        return this;
    }

    /**
     * Click on Google Analytics Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleAnalytics2Link() {
        googleAnalytics2.click();
        return this;
    }

    /**
     * Click on Google Api Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleApiConsoleLink() {
        googleApiConsole.click();
        return this;
    }

    /**
     * Click on Google Business Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleBusinessGroups1Link() {
        googleBusinessGroups1.click();
        return this;
    }

    /**
     * Click on Google Business Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleBusinessGroups2Link() {
        googleBusinessGroups2.click();
        return this;
    }

    /**
     * Click on Google Business Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleBusinessGroups3Link() {
        googleBusinessGroups3.click();
        return this;
    }

    /**
     * Click on Google Cloud Platform Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleCloudPlatformConsoleLink() {
        googleCloudPlatformConsole.click();
        return this;
    }

    /**
     * Click on Google Cloud Platform Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleCloudPlatformLink() {
        googleCloudPlatform.click();
        return this;
    }

    /**
     * Click on Google Developer Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDeveloperGroups1Link() {
        googleDeveloperGroups1.click();
        return this;
    }

    /**
     * Click on Google Developer Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDeveloperGroups2Link() {
        googleDeveloperGroups2.click();
        return this;
    }

    /**
     * Click on Google Developer Groups Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDeveloperGroups3Link() {
        googleDeveloperGroups3.click();
        return this;
    }

    /**
     * Click on Google Developers Experts Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersExperts1Link() {
        googleDevelopersExperts1.click();
        return this;
    }

    /**
     * Click on Google Developers Experts Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersExperts2Link() {
        googleDevelopersExperts2.click();
        return this;
    }

    /**
     * Click on Google Developers Experts Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersExperts3Link() {
        googleDevelopersExperts3.click();
        return this;
    }

    /**
     * Click on Google Developers Launchpad Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersLaunchpad1Link() {
        googleDevelopersLaunchpad1.click();
        return this;
    }

    /**
     * Click on Google Developers Launchpad Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersLaunchpad2Link() {
        googleDevelopersLaunchpad2.click();
        return this;
    }

    /**
     * Click on Google Developers Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGoogleDevelopersLink() {
        googleDevelopers.click();
        return this;
    }

    /**
     * Click on Google Pay Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePay1Link() {
        googlePay1.click();
        return this;
    }

    /**
     * Click on Google Pay Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePay2Link() {
        googlePay2.click();
        return this;
    }

    /**
     * Click on Google Play Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePlay1Link() {
        googlePlay1.click();
        return this;
    }

    /**
     * Click on Google Play Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePlay2Link() {
        googlePlay2.click();
        return this;
    }

    /**
     * Click on Google Play Billing Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePlayBilling1Link() {
        googlePlayBilling1.click();
        return this;
    }

    /**
     * Click on Google Play Billing Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePlayBilling2Link() {
        googlePlayBilling2.click();
        return this;
    }

    /**
     * Click on Google Play Console Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickGooglePlayConsoleLink() {
        googlePlayConsole.click();
        return this;
    }

    /**
     * Click on Indie Games Showcase Europe Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickIndieGamesShowcaseEuropeLink() {
        indieGamesShowcaseEurope.click();
        return this;
    }

    /**
     * Click on Interactive Media Ads Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickInteractiveMediaAds1Link() {
        interactiveMediaAds1.click();
        return this;
    }

    /**
     * Click on Interactive Media Ads Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickInteractiveMediaAds2Link() {
        interactiveMediaAds2.click();
        return this;
    }

    /**
     * Click on Kalilur Rahmanrahman.kalilurgmail.com Default Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickKalilurRahmanrahmanKalilurgmailComDefaultLink() {
        kalilurRahmanrahmanKalilurgmailComDefault.click();
        return this;
    }

    /**
     * Click on Language Button.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLanguage1Button() {
        language1.click();
        return this;
    }

    /**
     * Click on Language Button.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLanguage2Button() {
        language2.click();
        return this;
    }

    /**
     * Click on Launchpad Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLaunchpadLink() {
        launchpad.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLearnMore3Link() {
        learnMore3.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLearnMore4Link() {
        learnMore4.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickLearnMore5Link() {
        learnMore5.click();
        return this;
    }

    /**
     * Click on Maps Platform Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickMapsPlatform1Link() {
        mapsPlatform1.click();
        return this;
    }

    /**
     * Click on Maps Platform Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickMapsPlatform2Link() {
        mapsPlatform2.click();
        return this;
    }

    /**
     * Click on Medium Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickMediumLink() {
        medium.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickProducts1Link() {
        products1.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickProducts2Link() {
        products2.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickProducts3Link() {
        products3.click();
        return this;
    }

    /**
     * Click on 16 Reasons To Publish Your Apps And Games With The Android App Bundle Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickReasonsToPublishYourLink16() {
        reasonsToPublishYour16.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickSearch1Link() {
        search1.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickSearch2Link() {
        search2.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Subscribe Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickSubscribeLink() {
        subscribe.click();
        return this;
    }

    /**
     * Click on Tensorflow Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickTensorflow1Link() {
        tensorflow1.click();
        return this;
    }

    /**
     * Click on Tensorflow Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickTensorflow2Link() {
        tensorflow2.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickTermsLink() {
        terms.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickTwitterLink() {
        twitter.click();
        return this;
    }

    /**
     * Click on View All Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickViewAllLink() {
        viewAll.click();
        return this;
    }

    /**
     * Click on Web Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWeb1Link() {
        web1.click();
        return this;
    }

    /**
     * Click on Web Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWeb2Link() {
        web2.click();
        return this;
    }

    /**
     * Click on Web Push And Notification Apis Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWebPushAndNotificationApis4Link() {
        webPushAndNotificationApis4.click();
        return this;
    }

    /**
     * Click on Women Techmakers Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWomenTechmakers1Link() {
        womenTechmakers1.click();
        return this;
    }

    /**
     * Click on Women Techmakers Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWomenTechmakers2Link() {
        womenTechmakers2.click();
        return this;
    }

    /**
     * Click on Women Techmakers Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickWomenTechmakers3Link() {
        womenTechmakers3.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickYoutube1Link() {
        youtube1.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickYoutube2Link() {
        youtube2.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper clickYoutube3Link() {
        youtube3.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper fill() {
        setWebPushAndNotificationApis2TextField();
        setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField();
        setWebPushAndNotificationApis3TextField();
        setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField() {
        return setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField(data.get("LANGUAGELANGUAGEBAHASA_INDONESIADEUTSCHENGLISHESPAOLFRANAISPORTUGUS_BRASIL_1"));
    }

    /**
     * Set value to Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField(String languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1Value) {
        new Select(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1).selectByVisibleText(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1Value);
        return this;
    }

    /**
     * Set default value to Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField() {
        return setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField(data.get("LANGUAGELANGUAGEBAHASA_INDONESIADEUTSCHENGLISHESPAOLFRANAISPORTUGUS_BRASIL_2"));
    }

    /**
     * Set value to Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField(String languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2Value) {
        new Select(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2).selectByVisibleText(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2Value);
        return this;
    }

    /**
     * Set default value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis1TextField() {
        return setWebPushAndNotificationApis1TextField(data.get("WEB_PUSH_AND_NOTIFICATION_APIS_1"));
    }

    /**
     * Set value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis1TextField(String webPushAndNotificationApis1Value) {
        webPushAndNotificationApis1.click();
        return this;
    }

    /**
     * Set default value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis2TextField() {
        return setWebPushAndNotificationApis2TextField(data.get("WEB_PUSH_AND_NOTIFICATION_APIS_2"));
    }

    /**
     * Set value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis2TextField(String webPushAndNotificationApis2Value) {
        webPushAndNotificationApis2.sendKeys(webPushAndNotificationApis2Value);
        return this;
    }

    /**
     * Set default value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis3TextField() {
        return setWebPushAndNotificationApis3TextField(data.get("WEB_PUSH_AND_NOTIFICATION_APIS_3"));
    }

    /**
     * Set value to Web Push And Notification Apis Text field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper setWebPushAndNotificationApis3TextField(String webPushAndNotificationApis3Value) {
        webPushAndNotificationApis3.sendKeys(webPushAndNotificationApis3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper submit() {
        clickLanguageButton();
        GoogleDeveloper target = new GoogleDeveloper(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset default value from Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField() {
        return unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField(data.get("LANGUAGELANGUAGEBAHASA_INDONESIADEUTSCHENGLISHESPAOLFRANAISPORTUGUS_BRASIL_1"));
    }

    /**
     * Unset value from Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1DropDownListField(String languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1Value) {
        new Select(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1).deselectByVisibleText(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil1Value);
        return this;
    }

    /**
     * Unset default value from Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField() {
        return unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField(data.get("LANGUAGELANGUAGEBAHASA_INDONESIADEUTSCHENGLISHESPAOLFRANAISPORTUGUS_BRASIL_2"));
    }

    /**
     * Unset value from Languagelanguagebahasa Indonesiadeutschenglishespaolfranaisportugus Brasil Drop Down List field.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper unsetLanguagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2DropDownListField(String languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2Value) {
        new Select(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2).deselectByVisibleText(languagelanguagebahasaIndonesiadeutschenglishespaolfranaisportugusBrasil2Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper verifyPageLoaded() {
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
     * @return the GoogleDeveloper class instance.
     */
    public GoogleDeveloper verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
