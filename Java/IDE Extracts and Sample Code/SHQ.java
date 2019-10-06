import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SHQ {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[title='Overview of Selenium']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "#sitemap li:nth-of-type(4) a")
    @CacheLookup
    private WebElement aboutSelenium;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/fhUbq8aita0/']")
    @CacheLookup
    private WebElement announcingSelenium30beta1;

    @FindBy(css = "a[href='https://applitools.com/']")
    @CacheLookup
    private WebElement applitools;

    @FindBy(css = "a[title='Return to Selenium home page']")
    @CacheLookup
    private WebElement browserAutomation;

    @FindBy(css = "a[href='http://www.browserstack.com/automate/?utm_campaign=open-source-sponsor&utm_source=seleniumorg&utm_medium=referral']")
    @CacheLookup
    private WebElement browserstack;

    @FindBy(css = "a[href='https://github.com/SeleniumHQ/selenium/issues']")
    @CacheLookup
    private WebElement bugTracker;

    @FindBy(css = "a[href='https://crossbrowsertesting.com/selenium-testing?utm_source=seleniumhq&utm_campaign=sshp']")
    @CacheLookup
    private WebElement cbtlogo;

    @FindBy(css = "a[href='/support/index.html#CommercialSupport']")
    @CacheLookup
    private WebElement commercialSupport;

    @FindBy(css = "a[title='Technical references and guides']")
    @CacheLookup
    private WebElement documentation1;

    @FindBy(css = "#sitemap li:nth-of-type(2) a")
    @CacheLookup
    private WebElement documentation2;

    @FindBy(css = "a[title='Get Selenium']")
    @CacheLookup
    private WebElement download;

    @FindBy(css = "#sidebar div:nth-of-type(1) a")
    @CacheLookup
    private WebElement downloadSelenium;

    @FindBy(css = "a[href='https://github.com/SeleniumHQ/www.seleniumhq.org/edit/master/src/main/webapp/index.jsp']")
    @CacheLookup
    private WebElement editThisPage;

    @FindBy(css = "a[href='/about/events.html']")
    @CacheLookup
    private WebElement events;

    @FindBy(css = "a[href='http://experitest.com/']")
    @CacheLookup
    private WebElement experitest;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/aJXiSo1xL6I/']")
    @CacheLookup
    private WebElement fallSeleniumConfSaveTheDate;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/CaqNC87MayY/']")
    @CacheLookup
    private WebElement firefox55AndSeleniumIde;

    @FindBy(css = "a[href='http://twitter.com/SeleniumHQ']")
    @CacheLookup
    private WebElement followUs;

    @FindBy(css = "a[href='/sponsors']")
    @CacheLookup
    private WebElement fullListOfSponsors;

    @FindBy(css = "a[href='/about/getting-involved.html']")
    @CacheLookup
    private WebElement gettingInvolved;

    @FindBy(id = "submit")
    @CacheLookup
    private WebElement go;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/Y5kePHTokUo/']")
    @CacheLookup
    private WebElement hackingWithIntellij;

    @FindBy(css = "#promo b:nth-of-type(3) a")
    @CacheLookup
    private WebElement here1;

    @FindBy(css = "#promo b:nth-of-type(3) a")
    @CacheLookup
    private WebElement here2;

    @FindBy(css = "a[href='/support/index.html#IRC']")
    @CacheLookup
    private WebElement irc;

    @FindBy(css = "#mainContent p:nth-of-type(3) a:nth-of-type(1)")
    @CacheLookup
    private WebElement learnMoreAboutSponsorship;

    @FindBy(css = "a[href='/about/platforms.html#browsers']")
    @CacheLookup
    private WebElement manyBrowsers;

    @FindBy(css = "a[href='https://software.microfocus.com/en-us/software/leanft']")
    @CacheLookup
    private WebElement microfocus;

    @FindBy(css = "a[href='https://newrelic.com/synthetics?utm_campaign=brn+awr+seleniumorg+FY17Q1&utm_medium=REF&utm_source=seleniumhq.org&utm_content=synthetics-logo+&mpc=REF-seleniumhq.org-EN-generic--synthetics-logo']")
    @CacheLookup
    private WebElement newRelicSynthetics;

    @FindBy(css = "a[href='/about/news.jsp']")
    @CacheLookup
    private WebElement newsblogs;

    @FindBy(css = "#sitemap li:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement onlineVersion;

    @FindBy(css = "a[href='http://openqa.org/']")
    @CacheLookup
    private WebElement openqaOrgLogo;

    @FindBy(css = "a[href='/about/platforms.html#operating-systems']")
    @CacheLookup
    private WebElement operatingSystems;

    private final String pageLoadedText = "Selenium has the support of some of the largest browser vendors who have taken (or are taking) steps to make Selenium a native part of their browser";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='/about/platforms.html#programming-languages']")
    @CacheLookup
    private WebElement programmingLanguages;

    @FindBy(css = "a[title='Selenium Projects']")
    @CacheLookup
    private WebElement projects;

    @FindBy(css = "a.hs-rss-link")
    @CacheLookup
    private WebElement rssFeed;

    @FindBy(css = "a[href='http://saucelabs.com']")
    @CacheLookup
    private WebElement sauceLabs;

    @FindBy(id = "q")
    @CacheLookup
    private WebElement searchSelenium;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/D2uYQPA5u2A/']")
    @CacheLookup
    private WebElement selenium30OutNow;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/vUz3PD485w0/']")
    @CacheLookup
    private WebElement selenium3IsComing;

    @FindBy(css = "a[href='/download/#client-drivers']")
    @CacheLookup
    private WebElement seleniumApi;

    @FindBy(css = "a[href='http://seleniumhq.wordpress.com/']")
    @CacheLookup
    private WebElement seleniumBlog;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/ZoRIutBC1Jc/']")
    @CacheLookup
    private WebElement seleniumConf2016;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/ujLxMCRUe3k/']")
    @CacheLookup
    private WebElement seleniumConfIndia2016Update;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/5auHlS6yUJQ/']")
    @CacheLookup
    private WebElement seleniumConfIndiaSaveThe;

    @FindBy(css = "a[href='/projects/grid']")
    @CacheLookup
    private WebElement seleniumGrid;

    @FindBy(css = "#choice tbody tr td:nth-of-type(1) center a:nth-of-type(2)")
    @CacheLookup
    private WebElement seleniumGridLogo;

    @FindBy(css = "#choice tbody tr td:nth-of-type(2) p a")
    @CacheLookup
    private WebElement seleniumIde1;

    @FindBy(css = "#sitemap li:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement seleniumIde2;

    @FindBy(css = "a[href='http://feedproxy.google.com/~r/Selenium/~3/qZJ1oNPCLI8/']")
    @CacheLookup
    private WebElement seleniumIdeIsDeadLongLive;

    @FindBy(css = "#choice tbody tr td:nth-of-type(2) center a")
    @CacheLookup
    private WebElement seleniumIdeLogo;

    @FindBy(name = "submit")
    @CacheLookup
    private WebElement seleniumIsASuiteOfTools;

    @FindBy(css = "#choice tbody tr td:nth-of-type(1) center a:nth-of-type(1)")
    @CacheLookup
    private WebElement seleniumLogo;

    @FindBy(css = "#sitemap li:nth-of-type(1) a")
    @CacheLookup
    private WebElement seleniumProjects;

    @FindBy(css = "#choice tbody tr td:nth-of-type(1) p:nth-of-type(2) a")
    @CacheLookup
    private WebElement seleniumRemoteControl1;

    @FindBy(css = "#sitemap li:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement seleniumRemoteControl2;

    @FindBy(css = "#choice tbody tr td:nth-of-type(1) p:nth-of-type(1) a")
    @CacheLookup
    private WebElement seleniumWebdriver1;

    @FindBy(css = "#sitemap li:nth-of-type(1) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement seleniumWebdriver2;

    @FindBy(css = "a[href='https://www.ranorex.com/selocity/browser-extension.html']")
    @CacheLookup
    private WebElement selocitybannerseleniumhq;

    @FindBy(css = "#sidebar div:nth-of-type(2) p a")
    @CacheLookup
    private WebElement sponsorTheSeleniumProject;

    @FindBy(css = "a[href='http://www.subject-7.com/']")
    @CacheLookup
    private WebElement subject7logo;

    @FindBy(css = "a[title='Get help with Selenium']")
    @CacheLookup
    private WebElement support1;

    @FindBy(css = "#sitemap li:nth-of-type(3) a")
    @CacheLookup
    private WebElement support2;

    @FindBy(css = "a[href='https://www.testbirds.com/services/quality-assurance/testing-environment/?utm_source=seleniumhq&utm_campaign=int-cloud-logo-sponsoring-seleniumhq&utm_medium=logo-sponsoring']")
    @CacheLookup
    private WebElement testbirds;

    @FindBy(css = "a[href='/about/platforms.html#testing-frameworks']")
    @CacheLookup
    private WebElement testingFrameworks;

    @FindBy(css = "a[href='http://groups.google.com/group/selenium-users']")
    @CacheLookup
    private WebElement userGroup;

    @FindBy(css = "a[href='/about/contributors.html']")
    @CacheLookup
    private WebElement whoMadeSelenium;

    @FindBy(css = "a[href='https://github.com/SeleniumHQ/selenium/wiki']")
    @CacheLookup
    private WebElement wiki;

    @FindBy(id = "close")
    @CacheLookup
    private WebElement x1;

    @FindBy(id = "close")
    @CacheLookup
    private WebElement x2;

    public SHQ() {
    }

    public SHQ(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public SHQ(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public SHQ(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on About Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on About Selenium Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickAboutSeleniumLink() {
        aboutSelenium.click();
        return this;
    }

    /**
     * Click on Announcing Selenium 3.0beta1 Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickAnnouncingSelenium30beta1Link() {
        announcingSelenium30beta1.click();
        return this;
    }

    /**
     * Click on Applitools Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickApplitoolsLink() {
        applitools.click();
        return this;
    }

    /**
     * Click on Browser Automation Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickBrowserAutomationLink() {
        browserAutomation.click();
        return this;
    }

    /**
     * Click on Browserstack Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickBrowserstackLink() {
        browserstack.click();
        return this;
    }

    /**
     * Click on Bug Tracker Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickBugTrackerLink() {
        bugTracker.click();
        return this;
    }

    /**
     * Click on Cbtlogo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickCbtlogoLink() {
        cbtlogo.click();
        return this;
    }

    /**
     * Click on Commercial Support Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickCommercialSupportLink() {
        commercialSupport.click();
        return this;
    }

    /**
     * Click on Documentation Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickDocumentation1Link() {
        documentation1.click();
        return this;
    }

    /**
     * Click on Documentation Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickDocumentation2Link() {
        documentation2.click();
        return this;
    }

    /**
     * Click on Download Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickDownloadLink() {
        download.click();
        return this;
    }

    /**
     * Click on Download Selenium Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickDownloadSeleniumLink() {
        downloadSelenium.click();
        return this;
    }

    /**
     * Click on Edit This Page Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickEditThisPageLink() {
        editThisPage.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickEventsLink() {
        events.click();
        return this;
    }

    /**
     * Click on Experitest Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickExperitestLink() {
        experitest.click();
        return this;
    }

    /**
     * Click on Fall Selenium Conf Save The Date Call For Speakers Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickFallSeleniumConfSaveTheDateLink() {
        fallSeleniumConfSaveTheDate.click();
        return this;
    }

    /**
     * Click on Firefox 55 And Selenium Ide Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickFirefox55AndSeleniumIdeLink() {
        firefox55AndSeleniumIde.click();
        return this;
    }

    /**
     * Click on Follow Us Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickFollowUsLink() {
        followUs.click();
        return this;
    }

    /**
     * Click on Full List Of Sponsors Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickFullListOfSponsorsLink() {
        fullListOfSponsors.click();
        return this;
    }

    /**
     * Click on Getting Involved Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickGettingInvolvedLink() {
        gettingInvolved.click();
        return this;
    }

    /**
     * Click on Go Button.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickGoButton() {
        go.click();
        return this;
    }

    /**
     * Click on Hacking With Intellij Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickHackingWithIntellijLink() {
        hackingWithIntellij.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickHere1Link() {
        here1.click();
        return this;
    }

    /**
     * Click on Here Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickHere2Link() {
        here2.click();
        return this;
    }

    /**
     * Click on Irc Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickIrcLink() {
        irc.click();
        return this;
    }

    /**
     * Click on Learn More About Sponsorship Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickLearnMoreAboutSponsorshipLink() {
        learnMoreAboutSponsorship.click();
        return this;
    }

    /**
     * Click on Many Browsers Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickManyBrowsersLink() {
        manyBrowsers.click();
        return this;
    }

    /**
     * Click on Microfocus Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickMicrofocusLink() {
        microfocus.click();
        return this;
    }

    /**
     * Click on New Relic Synthetics Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickNewRelicSyntheticsLink() {
        newRelicSynthetics.click();
        return this;
    }

    /**
     * Click on Newsblogs Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickNewsblogsLink() {
        newsblogs.click();
        return this;
    }

    /**
     * Click on Online Version Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickOnlineVersionLink() {
        onlineVersion.click();
        return this;
    }

    /**
     * Click on Openqa.org Logo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickOpenqaOrgLogoLink() {
        openqaOrgLogo.click();
        return this;
    }

    /**
     * Click on Operating Systems Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickOperatingSystemsLink() {
        operatingSystems.click();
        return this;
    }

    /**
     * Click on Programming Languages Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickProgrammingLanguagesLink() {
        programmingLanguages.click();
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickProjectsLink() {
        projects.click();
        return this;
    }

    /**
     * Click on Rss Feed Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickRssFeedLink() {
        rssFeed.click();
        return this;
    }

    /**
     * Click on Sauce Labs Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSauceLabsLink() {
        sauceLabs.click();
        return this;
    }

    /**
     * Click on Selenium 3.0 Out Now Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSelenium30OutNowLink() {
        selenium30OutNow.click();
        return this;
    }

    /**
     * Click on Selenium 3 Is Coming Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSelenium3IsComingLink() {
        selenium3IsComing.click();
        return this;
    }

    /**
     * Click on Selenium Api Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumApiLink() {
        seleniumApi.click();
        return this;
    }

    /**
     * Click on Selenium Blog Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumBlogLink() {
        seleniumBlog.click();
        return this;
    }

    /**
     * Click on Selenium Conf 2016 Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumConf2016Link() {
        seleniumConf2016.click();
        return this;
    }

    /**
     * Click on Selenium Conf India 2016 Update Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumConfIndia2016UpdateLink() {
        seleniumConfIndia2016Update.click();
        return this;
    }

    /**
     * Click on Selenium Conf India Save The Date Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumConfIndiaSaveTheLink() {
        seleniumConfIndiaSaveThe.click();
        return this;
    }

    /**
     * Click on Selenium Grid Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumGridLink() {
        seleniumGrid.click();
        return this;
    }

    /**
     * Click on Selenium Grid Logo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumGridLogoLink() {
        seleniumGridLogo.click();
        return this;
    }

    /**
     * Click on Selenium Ide Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumIde1Link() {
        seleniumIde1.click();
        return this;
    }

    /**
     * Click on Selenium Ide Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumIde2Link() {
        seleniumIde2.click();
        return this;
    }

    /**
     * Click on Selenium Ide Is Dead Long Live Selenium Ide Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumIdeIsDeadLongLiveLink() {
        seleniumIdeIsDeadLongLive.click();
        return this;
    }

    /**
     * Click on Selenium Ide Logo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumIdeLogoLink() {
        seleniumIdeLogo.click();
        return this;
    }

    /**
     * Click on Selenium Is A Suite Of Tools To Automate Web Browsers Across Many Platforms Button.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumIsASuiteOfToolsButton() {
        seleniumIsASuiteOfTools.click();
        return this;
    }

    /**
     * Click on Selenium Logo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumLogoLink() {
        seleniumLogo.click();
        return this;
    }

    /**
     * Click on Selenium Projects Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumProjectsLink() {
        seleniumProjects.click();
        return this;
    }

    /**
     * Click on Selenium Remote Control Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumRemoteControl1Link() {
        seleniumRemoteControl1.click();
        return this;
    }

    /**
     * Click on Selenium Remote Control Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumRemoteControl2Link() {
        seleniumRemoteControl2.click();
        return this;
    }

    /**
     * Click on Selenium Webdriver Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumWebdriver1Link() {
        seleniumWebdriver1.click();
        return this;
    }

    /**
     * Click on Selenium Webdriver Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSeleniumWebdriver2Link() {
        seleniumWebdriver2.click();
        return this;
    }

    /**
     * Click on Selocitybannerseleniumhq Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSelocitybannerseleniumhqLink() {
        selocitybannerseleniumhq.click();
        return this;
    }

    /**
     * Click on Sponsor The Selenium Project Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSponsorTheSeleniumProjectLink() {
        sponsorTheSeleniumProject.click();
        return this;
    }

    /**
     * Click on Subject7logo Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSubject7logoLink() {
        subject7logo.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSupport1Link() {
        support1.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickSupport2Link() {
        support2.click();
        return this;
    }

    /**
     * Click on Testbirds Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickTestbirdsLink() {
        testbirds.click();
        return this;
    }

    /**
     * Click on Testing Frameworks Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickTestingFrameworksLink() {
        testingFrameworks.click();
        return this;
    }

    /**
     * Click on User Group Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickUserGroupLink() {
        userGroup.click();
        return this;
    }

    /**
     * Click on Who Made Selenium Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickWhoMadeSeleniumLink() {
        whoMadeSelenium.click();
        return this;
    }

    /**
     * Click on Wiki Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickWikiLink() {
        wiki.click();
        return this;
    }

    /**
     * Click on X Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickX1Link() {
        x1.click();
        return this;
    }

    /**
     * Click on X Link.
     *
     * @return the SHQ class instance.
     */
    public SHQ clickX2Link() {
        x2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the SHQ class instance.
     */
    public SHQ fill() {
        setSearchSeleniumTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the SHQ class instance.
     */
    public SHQ fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Search Selenium Text field.
     *
     * @return the SHQ class instance.
     */
    public SHQ setSearchSeleniumTextField() {
        return setSearchSeleniumTextField(data.get("SEARCH_SELENIUM"));
    }

    /**
     * Set value to Search Selenium Text field.
     *
     * @return the SHQ class instance.
     */
    public SHQ setSearchSeleniumTextField(String searchSeleniumValue) {
        searchSelenium.sendKeys(searchSeleniumValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the SHQ class instance.
     */
    public SHQ submit() {
        clickGoButton();
        SHQ target = new SHQ(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the SHQ class instance.
     */
    public SHQ verifyPageLoaded() {
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
     * @return the SHQ class instance.
     */
    public SHQ verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
