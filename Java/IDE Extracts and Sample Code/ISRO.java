import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ISRO {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(css = "#block-block-52 div.content div.text-right div a:nth-of-type(1)")
    @CacheLookup
    private WebElement a1;

    @FindBy(css = "#block-block-52 div.content div.text-right div a:nth-of-type(2)")
    @CacheLookup
    private WebElement a2;

    @FindBy(css = "#block-block-52 div.content div.text-right div a:nth-of-type(3)")
    @CacheLookup
    private WebElement a3;

    @FindBy(css = "a[href='https://www.isro.gov.in/about-isro']")
    @CacheLookup
    private WebElement about;

    @FindBy(css = "a[href='/sites/default/files/flipping_book/annual_report_2018-19_english/index.html']")
    @CacheLookup
    private WebElement annualReportEnglish;

    @FindBy(css = "a[href='https://www.isro.gov.in/applications']")
    @CacheLookup
    private WebElement applications;

    @FindBy(css = "a[href='/astrosat-0']")
    @CacheLookup
    private WebElement astrosat;

    @FindBy(css = "a[title='Autonomous Bodies under DoS']")
    @CacheLookup
    private WebElement autonomousBodiesUnderDos;

    @FindBy(css = "#block-block-44 div.content a:nth-of-type(6)")
    @CacheLookup
    private WebElement careers1;

    @FindBy(css = "#block-block-43 div.content p.rtecenter a:nth-of-type(5)")
    @CacheLookup
    private WebElement careers2;

    @FindBy(css = "#mdmegamenu-1 li:nth-of-type(8) a")
    @CacheLookup
    private WebElement chandrayaan21;

    @FindBy(css = "#block-views-specialone-latest-work-block-2 div.content div.view.view-specialone-latest-work.view-id-specialone_latest_work.view-display-id-block_2.view-dom-id-07d8da9daeece344c57dbffdd1b14aca div.view-content div:nth-of-type(1) div:nth-of-type(1) figure a")
    @CacheLookup
    private WebElement chandrayaan22;

    @FindBy(css = "a[href='       https://www.isro.gov.in/chandrayaan2-home-0    	']")
    @CacheLookup
    private WebElement chandrayaan2Mission;

    @FindBy(css = "a[title='Check Your 7th CPC Pension Revision Status - External website that opens in new window']")
    @CacheLookup
    private WebElement checkYour7thCpcPensionRevision;

    @FindBy(css = "a[href='/node/619']")
    @CacheLookup
    private WebElement citizensCharter;

    @FindBy(css = "a[href='https://mosdac.gov.in/data/servlet/Image3d?imagename=3DIMG%2A_L1C_ASIA_MER_IR1.jpg']")
    @CacheLookup
    private WebElement cloudCoverOverIndia1;

    @FindBy(css = "a[href='       https://mosdac.gov.in/data/servlet/Image3d?imagename=3DIMG*_L1C_ASIA_MER_IR1.jpg    	']")
    @CacheLookup
    private WebElement cloudCoverOverIndia2;

    @FindBy(css = "a[title='Contact Us']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = "a.tooltips.text-color-grayLight2")
    @CacheLookup
    private WebElement cqwIsroWebsite;

    @FindBy(css = "a[title='CSSTEAP - Centre for Space Science and Technology Education in Asia and the Pacific']")
    @CacheLookup
    private WebElement cssteap;

    @FindBy(css = "#block-block-42 div.content div.span12 a:nth-of-type(3)")
    @CacheLookup
    private WebElement departmentOfSpaceIndianSpace;

    @FindBy(css = "a[href='https://www.isro.gov.in/disaster-management-support']")
    @CacheLookup
    private WebElement disasterManagementSupport1;

    @FindBy(css = "a[href='       https://www.isro.gov.in/disaster-management-support    	']")
    @CacheLookup
    private WebElement disasterManagementSupport2;

    @FindBy(css = "a[title='Disclaimer']")
    @CacheLookup
    private WebElement disclaimer;

    @FindBy(css = "a[title='DOS/ISRO Swachhata Action Plan']")
    @CacheLookup
    private WebElement dosisroSwachhataActionPlan;

    @FindBy(css = "a.language-link.active.text-color-theme")
    @CacheLookup
    private WebElement english;

    @FindBy(css = "a[href='       applications    	']")
    @CacheLookup
    private WebElement eoApplications;

    @FindBy(css = "a[title='E-Procurement - External website that opens in new window']")
    @CacheLookup
    private WebElement eprocurement;

    @FindBy(css = "#block-block-52 div.content div.text-right div a:nth-of-type(4)")
    @CacheLookup
    private WebElement facebook1;

    @FindBy(css = "#block-block-47 div.content div:nth-of-type(1) div:nth-of-type(1) a.tooltips.text-color-grayLight1")
    @CacheLookup
    private WebElement facebook2;

    @FindBy(css = "a[title='FAQ']")
    @CacheLookup
    private WebElement faq;

    @FindBy(css = "a[title='Feedback']")
    @CacheLookup
    private WebElement feedback;

    @FindBy(css = "a[title='External website that opens in a new window']")
    @CacheLookup
    private WebElement gOVERN;

    @FindBy(css = "a[title='Help']")
    @CacheLookup
    private WebElement help;

    @FindBy(css = "a[href='sites/default/files/flipping_book/annual_report_2018-19_hindi/index.html']")
    @CacheLookup
    private WebElement hindi;

    @FindBy(css = "a[title='Hyperlinking Policy']")
    @CacheLookup
    private WebElement hyperlinkingPolicy;

    @FindBy(css = "a[title='India Code - Digital Repository of all Central and State Acts -External website that opens in new window']")
    @CacheLookup
    private WebElement indiaCode;

    @FindBy(css = "a[href='/indias-space-policy-0']")
    @CacheLookup
    private WebElement indiasSpacePolicy;

    @FindBy(css = "a[title='International Cooperation']")
    @CacheLookup
    private WebElement internationalCooperation;

    @FindBy(css = "a[title='ISM Data Sheets']")
    @CacheLookup
    private WebElement ismDataSheets;

    @FindBy(css = "#block-block-42 div.content div.span12 a:nth-of-type(2)")
    @CacheLookup
    private WebElement isroLogo;

    @FindBy(css = "a[href='https://www.isro.gov.in/launchers']")
    @CacheLookup
    private WebElement launchers;

    @FindBy(css = "a[href='https://www.isro.gov.in/media']")
    @CacheLookup
    private WebElement media;

    @FindBy(css = "a[href='https://www.isro.gov.in/missions-0']")
    @CacheLookup
    private WebElement missions;

    @FindBy(css = "a[href='       /pslv-c25-mars-orbiter-mission/olympus-mons    	']")
    @CacheLookup
    private WebElement mom;

    @FindBy(css = "a[title='Monthly Summary of DOS']")
    @CacheLookup
    private WebElement monthlySummaryOfDos;

    @FindBy(css = "a[href='/press-release']")
    @CacheLookup
    private WebElement more;

    @FindBy(css = "a[title='Government of India']")
    @CacheLookup
    private WebElement nationalEmblem;

    @FindBy(css = "a[title='NGSP - External website that opens in new window']")
    @CacheLookup
    private WebElement nationalGovernmentServicesPortalngsp;

    @FindBy(css = "a[title='National Portal of India - External website that opens in new window']")
    @CacheLookup
    private WebElement nationalPortalOfIndia;

    @FindBy(css = "a[href='http://www.nvsp.in/']")
    @CacheLookup
    private WebElement nationalVotersServicePortal;

    @FindBy(css = "a[href='/irnss-programme']")
    @CacheLookup
    private WebElement navic1;

    @FindBy(css = "a[href='       /irnss-programme    	']")
    @CacheLookup
    private WebElement navic2;

    @FindBy(css = "a[href='/pslv-c25-mars-orbiter-mission/olympus-mons']")
    @CacheLookup
    private WebElement olympusMonsLatestImageOfMars;

    private final String pageLoadedText = "Our vision is to harness space technology for national development, while pursuing space science research and planetary exploration";

    private final String pageUrl = "/";

    @FindBy(css = "a[title='Parliament Questions']")
    @CacheLookup
    private WebElement parliamentQuestions;

    @FindBy(css = "a[title='PIB - External website that opens in new window']")
    @CacheLookup
    private WebElement pib;

    @FindBy(css = "a[title='Privacy Policy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[title='Publications']")
    @CacheLookup
    private WebElement publications;

    @FindBy(css = "#block-system-main div.content div.ds-1col.node.node-page.view-mode-full.clearfix div.field.field-name-body.field-type-text-with-summary.field-label-hidden div.field-items div.field-item.even div.span12.tab-panel div:nth-of-type(1) div:nth-of-type(2) div.text-center div.view.view-top-content.view-id-top_content.view-display-id-story_of_the_week.view-dom-id-1e211d5c6b5a6085c7d10b263b598d9c div.view-content div.views-row.views-row-1.views-row-odd.views-row-first.views-row-last span span a")
    @CacheLookup
    private WebElement readMore;

    @FindBy(css = "a[title='Read more updates']")
    @CacheLookup
    private WebElement readMore;

    @FindBy(css = "a[title='Related Links']")
    @CacheLookup
    private WebElement relatedLinks;

    @FindBy(css = "a[href='https://www.isro.gov.in/request-transponder-capacity']")
    @CacheLookup
    private WebElement requestTransponderCapacity;

    @FindBy(css = "a[title='Right to Information']")
    @CacheLookup
    private WebElement rightToInformation;

    @FindBy(id = "edit-search-block-form--2")
    @CacheLookup
    private WebElement search1;

    @FindBy(id = "edit-submit")
    @CacheLookup
    private WebElement search2;

    @FindBy(id = "selectnav1")
    @CacheLookup
    private WebElement search3;

    @FindBy(css = "a[href='/update/11-sep-2019/caltech%E2%80%99s-provost-met-chairman-isro-secretary-dos']")
    @CacheLookup
    private WebElement sep112019CaltechsProvost;

    @FindBy(css = "a[href='/update/16-sep-2019/rajbhasha-kirti-purashkar-first-2018-19']")
    @CacheLookup
    private WebElement sep162019RajbhashaKirti;

    @FindBy(css = "a[href='/astrosat-announcement-of-opportunity-ao-soliciting-proposals-ninth-ao-cycle-observations']")
    @CacheLookup
    private WebElement sep192019AstrosatAnnouncement;

    @FindBy(css = "a[href='/update/19-sep-2019/isro-space-technology-cell-confluence-held-iit-madras']")
    @CacheLookup
    private WebElement sep192019IsrospaceTechnology;

    @FindBy(css = "a[href='/update/19-sep-2019/update-chandrayaan-%E2%80%93-2']")
    @CacheLookup
    private WebElement sep192019UpdateOn;

    @FindBy(css = "a[title='Site Map']")
    @CacheLookup
    private WebElement siteMap;

    @FindBy(css = "a[title='Skip to main content']")
    @CacheLookup
    private WebElement skipToMainContent;

    @FindBy(css = "a[href='/applications']")
    @CacheLookup
    private WebElement spaceApplications;

    @FindBy(css = "a[href='       /astrosat-0    	']")
    @CacheLookup
    private WebElement spaceScience;

    @FindBy(css = "a[href='https://www.isro.gov.in/spacecraft']")
    @CacheLookup
    private WebElement spacecraft;

    @FindBy(css = "a[title='Academia Interface']")
    @CacheLookup
    private WebElement sponsoredResearch;

    @FindBy(css = "#block-system-main div.content div.ds-1col.node.node-page.view-mode-full.clearfix div.field.field-name-body.field-type-text-with-summary.field-label-hidden div.field-items div.field-item.even div.span12.tab-panel div:nth-of-type(1) div:nth-of-type(2) div.text-center div.view.view-top-content.view-id-top_content.view-display-id-story_of_the_week.view-dom-id-1e211d5c6b5a6085c7d10b263b598d9c div.view-content div.views-row.views-row-1.views-row-odd.views-row-first.views-row-last div:nth-of-type(1) h3.field-content a")
    @CacheLookup
    private WebElement storyOfTheWeekSuper;

    @FindBy(css = "a[title='Technology Transfer']")
    @CacheLookup
    private WebElement technologyTransfer;

    @FindBy(css = "a[title='Tender Notices']")
    @CacheLookup
    private WebElement tenderNotices;

    @FindBy(css = "a[title='Terms of Use']")
    @CacheLookup
    private WebElement termsOfUse;

    @FindBy(css = "#block-system-main div.content div.ds-1col.node.node-page.view-mode-full.clearfix div.field.field-name-body.field-type-text-with-summary.field-label-hidden div.field-items div.field-item.even div.span12.tab-panel div:nth-of-type(2) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement timeline1;

    @FindBy(css = "#block-system-main div.content div.ds-1col.node.node-page.view-mode-full.clearfix div.field.field-name-body.field-type-text-with-summary.field-label-hidden div.field-items div.field-item.even div.span12.tab-panel div:nth-of-type(2) div:nth-of-type(2) div.row.span6.offset3 a")
    @CacheLookup
    private WebElement timeline2;

    @FindBy(css = "#block-block-43 div.content p.rtecenter a:nth-of-type(2)")
    @CacheLookup
    private WebElement timeline3;

    @FindBy(css = "#block-block-52 div.content div.text-right div a:nth-of-type(5)")
    @CacheLookup
    private WebElement twitter1;

    @FindBy(css = "#block-block-47 div.content div:nth-of-type(1) div:nth-of-type(2) a.tooltips.text-color-grayLight1")
    @CacheLookup
    private WebElement twitter2;

    @FindBy(css = "a[href='       /unnati    	']")
    @CacheLookup
    private WebElement unnatiBatch2UnispaceNano;

    @FindBy(css = "a[href='/unnati']")
    @CacheLookup
    private WebElement unnatiUnispaceNanoSatelliteAssembly;

    @FindBy(css = "a[title='Update/अपडेट']")
    @CacheLookup
    private WebElement updates;

    @FindBy(css = "a[href='https://vikramsarabhai.isro.gov.in']")
    @CacheLookup
    private WebElement vikramASarabhaiCentenaryProgramme1;

    @FindBy(css = "a[href='       https://vikramsarabhai.isro.gov.in    	']")
    @CacheLookup
    private WebElement vikramASarabhaiCentenaryProgramme2;

    public ISRO() {
    }

    public ISRO(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public ISRO(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public ISRO(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on A Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickA1Link() {
        a1.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickA2Link() {
        a2.click();
        return this;
    }

    /**
     * Click on A Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickA3Link() {
        a3.click();
        return this;
    }

    /**
     * Click on About Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickAboutLink() {
        about.click();
        return this;
    }

    /**
     * Click on Annual Report English Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickAnnualReportEnglishLink() {
        annualReportEnglish.click();
        return this;
    }

    /**
     * Click on Applications Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickApplicationsLink() {
        applications.click();
        return this;
    }

    /**
     * Click on Astrosat Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickAstrosatLink() {
        astrosat.click();
        return this;
    }

    /**
     * Click on Autonomous Bodies Under Dos Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickAutonomousBodiesUnderDosLink() {
        autonomousBodiesUnderDos.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCareers1Link() {
        careers1.click();
        return this;
    }

    /**
     * Click on Careers Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCareers2Link() {
        careers2.click();
        return this;
    }

    /**
     * Click on Chandrayaan 2 Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickChandrayaan21Link() {
        chandrayaan21.click();
        return this;
    }

    /**
     * Click on Chandrayaan 2 Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickChandrayaan22Link() {
        chandrayaan22.click();
        return this;
    }

    /**
     * Click on Chandrayaan2 Mission Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickChandrayaan2MissionLink() {
        chandrayaan2Mission.click();
        return this;
    }

    /**
     * Click on Check Your 7th Cpc Pension Revision Status Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCheckYour7thCpcPensionRevisionLink() {
        checkYour7thCpcPensionRevision.click();
        return this;
    }

    /**
     * Click on Citizens Charter Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCitizensCharterLink() {
        citizensCharter.click();
        return this;
    }

    /**
     * Click on Cloud Cover Over India Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCloudCoverOverIndia1Link() {
        cloudCoverOverIndia1.click();
        return this;
    }

    /**
     * Click on Cloud Cover Over India Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCloudCoverOverIndia2Link() {
        cloudCoverOverIndia2.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Cqw Isro Website Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCqwIsroWebsiteLink() {
        cqwIsroWebsite.click();
        return this;
    }

    /**
     * Click on Cssteap Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickCssteapLink() {
        cssteap.click();
        return this;
    }

    /**
     * Click on Department Of Space Indian Space Research Organisation Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickDepartmentOfSpaceIndianSpaceLink() {
        departmentOfSpaceIndianSpace.click();
        return this;
    }

    /**
     * Click on Disaster Management Support Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickDisasterManagementSupport1Link() {
        disasterManagementSupport1.click();
        return this;
    }

    /**
     * Click on Disaster Management Support Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickDisasterManagementSupport2Link() {
        disasterManagementSupport2.click();
        return this;
    }

    /**
     * Click on Disclaimer Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickDisclaimerLink() {
        disclaimer.click();
        return this;
    }

    /**
     * Click on Dosisro Swachhata Action Plan Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickDosisroSwachhataActionPlanLink() {
        dosisroSwachhataActionPlan.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Eo Applications Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickEoApplicationsLink() {
        eoApplications.click();
        return this;
    }

    /**
     * Click on Eprocurement Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickEprocurementLink() {
        eprocurement.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickFacebook1Link() {
        facebook1.click();
        return this;
    }

    /**
     * Click on Facebook Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickFacebook2Link() {
        facebook2.click();
        return this;
    }

    /**
     * Click on Faq Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickFaqLink() {
        faq.click();
        return this;
    }

    /**
     * Click on Feedback Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickFeedbackLink() {
        feedback.click();
        return this;
    }

    /**
     * Click on G O V E R N M E N T O F I N D I A Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickGOVERNLink() {
        gOVERN.click();
        return this;
    }

    /**
     * Click on Help Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickHelpLink() {
        help.click();
        return this;
    }

    /**
     * Click on Hindi Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickHindiLink() {
        hindi.click();
        return this;
    }

    /**
     * Click on Hyperlinking Policy Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickHyperlinkingPolicyLink() {
        hyperlinkingPolicy.click();
        return this;
    }

    /**
     * Click on India Code Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickIndiaCodeLink() {
        indiaCode.click();
        return this;
    }

    /**
     * Click on Indias Space Policy Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickIndiasSpacePolicyLink() {
        indiasSpacePolicy.click();
        return this;
    }

    /**
     * Click on International Cooperation Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickInternationalCooperationLink() {
        internationalCooperation.click();
        return this;
    }

    /**
     * Click on Ism Data Sheets Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickIsmDataSheetsLink() {
        ismDataSheets.click();
        return this;
    }

    /**
     * Click on Isro Logo Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickIsroLogoLink() {
        isroLogo.click();
        return this;
    }

    /**
     * Click on Launchers Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickLaunchersLink() {
        launchers.click();
        return this;
    }

    /**
     * Click on Media Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickMediaLink() {
        media.click();
        return this;
    }

    /**
     * Click on Missions Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickMissionsLink() {
        missions.click();
        return this;
    }

    /**
     * Click on Mom Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickMomLink() {
        mom.click();
        return this;
    }

    /**
     * Click on Monthly Summary Of Dos Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickMonthlySummaryOfDosLink() {
        monthlySummaryOfDos.click();
        return this;
    }

    /**
     * Click on More Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickMoreLink() {
        more.click();
        return this;
    }

    /**
     * Click on National Emblem Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNationalEmblemLink() {
        nationalEmblem.click();
        return this;
    }

    /**
     * Click on National Government Services Portalngsp Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNationalGovernmentServicesPortalngspLink() {
        nationalGovernmentServicesPortalngsp.click();
        return this;
    }

    /**
     * Click on National Portal Of India Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNationalPortalOfIndiaLink() {
        nationalPortalOfIndia.click();
        return this;
    }

    /**
     * Click on National Voters Service Portal Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNationalVotersServicePortalLink() {
        nationalVotersServicePortal.click();
        return this;
    }

    /**
     * Click on Navic Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNavic1Link() {
        navic1.click();
        return this;
    }

    /**
     * Click on Navic Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickNavic2Link() {
        navic2.click();
        return this;
    }

    /**
     * Click on Olympus Mons Latest Image Of Mars Taken By Mcc Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickOlympusMonsLatestImageOfMarsLink() {
        olympusMonsLatestImageOfMars.click();
        return this;
    }

    /**
     * Click on Parliament Questions Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickParliamentQuestionsLink() {
        parliamentQuestions.click();
        return this;
    }

    /**
     * Click on Pib Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickPibLink() {
        pib.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Publications Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickPublicationsLink() {
        publications.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickReadMoreLink() {
        readMore.click();
        return this;
    }

    /**
     * Click on Read More Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickReadMoreLink() {
        readMore.click();
        return this;
    }

    /**
     * Click on Related Links Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickRelatedLinksLink() {
        relatedLinks.click();
        return this;
    }

    /**
     * Click on Request Transponder Capacity Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickRequestTransponderCapacityLink() {
        requestTransponderCapacity.click();
        return this;
    }

    /**
     * Click on Right To Information Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickRightToInformationLink() {
        rightToInformation.click();
        return this;
    }

    /**
     * Set default value to Search Text field.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSearch1Button() {
        return clickSearch1Button(data.get("SEARCH"));
    }

    /**
     * Click on Search Button.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSearch1Button(String searchValue) {
        search1.sendKeys(searchValue);
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSearch2Button() {
        search2.click();
        return this;
    }

    /**
     * Click on Sep 11 2019 Caltechs Provost Met Chairman Isrosecretary Dos Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSep112019CaltechsProvostLink() {
        sep112019CaltechsProvost.click();
        return this;
    }

    /**
     * Click on Sep 16 2019 Rajbhasha Kirti Purashkar First 201819 Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSep162019RajbhashaKirtiLink() {
        sep162019RajbhashaKirti.click();
        return this;
    }

    /**
     * Click on Sep 19 2019 Astrosat Announcement Of Opportunity Ao Soliciting Proposals For Ninth Ao Cycle Observations Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSep192019AstrosatAnnouncementLink() {
        sep192019AstrosatAnnouncement.click();
        return this;
    }

    /**
     * Click on Sep 19 2019 Isrospace Technology Cell Confluence Held At Iit Madras Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSep192019IsrospaceTechnologyLink() {
        sep192019IsrospaceTechnology.click();
        return this;
    }

    /**
     * Click on Sep 19 2019 Update On Chandrayaan 2 Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSep192019UpdateOnLink() {
        sep192019UpdateOn.click();
        return this;
    }

    /**
     * Click on Site Map Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSiteMapLink() {
        siteMap.click();
        return this;
    }

    /**
     * Click on Skip To Main Content Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSkipToMainContentLink() {
        skipToMainContent.click();
        return this;
    }

    /**
     * Click on Space Applications Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSpaceApplicationsLink() {
        spaceApplications.click();
        return this;
    }

    /**
     * Click on Space Science Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSpaceScienceLink() {
        spaceScience.click();
        return this;
    }

    /**
     * Click on Spacecraft Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSpacecraftLink() {
        spacecraft.click();
        return this;
    }

    /**
     * Click on Sponsored Research Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickSponsoredResearchLink() {
        sponsoredResearch.click();
        return this;
    }

    /**
     * Click on Story Of The Week Super Flares In Nascent Sun Evidence From Meteorites Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickStoryOfTheWeekSuperLink() {
        storyOfTheWeekSuper.click();
        return this;
    }

    /**
     * Click on Technology Transfer Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTechnologyTransferLink() {
        technologyTransfer.click();
        return this;
    }

    /**
     * Click on Tender Notices Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTenderNoticesLink() {
        tenderNotices.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTermsOfUseLink() {
        termsOfUse.click();
        return this;
    }

    /**
     * Click on Timeline Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTimeline1Link() {
        timeline1.click();
        return this;
    }

    /**
     * Click on Timeline Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTimeline2Link() {
        timeline2.click();
        return this;
    }

    /**
     * Click on Timeline Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTimeline3Link() {
        timeline3.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTwitter1Link() {
        twitter1.click();
        return this;
    }

    /**
     * Click on Twitter Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickTwitter2Link() {
        twitter2.click();
        return this;
    }

    /**
     * Click on Unnati Batch2 Unispace Nano Satellite Assembly Training By Isro Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickUnnatiBatch2UnispaceNanoLink() {
        unnatiBatch2UnispaceNano.click();
        return this;
    }

    /**
     * Click on Unnati Unispace Nano Satellite Assembly Training By Isro Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickUnnatiUnispaceNanoSatelliteAssemblyLink() {
        unnatiUnispaceNanoSatelliteAssembly.click();
        return this;
    }

    /**
     * Click on Updates Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickUpdatesLink() {
        updates.click();
        return this;
    }

    /**
     * Click on Vikram A Sarabhai Centenary Programme Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickVikramASarabhaiCentenaryProgramme1Link() {
        vikramASarabhaiCentenaryProgramme1.click();
        return this;
    }

    /**
     * Click on Vikram A Sarabhai Centenary Programme Link.
     *
     * @return the ISRO class instance.
     */
    public ISRO clickVikramASarabhaiCentenaryProgramme2Link() {
        vikramASarabhaiCentenaryProgramme2.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the ISRO class instance.
     */
    public ISRO fill() {
        clickSearch1Button();
        setSearch3DropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the ISRO class instance.
     */
    public ISRO fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Search Drop Down List field.
     *
     * @return the ISRO class instance.
     */
    public ISRO setSearch3DropDownListField() {
        return setSearch3DropDownListField(data.get("SEARCH_3"));
    }

    /**
     * Set value to Search Drop Down List field.
     *
     * @return the ISRO class instance.
     */
    public ISRO setSearch3DropDownListField(String search3Value) {
        new Select(search3).selectByVisibleText(search3Value);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the ISRO class instance.
     */
    public ISRO submit() {
        clickSearchButton();
        ISRO target = new ISRO(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset default value from Search Drop Down List field.
     *
     * @return the ISRO class instance.
     */
    public ISRO unsetSearch3DropDownListField() {
        return unsetSearch3DropDownListField(data.get("SEARCH_3"));
    }

    /**
     * Unset value from Search Drop Down List field.
     *
     * @return the ISRO class instance.
     */
    public ISRO unsetSearch3DropDownListField(String search3Value) {
        new Select(search3).deselectByVisibleText(search3Value);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the ISRO class instance.
     */
    public ISRO verifyPageLoaded() {
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
     * @return the ISRO class instance.
     */
    public ISRO verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
