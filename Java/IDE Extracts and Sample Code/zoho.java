import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class zoho {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "a[href='tel:18001031123']")
    @CacheLookup
    private WebElement _10311231800;

    @FindBy(css = "a[href='tel:18001237711']")
    @CacheLookup
    private WebElement _12377111800;

    @FindBy(css = "a[href='tel:+914467447000']")
    @CacheLookup
    private WebElement _446744700091;

    @FindBy(css = "a[href='https://www.zoho.com/aboutus.html']")
    @CacheLookup
    private WebElement aboutUs;

    @FindBy(css = "a[href='/aboutus.html']")
    @CacheLookup
    private WebElement aboutZoho;

    @FindBy(css = "a[href='/abuse-policy/']")
    @CacheLookup
    private WebElement abusePolicy;

    @FindBy(css = "a[href='https://www.zoho.com/academy/']")
    @CacheLookup
    private WebElement academy;

    @FindBy(css = "a.zh-access")
    @CacheLookup
    private WebElement accessYourApps;

    @FindBy(css = "a.zgh-i-zohoone")
    @CacheLookup
    private WebElement allinoneSuiteoneanIntegratedSuiteThatEncompasses;

    @FindBy(css = "a[href='analytics/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement analytics;

    @FindBy(css = "a.zgh-i-analytics")
    @CacheLookup
    private WebElement analyticsvisuallyAnalyzeYourBusinessData;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement analyticsvisuallyAnalyzeYourDataSignUp1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(6) a")
    @CacheLookup
    private WebElement analyticsvisuallyAnalyzeYourDataSignUp2;

    @FindBy(css = "#block-system-main div:nth-of-type(5) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement analyticsvisuallyAnalyzeYourDataSignUp3;

    @FindBy(css = "a[href='/policy.html']")
    @CacheLookup
    private WebElement antispamPolicy;

    @FindBy(css = "a[href='/apple-watch.html']")
    @CacheLookup
    private WebElement appsForAppleWatch;

    @FindBy(id = "fhockey_v1-query")
    @CacheLookup
    private WebElement appsMobileAppsGSuiteIntegration1;

    @FindBy(css = "input.fsearch-icon")
    @CacheLookup
    private WebElement appsMobileAppsGSuiteIntegration2;

    @FindBy(css = "a[href='assist/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement assist;

    @FindBy(css = "a[href='/assist/?src=top-header&ireft=home-he']")
    @CacheLookup
    private WebElement assistsupportRemoteCustomersInstantly1;

    @FindBy(css = "a[href='/assist/?src=top-header&ireft=home-it']")
    @CacheLookup
    private WebElement assistsupportRemoteCustomersInstantly2;

    @FindBy(css = "a[href='backstage/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement backstage;

    @FindBy(css = "a.zgh-i-backstage")
    @CacheLookup
    private WebElement backstageendtoendEventManagementSoftware;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement bahasaIndonesia1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement bahasaIndonesia2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement bahasaIndonesia3;

    @FindBy(css = "a[href='https://www.zoho.com/blog']")
    @CacheLookup
    private WebElement blogs;

    @FindBy(css = "a[href='books/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement books;

    @FindBy(css = "a.zgh-i-books")
    @CacheLookup
    private WebElement bookssmartAccountingForGrowingBusinesses;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement bookssmartAccountingSignUpNow1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement bookssmartAccountingSignUpNow2;

    @FindBy(css = "#block-system-main div:nth-of-type(5) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement bookssmartAccountingSignUpNow3;

    @FindBy(css = "a[href='bugtracker/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement bugtracker;

    @FindBy(css = "a.zgh-i-bugtracker")
    @CacheLookup
    private WebElement bugtrackerfixBugsFastAndShipGreat;

    @FindBy(css = "a.zgh-i-buildandsell")
    @CacheLookup
    private WebElement buildAndSellbuildExtensionsCustomApps;

    @FindBy(css = "a[href='campaigns/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement campaigns;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement campaignseffectiveEmailMarketingSignUpNow1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement campaignseffectiveEmailMarketingSignUpNow2;

    @FindBy(css = "a.zgh-i-campaigns")
    @CacheLookup
    private WebElement campaignsreachAndEngageYourCustomers;

    @FindBy(css = "a[href='checkout/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement checkout;

    @FindBy(css = "a.zgh-i-checkout")
    @CacheLookup
    private WebElement checkoutsimpleOnetimeAndRecurringOnlinePayments;

    @FindBy(css = "a[href='cliq/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement cliq;

    @FindBy(css = "a.zgh-i-cliq")
    @CacheLookup
    private WebElement cliqchatThatsBuiltForWork;

    @FindBy(css = "a[href='commerce/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement commerce;

    @FindBy(css = "a.zgh-i-commerce")
    @CacheLookup
    private WebElement commerceeverythingEcommerce;

    @FindBy(css = "a[href='https://community.zoho.com/']")
    @CacheLookup
    private WebElement community;

    @FindBy(css = "a[href='connect/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement connect;

    @FindBy(css = "a[href='/connect/?src=top-header&ireft=home-pe']")
    @CacheLookup
    private WebElement connectyourSocialWorkplace1;

    @FindBy(css = "a[href='/connect/?src=top-header&ireft=home-co']")
    @CacheLookup
    private WebElement connectyourSocialWorkplace2;

    @FindBy(css = "a[href='/consulting-partners.html']")
    @CacheLookup
    private WebElement consultingPartners;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(2) a")
    @CacheLookup
    private WebElement contact;

    @FindBy(css = "a.zh-contact")
    @CacheLookup
    private WebElement contactSales;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(1) div.content-wrap div.footer-links-wrap div.product-links.five-column div:nth-of-type(4) ul li:nth-of-type(7) a")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a[href='contactmanager/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement contactmanager;

    @FindBy(css = "a.zgh-i-contactmanager")
    @CacheLookup
    private WebElement contactmanagerabsoluteContactManagement;

    @FindBy(css = "a[href='https://www.zoho.com/privacy/cookie-policy.html']")
    @CacheLookup
    private WebElement cookiePolicy;

    @FindBy(css = "a[href='creator/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement creator;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement creatorbuildAppsForYourNeedsSign1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement creatorbuildAppsForYourNeedsSign2;

    @FindBy(css = "#block-system-main div:nth-of-type(5) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement creatorbuildAppsForYourNeedsSign3;

    @FindBy(css = "a[href='/creator/?src=top-header&ireft=home-it']")
    @CacheLookup
    private WebElement creatorbuildCustomAppsForYourBusiness1;

    @FindBy(css = "a[href='/creator/?src=top-header&ireft=home-cu']")
    @CacheLookup
    private WebElement creatorbuildCustomAppsForYourBusiness2;

    @FindBy(css = "a[href='crm/?src=zoho-snm&ireft=ohome']")
    @CacheLookup
    private WebElement crm;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(1) h4 a")
    @CacheLookup
    private WebElement crmPlus;

    @FindBy(css = "a.zgh-i-crm")
    @CacheLookup
    private WebElement crmcloseMoreDealsInLessTime;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) div.promotion-app a")
    @CacheLookup
    private WebElement crmmultichannelCrmSoftwareengageProspectsAutomateYour1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) div.promotion-app a")
    @CacheLookup
    private WebElement crmmultichannelCrmSoftwareengageProspectsAutomateYour2;

    @FindBy(css = "#block-system-main div:nth-of-type(5) div.content-wrap.animated div:nth-of-type(1) div.promotion-app a")
    @CacheLookup
    private WebElement crmmultichannelCrmSoftwareengageProspectsAutomateYour3;

    @FindBy(css = "a.zgh-i-customapps")
    @CacheLookup
    private WebElement customAppseaseWorkWithAppsTailormade;

    @FindBy(css = "a.zgh-i-crmplus")
    @CacheLookup
    private WebElement customerExperienceBundlecrmPlusunifiedBundleThat;

    @FindBy(css = "a[href='https://www.zoho.com/customers.html']")
    @CacheLookup
    private WebElement customers1;

    @FindBy(css = "a.zh-customers")
    @CacheLookup
    private WebElement customers2;

    @FindBy(css = "a[href='desk/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement desk;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement deskcontextawareHelpDeskSignUpNow1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement deskcontextawareHelpDeskSignUpNow2;

    @FindBy(css = "a[href='/desk/?src=top-header&ireft=home-sa']")
    @CacheLookup
    private WebElement deskputCustomerServiceAtTheHeart1;

    @FindBy(css = "a[href='/desk/?src=top-header&ireft=home-he']")
    @CacheLookup
    private WebElement deskputCustomerServiceAtTheHeart2;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement deutsch1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement deutsch2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement deutsch3;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(3) h5 a")
    @CacheLookup
    private WebElement developer;

    @FindBy(css = "a[href='docs/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement docs;

    @FindBy(css = "a.zgh-i-docs")
    @CacheLookup
    private WebElement docsallYourDocumentsInOnePlace;

    @FindBy(id = "zgh-search-query")
    @CacheLookup
    private WebElement englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1;

    @FindBy(css = "input.zgh-search-btn")
    @CacheLookup
    private WebElement englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted2;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement espaolLatinoamrica1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement espaolLatinoamrica2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement espaolLatinoamrica3;

    @FindBy(css = "a[href='/events.html?src=zohofooter']")
    @CacheLookup
    private WebElement events;

    @FindBy(css = "a[href='expense/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement expense;

    @FindBy(css = "a[href='/expense/?src=top-header&ireft=home-fi']")
    @CacheLookup
    private WebElement expenseeffortlessExpenseReporting1;

    @FindBy(css = "a[href='/expense/?src=top-header&ireft=home-pe']")
    @CacheLookup
    private WebElement expenseeffortlessExpenseReporting2;

    @FindBy(css = "a.zgh-i-extensions")
    @CacheLookup
    private WebElement extensionsintegrateZohoProductsWithThirdParty;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(3) h4 a")
    @CacheLookup
    private WebElement financePlus;

    @FindBy(css = "a[href='flow/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement flow;

    @FindBy(css = "a[href='/flow/?src=top-header&ireft=home-it']")
    @CacheLookup
    private WebElement flowintegrateYourAppsToAutomateBusiness1;

    @FindBy(css = "a[href='/flow/?src=top-header&ireft=home-cu']")
    @CacheLookup
    private WebElement flowintegrateYourAppsToAutomateBusiness2;

    @FindBy(css = "a[href='forms/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement forms;

    @FindBy(css = "a[href='/forms/?src=top-header&ireft=home-sa']")
    @CacheLookup
    private WebElement formsformsForMobileTeams1;

    @FindBy(css = "a[href='/forms/?src=top-header&ireft=home-ma']")
    @CacheLookup
    private WebElement formsformsForMobileTeams2;

    @FindBy(css = "a[href='https://forums.zoho.com/']")
    @CacheLookup
    private WebElement forums;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement franais1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement franais2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement franais3;

    @FindBy(css = "a.zh-signup")
    @CacheLookup
    private WebElement freeSignUp;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(1) h5 a")
    @CacheLookup
    private WebElement gSuiteIntegration1;

    @FindBy(css = "a[href='/g-suite/']")
    @CacheLookup
    private WebElement gSuiteIntegration2;

    @FindBy(css = "a[href='/gdpr.html']")
    @CacheLookup
    private WebElement gdprCompliance;

    @FindBy(css = "a.zgh-signup")
    @CacheLookup
    private WebElement getStarted;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(1) div.content-wrap div.footer-links-wrap div.product-links.five-column div:nth-of-type(5) ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement gstHelpline;

    @FindBy(css = "a[href='mailto:gstindia@zohofinance.com']")
    @CacheLookup
    private WebElement gstindiazohofinanceCom;

    @FindBy(css = "a.zgh-i-itmanagement")
    @CacheLookup
    private WebElement helpDeskManagementitManagementalignItTo;

    @FindBy(css = "a[href='/hosting/']")
    @CacheLookup
    private WebElement hostingProviders;

    @FindBy(css = "a[href='identity-management/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement identityManagement;

    @FindBy(css = "a.zgh-i-identitymanagement")
    @CacheLookup
    private WebElement identityManagementanIdentityManagementAndGovernance;

    @FindBy(css = "a.zgh-i-industrysolutions")
    @CacheLookup
    private WebElement industrySolutionsendtoendBusinessSolutionsForYour;

    @FindBy(css = "a.zgh-i-workplace")
    @CacheLookup
    private WebElement integratedCollaborationPlatformworkplacecreateCollaborateAndCommunicate;

    @FindBy(css = "a[href='inventory/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement inventory;

    @FindBy(css = "a.zgh-i-inventory")
    @CacheLookup
    private WebElement inventoryonlineInventoryAndOrderManagement;

    @FindBy(css = "a[href='invoice/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement invoice;

    @FindBy(css = "a.zgh-i-invoice")
    @CacheLookup
    private WebElement invoicehasslefreeInvoicing;

    @FindBy(css = "a[href='/ipr-complaints.html']")
    @CacheLookup
    private WebElement iprComplaints;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(4) h4 a")
    @CacheLookup
    private WebElement itManagement;

    @FindBy(css = "a.learn-more")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(1) a.lm")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(1) a.lm")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(2) a.lm")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(2) a.lm")
    @CacheLookup
    private WebElement learnMore3;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(3) a.lm")
    @CacheLookup
    private WebElement learnMore3;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(3) a.lm")
    @CacheLookup
    private WebElement learnMore4;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(4) a.lm")
    @CacheLookup
    private WebElement learnMore5;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(5) a.lm")
    @CacheLookup
    private WebElement learnMore6;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(4) a.lm")
    @CacheLookup
    private WebElement learnMore7;

    @FindBy(css = "a[href='log360-cloud/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement logManagementCloud;

    @FindBy(css = "a.zgh-i-logmanagementcloud")
    @CacheLookup
    private WebElement logManagementCloudstoreAndManageAll;

    @FindBy(css = "a.zgh-login")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "a.zh-login")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "a[href='mail/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement mail;

    @FindBy(css = "a.zgh-i-mail")
    @CacheLookup
    private WebElement mailbusinessEmailCleanAndAdfree;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement mailcleanAndAdfreeSignUpNow1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement mailcleanAndAdfreeSignUpNow2;

    @FindBy(css = "#block-system-main div:nth-of-type(5) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement mailcleanAndAdfreeSignUpNow3;

    @FindBy(css = "a[href='marketinghub/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement marketinghub;

    @FindBy(css = "a.zgh-i-marketinghub")
    @CacheLookup
    private WebElement marketinghubtheIntegratedMarketingAutomationSystem;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(4) h5 a")
    @CacheLookup
    private WebElement marketplace;

    @FindBy(css = "a[href='meeting/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement meeting;

    @FindBy(css = "a[href='/meeting/?src=top-header&ireft=home-ma']")
    @CacheLookup
    private WebElement meetingwebConferencingMadeSimpleAndEasy1;

    @FindBy(css = "a[href='/meeting/?src=top-header&ireft=home-co']")
    @CacheLookup
    private WebElement meetingwebConferencingMadeSimpleAndEasy2;

    @FindBy(css = "a[href='/office365/']")
    @CacheLookup
    private WebElement microsoftOffice365Integration;

    @FindBy(css = "a[href='/mobile-apps.html']")
    @CacheLookup
    private WebElement mobileApps;

    @FindBy(css = "a[href='mdm-cloud.html?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement mobileDeviceManagement;

    @FindBy(css = "a.zgh-i-mobiledevicemanagement")
    @CacheLookup
    private WebElement mobileDeviceManagementeasytouseAffordableWebbased;

    @FindBy(css = "a.more-detail-link")
    @CacheLookup
    private WebElement moreCustomers;

    @FindBy(css = "a[href='motivator/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement motivator;

    @FindBy(css = "a.zgh-i-motivator")
    @CacheLookup
    private WebElement motivatorturbochargeYourSalesWithSalesActivity;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement nederlands1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement nederlands2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement nederlands3;

    @FindBy(css = "a[href='analytics/?src=zoho-home']")
    @CacheLookup
    private WebElement newAnalytics;

    @FindBy(css = "a[href='bookings/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement newBookings;

    @FindBy(css = "a.zgh-i-bookings")
    @CacheLookup
    private WebElement newbookingsschedulingSoftwareForSmallBusinesses;

    @FindBy(css = "a[href='notebook/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement notebook;

    @FindBy(css = "a.zgh-i-notebook")
    @CacheLookup
    private WebElement notebookaBeautifulHomeForAllYour;

    @FindBy(css = "a[href='https://zoho.to/INDbannerhome']")
    @CacheLookup
    private WebElement nov19202019;

    @FindBy(css = "a[href='https://events.zoho.com/Zoholics-Canada2019?src=ireft=ohome']")
    @CacheLookup
    private WebElement november672019;

    @FindBy(css = "a[href='https://events.zoho.com/developers2019?src=ireft=ohome']")
    @CacheLookup
    private WebElement oct02032019;

    @FindBy(css = "a[href='https://events.zoho.com/Zoholics-Colombia2019/?src=zoho-home']")
    @CacheLookup
    private WebElement october12019ColombiajoinUs;

    @FindBy(css = "a[href='https://events.zoho.com/Zoholics-Brazil2019/?src=zoho-home']")
    @CacheLookup
    private WebElement october42019BraziljoinUs;

    @FindBy(css = "a[href='https://events.zoho.com/Zoholics-Chile2019/?src=ireft=ohome']")
    @CacheLookup
    private WebElement october72019ChilejoinUs;

    @FindBy(css = "a[href='officeplatform/integrator/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement officeIntegrator;

    @FindBy(css = "a[href='/officeplatform/integrator/?src=top-header&ireft=home-cu']")
    @CacheLookup
    private WebElement officeIntegratorgiveYourAppsBuiltinDocument1;

    @FindBy(css = "a[href='/officeplatform/integrator/?src=top-header&ireft=home-em']")
    @CacheLookup
    private WebElement officeIntegratorgiveYourAppsBuiltinDocument2;

    @FindBy(css = "a.zgh-i-officesuite")
    @CacheLookup
    private WebElement officeSuitepowerfulOfficeEditorsForModern;

    @FindBy(css = "#block-system-main div:nth-of-type(6) div.content-wrap div:nth-of-type(1) a")
    @CacheLookup
    private WebElement one;

    @FindBy(id = "hockey_v1-query")
    @CacheLookup
    private WebElement orchestly1;

    @FindBy(css = "input.search-icon")
    @CacheLookup
    private WebElement orchestly2;

    @FindBy(css = "a[href='https://www.orchestly.com?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement orchestly3;

    @FindBy(name = "query")
    @CacheLookup
    private WebElement orchestly4;

    @FindBy(css = "#block-system-main div:nth-of-type(20) form input:nth-of-type(2)")
    @CacheLookup
    private WebElement orchestly5;

    @FindBy(css = "a.zgh-i-orchestly")
    @CacheLookup
    private WebElement orchestlybusinessWorkflowManagementPlatform;

    private final String pageLoadedText = "Unique and powerful suite of software to run your entire business, brought to you by a company with the long term vision to transform the way you work";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='pagesense/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement pagesense;

    @FindBy(css = "a.zgh-i-pagesense")
    @CacheLookup
    private WebElement pagesenseconversionRateOptimizationSoftware;

    @FindBy(css = "#block-system-main div:nth-of-type(19) div.content-wrap div:nth-of-type(2) h5 a")
    @CacheLookup
    private WebElement partnerWithZoho;

    @FindBy(css = "a[href='/partnerportal.html']")
    @CacheLookup
    private WebElement partners;

    @FindBy(css = "a[href='patchmanagerplus/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement patchManagerPlus;

    @FindBy(css = "a.zgh-i-patchmanagerplus")
    @CacheLookup
    private WebElement patchManagerPlusstayClearOfVulnerabilities;

    @FindBy(css = "a[href='payroll/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement payroll;

    @FindBy(css = "a[href='/payroll/?src=top-header&ireft=home-fi']")
    @CacheLookup
    private WebElement payrollpayrollExperienceRedefinedToBeStressfree1;

    @FindBy(css = "a[href='/payroll/?src=top-header&ireft=home-pe']")
    @CacheLookup
    private WebElement payrollpayrollExperienceRedefinedToBeStressfree2;

    @FindBy(css = "a[href='people/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement people;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(5) h4 a")
    @CacheLookup
    private WebElement peoplePlus;

    @FindBy(css = "a.zgh-i-people")
    @CacheLookup
    private WebElement peopleorganizeAutomateAndSimplifyYourHr;

    @FindBy(css = "a[href='https://www.zoho.com/perspectives/']")
    @CacheLookup
    private WebElement perspectives;

    @FindBy(css = "a[href='/platform-partners.html']")
    @CacheLookup
    private WebElement platformPartners;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(3) div:nth-of-type(2) div.zgh-localBox ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement portugusBrasil1;

    @FindBy(css = ".html.not-front.not-logged-in.no-sidebars.page-node-33927.node-type-zoho-home.og-context-node-17848.i18n-en.node-tnid-33927.domain-com.lang-en.ccode-in div:nth-of-type(2) div:nth-of-type(2) div.zh-user-account div.zgh-localization.init div.zgh-localBox ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement portugusBrasil2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) div:nth-of-type(2) div.zlang-container-inner ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement portugusBrasil3;

    @FindBy(css = "a[href='/press.html']")
    @CacheLookup
    private WebElement press;

    @FindBy(css = "a[href='/privacy.html']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement products;

    @FindBy(css = "a[href='projects/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement projects;

    @FindBy(css = "#block-system-main div:nth-of-type(3) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement projectsplanAndTrackProjectsSignUp1;

    @FindBy(css = "#block-system-main div:nth-of-type(4) div.content-wrap.animated div:nth-of-type(1) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement projectsplanAndTrackProjectsSignUp2;

    @FindBy(css = "a.zgh-i-projects")
    @CacheLookup
    private WebElement projectsturnEveryProjectIntoASuccess;

    @FindBy(css = "a.popup-controller")
    @CacheLookup
    private WebElement rablabIntegratedTheirBusinessOperationsAnd;

    @FindBy(css = "a[href='recruit/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement recruit;

    @FindBy(css = "a.zgh-i-recruit")
    @CacheLookup
    private WebElement recruitapplicantTrackingSystem;

    @FindBy(css = "a[href='/referral-partners-new.html']")
    @CacheLookup
    private WebElement referralPartners;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(1) div.content-wrap div.footer-links-wrap div.product-links.five-column div:nth-of-type(5) ul:nth-of-type(2) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement sales;

    @FindBy(css = "a[href='salesinbox/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement salesinbox;

    @FindBy(css = "a.zgh-i-salesinbox")
    @CacheLookup
    private WebElement salesinboxemailForSalespeople;

    @FindBy(css = "a[href='salesiq/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement salesiq;

    @FindBy(css = "a.zgh-i-salesiq")
    @CacheLookup
    private WebElement salesiqconvertWebsiteVisitorsIntoCustomers;

    @FindBy(css = "a[href='mailto:sales@zohocorp.com']")
    @CacheLookup
    private WebElement saleszohocorpCom;

    @FindBy(css = "a[href='/security.html']")
    @CacheLookup
    private WebElement security;

    @FindBy(css = "a[href='https://zoho.to/ANZbannerhomepage']")
    @CacheLookup
    private WebElement september17242019;

    @FindBy(css = "a[href='https://events.zoho.com/ZoholicsSouthAfrica-2019?src=ireft=ohome']")
    @CacheLookup
    private WebElement september52019JohannesburgmeetZohos;

    @FindBy(css = "a[href='online-service-desk-software.html?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement servicedeskPlus;

    @FindBy(css = "a.zgh-i-servicedeskplus")
    @CacheLookup
    private WebElement servicedeskPlusofferBestinclassItSupportOn;

    @FindBy(css = "a[href='sheet/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement sheet;

    @FindBy(css = "a.zgh-i-sheet")
    @CacheLookup
    private WebElement sheettheSpreadsheetApplicationForCollaborativeWork;

    @FindBy(css = "a[href='show/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement show;

    @FindBy(css = "a.zgh-i-show")
    @CacheLookup
    private WebElement showcreateCollaborateAndBroadcastPresentations;

    @FindBy(css = "a[href='showtime/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement showtime;

    @FindBy(css = "a[href='/showtime/?src=top-header&ireft=home-pe']")
    @CacheLookup
    private WebElement showtimeonboardNewHiresAndHostImpactful;

    @FindBy(css = "a[href='/showtime/?src=top-header&ireft=home-co']")
    @CacheLookup
    private WebElement showtimeonlineTrainingToolToEngageYour;

    @FindBy(css = "a[href='sign/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement sign;

    @FindBy(css = "a.zgh-i-sign")
    @CacheLookup
    private WebElement signsignAndSendDocuments;

    @FindBy(css = "a[href='https://www.site24x7.com/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement site24x7;

    @FindBy(css = "a.zgh-i-site24x7")
    @CacheLookup
    private WebElement site24x7websiteMonitoringFromAGlobalPerspective;

    @FindBy(css = "a[href='sites/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement sites;

    @FindBy(css = "a.zgh-i-sites")
    @CacheLookup
    private WebElement sitesdesignMobileFriendlyWebsites;

    @FindBy(css = "a[href='social/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement social;

    @FindBy(css = "a.zgh-i-social")
    @CacheLookup
    private WebElement socialtheAllinoneSocialMediaManagementSoftware;

    @FindBy(css = "a[href='sprints/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement sprints;

    @FindBy(css = "a.zgh-i-sprints")
    @CacheLookup
    private WebElement sprintsplanningAndTrackingToolForAgile;

    @FindBy(css = "a[href='subscriptions/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement subscriptions;

    @FindBy(css = "a.zgh-i-subscriptions")
    @CacheLookup
    private WebElement subscriptionssmarterBillingForYourSubscriptionBusiness;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(2) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement support1;

    @FindBy(css = "a.zh-support")
    @CacheLookup
    private WebElement support2;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(1) div.content-wrap div.footer-links-wrap div.product-links.five-column div:nth-of-type(3) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement support3;

    @FindBy(css = "a[href='survey/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement survey;

    @FindBy(css = "a.zgh-i-survey")
    @CacheLookup
    private WebElement surveyonlineSurveysForEveryOccasion;

    @FindBy(css = "a[href='/technology-partners.html']")
    @CacheLookup
    private WebElement technologyPartners;

    @FindBy(css = "a[href='/terms.html']")
    @CacheLookup
    private WebElement termsOfService;

    @FindBy(css = "a.zgh-i-financeplus")
    @CacheLookup
    private WebElement unifiedFinancePlatformfinancePluseverythingYouNeed;

    @FindBy(css = "a.zgh-i-peopleplus")
    @CacheLookup
    private WebElement unifiedHrPlatformpeoplePlusintegratedHrPlatform;

    @FindBy(css = "a[href='vault/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement vault;

    @FindBy(css = "a.zgh-i-vault")
    @CacheLookup
    private WebElement vaultonlinePasswordManagerForTeams;

    @FindBy(css = "a[href='wiki/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement wiki;

    @FindBy(css = "a.zgh-i-wiki")
    @CacheLookup
    private WebElement wikiknowledgeManagementForTeams;

    @FindBy(css = "a[href='workdrive/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement workdrive;

    @FindBy(css = "a.zgh-i-workdrive")
    @CacheLookup
    private WebElement workdriveonlineFileManagementForTeams;

    @FindBy(css = "a[href='workerly/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement workerly;

    @FindBy(css = "a.zgh-i-workerly")
    @CacheLookup
    private WebElement workerlytemporaryStaffingSolution;

    @FindBy(css = "#block-system-main div:nth-of-type(7) div.content-wrap div:nth-of-type(2) h4 a")
    @CacheLookup
    private WebElement workplace;

    @FindBy(css = "a[href='writer/?src=zoho-home&ireft=ohome']")
    @CacheLookup
    private WebElement writer;

    @FindBy(css = "a.zgh-i-writer")
    @CacheLookup
    private WebElement writeraCleanCrispSpaceToWrite;

    @FindBy(css = "a[href='/zia/']")
    @CacheLookup
    private WebElement zia;

    @FindBy(css = "#block-block-3 div.header div.zgh-headerWrap div:nth-of-type(1) a")
    @CacheLookup
    private WebElement zoho;

    @FindBy(css = "a[href='https://www.zoho.com/']")
    @CacheLookup
    private WebElement zohoCom;

    @FindBy(css = "a[href='https://www.zohomeetups.com/Zoho-Manila-CRM-Meetup-September-2019']")
    @CacheLookup
    private WebElement zohoCrmManilaUserGroupMeetup;

    @FindBy(css = "a[href='https://www.zoho.eu/']")
    @CacheLookup
    private WebElement zohoEu;

    @FindBy(css = "#block-zoho-navigation-links-product-pages-footer-links div:nth-of-type(2) ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement zohoHome;

    @FindBy(css = "input.footer-search-input")
    @CacheLookup
    private WebElement zohoHomecontactsecurityIprComplaintsAntispamPolicyterms;

    @FindBy(css = "a[href='https://www.zoho.in/']")
    @CacheLookup
    private WebElement zohoIn;

    @FindBy(css = "a[href='/inthenews.html']")
    @CacheLookup
    private WebElement zohoInTheNews;

    @FindBy(css = "a[href='https://us.zohomerchandise.com']")
    @CacheLookup
    private WebElement zohoMerchandise;

    @FindBy(css = "a[href='/opinions.html']")
    @CacheLookup
    private WebElement zohoOpinions;

    @FindBy(css = "a.zoho-university-link")
    @CacheLookup
    private WebElement zohoUniversity;

    public zoho() {
    }

    public zoho(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public zoho(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public zoho(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 1800 103 1123 Link.
     *
     * @return the zoho class instance.
     */
    public zoho click1031123Link1800() {
        _10311231800.click();
        return this;
    }

    /**
     * Click on 1800 123 7711 Link.
     *
     * @return the zoho class instance.
     */
    public zoho click1237711Link1800() {
        _12377111800.click();
        return this;
    }

    /**
     * Click on 91 44 67447000 Link.
     *
     * @return the zoho class instance.
     */
    public zoho click4467447000Link91() {
        _446744700091.click();
        return this;
    }

    /**
     * Click on About Us Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAboutUsLink() {
        aboutUs.click();
        return this;
    }

    /**
     * Click on About Zoho Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAboutZohoLink() {
        aboutZoho.click();
        return this;
    }

    /**
     * Click on Abuse Policy Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAbusePolicyLink() {
        abusePolicy.click();
        return this;
    }

    /**
     * Click on Academy Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAcademyLink() {
        academy.click();
        return this;
    }

    /**
     * Click on Access Your Apps Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAccessYourAppsLink() {
        accessYourApps.click();
        return this;
    }

    /**
     * Click on Allinone Suiteonean Integrated Suite That Encompasses All The Apps In Zoho. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAllinoneSuiteoneanIntegratedSuiteThatEncompassesLink() {
        allinoneSuiteoneanIntegratedSuiteThatEncompasses.click();
        return this;
    }

    /**
     * Click on Analytics Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAnalyticsLink() {
        analytics.click();
        return this;
    }

    /**
     * Click on Analyticsvisually Analyze Your Business Data. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAnalyticsvisuallyAnalyzeYourBusinessDataLink() {
        analyticsvisuallyAnalyzeYourBusinessData.click();
        return this;
    }

    /**
     * Click on Analyticsvisually Analyze Your Data.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAnalyticsvisuallyAnalyzeYourDataSignUp1Link() {
        analyticsvisuallyAnalyzeYourDataSignUp1.click();
        return this;
    }

    /**
     * Click on Analyticsvisually Analyze Your Data.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAnalyticsvisuallyAnalyzeYourDataSignUp2Link() {
        analyticsvisuallyAnalyzeYourDataSignUp2.click();
        return this;
    }

    /**
     * Click on Analyticsvisually Analyze Your Data.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAnalyticsvisuallyAnalyzeYourDataSignUp3Link() {
        analyticsvisuallyAnalyzeYourDataSignUp3.click();
        return this;
    }

    /**
     * Click on Antispam Policy Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAntispamPolicyLink() {
        antispamPolicy.click();
        return this;
    }

    /**
     * Click on Apps For Apple Watch Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAppsForAppleWatchLink() {
        appsForAppleWatch.click();
        return this;
    }

    /**
     * Set default value to Apps Mobile Apps G Suite Integration Microsoft Office 365 Integration Apps For Apple Watch Partners Hosting Providers Partners Consulting Partners Platform Partners Technology Partners Resources Zia Support Community Forums Blogs Academy About About Zoho Perspectives Events Press Zoho In The Newszoho Opinions Contact Uszoho University Contact India Gst Helpline 1800 123 7711 Gstindiazohofinance Text field.
     *
     * @return the zoho class instance.
     */
    public zoho clickAppsMobileAppsGSuiteIntegration1Button() {
        return clickAppsMobileAppsGSuiteIntegration1Button(data.get("APPS_MOBILE_APPS_G_SUITE_INTEGRATION"));
    }

    /**
     * Click on Apps Mobile Apps G Suite Integration Microsoft Office 365 Integration Apps For Apple Watch Partners Hosting Providers Partners Consulting Partners Platform Partners Technology Partners Resources Zia Support Community Forums Blogs Academy About About Zoho Perspectives Events Press Zoho In The Newszoho Opinions Contact Uszoho University Contact India Gst Helpline 1800 123 7711 Gstindiazohofinance Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickAppsMobileAppsGSuiteIntegration1Button(String appsMobileAppsGSuiteIntegrationValue) {
        appsMobileAppsGSuiteIntegration1.sendKeys(appsMobileAppsGSuiteIntegrationValue);
        return this;
    }

    /**
     * Click on Apps Mobile Apps G Suite Integration Microsoft Office 365 Integration Apps For Apple Watch Partners Hosting Providers Partners Consulting Partners Platform Partners Technology Partners Resources Zia Support Community Forums Blogs Academy About About Zoho Perspectives Events Press Zoho In The Newszoho Opinions Contact Uszoho University Contact India Gst Helpline 1800 123 7711 Gstindiazohofinance Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickAppsMobileAppsGSuiteIntegration2Button() {
        appsMobileAppsGSuiteIntegration2.click();
        return this;
    }

    /**
     * Click on Assist Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAssistLink() {
        assist.click();
        return this;
    }

    /**
     * Click on Assistsupport Remote Customers Instantly. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAssistsupportRemoteCustomersInstantly1Link() {
        assistsupportRemoteCustomersInstantly1.click();
        return this;
    }

    /**
     * Click on Assistsupport Remote Customers Instantly. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickAssistsupportRemoteCustomersInstantly2Link() {
        assistsupportRemoteCustomersInstantly2.click();
        return this;
    }

    /**
     * Click on Backstage Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBackstageLink() {
        backstage.click();
        return this;
    }

    /**
     * Click on Backstageendtoend Event Management Software. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBackstageendtoendEventManagementSoftwareLink() {
        backstageendtoendEventManagementSoftware.click();
        return this;
    }

    /**
     * Click on Bahasa Indonesia Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBahasaIndonesia1Link() {
        bahasaIndonesia1.click();
        return this;
    }

    /**
     * Click on Bahasa Indonesia Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBahasaIndonesia2Link() {
        bahasaIndonesia2.click();
        return this;
    }

    /**
     * Click on Bahasa Indonesia Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBahasaIndonesia3Link() {
        bahasaIndonesia3.click();
        return this;
    }

    /**
     * Click on Blogs Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBlogsLink() {
        blogs.click();
        return this;
    }

    /**
     * Click on Books Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBooksLink() {
        books.click();
        return this;
    }

    /**
     * Click on Bookssmart Accounting For Growing Businesses. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBookssmartAccountingForGrowingBusinessesLink() {
        bookssmartAccountingForGrowingBusinesses.click();
        return this;
    }

    /**
     * Click on Bookssmart Accounting.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBookssmartAccountingSignUpNow1Link() {
        bookssmartAccountingSignUpNow1.click();
        return this;
    }

    /**
     * Click on Bookssmart Accounting.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBookssmartAccountingSignUpNow2Link() {
        bookssmartAccountingSignUpNow2.click();
        return this;
    }

    /**
     * Click on Bookssmart Accounting.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBookssmartAccountingSignUpNow3Link() {
        bookssmartAccountingSignUpNow3.click();
        return this;
    }

    /**
     * Click on Bugtracker Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBugtrackerLink() {
        bugtracker.click();
        return this;
    }

    /**
     * Click on Bugtrackerfix Bugs Fast And Ship Great Software. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBugtrackerfixBugsFastAndShipGreatLink() {
        bugtrackerfixBugsFastAndShipGreat.click();
        return this;
    }

    /**
     * Click on Build And Sellbuild Extensions Custom Apps And Industry Solutions Using Our Platforms And Public Apis. Zoho Marketplace Helps Showcase Your Extensions To All Our Users Worldwide. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickBuildAndSellbuildExtensionsCustomAppsLink() {
        buildAndSellbuildExtensionsCustomApps.click();
        return this;
    }

    /**
     * Click on Campaigns Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCampaignsLink() {
        campaigns.click();
        return this;
    }

    /**
     * Click on Campaignseffective Email Marketing.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCampaignseffectiveEmailMarketingSignUpNow1Link() {
        campaignseffectiveEmailMarketingSignUpNow1.click();
        return this;
    }

    /**
     * Click on Campaignseffective Email Marketing.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCampaignseffectiveEmailMarketingSignUpNow2Link() {
        campaignseffectiveEmailMarketingSignUpNow2.click();
        return this;
    }

    /**
     * Click on Campaignsreach And Engage Your Customers. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCampaignsreachAndEngageYourCustomersLink() {
        campaignsreachAndEngageYourCustomers.click();
        return this;
    }

    /**
     * Click on Checkout Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCheckoutLink() {
        checkout.click();
        return this;
    }

    /**
     * Click on Checkoutsimple Onetime And Recurring Online Payments Solution. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCheckoutsimpleOnetimeAndRecurringOnlinePaymentsLink() {
        checkoutsimpleOnetimeAndRecurringOnlinePayments.click();
        return this;
    }

    /**
     * Click on Cliq Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCliqLink() {
        cliq.click();
        return this;
    }

    /**
     * Click on Cliqchat Thats Built For Work. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCliqchatThatsBuiltForWorkLink() {
        cliqchatThatsBuiltForWork.click();
        return this;
    }

    /**
     * Click on Commerce Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCommerceLink() {
        commerce.click();
        return this;
    }

    /**
     * Click on Commerceeverything Ecommerce. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCommerceeverythingEcommerceLink() {
        commerceeverythingEcommerce.click();
        return this;
    }

    /**
     * Click on Community Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCommunityLink() {
        community.click();
        return this;
    }

    /**
     * Click on Connect Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickConnectLink() {
        connect.click();
        return this;
    }

    /**
     * Click on Connectyour Social Workplace. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickConnectyourSocialWorkplace1Link() {
        connectyourSocialWorkplace1.click();
        return this;
    }

    /**
     * Click on Connectyour Social Workplace. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickConnectyourSocialWorkplace2Link() {
        connectyourSocialWorkplace2.click();
        return this;
    }

    /**
     * Click on Consulting Partners Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickConsultingPartnersLink() {
        consultingPartners.click();
        return this;
    }

    /**
     * Click on Contact Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickContactLink() {
        contact.click();
        return this;
    }

    /**
     * Click on Contact Sales Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickContactSalesLink() {
        contactSales.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Contactmanager Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickContactmanagerLink() {
        contactmanager.click();
        return this;
    }

    /**
     * Click on Contactmanagerabsolute Contact Management. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickContactmanagerabsoluteContactManagementLink() {
        contactmanagerabsoluteContactManagement.click();
        return this;
    }

    /**
     * Click on Cookie Policy Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCookiePolicyLink() {
        cookiePolicy.click();
        return this;
    }

    /**
     * Click on Creator Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorLink() {
        creator.click();
        return this;
    }

    /**
     * Click on Creatorbuild Apps For Your Needs.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorbuildAppsForYourNeedsSign1Link() {
        creatorbuildAppsForYourNeedsSign1.click();
        return this;
    }

    /**
     * Click on Creatorbuild Apps For Your Needs.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorbuildAppsForYourNeedsSign2Link() {
        creatorbuildAppsForYourNeedsSign2.click();
        return this;
    }

    /**
     * Click on Creatorbuild Apps For Your Needs.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorbuildAppsForYourNeedsSign3Link() {
        creatorbuildAppsForYourNeedsSign3.click();
        return this;
    }

    /**
     * Click on Creatorbuild Custom Apps For Your Business Needs. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorbuildCustomAppsForYourBusiness1Link() {
        creatorbuildCustomAppsForYourBusiness1.click();
        return this;
    }

    /**
     * Click on Creatorbuild Custom Apps For Your Business Needs. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCreatorbuildCustomAppsForYourBusiness2Link() {
        creatorbuildCustomAppsForYourBusiness2.click();
        return this;
    }

    /**
     * Click on Crm Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmLink() {
        crm.click();
        return this;
    }

    /**
     * Click on Crm Plus Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmPlusLink() {
        crmPlus.click();
        return this;
    }

    /**
     * Click on Crmclose More Deals In Less Time. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmcloseMoreDealsInLessTimeLink() {
        crmcloseMoreDealsInLessTime.click();
        return this;
    }

    /**
     * Click on Crmmultichannel Crm Softwareengage Prospects Automate Your Sales Process And Close More Deals.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmmultichannelCrmSoftwareengageProspectsAutomateYour1Link() {
        crmmultichannelCrmSoftwareengageProspectsAutomateYour1.click();
        return this;
    }

    /**
     * Click on Crmmultichannel Crm Softwareengage Prospects Automate Your Sales Process And Close More Deals.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmmultichannelCrmSoftwareengageProspectsAutomateYour2Link() {
        crmmultichannelCrmSoftwareengageProspectsAutomateYour2.click();
        return this;
    }

    /**
     * Click on Crmmultichannel Crm Softwareengage Prospects Automate Your Sales Process And Close More Deals.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCrmmultichannelCrmSoftwareengageProspectsAutomateYour3Link() {
        crmmultichannelCrmSoftwareengageProspectsAutomateYour3.click();
        return this;
    }

    /**
     * Click on Custom Appsease Work With Apps Tailormade For Your Business. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCustomAppseaseWorkWithAppsTailormadeLink() {
        customAppseaseWorkWithAppsTailormade.click();
        return this;
    }

    /**
     * Click on Customer Experience Bundlecrm Plusunified Bundle That Helps Deliver Exceptional Customer Experience. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCustomerExperienceBundlecrmPlusunifiedBundleThatLink() {
        customerExperienceBundlecrmPlusunifiedBundleThat.click();
        return this;
    }

    /**
     * Click on Customers Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCustomers1Link() {
        customers1.click();
        return this;
    }

    /**
     * Click on Customers Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickCustomers2Link() {
        customers2.click();
        return this;
    }

    /**
     * Click on Desk Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeskLink() {
        desk.click();
        return this;
    }

    /**
     * Click on Deskcontextaware Help Desk.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeskcontextawareHelpDeskSignUpNow1Link() {
        deskcontextawareHelpDeskSignUpNow1.click();
        return this;
    }

    /**
     * Click on Deskcontextaware Help Desk.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeskcontextawareHelpDeskSignUpNow2Link() {
        deskcontextawareHelpDeskSignUpNow2.click();
        return this;
    }

    /**
     * Click on Deskput Customer Service At The Heart Of Your Company. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeskputCustomerServiceAtTheHeart1Link() {
        deskputCustomerServiceAtTheHeart1.click();
        return this;
    }

    /**
     * Click on Deskput Customer Service At The Heart Of Your Company. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeskputCustomerServiceAtTheHeart2Link() {
        deskputCustomerServiceAtTheHeart2.click();
        return this;
    }

    /**
     * Click on Deutsch Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeutsch1Link() {
        deutsch1.click();
        return this;
    }

    /**
     * Click on Deutsch Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeutsch2Link() {
        deutsch2.click();
        return this;
    }

    /**
     * Click on Deutsch Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeutsch3Link() {
        deutsch3.click();
        return this;
    }

    /**
     * Click on Developer Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDeveloperLink() {
        developer.click();
        return this;
    }

    /**
     * Click on Docs Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDocsLink() {
        docs.click();
        return this;
    }

    /**
     * Click on Docsall Your Documents In One Place. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickDocsallYourDocumentsInOnePlaceLink() {
        docsallYourDocumentsInOnePlace.click();
        return this;
    }

    /**
     * Set default value to Englishespaol Latinoamricaportugus Brasildeutschfranaisnederlandsbahasa Indonesialoginget Started Text field.
     *
     * @return the zoho class instance.
     */
    public zoho clickEnglishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1Button() {
        return clickEnglishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1Button(data.get("ENGLISHESPAOL_LATINOAMRICAPORTUGUS_BRASILDEUTSCHFRANAISNEDERLANDSBAHASA_INDONESIALOGINGET_STARTED"));
    }

    /**
     * Click on Englishespaol Latinoamricaportugus Brasildeutschfranaisnederlandsbahasa Indonesialoginget Started Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickEnglishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1Button(String englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStartedValue) {
        englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1.sendKeys(englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStartedValue);
        return this;
    }

    /**
     * Click on Englishespaol Latinoamricaportugus Brasildeutschfranaisnederlandsbahasa Indonesialoginget Started Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickEnglishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted2Button() {
        englishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted2.click();
        return this;
    }

    /**
     * Click on Espaol Latinoamrica Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickEspaolLatinoamrica1Link() {
        espaolLatinoamrica1.click();
        return this;
    }

    /**
     * Click on Espaol Latinoamrica Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickEspaolLatinoamrica2Link() {
        espaolLatinoamrica2.click();
        return this;
    }

    /**
     * Click on Espaol Latinoamrica Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickEspaolLatinoamrica3Link() {
        espaolLatinoamrica3.click();
        return this;
    }

    /**
     * Click on Events Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickEventsLink() {
        events.click();
        return this;
    }

    /**
     * Click on Expense Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickExpenseLink() {
        expense.click();
        return this;
    }

    /**
     * Click on Expenseeffortless Expense Reporting. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickExpenseeffortlessExpenseReporting1Link() {
        expenseeffortlessExpenseReporting1.click();
        return this;
    }

    /**
     * Click on Expenseeffortless Expense Reporting. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickExpenseeffortlessExpenseReporting2Link() {
        expenseeffortlessExpenseReporting2.click();
        return this;
    }

    /**
     * Click on Extensionsintegrate Zoho Products With Third Party Applications. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickExtensionsintegrateZohoProductsWithThirdPartyLink() {
        extensionsintegrateZohoProductsWithThirdParty.click();
        return this;
    }

    /**
     * Click on Finance Plus Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFinancePlusLink() {
        financePlus.click();
        return this;
    }

    /**
     * Click on Flow Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFlowLink() {
        flow.click();
        return this;
    }

    /**
     * Click on Flowintegrate Your Apps To Automate Business Workflows. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFlowintegrateYourAppsToAutomateBusiness1Link() {
        flowintegrateYourAppsToAutomateBusiness1.click();
        return this;
    }

    /**
     * Click on Flowintegrate Your Apps To Automate Business Workflows. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFlowintegrateYourAppsToAutomateBusiness2Link() {
        flowintegrateYourAppsToAutomateBusiness2.click();
        return this;
    }

    /**
     * Click on Forms Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFormsLink() {
        forms.click();
        return this;
    }

    /**
     * Click on Formsforms For Mobile Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFormsformsForMobileTeams1Link() {
        formsformsForMobileTeams1.click();
        return this;
    }

    /**
     * Click on Formsforms For Mobile Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFormsformsForMobileTeams2Link() {
        formsformsForMobileTeams2.click();
        return this;
    }

    /**
     * Click on Forums Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickForumsLink() {
        forums.click();
        return this;
    }

    /**
     * Click on Franais Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFranais1Link() {
        franais1.click();
        return this;
    }

    /**
     * Click on Franais Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFranais2Link() {
        franais2.click();
        return this;
    }

    /**
     * Click on Franais Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFranais3Link() {
        franais3.click();
        return this;
    }

    /**
     * Click on Free Sign Up Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickFreeSignUpLink() {
        freeSignUp.click();
        return this;
    }

    /**
     * Click on G Suite Integration Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGSuiteIntegration1Link() {
        gSuiteIntegration1.click();
        return this;
    }

    /**
     * Click on G Suite Integration Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGSuiteIntegration2Link() {
        gSuiteIntegration2.click();
        return this;
    }

    /**
     * Click on Gdpr Compliance Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGdprComplianceLink() {
        gdprCompliance.click();
        return this;
    }

    /**
     * Click on Get Started Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGetStartedLink() {
        getStarted.click();
        return this;
    }

    /**
     * Click on Gst Helpline Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGstHelplineLink() {
        gstHelpline.click();
        return this;
    }

    /**
     * Click on Gstindiazohofinance.com Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickGstindiazohofinanceComLink() {
        gstindiazohofinanceCom.click();
        return this;
    }

    /**
     * Click on Help Desk Managementit Managementalign It To Your Business With Our Support And Monitoring Solutions. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickHelpDeskManagementitManagementalignItToLink() {
        helpDeskManagementitManagementalignItTo.click();
        return this;
    }

    /**
     * Click on Hosting Providers Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickHostingProvidersLink() {
        hostingProviders.click();
        return this;
    }

    /**
     * Click on Identity Management Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickIdentityManagementLink() {
        identityManagement.click();
        return this;
    }

    /**
     * Click on Identity Managementan Identity Management And Governance Solution. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickIdentityManagementanIdentityManagementAndGovernanceLink() {
        identityManagementanIdentityManagementAndGovernance.click();
        return this;
    }

    /**
     * Click on Industry Solutionsendtoend Business Solutions For Your Vertical. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickIndustrySolutionsendtoendBusinessSolutionsForYourLink() {
        industrySolutionsendtoendBusinessSolutionsForYour.click();
        return this;
    }

    /**
     * Click on Integrated Collaboration Platformworkplacecreate Collaborate And Communicate With Your Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickIntegratedCollaborationPlatformworkplacecreateCollaborateAndCommunicateLink() {
        integratedCollaborationPlatformworkplacecreateCollaborateAndCommunicate.click();
        return this;
    }

    /**
     * Click on Inventory Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickInventoryLink() {
        inventory.click();
        return this;
    }

    /**
     * Click on Inventoryonline Inventory And Order Management. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickInventoryonlineInventoryAndOrderManagementLink() {
        inventoryonlineInventoryAndOrderManagement.click();
        return this;
    }

    /**
     * Click on Invoice Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickInvoiceLink() {
        invoice.click();
        return this;
    }

    /**
     * Click on Invoicehasslefree Invoicing. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickInvoicehasslefreeInvoicingLink() {
        invoicehasslefreeInvoicing.click();
        return this;
    }

    /**
     * Click on Ipr Complaints Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickIprComplaintsLink() {
        iprComplaints.click();
        return this;
    }

    /**
     * Click on It Management Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickItManagementLink() {
        itManagement.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore3Link() {
        learnMore3.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore3Link() {
        learnMore3.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore4Link() {
        learnMore4.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore5Link() {
        learnMore5.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore6Link() {
        learnMore6.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLearnMore7Link() {
        learnMore7.click();
        return this;
    }

    /**
     * Click on Log Management Cloud Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLogManagementCloudLink() {
        logManagementCloud.click();
        return this;
    }

    /**
     * Click on Log Management Cloudstore And Manage All Your Log Data On A Secure Cloud Platform. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLogManagementCloudstoreAndManageAllLink() {
        logManagementCloudstoreAndManageAll.click();
        return this;
    }

    /**
     * Click on Login Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLoginLink() {
        login.click();
        return this;
    }

    /**
     * Click on Login Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickLoginLink() {
        login.click();
        return this;
    }

    /**
     * Click on Mail Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMailLink() {
        mail.click();
        return this;
    }

    /**
     * Click on Mailbusiness Email. Clean And Adfree. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMailbusinessEmailCleanAndAdfreeLink() {
        mailbusinessEmailCleanAndAdfree.click();
        return this;
    }

    /**
     * Click on Mailclean And Adfree.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMailcleanAndAdfreeSignUpNow1Link() {
        mailcleanAndAdfreeSignUpNow1.click();
        return this;
    }

    /**
     * Click on Mailclean And Adfree.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMailcleanAndAdfreeSignUpNow2Link() {
        mailcleanAndAdfreeSignUpNow2.click();
        return this;
    }

    /**
     * Click on Mailclean And Adfree.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMailcleanAndAdfreeSignUpNow3Link() {
        mailcleanAndAdfreeSignUpNow3.click();
        return this;
    }

    /**
     * Click on Marketinghub Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMarketinghubLink() {
        marketinghub.click();
        return this;
    }

    /**
     * Click on Marketinghubthe Integrated Marketing Automation System. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMarketinghubtheIntegratedMarketingAutomationSystemLink() {
        marketinghubtheIntegratedMarketingAutomationSystem.click();
        return this;
    }

    /**
     * Click on Marketplace Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMarketplaceLink() {
        marketplace.click();
        return this;
    }

    /**
     * Click on Meeting Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMeetingLink() {
        meeting.click();
        return this;
    }

    /**
     * Click on Meetingweb Conferencing Made Simple And Easy. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMeetingwebConferencingMadeSimpleAndEasy1Link() {
        meetingwebConferencingMadeSimpleAndEasy1.click();
        return this;
    }

    /**
     * Click on Meetingweb Conferencing Made Simple And Easy. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMeetingwebConferencingMadeSimpleAndEasy2Link() {
        meetingwebConferencingMadeSimpleAndEasy2.click();
        return this;
    }

    /**
     * Click on Microsoft Office 365 Integration Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMicrosoftOffice365IntegrationLink() {
        microsoftOffice365Integration.click();
        return this;
    }

    /**
     * Click on Mobile Apps Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMobileAppsLink() {
        mobileApps.click();
        return this;
    }

    /**
     * Click on Mobile Device Management Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMobileDeviceManagementLink() {
        mobileDeviceManagement.click();
        return this;
    }

    /**
     * Click on Mobile Device Managementeasytouse Affordable Webbased Mdm Solution. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMobileDeviceManagementeasytouseAffordableWebbasedLink() {
        mobileDeviceManagementeasytouseAffordableWebbased.click();
        return this;
    }

    /**
     * Click on More Customers Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMoreCustomersLink() {
        moreCustomers.click();
        return this;
    }

    /**
     * Click on Motivator Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMotivatorLink() {
        motivator.click();
        return this;
    }

    /**
     * Click on Motivatorturbocharge Your Sales With Sales Activity Management. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickMotivatorturbochargeYourSalesWithSalesActivityLink() {
        motivatorturbochargeYourSalesWithSalesActivity.click();
        return this;
    }

    /**
     * Click on Nederlands Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNederlands1Link() {
        nederlands1.click();
        return this;
    }

    /**
     * Click on Nederlands Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNederlands2Link() {
        nederlands2.click();
        return this;
    }

    /**
     * Click on Nederlands Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNederlands3Link() {
        nederlands3.click();
        return this;
    }

    /**
     * Click on New Analytics Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNewAnalyticsLink() {
        newAnalytics.click();
        return this;
    }

    /**
     * Click on New Bookings Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNewBookingsLink() {
        newBookings.click();
        return this;
    }

    /**
     * Click on Newbookingsscheduling Software For Small Businesses Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNewbookingsschedulingSoftwareForSmallBusinessesLink() {
        newbookingsschedulingSoftwareForSmallBusinesses.click();
        return this;
    }

    /**
     * Click on Notebook Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNotebookLink() {
        notebook.click();
        return this;
    }

    /**
     * Click on Notebooka Beautiful Home For All Your Notes. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNotebookaBeautifulHomeForAllYourLink() {
        notebookaBeautifulHomeForAllYour.click();
        return this;
    }

    /**
     * Click on Nov 19 20 2019 Mumbaimeet Zohos Product Experts Passionate Customers And Business Leaders At Indialearn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNov19202019Link() {
        nov19202019.click();
        return this;
    }

    /**
     * Click on November 6 7 2019 Torontomeet Zohos Product Experts Passionate Customers And Business Leaders At Canada.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickNovember672019Link() {
        november672019.click();
        return this;
    }

    /**
     * Click on Oct 02 03 2019 Pleasantoncliq Bots Extensions Serverless Code And A Lot More Learn How You Can Build And Distribute Business Apps For Zoho.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOct02032019Link() {
        oct02032019.click();
        return this;
    }

    /**
     * Click on October 1 2019 Colombiajoin Us For Zoholics Colombia 2019 On October 1 2019 And Meet Our Experts To Learn How Zoho Apps Can Positively Impact Your Business.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOctober12019ColombiajoinUsLink() {
        october12019ColombiajoinUs.click();
        return this;
    }

    /**
     * Click on October 4 2019 Braziljoin Us For Zoholics Brazil 2019 On October 4 2019 And Meet Our Experts To Learn How Zoho Apps Can Positively Impact Your Business.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOctober42019BraziljoinUsLink() {
        october42019BraziljoinUs.click();
        return this;
    }

    /**
     * Click on October 7 2019 Chilejoin Us For Zoholics Chile 2019 On October 7 2019 And Meet Our Experts To Learn How Zoho Apps Can Positively Impact Your Business.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOctober72019ChilejoinUsLink() {
        october72019ChilejoinUs.click();
        return this;
    }

    /**
     * Click on Office Integrator Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOfficeIntegratorLink() {
        officeIntegrator.click();
        return this;
    }

    /**
     * Click on Office Integratorgive Your Apps Builtin Document Editors. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOfficeIntegratorgiveYourAppsBuiltinDocument1Link() {
        officeIntegratorgiveYourAppsBuiltinDocument1.click();
        return this;
    }

    /**
     * Click on Office Integratorgive Your Apps Builtin Document Editors. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOfficeIntegratorgiveYourAppsBuiltinDocument2Link() {
        officeIntegratorgiveYourAppsBuiltinDocument2.click();
        return this;
    }

    /**
     * Click on Office Suitepowerful Office Editors For Modern Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOfficeSuitepowerfulOfficeEditorsForModernLink() {
        officeSuitepowerfulOfficeEditorsForModern.click();
        return this;
    }

    /**
     * Click on One Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOneLink() {
        one.click();
        return this;
    }

    /**
     * Set default value to Orchestly Text field.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestly1Button() {
        return clickOrchestly1Button(data.get("ORCHESTLY"));
    }

    /**
     * Click on Orchestly Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestly1Button(String orchestlyValue) {
        orchestly1.sendKeys(orchestlyValue);
        return this;
    }

    /**
     * Click on Orchestly Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestly2Button() {
        orchestly2.click();
        return this;
    }

    /**
     * Click on Orchestly Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestly3Link() {
        orchestly3.click();
        return this;
    }

    /**
     * Click on Orchestly Button.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestly5Button() {
        orchestly5.click();
        return this;
    }

    /**
     * Click on Orchestlybusiness Workflow Management Platform. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickOrchestlybusinessWorkflowManagementPlatformLink() {
        orchestlybusinessWorkflowManagementPlatform.click();
        return this;
    }

    /**
     * Click on Pagesense Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPagesenseLink() {
        pagesense.click();
        return this;
    }

    /**
     * Click on Pagesenseconversion Rate Optimization Software. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPagesenseconversionRateOptimizationSoftwareLink() {
        pagesenseconversionRateOptimizationSoftware.click();
        return this;
    }

    /**
     * Click on Partner With Zoho Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPartnerWithZohoLink() {
        partnerWithZoho.click();
        return this;
    }

    /**
     * Click on Partners Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPartnersLink() {
        partners.click();
        return this;
    }

    /**
     * Click on Patch Manager Plus Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPatchManagerPlusLink() {
        patchManagerPlus.click();
        return this;
    }

    /**
     * Click on Patch Manager Plusstay Clear Of Vulnerabilities And Cyber Attacks. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPatchManagerPlusstayClearOfVulnerabilitiesLink() {
        patchManagerPlusstayClearOfVulnerabilities.click();
        return this;
    }

    /**
     * Click on Payroll Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPayrollLink() {
        payroll.click();
        return this;
    }

    /**
     * Click on Payrollpayroll Experience Redefined To Be Stressfree. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPayrollpayrollExperienceRedefinedToBeStressfree1Link() {
        payrollpayrollExperienceRedefinedToBeStressfree1.click();
        return this;
    }

    /**
     * Click on Payrollpayroll Experience Redefined To Be Stressfree. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPayrollpayrollExperienceRedefinedToBeStressfree2Link() {
        payrollpayrollExperienceRedefinedToBeStressfree2.click();
        return this;
    }

    /**
     * Click on People Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPeopleLink() {
        people.click();
        return this;
    }

    /**
     * Click on People Plus Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPeoplePlusLink() {
        peoplePlus.click();
        return this;
    }

    /**
     * Click on Peopleorganize Automate And Simplify Your Hr Processes. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPeopleorganizeAutomateAndSimplifyYourHrLink() {
        peopleorganizeAutomateAndSimplifyYourHr.click();
        return this;
    }

    /**
     * Click on Perspectives Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPerspectivesLink() {
        perspectives.click();
        return this;
    }

    /**
     * Click on Platform Partners Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPlatformPartnersLink() {
        platformPartners.click();
        return this;
    }

    /**
     * Click on Portugus Brasil Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPortugusBrasil1Link() {
        portugusBrasil1.click();
        return this;
    }

    /**
     * Click on Portugus Brasil Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPortugusBrasil2Link() {
        portugusBrasil2.click();
        return this;
    }

    /**
     * Click on Portugus Brasil Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPortugusBrasil3Link() {
        portugusBrasil3.click();
        return this;
    }

    /**
     * Click on Press Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPressLink() {
        press.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Products Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickProductsLink() {
        products.click();
        return this;
    }

    /**
     * Click on Projects Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickProjectsLink() {
        projects.click();
        return this;
    }

    /**
     * Click on Projectsplan And Track Projects.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickProjectsplanAndTrackProjectsSignUp1Link() {
        projectsplanAndTrackProjectsSignUp1.click();
        return this;
    }

    /**
     * Click on Projectsplan And Track Projects.sign Up Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickProjectsplanAndTrackProjectsSignUp2Link() {
        projectsplanAndTrackProjectsSignUp2.click();
        return this;
    }

    /**
     * Click on Projectsturn Every Project Into A Success Story. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickProjectsturnEveryProjectIntoASuccessLink() {
        projectsturnEveryProjectIntoASuccess.click();
        return this;
    }

    /**
     * Click on Rablab Integrated Their Business Operations And Increased Productivity With Zoho. Nicolas Rabouille Cofounder Project Managementplay Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickRablabIntegratedTheirBusinessOperationsAndLink() {
        rablabIntegratedTheirBusinessOperationsAnd.click();
        return this;
    }

    /**
     * Click on Recruit Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickRecruitLink() {
        recruit.click();
        return this;
    }

    /**
     * Click on Recruitapplicant Tracking System. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickRecruitapplicantTrackingSystemLink() {
        recruitapplicantTrackingSystem.click();
        return this;
    }

    /**
     * Click on Referral Partners Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickReferralPartnersLink() {
        referralPartners.click();
        return this;
    }

    /**
     * Click on Sales Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSalesLink() {
        sales.click();
        return this;
    }

    /**
     * Click on Salesinbox Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSalesinboxLink() {
        salesinbox.click();
        return this;
    }

    /**
     * Click on Salesinboxemail For Salespeople. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSalesinboxemailForSalespeopleLink() {
        salesinboxemailForSalespeople.click();
        return this;
    }

    /**
     * Click on Salesiq Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSalesiqLink() {
        salesiq.click();
        return this;
    }

    /**
     * Click on Salesiqconvert Website Visitors Into Customers. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSalesiqconvertWebsiteVisitorsIntoCustomersLink() {
        salesiqconvertWebsiteVisitorsIntoCustomers.click();
        return this;
    }

    /**
     * Click on Saleszohocorp.com Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSaleszohocorpComLink() {
        saleszohocorpCom.click();
        return this;
    }

    /**
     * Click on Security Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSecurityLink() {
        security.click();
        return this;
    }

    /**
     * Click on September 17 24 2019 Anzmeet Zohos Product Experts Passionate Customers And Business Leaders At Australia New Zealand.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSeptember17242019Link() {
        september17242019.click();
        return this;
    }

    /**
     * Click on September 5 2019 Johannesburgmeet Zohos Product Experts Passionate Customers And Business Leaders At South Africa.learn More Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSeptember52019JohannesburgmeetZohosLink() {
        september52019JohannesburgmeetZohos.click();
        return this;
    }

    /**
     * Click on Servicedesk Plus Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickServicedeskPlusLink() {
        servicedeskPlus.click();
        return this;
    }

    /**
     * Click on Servicedesk Plusoffer Bestinclass It Support On The Cloud. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickServicedeskPlusofferBestinclassItSupportOnLink() {
        servicedeskPlusofferBestinclassItSupportOn.click();
        return this;
    }

    /**
     * Click on Sheet Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSheetLink() {
        sheet.click();
        return this;
    }

    /**
     * Click on Sheetthe Spreadsheet Application For Collaborative Work. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSheettheSpreadsheetApplicationForCollaborativeWorkLink() {
        sheettheSpreadsheetApplicationForCollaborativeWork.click();
        return this;
    }

    /**
     * Click on Show Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickShowLink() {
        show.click();
        return this;
    }

    /**
     * Click on Showcreate Collaborate And Broadcast Presentations. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickShowcreateCollaborateAndBroadcastPresentationsLink() {
        showcreateCollaborateAndBroadcastPresentations.click();
        return this;
    }

    /**
     * Click on Showtime Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickShowtimeLink() {
        showtime.click();
        return this;
    }

    /**
     * Click on Showtimeonboard New Hires And Host Impactful Employee Training. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickShowtimeonboardNewHiresAndHostImpactfulLink() {
        showtimeonboardNewHiresAndHostImpactful.click();
        return this;
    }

    /**
     * Click on Showtimeonline Training Tool To Engage Your Learners. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickShowtimeonlineTrainingToolToEngageYourLink() {
        showtimeonlineTrainingToolToEngageYour.click();
        return this;
    }

    /**
     * Click on Sign Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSignLink() {
        sign.click();
        return this;
    }

    /**
     * Click on Signsign And Send Documents. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSignsignAndSendDocumentsLink() {
        signsignAndSendDocuments.click();
        return this;
    }

    /**
     * Click on Site24x7 Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSite24x7Link() {
        site24x7.click();
        return this;
    }

    /**
     * Click on Site24x7website Monitoring From A Global Perspective. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSite24x7websiteMonitoringFromAGlobalPerspectiveLink() {
        site24x7websiteMonitoringFromAGlobalPerspective.click();
        return this;
    }

    /**
     * Click on Sites Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSitesLink() {
        sites.click();
        return this;
    }

    /**
     * Click on Sitesdesign Mobile Friendly Websites. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSitesdesignMobileFriendlyWebsitesLink() {
        sitesdesignMobileFriendlyWebsites.click();
        return this;
    }

    /**
     * Click on Social Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSocialLink() {
        social.click();
        return this;
    }

    /**
     * Click on Socialthe Allinone Social Media Management Software. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSocialtheAllinoneSocialMediaManagementSoftwareLink() {
        socialtheAllinoneSocialMediaManagementSoftware.click();
        return this;
    }

    /**
     * Click on Sprints Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSprintsLink() {
        sprints.click();
        return this;
    }

    /**
     * Click on Sprintsplanning And Tracking Tool For Agile Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSprintsplanningAndTrackingToolForAgileLink() {
        sprintsplanningAndTrackingToolForAgile.click();
        return this;
    }

    /**
     * Click on Subscriptions Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSubscriptionsLink() {
        subscriptions.click();
        return this;
    }

    /**
     * Click on Subscriptionssmarter Billing For Your Subscription Business. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSubscriptionssmarterBillingForYourSubscriptionBusinessLink() {
        subscriptionssmarterBillingForYourSubscriptionBusiness.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSupport1Link() {
        support1.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSupport2Link() {
        support2.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSupport3Link() {
        support3.click();
        return this;
    }

    /**
     * Click on Survey Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSurveyLink() {
        survey.click();
        return this;
    }

    /**
     * Click on Surveyonline Surveys For Every Occasion. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickSurveyonlineSurveysForEveryOccasionLink() {
        surveyonlineSurveysForEveryOccasion.click();
        return this;
    }

    /**
     * Click on Technology Partners Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickTechnologyPartnersLink() {
        technologyPartners.click();
        return this;
    }

    /**
     * Click on Terms Of Service Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickTermsOfServiceLink() {
        termsOfService.click();
        return this;
    }

    /**
     * Click on Unified Finance Platformfinance Pluseverything You Need To Manage Your Operations And Finance. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickUnifiedFinancePlatformfinancePluseverythingYouNeedLink() {
        unifiedFinancePlatformfinancePluseverythingYouNeed.click();
        return this;
    }

    /**
     * Click on Unified Hr Platformpeople Plusintegrated Hr Platform For Seamless Employee Experience. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickUnifiedHrPlatformpeoplePlusintegratedHrPlatformLink() {
        unifiedHrPlatformpeoplePlusintegratedHrPlatform.click();
        return this;
    }

    /**
     * Click on Vault Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickVaultLink() {
        vault.click();
        return this;
    }

    /**
     * Click on Vaultonline Password Manager For Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickVaultonlinePasswordManagerForTeamsLink() {
        vaultonlinePasswordManagerForTeams.click();
        return this;
    }

    /**
     * Click on Wiki Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWikiLink() {
        wiki.click();
        return this;
    }

    /**
     * Click on Wikiknowledge Management For Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWikiknowledgeManagementForTeamsLink() {
        wikiknowledgeManagementForTeams.click();
        return this;
    }

    /**
     * Click on Workdrive Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWorkdriveLink() {
        workdrive.click();
        return this;
    }

    /**
     * Click on Workdriveonline File Management For Teams. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWorkdriveonlineFileManagementForTeamsLink() {
        workdriveonlineFileManagementForTeams.click();
        return this;
    }

    /**
     * Click on Workerly Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWorkerlyLink() {
        workerly.click();
        return this;
    }

    /**
     * Click on Workerlytemporary Staffing Solution Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWorkerlytemporaryStaffingSolutionLink() {
        workerlytemporaryStaffingSolution.click();
        return this;
    }

    /**
     * Click on Workplace Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWorkplaceLink() {
        workplace.click();
        return this;
    }

    /**
     * Click on Writer Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWriterLink() {
        writer.click();
        return this;
    }

    /**
     * Click on Writera Clean Crisp Space To Write And Discuss. Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickWriteraCleanCrispSpaceToWriteLink() {
        writeraCleanCrispSpaceToWrite.click();
        return this;
    }

    /**
     * Click on Zia Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZiaLink() {
        zia.click();
        return this;
    }

    /**
     * Click on Zoho.com Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoComLink() {
        zohoCom.click();
        return this;
    }

    /**
     * Click on Zoho Crm Manila User Group Meetup For Advanced Users At Philippines.september 13 2019 0930am 0100 Pm Register Now Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoCrmManilaUserGroupMeetupLink() {
        zohoCrmManilaUserGroupMeetup.click();
        return this;
    }

    /**
     * Click on Zoho.eu Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoEuLink() {
        zohoEu.click();
        return this;
    }

    /**
     * Click on Zoho Home Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoHomeLink() {
        zohoHome.click();
        return this;
    }

    /**
     * Click on Zoho.in Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoInLink() {
        zohoIn.click();
        return this;
    }

    /**
     * Click on Zoho In The News Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoInTheNewsLink() {
        zohoInTheNews.click();
        return this;
    }

    /**
     * Click on Zoho Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoLink() {
        zoho.click();
        return this;
    }

    /**
     * Click on Zoho Merchandise Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoMerchandiseLink() {
        zohoMerchandise.click();
        return this;
    }

    /**
     * Click on Zoho Opinions Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoOpinionsLink() {
        zohoOpinions.click();
        return this;
    }

    /**
     * Click on Zoho University Link.
     *
     * @return the zoho class instance.
     */
    public zoho clickZohoUniversityLink() {
        zohoUniversity.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the zoho class instance.
     */
    public zoho fill() {
        clickEnglishespaolLatinoamricaportugusBrasildeutschfranaisnederlandsbahasaIndonesialogingetStarted1Button();
        clickOrchestly1Button();
        setOrchestly4TextField();
        clickAppsMobileAppsGSuiteIntegration1Button();
        setZohoHomecontactsecurityIprComplaintsAntispamPolicytermsTextField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the zoho class instance.
     */
    public zoho fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Orchestly Text field.
     *
     * @return the zoho class instance.
     */
    public zoho setOrchestly4TextField() {
        return setOrchestly4TextField(data.get("ORCHESTLY_4"));
    }

    /**
     * Set value to Orchestly Text field.
     *
     * @return the zoho class instance.
     */
    public zoho setOrchestly4TextField(String orchestly4Value) {
        orchestly4.sendKeys(orchestly4Value);
        return this;
    }

    /**
     * Set default value to Zoho Homecontactsecurity Ipr Complaints Antispam Policyterms Of Serviceprivacy Policycookie Policygdpr Complianceabuse Policy 2019 Zoho Corporation Pvt Text field.
     *
     * @return the zoho class instance.
     */
    public zoho setZohoHomecontactsecurityIprComplaintsAntispamPolicytermsTextField() {
        return setZohoHomecontactsecurityIprComplaintsAntispamPolicytermsTextField(data.get("ZOHO_HOMECONTACTSECURITY_IPR_COMPLAINTS_ANTISPAM_POLICYTERMS"));
    }

    /**
     * Set value to Zoho Homecontactsecurity Ipr Complaints Antispam Policyterms Of Serviceprivacy Policycookie Policygdpr Complianceabuse Policy 2019 Zoho Corporation Pvt Text field.
     *
     * @return the zoho class instance.
     */
    public zoho setZohoHomecontactsecurityIprComplaintsAntispamPolicytermsTextField(String zohoHomecontactsecurityIprComplaintsAntispamPolicytermsValue) {
        zohoHomecontactsecurityIprComplaintsAntispamPolicyterms.sendKeys(zohoHomecontactsecurityIprComplaintsAntispamPolicytermsValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the zoho class instance.
     */
    public zoho submit() {
        clickAppsMobileAppsGSuiteIntegrationMicrosoftOffice365IntegrationAppsForAppleWatchPartnersHostingProvidersPartnersConsultingPartnersPlatformPartnersTechnologyPartnersResourcesZiaSupportCommunityForumsBlogsAcademyAboutAboutZohoPerspectivesEventsPressZohoInTheNewszohoOpinionsContactUszohoUniversityContactIndiaGstHelpline18001237711GstindiazohofinanceButton();
        zoho target = new zoho(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the zoho class instance.
     */
    public zoho verifyPageLoaded() {
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
     * @return the zoho class instance.
     */
    public zoho verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
