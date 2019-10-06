import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='https://www.google.com/intl/en_in/about/?utm_source=google-IN&utm_medium=referral&utm_campaign=hp-footer&fg=1']")
    @CacheLookup
    private WebElement about;

    @FindBy(id = "gb192")
    @CacheLookup
    private WebElement account;

    @FindBy(css = "a.gb_X.gb_gg")
    @CacheLookup
    private WebElement addAShortcut;

    @FindBy(css = "a.gb_4.gb_9f.gb_We.gb_tb")
    @CacheLookup
    private WebElement addAccount;

    @FindBy(css = "a[href='/advanced_search?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement advancedSearch;

    @FindBy(css = "a[href='https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1']")
    @CacheLookup
    private WebElement advertising;

    @FindBy(css = "a.gb_cc.gb_za.gb_bc")
    @CacheLookup
    private WebElement allYourBrandAccounts;

    @FindBy(id = "gb30")
    @CacheLookup
    private WebElement blogger;

    @FindBy(id = "gb10")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a[href='https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1']")
    @CacheLookup
    private WebElement business;

    @FindBy(id = "gb24")
    @CacheLookup
    private WebElement calendar;

    @FindBy(css = "a.gb_bb.gb_7a.gb_gg")
    @CacheLookup
    private WebElement change;

    @FindBy(css = "a[href='https://www.google.com/webhp?authuser=1']")
    @CacheLookup
    private WebElement cit199625thReunioncit9625ReuniongmailCom;

    @FindBy(id = "gb265")
    @CacheLookup
    private WebElement classroom;

    @FindBy(id = "gb338")
    @CacheLookup
    private WebElement collections;

    @FindBy(css = "a.gb_tb.gb_5.gb_sd.gb_ud")
    @CacheLookup
    private WebElement complete;

    @FindBy(id = "gb53")
    @CacheLookup
    private WebElement contacts;

    @FindBy(id = "gb25")
    @CacheLookup
    private WebElement docs;

    @FindBy(id = "gb49")
    @CacheLookup
    private WebElement drive;

    @FindBy(id = "gb461")
    @CacheLookup
    private WebElement duo;

    @FindBy(id = "gb429")
    @CacheLookup
    private WebElement earth;

    @FindBy(css = "a.gb_8f.gb_K")
    @CacheLookup
    private WebElement evenMoreFromGoogle;

    @FindBy(id = "gb206")
    @CacheLookup
    private WebElement flights;

    @FindBy(css = "a[href='https://mail.google.com/mail/?tab=wm&authuser=0&ogbl']")
    @CacheLookup
    private WebElement gmail1;

    @FindBy(id = "gb23")
    @CacheLookup
    private WebElement gmail2;

    @FindBy(name = "q")
    @CacheLookup
    private WebElement gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecomplete;

    @FindBy(css = "a.gb_4.gb_cg.gbp1.gb_We.gb_tb")
    @CacheLookup
    private WebElement googleAccount;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch1;

    @FindBy(name = "btnK")
    @CacheLookup
    private WebElement googleSearch2;

    @FindBy(id = "gb300")
    @CacheLookup
    private WebElement hangouts;

    @FindBy(css = "a[href='//myactivity.google.com/product/search?utm_source=google&hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement history;

    @FindBy(css = "a[href='//google.com/search/howsearchworks/?fg=1']")
    @CacheLookup
    private WebElement howSearchWorks;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky1;

    @FindBy(name = "btnI")
    @CacheLookup
    private WebElement imFeelingLucky2;

    @FindBy(css = "a[href='https://www.google.co.in/imghp?hl=en&tab=wi&authuser=0&ogbl']")
    @CacheLookup
    private WebElement images1;

    @FindBy(id = "gb2")
    @CacheLookup
    private WebElement images2;

    @FindBy(id = "gb357")
    @CacheLookup
    private WebElement jamboard;

    @FindBy(css = "a.gb_Ob.gb_0b")
    @CacheLookup
    private WebElement kalilurRahmanrahmanKalilurgmailComDefault;

    @FindBy(id = "gb136")
    @CacheLookup
    private WebElement keep;

    @FindBy(id = "gb8")
    @CacheLookup
    private WebElement maps;

    @FindBy(css = "a.gb_J.gb_gg")
    @CacheLookup
    private WebElement more;

    @FindBy(id = "gb5")
    @CacheLookup
    private WebElement news;

    @FindBy(css = "a.gb_1.gb_rd.gb_sd")
    @CacheLookup
    private WebElement noThanks;

    private final String pageLoadedText = "";

    private final String pageUrl = "/";

    @FindBy(id = "gb31")
    @CacheLookup
    private WebElement photos;

    @FindBy(id = "gb78")
    @CacheLookup
    private WebElement play;

    @FindBy(css = "a[href='https://policies.google.com/privacy?fg=1']")
    @CacheLookup
    private WebElement privacy1;

    @FindBy(css = "a.gb_Ib")
    @CacheLookup
    private WebElement privacy2;

    @FindBy(id = "sbfblt")
    @CacheLookup
    private WebElement reportInappropriatePredictions;

    @FindBy(id = "gb1")
    @CacheLookup
    private WebElement search;

    @FindBy(css = "a[href='//support.google.com/websearch/?p=ws_results_help&hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchHelp;

    @FindBy(css = "a[href='https://www.google.com/preferences?hl=en-IN&fg=1']")
    @CacheLookup
    private WebElement searchSettings;

    @FindBy(id = "dk2qOd")
    @CacheLookup
    private WebElement sendFeedback;

    @FindBy(id = "fsettl")
    @CacheLookup
    private WebElement settings;

    @FindBy(id = "gb6")
    @CacheLookup
    private WebElement shopping;

    @FindBy(id = "gb_71")
    @CacheLookup
    private WebElement signOut;

    @FindBy(css = "a[href='https://policies.google.com/terms?fg=1']")
    @CacheLookup
    private WebElement terms;

    @FindBy(id = "gb51")
    @CacheLookup
    private WebElement translate;

    @FindBy(css = "a[href='//myactivity.google.com/privacyadvisor/search?utm_source=googlemenu&fg=1']")
    @CacheLookup
    private WebElement yourDataInSearch;

    @FindBy(id = "gb36")
    @CacheLookup
    private WebElement youtube;

    public Google() {
    }

    public Google(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Google(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Google(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the Google class instance.
     */
    public Google clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Account Link.
     *
     * @return the Google class instance.
     */
    public Google clickAccountLink() {
        account.click();
        return this;
    }

    /**
     * Click on Add A Shortcut Link.
     *
     * @return the Google class instance.
     */
    public Google clickAddAShortcutLink() {
        addAShortcut.click();
        return this;
    }

    /**
     * Click on Add Account Link.
     *
     * @return the Google class instance.
     */
    public Google clickAddAccountLink() {
        addAccount.click();
        return this;
    }

    /**
     * Click on Advanced Search Link.
     *
     * @return the Google class instance.
     */
    public Google clickAdvancedSearchLink() {
        advancedSearch.click();
        return this;
    }

    /**
     * Click on Advertising Link.
     *
     * @return the Google class instance.
     */
    public Google clickAdvertisingLink() {
        advertising.click();
        return this;
    }

    /**
     * Click on All Your Brand Accounts Link.
     *
     * @return the Google class instance.
     */
    public Google clickAllYourBrandAccountsLink() {
        allYourBrandAccounts.click();
        return this;
    }

    /**
     * Click on Blogger Link.
     *
     * @return the Google class instance.
     */
    public Google clickBloggerLink() {
        blogger.click();
        return this;
    }

    /**
     * Click on Books Link.
     *
     * @return the Google class instance.
     */
    public Google clickBooksLink() {
        books.click();
        return this;
    }

    /**
     * Click on Business Link.
     *
     * @return the Google class instance.
     */
    public Google clickBusinessLink() {
        business.click();
        return this;
    }

    /**
     * Click on Calendar Link.
     *
     * @return the Google class instance.
     */
    public Google clickCalendarLink() {
        calendar.click();
        return this;
    }

    /**
     * Click on Change Link.
     *
     * @return the Google class instance.
     */
    public Google clickChangeLink() {
        change.click();
        return this;
    }

    /**
     * Click on Cit 1996 25th Reunioncit96.25.reuniongmail.com Link.
     *
     * @return the Google class instance.
     */
    public Google clickCit199625thReunioncit9625ReuniongmailComLink() {
        cit199625thReunioncit9625ReuniongmailCom.click();
        return this;
    }

    /**
     * Click on Classroom Link.
     *
     * @return the Google class instance.
     */
    public Google clickClassroomLink() {
        classroom.click();
        return this;
    }

    /**
     * Click on Collections Link.
     *
     * @return the Google class instance.
     */
    public Google clickCollectionsLink() {
        collections.click();
        return this;
    }

    /**
     * Click on Complete Link.
     *
     * @return the Google class instance.
     */
    public Google clickCompleteLink() {
        complete.click();
        return this;
    }

    /**
     * Click on Contacts Link.
     *
     * @return the Google class instance.
     */
    public Google clickContactsLink() {
        contacts.click();
        return this;
    }

    /**
     * Click on Docs Link.
     *
     * @return the Google class instance.
     */
    public Google clickDocsLink() {
        docs.click();
        return this;
    }

    /**
     * Click on Drive Link.
     *
     * @return the Google class instance.
     */
    public Google clickDriveLink() {
        drive.click();
        return this;
    }

    /**
     * Click on Duo Link.
     *
     * @return the Google class instance.
     */
    public Google clickDuoLink() {
        duo.click();
        return this;
    }

    /**
     * Click on Earth Link.
     *
     * @return the Google class instance.
     */
    public Google clickEarthLink() {
        earth.click();
        return this;
    }

    /**
     * Click on Even More From Google Link.
     *
     * @return the Google class instance.
     */
    public Google clickEvenMoreFromGoogleLink() {
        evenMoreFromGoogle.click();
        return this;
    }

    /**
     * Click on Flights Link.
     *
     * @return the Google class instance.
     */
    public Google clickFlightsLink() {
        flights.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the Google class instance.
     */
    public Google clickGmail1Link() {
        gmail1.click();
        return this;
    }

    /**
     * Click on Gmail Link.
     *
     * @return the Google class instance.
     */
    public Google clickGmail2Link() {
        gmail2.click();
        return this;
    }

    /**
     * Click on Google Account Link.
     *
     * @return the Google class instance.
     */
    public Google clickGoogleAccountLink() {
        googleAccount.click();
        return this;
    }

    /**
     * Click on Google Search Button.
     *
     * @return the Google class instance.
     */
    public Google clickGoogleSearch1Button() {
        googleSearch1.click();
        return this;
    }

    /**
     * Click on Google Search Button.
     *
     * @return the Google class instance.
     */
    public Google clickGoogleSearch2Button() {
        googleSearch2.click();
        return this;
    }

    /**
     * Click on Hangouts Link.
     *
     * @return the Google class instance.
     */
    public Google clickHangoutsLink() {
        hangouts.click();
        return this;
    }

    /**
     * Click on History Link.
     *
     * @return the Google class instance.
     */
    public Google clickHistoryLink() {
        history.click();
        return this;
    }

    /**
     * Click on How Search Works Link.
     *
     * @return the Google class instance.
     */
    public Google clickHowSearchWorksLink() {
        howSearchWorks.click();
        return this;
    }

    /**
     * Click on Im Feeling Lucky Button.
     *
     * @return the Google class instance.
     */
    public Google clickImFeelingLucky1Button() {
        imFeelingLucky1.click();
        return this;
    }

    /**
     * Click on Im Feeling Lucky Button.
     *
     * @return the Google class instance.
     */
    public Google clickImFeelingLucky2Button() {
        imFeelingLucky2.click();
        return this;
    }

    /**
     * Click on Images Link.
     *
     * @return the Google class instance.
     */
    public Google clickImages1Link() {
        images1.click();
        return this;
    }

    /**
     * Click on Images Link.
     *
     * @return the Google class instance.
     */
    public Google clickImages2Link() {
        images2.click();
        return this;
    }

    /**
     * Click on Jamboard Link.
     *
     * @return the Google class instance.
     */
    public Google clickJamboardLink() {
        jamboard.click();
        return this;
    }

    /**
     * Click on Kalilur Rahmanrahman.kalilurgmail.com Default Link.
     *
     * @return the Google class instance.
     */
    public Google clickKalilurRahmanrahmanKalilurgmailComDefaultLink() {
        kalilurRahmanrahmanKalilurgmailComDefault.click();
        return this;
    }

    /**
     * Click on Keep Link.
     *
     * @return the Google class instance.
     */
    public Google clickKeepLink() {
        keep.click();
        return this;
    }

    /**
     * Click on Maps Link.
     *
     * @return the Google class instance.
     */
    public Google clickMapsLink() {
        maps.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the Google class instance.
     */
    public Google clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on News Link.
     *
     * @return the Google class instance.
     */
    public Google clickNewsLink() {
        news.click();
        return this;
    }

    /**
     * Click on No Thanks Link.
     *
     * @return the Google class instance.
     */
    public Google clickNoThanksLink() {
        noThanks.click();
        return this;
    }

    /**
     * Click on Photos Link.
     *
     * @return the Google class instance.
     */
    public Google clickPhotosLink() {
        photos.click();
        return this;
    }

    /**
     * Click on Play Link.
     *
     * @return the Google class instance.
     */
    public Google clickPlayLink() {
        play.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the Google class instance.
     */
    public Google clickPrivacy1Link() {
        privacy1.click();
        return this;
    }

    /**
     * Click on Privacy Link.
     *
     * @return the Google class instance.
     */
    public Google clickPrivacy2Link() {
        privacy2.click();
        return this;
    }

    /**
     * Click on Report Inappropriate Predictions Link.
     *
     * @return the Google class instance.
     */
    public Google clickReportInappropriatePredictionsLink() {
        reportInappropriatePredictions.click();
        return this;
    }

    /**
     * Click on Search Help Link.
     *
     * @return the Google class instance.
     */
    public Google clickSearchHelpLink() {
        searchHelp.click();
        return this;
    }

    /**
     * Click on Search Link.
     *
     * @return the Google class instance.
     */
    public Google clickSearchLink() {
        search.click();
        return this;
    }

    /**
     * Click on Search Settings Link.
     *
     * @return the Google class instance.
     */
    public Google clickSearchSettingsLink() {
        searchSettings.click();
        return this;
    }

    /**
     * Click on Send Feedback Link.
     *
     * @return the Google class instance.
     */
    public Google clickSendFeedbackLink() {
        sendFeedback.click();
        return this;
    }

    /**
     * Click on Settings Link.
     *
     * @return the Google class instance.
     */
    public Google clickSettingsLink() {
        settings.click();
        return this;
    }

    /**
     * Click on Shopping Link.
     *
     * @return the Google class instance.
     */
    public Google clickShoppingLink() {
        shopping.click();
        return this;
    }

    /**
     * Click on Sign Out Link.
     *
     * @return the Google class instance.
     */
    public Google clickSignOutLink() {
        signOut.click();
        return this;
    }

    /**
     * Click on Terms Link.
     *
     * @return the Google class instance.
     */
    public Google clickTermsLink() {
        terms.click();
        return this;
    }

    /**
     * Click on Translate Link.
     *
     * @return the Google class instance.
     */
    public Google clickTranslateLink() {
        translate.click();
        return this;
    }

    /**
     * Click on Your Data In Search Link.
     *
     * @return the Google class instance.
     */
    public Google clickYourDataInSearchLink() {
        yourDataInSearch.click();
        return this;
    }

    /**
     * Click on Youtube Link.
     *
     * @return the Google class instance.
     */
    public Google clickYoutubeLink() {
        youtube.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Google class instance.
     */
    public Google fill() {
        setGmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Google class instance.
     */
    public Google fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchadd A Shortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionseartheven More From Googlecomplete Your Privacy Checkupreview Your Settings To Make Sure That They Are Still Right For Youno Thankscomplete Remove Report Inappropriate Predictions Google Offered In India Privacytermssettingssearch Settingsadvanced Searchyour Data In Searchhistorysearch Helpsend Feedbackadvertisingbusinessabout How Search Works Changekalilur Rahmanrahman Text field.
     *
     * @return the Google class instance.
     */
    public Google setGmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteTextField() {
        return setGmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteTextField(data.get("GMAILIMAGESSEARCHYOUTUBEMAPSPLAYNEWSGMAILDRIVECALENDARFLIGHTSSHOPPINGIMAGESSEARCHADD_A_SHORTCUTMORETRANSLATEBOOKSBLOGGERPHOTOSDOCSACCOUNTCONTACTSHANGOUTSDUOKEEPJAMBOARDCLASSROOMCOLLECTIONSEARTHEVEN_MORE_FROM_GOOGLECOMPLETE"));
    }

    /**
     * Set value to Gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchadd A Shortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionseartheven More From Googlecomplete Your Privacy Checkupreview Your Settings To Make Sure That They Are Still Right For Youno Thankscomplete Remove Report Inappropriate Predictions Google Offered In India Privacytermssettingssearch Settingsadvanced Searchyour Data In Searchhistorysearch Helpsend Feedbackadvertisingbusinessabout How Search Works Changekalilur Rahmanrahman Text field.
     *
     * @return the Google class instance.
     */
    public Google setGmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteTextField(String gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteValue) {
        gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecomplete.sendKeys(gmailimagessearchyoutubemapsplaynewsgmaildrivecalendarflightsshoppingimagessearchaddAShortcutmoretranslatebooksbloggerphotosdocsaccountcontactshangoutsduokeepjamboardclassroomcollectionsearthevenMoreFromGooglecompleteValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Google class instance.
     */
    public Google submit() {
        clickImFeelingLuckyButton();
        Google target = new Google(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Google class instance.
     */
    public Google verifyPageLoaded() {
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
     * @return the Google class instance.
     */
    public Google verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
