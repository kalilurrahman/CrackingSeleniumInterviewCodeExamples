import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Wikipedia {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    @FindBy(id = "js-link-box-te")
    @CacheLookup
    private WebElement _00071;

    @FindBy(id = "js-link-box-zh")
    @CacheLookup
    private WebElement _0730001;

    @FindBy(css = "a[title='Belaruskaya (Akademichnaya)']")
    @CacheLookup
    private WebElement _1;

    @FindBy(css = "a[title='Pañjābī (Shāhmukhī)']")
    @CacheLookup
    private WebElement _1;

    @FindBy(css = "a[title='Löriyé-Šomālī']")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "a[title='Perem Komi']")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "a[title='Rusin’skyj Yazyk']")
    @CacheLookup
    private WebElement _12;

    @FindBy(css = "a[title='Tyva dyl']")
    @CacheLookup
    private WebElement _13;

    @FindBy(css = "a[href='//ru.wikipedia.org/wiki/%D0%92%D0%B8%D0%BA%D0%B8%D0%BF%D0%B5%D0%B4%D0%B8%D1%8F:%D0%A1%D0%92']")
    @CacheLookup
    private WebElement _14;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/%EC%9C%84%ED%82%A4%EB%B0%B1%EA%B3%BC%EC%9D%98_%EB%AA%A9%EB%A1%9D']")
    @CacheLookup
    private WebElement _15;

    @FindBy(id = "js-link-box-ja")
    @CacheLookup
    private WebElement _1680001;

    @FindBy(css = "a[title='Belaruskaya (Taraškievica)']")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "a[title='Slověnĭskŭ']")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "a[title='Bishnupriya Manipuri']")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "a[title='Iron Ævzag']")
    @CacheLookup
    private WebElement _4;

    @FindBy(css = "a[title='Kurdîy Nawendî']")
    @CacheLookup
    private WebElement _5;

    @FindBy(id = "js-link-box-ru")
    @CacheLookup
    private WebElement _5680001;

    @FindBy(css = "a[title='Kyryk Mary']")
    @CacheLookup
    private WebElement _6;

    @FindBy(css = "a[title='Nepal Bhasa']")
    @CacheLookup
    private WebElement _7;

    @FindBy(css = "a[title='Pañjābī (Gurmukhī)']")
    @CacheLookup
    private WebElement _8;

    @FindBy(css = "a[title='Saxa Tyla']")
    @CacheLookup
    private WebElement _9;

    @FindBy(css = "a[href='//om.wikipedia.org/']")
    @CacheLookup
    private WebElement afaanOromoo;

    @FindBy(css = "a[href='//af.wikipedia.org/']")
    @CacheLookup
    private WebElement afrikaans;

    @FindBy(css = "a[href='//ak.wikipedia.org/']")
    @CacheLookup
    private WebElement akan;

    @FindBy(css = "a[href='//als.wikipedia.org/']")
    @CacheLookup
    private WebElement alemannisch;

    @FindBy(css = "a[href='//eo.wikipedia.org/wiki/Vikipedio:Internacia_Vikipedio']")
    @CacheLookup
    private WebElement aliajLingvoj;

    @FindBy(css = "a[href='//an.wikipedia.org/']")
    @CacheLookup
    private WebElement aragons;

    @FindBy(css = "a[href='//roa-rup.wikipedia.org/']")
    @CacheLookup
    private WebElement armneashce;

    @FindBy(css = "a[href='//frp.wikipedia.org/']")
    @CacheLookup
    private WebElement arpitan;

    @FindBy(css = "a[href='//ig.wikipedia.org/']")
    @CacheLookup
    private WebElement assBekeeMabAssOyibo;

    @FindBy(css = "a[href='//ast.wikipedia.org/']")
    @CacheLookup
    private WebElement asturianu;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/Liste_des_Wikip%C3%A9dias']")
    @CacheLookup
    private WebElement autresLangues;

    @FindBy(css = "a[href='//gn.wikipedia.org/']")
    @CacheLookup
    private WebElement avae;

    @FindBy(css = "a[href='//ay.wikipedia.org/']")
    @CacheLookup
    private WebElement aymar;

    @FindBy(css = "a[href='//az.wikipedia.org/']")
    @CacheLookup
    private WebElement azrbaycanca;

    @FindBy(css = "a[href='//bjn.wikipedia.org/']")
    @CacheLookup
    private WebElement bahasaBanjar;

    @FindBy(css = "a[href='//id.wikipedia.org/']")
    @CacheLookup
    private WebElement bahasaIndonesia;

    @FindBy(css = "a[href='//ms.wikipedia.org/']")
    @CacheLookup
    private WebElement bahasaMelayu;

    @FindBy(css = "a[href='//min.wikipedia.org/']")
    @CacheLookup
    private WebElement bahasoMinangkabau;

    @FindBy(css = "a[href='//ace.wikipedia.org/']")
    @CacheLookup
    private WebElement bahsaAch;

    @FindBy(css = "a[href='//bm.wikipedia.org/']")
    @CacheLookup
    private WebElement bamanankan;

    @FindBy(css = "a[href='//map-bms.wikipedia.org/']")
    @CacheLookup
    private WebElement basaBanyumasan;

    @FindBy(css = "a[href='//su.wikipedia.org/']")
    @CacheLookup
    private WebElement basaSunda;

    @FindBy(css = "a[href='//bug.wikipedia.org/']")
    @CacheLookup
    private WebElement basaUgi;

    @FindBy(css = "a[href='//bcl.wikipedia.org/']")
    @CacheLookup
    private WebElement bikolCentral;

    @FindBy(css = "a[href='//bi.wikipedia.org/']")
    @CacheLookup
    private WebElement bislama;

    @FindBy(css = "a[href='//zh-min-nan.wikipedia.org/']")
    @CacheLookup
    private WebElement bnlmgHlo;

    @FindBy(css = "a[href='//bar.wikipedia.org/']")
    @CacheLookup
    private WebElement boarisch;

    @FindBy(css = "a[href='//no.wikipedia.org/']")
    @CacheLookup
    private WebElement bokml;

    @FindBy(css = "a[href='//bs.wikipedia.org/']")
    @CacheLookup
    private WebElement bosanski;

    @FindBy(css = "a[href='//br.wikipedia.org/']")
    @CacheLookup
    private WebElement brezhoneg;

    @FindBy(css = "a[href='//ca.wikipedia.org/']")
    @CacheLookup
    private WebElement catal;

    @FindBy(css = "a[href='//ch.wikipedia.org/']")
    @CacheLookup
    private WebElement chamoru;

    @FindBy(css = "a[href='//cbk-zam.wikipedia.org/']")
    @CacheLookup
    private WebElement chavacanoDeZamboanga;

    @FindBy(css = "a[href='//ny.wikipedia.org/']")
    @CacheLookup
    private WebElement chichewa;

    @FindBy(css = "a[href='//sn.wikipedia.org/']")
    @CacheLookup
    private WebElement chishona;

    @FindBy(css = "a[href='//tum.wikipedia.org/']")
    @CacheLookup
    private WebElement chitumbuka;

    @FindBy(css = "a[href='//commons.wikimedia.org/']")
    @CacheLookup
    private WebElement commonsFreelyUsablePhotos;

    @FindBy(css = "a[href='//co.wikipedia.org/']")
    @CacheLookup
    private WebElement corsu;

    @FindBy(css = "a[href='https://creativecommons.org/licenses/by-sa/3.0/']")
    @CacheLookup
    private WebElement creativeCommonsAttributionsharealikeLicense;

    @FindBy(css = "a[title='Saesneg']")
    @CacheLookup
    private WebElement cymraeg;

    @FindBy(css = "a[href='//da.wikipedia.org/']")
    @CacheLookup
    private WebElement dansk;

    @FindBy(css = "a[href='//se.wikipedia.org/']")
    @CacheLookup
    private WebElement davvismegiella;

    @FindBy(css = "a[href='//pdc.wikipedia.org/']")
    @CacheLookup
    private WebElement deitsch;

    @FindBy(css = "#js-lang-lists div:nth-of-type(1) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement deutsch;

    @FindBy(id = "js-link-box-de")
    @CacheLookup
    private WebElement deutsch2343000Artikel;

    @FindBy(css = "a[href='//nv.wikipedia.org/']")
    @CacheLookup
    private WebElement dinBizaad;

    @FindBy(css = "a[href='//dsb.wikipedia.org/']")
    @CacheLookup
    private WebElement dolnoserbski;

    @FindBy(css = "a[href='//na.wikipedia.org/']")
    @CacheLookup
    private WebElement dorerinNaoero;

    @FindBy(css = "a.jsl10n")
    @CacheLookup
    private WebElement downloadWikipediaForAndroidOr;

    @FindBy(css = "a[title='Ladino']")
    @CacheLookup
    private WebElement dzhudezmo;

    @FindBy(css = "a[href='//ee.wikipedia.org/']")
    @CacheLookup
    private WebElement eegbe;

    @FindBy(css = "a[href='//et.wikipedia.org/']")
    @CacheLookup
    private WebElement eesti;

    @FindBy(css = "a[href='//bat-smg.wikipedia.org/']")
    @CacheLookup
    private WebElement emaitka;

    @FindBy(css = "a[href='//eml.wikipedia.org/']")
    @CacheLookup
    private WebElement emiglinrumagnl;

    @FindBy(id = "searchLanguage")
    @CacheLookup
    private WebElement en;

    @FindBy(css = "a[title='English']")
    @CacheLookup
    private WebElement english;

    @FindBy(id = "js-link-box-en")
    @CacheLookup
    private WebElement english5930000Articles;

    @FindBy(css = "#js-lang-lists div:nth-of-type(1) ul li:nth-of-type(3) a")
    @CacheLookup
    private WebElement espaol;

    @FindBy(id = "js-link-box-es")
    @CacheLookup
    private WebElement espaol1545000Artculos;

    @FindBy(css = "a[href='//eo.wikipedia.org/']")
    @CacheLookup
    private WebElement esperanto;

    @FindBy(css = "a[href='//ext.wikipedia.org/']")
    @CacheLookup
    private WebElement estremeu;

    @FindBy(css = "a[href='//cs.wikipedia.org/']")
    @CacheLookup
    private WebElement etina;

    @FindBy(css = "a[href='//eu.wikipedia.org/']")
    @CacheLookup
    private WebElement euskara;

    @FindBy(css = "a[href='//to.wikipedia.org/']")
    @CacheLookup
    private WebElement fakaTonga;

    @FindBy(css = "a[href='//hif.wikipedia.org/']")
    @CacheLookup
    private WebElement fijiHindi;

    @FindBy(css = "#js-lang-lists div:nth-of-type(1) ul li:nth-of-type(4) a")
    @CacheLookup
    private WebElement franais;

    @FindBy(id = "js-link-box-fr")
    @CacheLookup
    private WebElement franais2139000Articles;

    @FindBy(css = "a[href='//fo.wikipedia.org/']")
    @CacheLookup
    private WebElement froyskt;

    @FindBy(css = "a[href='//fy.wikipedia.org/']")
    @CacheLookup
    private WebElement frysk;

    @FindBy(css = "a[href='//ff.wikipedia.org/']")
    @CacheLookup
    private WebElement fulfulde;

    @FindBy(css = "a[href='//fur.wikipedia.org/']")
    @CacheLookup
    private WebElement furlan;

    @FindBy(css = "a[href='//ga.wikipedia.org/']")
    @CacheLookup
    private WebElement gaeilge;

    @FindBy(css = "a[href='//gv.wikipedia.org/']")
    @CacheLookup
    private WebElement gaelg;

    @FindBy(css = "a[href='//sm.wikipedia.org/']")
    @CacheLookup
    private WebElement gaganaSmoa;

    @FindBy(css = "a[href='//gag.wikipedia.org/']")
    @CacheLookup
    private WebElement gagauz;

    @FindBy(css = "a[href='//gl.wikipedia.org/']")
    @CacheLookup
    private WebElement galego;

    @FindBy(css = "a[href='//gd.wikipedia.org/']")
    @CacheLookup
    private WebElement gidhlig;

    @FindBy(css = "a[href='//ki.wikipedia.org/']")
    @CacheLookup
    private WebElement gky;

    @FindBy(css = "a[href='//hak.wikipedia.org/']")
    @CacheLookup
    private WebElement hakkng;

    @FindBy(css = "a[href='//ha.wikipedia.org/']")
    @CacheLookup
    private WebElement hausa;

    @FindBy(css = "a[href='//hsb.wikipedia.org/']")
    @CacheLookup
    private WebElement hornjoserbsce;

    @FindBy(css = "a[href='//hr.wikipedia.org/']")
    @CacheLookup
    private WebElement hrvatski;

    @FindBy(css = "a[href='//io.wikipedia.org/']")
    @CacheLookup
    private WebElement ido;

    @FindBy(css = "a[href='//ilo.wikipedia.org/']")
    @CacheLookup
    private WebElement ilokano;

    @FindBy(css = "a[href='//ia.wikipedia.org/']")
    @CacheLookup
    private WebElement interlingua;

    @FindBy(css = "a[href='//ie.wikipedia.org/']")
    @CacheLookup
    private WebElement interlingue;

    @FindBy(css = "a[href='//iu.wikipedia.org/']")
    @CacheLookup
    private WebElement inuktitut;

    @FindBy(css = "a[href='//xh.wikipedia.org/']")
    @CacheLookup
    private WebElement isixhosa;

    @FindBy(css = "a[href='//zu.wikipedia.org/']")
    @CacheLookup
    private WebElement isizulu;

    @FindBy(css = "#js-lang-lists div:nth-of-type(1) ul li:nth-of-type(5) a")
    @CacheLookup
    private WebElement italiano;

    @FindBy(id = "js-link-box-it")
    @CacheLookup
    private WebElement italiano1552000Voci;

    @FindBy(css = "a[href='//ik.wikipedia.org/']")
    @CacheLookup
    private WebElement iupiak;

    @FindBy(css = "a[href='//jv.wikipedia.org/']")
    @CacheLookup
    private WebElement jawa;

    @FindBy(css = "a[href='//kl.wikipedia.org/']")
    @CacheLookup
    private WebElement kalaallisut;

    @FindBy(css = "a[href='//pam.wikipedia.org/']")
    @CacheLookup
    private WebElement kapampangan;

    @FindBy(css = "a[href='//csb.wikipedia.org/']")
    @CacheLookup
    private WebElement kaszbsczi;

    @FindBy(css = "a[href='//kw.wikipedia.org/']")
    @CacheLookup
    private WebElement kernewek;

    @FindBy(css = "a[href='//rw.wikipedia.org/']")
    @CacheLookup
    private WebElement kinyarwanda;

    @FindBy(css = "a[href='//rn.wikipedia.org/']")
    @CacheLookup
    private WebElement kirundi;

    @FindBy(css = "a[href='//sw.wikipedia.org/']")
    @CacheLookup
    private WebElement kiswahili;

    @FindBy(css = "a[href='//pl.wikipedia.org/wiki/Wikipedia:Lista_wersji_j%C4%99zykowych']")
    @CacheLookup
    private WebElement kompletnaListaJzykw;

    @FindBy(css = "a[href='//kg.wikipedia.org/']")
    @CacheLookup
    private WebElement kongo;

    @FindBy(css = "a[href='//gom.wikipedia.org/']")
    @CacheLookup
    private WebElement konknni;

    @FindBy(css = "a[href='//ht.wikipedia.org/']")
    @CacheLookup
    private WebElement kreylAyisyen;

    @FindBy(css = "a[href='//ku.wikipedia.org/']")
    @CacheLookup
    private WebElement kurd;

    @FindBy(css = "a[href='//ltg.wikipedia.org/']")
    @CacheLookup
    private WebElement latgau;

    @FindBy(css = "a[href='//la.wikipedia.org/']")
    @CacheLookup
    private WebElement latina;

    @FindBy(css = "a[href='//lv.wikipedia.org/']")
    @CacheLookup
    private WebElement latvieu;

    @FindBy(css = "a[href='//haw.wikipedia.org/']")
    @CacheLookup
    private WebElement leloHawaii;

    @FindBy(css = "a[href='//lij.wikipedia.org/']")
    @CacheLookup
    private WebElement lgure;

    @FindBy(css = "a[href='//lt.wikipedia.org/']")
    @CacheLookup
    private WebElement lietuvi;

    @FindBy(css = "a[href='//li.wikipedia.org/']")
    @CacheLookup
    private WebElement limburgs;

    @FindBy(css = "a[href='//ln.wikipedia.org/']")
    @CacheLookup
    private WebElement lingla;

    @FindBy(css = "a[href='//szl.wikipedia.org/']")
    @CacheLookup
    private WebElement lnski;

    @FindBy(css = "a[href='//jbo.wikipedia.org/']")
    @CacheLookup
    private WebElement lojban;

    @FindBy(css = "a[href='//lb.wikipedia.org/']")
    @CacheLookup
    private WebElement ltzebuergesch;

    @FindBy(css = "a[href='//lg.wikipedia.org/']")
    @CacheLookup
    private WebElement luganda;

    @FindBy(css = "a[href='//lmo.wikipedia.org/']")
    @CacheLookup
    private WebElement lumbaart;

    @FindBy(css = "a[href='//hu.wikipedia.org/']")
    @CacheLookup
    private WebElement magyar;

    @FindBy(css = "a[href='//mg.wikipedia.org/']")
    @CacheLookup
    private WebElement malagasy;

    @FindBy(css = "a[href='//mt.wikipedia.org/']")
    @CacheLookup
    private WebElement malti;

    @FindBy(css = "a[href='//www.mediawiki.org/']")
    @CacheLookup
    private WebElement mediawikiFreeOpenWiki;

    @FindBy(css = "a[href='//meta.wikimedia.org/']")
    @CacheLookup
    private WebElement metawikiCommunityCoordinationDocumentation;

    @FindBy(css = "a[href='//mwl.wikipedia.org/']")
    @CacheLookup
    private WebElement mirands;

    @FindBy(css = "a[title='Ming-deng-ngu']")
    @CacheLookup
    private WebElement mngdngng;

    @FindBy(css = "a[href='//mi.wikipedia.org/']")
    @CacheLookup
    private WebElement mori;

    @FindBy(css = "a[href='//fj.wikipedia.org/']")
    @CacheLookup
    private WebElement naVosaVakaviti;

    @FindBy(css = "a[href='//nl.wikipedia.org/']")
    @CacheLookup
    private WebElement nederlands;

    @FindBy(css = "a[href='//nds-nl.wikipedia.org/']")
    @CacheLookup
    private WebElement nedersaksisch;

    @FindBy(css = "a[href='//ang.wikipedia.org/']")
    @CacheLookup
    private WebElement nglisc;

    @FindBy(css = "a[href='//vi.wikipedia.org/wiki/Wikipedia:Phi%C3%AAn_b%E1%BA%A3n_ng%C3%B4n_ng%E1%BB%AF']")
    @CacheLookup
    private WebElement ngnNgKhc;

    @FindBy(css = "a[href='//cr.wikipedia.org/']")
    @CacheLookup
    private WebElement nhiyawwin;

    @FindBy(css = "a[href='//nah.wikipedia.org/']")
    @CacheLookup
    private WebElement nhuatlahtlli;

    @FindBy(css = "a[href='//nap.wikipedia.org/']")
    @CacheLookup
    private WebElement nnapulitano;

    @FindBy(css = "a[href='//frr.wikipedia.org/']")
    @CacheLookup
    private WebElement nordfriisk;

    @FindBy(css = "a[href='//pih.wikipedia.org/']")
    @CacheLookup
    private WebElement norfukPitkern;

    @FindBy(css = "a[href='//nrm.wikipedia.org/']")
    @CacheLookup
    private WebElement nouormandNormaund;

    @FindBy(css = "a[href='//nov.wikipedia.org/']")
    @CacheLookup
    private WebElement novial;

    @FindBy(css = "a[href='//nn.wikipedia.org/']")
    @CacheLookup
    private WebElement nynorsk;

    @FindBy(css = "a[href='//oc.wikipedia.org/']")
    @CacheLookup
    private WebElement occitan;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/List_of_Wikipedias']")
    @CacheLookup
    private WebElement otherLanguages;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/Lista_de_Wikipedias']")
    @CacheLookup
    private WebElement otrosIdiomas;

    @FindBy(css = "a[href='//uz.wikipedia.org/']")
    @CacheLookup
    private WebElement ozbekcha;

    private final String pageLoadedText = "Save your favorite articles to read offline, sync your reading lists across devices and customize your reading experience with the official Wikipedia app";

    private final String pageUrl = "/";

    @FindBy(css = "a[href='//pag.wikipedia.org/']")
    @CacheLookup
    private WebElement pangasinn;

    @FindBy(css = "a[href='//pap.wikipedia.org/']")
    @CacheLookup
    private WebElement papiamentu;

    @FindBy(css = "a[href='//pfl.wikipedia.org/']")
    @CacheLookup
    private WebElement pflzisch;

    @FindBy(css = "a[href='//pcd.wikipedia.org/']")
    @CacheLookup
    private WebElement picard;

    @FindBy(css = "a[href='//pms.wikipedia.org/']")
    @CacheLookup
    private WebElement piemontis;

    @FindBy(css = "a[href='//nds.wikipedia.org/']")
    @CacheLookup
    private WebElement plattdtsch;

    @FindBy(css = "a[href='//pl.wikipedia.org/']")
    @CacheLookup
    private WebElement polski;

    @FindBy(css = "#js-lang-lists div:nth-of-type(1) ul li:nth-of-type(9) a")
    @CacheLookup
    private WebElement portugus;

    @FindBy(id = "js-link-box-pt")
    @CacheLookup
    private WebElement portugus1013000Artigos;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/Privacy_policy']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "a[href='//kaa.wikipedia.org/']")
    @CacheLookup
    private WebElement qaraqalpaqsha;

    @FindBy(css = "a[href='//kk.wikipedia.org/']")
    @CacheLookup
    private WebElement qazaqa;

    @FindBy(css = "a[href='//crh.wikipedia.org/']")
    @CacheLookup
    private WebElement qrmtatarca;

    @FindBy(id = "js-lang-list-button")
    @CacheLookup
    private WebElement readWikipediaInYourLanguage;

    @FindBy(css = "a[href='//ty.wikipedia.org/']")
    @CacheLookup
    private WebElement reoMohi;

    @FindBy(css = "a[href='//ksh.wikipedia.org/']")
    @CacheLookup
    private WebElement ripoarisch;

    @FindBy(css = "a[href='//rmy.wikipedia.org/']")
    @CacheLookup
    private WebElement romani;

    @FindBy(css = "a[href='//ro.wikipedia.org/']")
    @CacheLookup
    private WebElement romn;

    @FindBy(css = "a[href='//rm.wikipedia.org/']")
    @CacheLookup
    private WebElement rumantsch;

    @FindBy(css = "a[href='//qu.wikipedia.org/']")
    @CacheLookup
    private WebElement runaSimi;

    @FindBy(css = "a[href='//sc.wikipedia.org/']")
    @CacheLookup
    private WebElement sardu;

    @FindBy(css = "a[href='//sco.wikipedia.org/']")
    @CacheLookup
    private WebElement scots;

    @FindBy(css = "button.pure-button.pure-button-primary-progressive")
    @CacheLookup
    private WebElement search;

    @FindBy(id = "searchInput")
    @CacheLookup
    private WebElement searchWikipedia;

    @FindBy(css = "a[href='//stq.wikipedia.org/']")
    @CacheLookup
    private WebElement seeltersk;

    @FindBy(css = "a[href='//st.wikipedia.org/']")
    @CacheLookup
    private WebElement sesotho;

    @FindBy(css = "a[href='//nso.wikipedia.org/']")
    @CacheLookup
    private WebElement sesothoSaLeboa;

    @FindBy(css = "a[href='//tn.wikipedia.org/']")
    @CacheLookup
    private WebElement setswana;

    @FindBy(css = "a[href='//sq.wikipedia.org/']")
    @CacheLookup
    private WebElement shqip;

    @FindBy(css = "a[href='//scn.wikipedia.org/']")
    @CacheLookup
    private WebElement sicilianu;

    @FindBy(css = "a[href='//simple.wikipedia.org/']")
    @CacheLookup
    private WebElement simpleEnglish;

    @FindBy(css = "a[href='//ceb.wikipedia.org/']")
    @CacheLookup
    private WebElement sinugboanongBinisaya;

    @FindBy(css = "a[href='//ss.wikipedia.org/']")
    @CacheLookup
    private WebElement siswati;

    @FindBy(css = "a[href='//is.wikipedia.org/']")
    @CacheLookup
    private WebElement slenska;

    @FindBy(css = "a[href='//sk.wikipedia.org/']")
    @CacheLookup
    private WebElement slovenina1;

    @FindBy(css = "a[href='//sl.wikipedia.org/']")
    @CacheLookup
    private WebElement slovenina2;

    @FindBy(css = "a[href='//sg.wikipedia.org/']")
    @CacheLookup
    private WebElement sng;

    @FindBy(css = "a[href='//so.wikipedia.org/']")
    @CacheLookup
    private WebElement soomaaliga;

    @FindBy(css = "a[href='//srn.wikipedia.org/']")
    @CacheLookup
    private WebElement sranantongo;

    @FindBy(css = "a[href='//sr.wikipedia.org/']")
    @CacheLookup
    private WebElement srpski;

    @FindBy(css = "a[href='//sh.wikipedia.org/']")
    @CacheLookup
    private WebElement srpskohrvatski;

    @FindBy(css = "a[title='suomi']")
    @CacheLookup
    private WebElement suomi;

    @FindBy(css = "a[href='//sv.wikipedia.org/']")
    @CacheLookup
    private WebElement svenska;

    @FindBy(css = "a[href='//tl.wikipedia.org/']")
    @CacheLookup
    private WebElement tagalog;

    @FindBy(css = "a[href='//kab.wikipedia.org/']")
    @CacheLookup
    private WebElement taqbaylit;

    @FindBy(css = "a[href='//roa-tara.wikipedia.org/']")
    @CacheLookup
    private WebElement tarandne;

    @FindBy(css = "a[href='//tt.wikipedia.org/']")
    @CacheLookup
    private WebElement tatara;

    @FindBy(css = "a[href='//meta.wikimedia.org/wiki/Terms_of_Use']")
    @CacheLookup
    private WebElement termsOfUse;

    @FindBy(css = "a[href='//tet.wikipedia.org/']")
    @CacheLookup
    private WebElement tetun;

    @FindBy(css = "a[href='//vi.wikipedia.org/']")
    @CacheLookup
    private WebElement tingVit;

    @FindBy(css = "a[href='//tpi.wikipedia.org/']")
    @CacheLookup
    private WebElement tokPisin;

    @FindBy(css = "a[title='Turkce']")
    @CacheLookup
    private WebElement trke;

    @FindBy(css = "a[href='//tk.wikipedia.org/']")
    @CacheLookup
    private WebElement trkmene;

    @FindBy(css = "a[href='//chy.wikipedia.org/']")
    @CacheLookup
    private WebElement tshesenstsestotse;

    @FindBy(css = "a[href='//ve.wikipedia.org/']")
    @CacheLookup
    private WebElement tshivena;

    @FindBy(css = "a[href='//tw.wikipedia.org/']")
    @CacheLookup
    private WebElement twi;

    @FindBy(css = "a[href='//za.wikipedia.org/']")
    @CacheLookup
    private WebElement vahcuengh;

    @FindBy(css = "a[href='//vep.wikipedia.org/']")
    @CacheLookup
    private WebElement vepsn;

    @FindBy(css = "a[href='//vec.wikipedia.org/']")
    @CacheLookup
    private WebElement vneto;

    @FindBy(css = "a[href='//vo.wikipedia.org/']")
    @CacheLookup
    private WebElement volapk;

    @FindBy(css = "a[href='//fiu-vro.wikipedia.org/']")
    @CacheLookup
    private WebElement vro;

    @FindBy(css = "a[href='//wa.wikipedia.org/']")
    @CacheLookup
    private WebElement walon;

    @FindBy(css = "a[href='//de.wikipedia.org/wiki/Wikipedia:Sprachen']")
    @CacheLookup
    private WebElement weitereSprachen;

    @FindBy(css = "a[href='//vls.wikipedia.org/']")
    @CacheLookup
    private WebElement westvlams;

    @FindBy(css = "a[href='//www.wikibooks.org/']")
    @CacheLookup
    private WebElement wikibooksFreeTextbooks;

    @FindBy(css = "a[href='//www.wikidata.org/']")
    @CacheLookup
    private WebElement wikidataFreeKnowledgeBase;

    @FindBy(css = "a[href='//wikimediafoundation.org/']")
    @CacheLookup
    private WebElement wikimediaFoundation;

    @FindBy(css = "a[href='//www.wikinews.org/']")
    @CacheLookup
    private WebElement wikinewsFreeNewsSource;

    @FindBy(css = "a[href='//www.wikiquote.org/']")
    @CacheLookup
    private WebElement wikiquoteFreeQuoteCompendium;

    @FindBy(css = "a[href='//www.wikisource.org/']")
    @CacheLookup
    private WebElement wikisourceFreeLibrary;

    @FindBy(css = "a[href='//species.wikimedia.org/']")
    @CacheLookup
    private WebElement wikispeciesFreeSpeciesDirectory;

    @FindBy(css = "a[href='//www.wikiversity.org/']")
    @CacheLookup
    private WebElement wikiversityFreeCourseMaterials;

    @FindBy(css = "a[href='//www.wikivoyage.org/']")
    @CacheLookup
    private WebElement wikivoyageFreeTravelGuide;

    @FindBy(css = "a[href='//www.wiktionary.org/']")
    @CacheLookup
    private WebElement wiktionaryFreeDictionary;

    @FindBy(css = "a[href='//war.wikipedia.org/']")
    @CacheLookup
    private WebElement winaray;

    @FindBy(css = "a[href='//wo.wikipedia.org/']")
    @CacheLookup
    private WebElement wolof;

    @FindBy(css = "a[href='//ts.wikipedia.org/']")
    @CacheLookup
    private WebElement xitsonga;

    @FindBy(css = "a[href='//yo.wikipedia.org/']")
    @CacheLookup
    private WebElement yorb;

    @FindBy(css = "a[title='Zazaki']")
    @CacheLookup
    private WebElement zazaki;

    @FindBy(css = "a[href='//zea.wikipedia.org/']")
    @CacheLookup
    private WebElement zeuws;

    public Wikipedia() {
    }

    public Wikipedia(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public Wikipedia(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public Wikipedia(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on 71 000 Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia click000Link71() {
        _00071.click();
        return this;
    }

    /**
     * Click on 1 073 000 Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia click073000Link1() {
        _0730001.click();
        return this;
    }

    /**
     * Click on 1 168 000 Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia click168000Link1() {
        _1680001.click();
        return this;
    }

    /**
     * Click on 1 568 000 Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia click568000Link1() {
        _5680001.click();
        return this;
    }

    /**
     * Click on Afaan Oromoo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAfaanOromooLink() {
        afaanOromoo.click();
        return this;
    }

    /**
     * Click on Afrikaans Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAfrikaansLink() {
        afrikaans.click();
        return this;
    }

    /**
     * Click on Akan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAkanLink() {
        akan.click();
        return this;
    }

    /**
     * Click on Alemannisch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAlemannischLink() {
        alemannisch.click();
        return this;
    }

    /**
     * Click on Aliaj Lingvoj Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAliajLingvojLink() {
        aliajLingvoj.click();
        return this;
    }

    /**
     * Click on Aragons Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAragonsLink() {
        aragons.click();
        return this;
    }

    /**
     * Click on Armneashce Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickArmneashceLink() {
        armneashce.click();
        return this;
    }

    /**
     * Click on Arpitan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickArpitanLink() {
        arpitan.click();
        return this;
    }

    /**
     * Click on Ass Bekee Mab Ass Oyibo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAssBekeeMabAssOyiboLink() {
        assBekeeMabAssOyibo.click();
        return this;
    }

    /**
     * Click on Asturianu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAsturianuLink() {
        asturianu.click();
        return this;
    }

    /**
     * Click on Autres Langues Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAutresLanguesLink() {
        autresLangues.click();
        return this;
    }

    /**
     * Click on Avae Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAvaeLink() {
        avae.click();
        return this;
    }

    /**
     * Click on Aymar Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAymarLink() {
        aymar.click();
        return this;
    }

    /**
     * Click on Azrbaycanca Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickAzrbaycancaLink() {
        azrbaycanca.click();
        return this;
    }

    /**
     * Click on Bahasa Banjar Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBahasaBanjarLink() {
        bahasaBanjar.click();
        return this;
    }

    /**
     * Click on Bahasa Indonesia Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBahasaIndonesiaLink() {
        bahasaIndonesia.click();
        return this;
    }

    /**
     * Click on Bahasa Melayu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBahasaMelayuLink() {
        bahasaMelayu.click();
        return this;
    }

    /**
     * Click on Bahaso Minangkabau Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBahasoMinangkabauLink() {
        bahasoMinangkabau.click();
        return this;
    }

    /**
     * Click on Bahsa Ach Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBahsaAchLink() {
        bahsaAch.click();
        return this;
    }

    /**
     * Click on Bamanankan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBamanankanLink() {
        bamanankan.click();
        return this;
    }

    /**
     * Click on Basa Banyumasan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBasaBanyumasanLink() {
        basaBanyumasan.click();
        return this;
    }

    /**
     * Click on Basa Sunda Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBasaSundaLink() {
        basaSunda.click();
        return this;
    }

    /**
     * Click on Basa Ugi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBasaUgiLink() {
        basaUgi.click();
        return this;
    }

    /**
     * Click on Bikol Central Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBikolCentralLink() {
        bikolCentral.click();
        return this;
    }

    /**
     * Click on Bislama Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBislamaLink() {
        bislama.click();
        return this;
    }

    /**
     * Click on Bnlmg Hlo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBnlmgHloLink() {
        bnlmgHlo.click();
        return this;
    }

    /**
     * Click on Boarisch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBoarischLink() {
        boarisch.click();
        return this;
    }

    /**
     * Click on Bokml Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBokmlLink() {
        bokml.click();
        return this;
    }

    /**
     * Click on Bosanski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBosanskiLink() {
        bosanski.click();
        return this;
    }

    /**
     * Click on Brezhoneg Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickBrezhonegLink() {
        brezhoneg.click();
        return this;
    }

    /**
     * Click on Catal Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickCatalLink() {
        catal.click();
        return this;
    }

    /**
     * Click on Chamoru Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickChamoruLink() {
        chamoru.click();
        return this;
    }

    /**
     * Click on Chavacano De Zamboanga Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickChavacanoDeZamboangaLink() {
        chavacanoDeZamboanga.click();
        return this;
    }

    /**
     * Click on Chichewa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickChichewaLink() {
        chichewa.click();
        return this;
    }

    /**
     * Click on Chishona Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickChishonaLink() {
        chishona.click();
        return this;
    }

    /**
     * Click on Chitumbuka Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickChitumbukaLink() {
        chitumbuka.click();
        return this;
    }

    /**
     * Click on Commons Freely Usable Photos More Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickCommonsFreelyUsablePhotosLink() {
        commonsFreelyUsablePhotos.click();
        return this;
    }

    /**
     * Click on Corsu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickCorsuLink() {
        corsu.click();
        return this;
    }

    /**
     * Click on Creative Commons Attributionsharealike License Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickCreativeCommonsAttributionsharealikeLicenseLink() {
        creativeCommonsAttributionsharealikeLicense.click();
        return this;
    }

    /**
     * Click on Cymraeg Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickCymraegLink() {
        cymraeg.click();
        return this;
    }

    /**
     * Click on Dansk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDanskLink() {
        dansk.click();
        return this;
    }

    /**
     * Click on Davvismegiella Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDavvismegiellaLink() {
        davvismegiella.click();
        return this;
    }

    /**
     * Click on Deitsch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDeitschLink() {
        deitsch.click();
        return this;
    }

    /**
     * Click on Deutsch 2 343 000 Artikel Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDeutsch2343000ArtikelLink() {
        deutsch2343000Artikel.click();
        return this;
    }

    /**
     * Click on Deutsch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDeutschLink() {
        deutsch.click();
        return this;
    }

    /**
     * Click on Din Bizaad Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDinBizaadLink() {
        dinBizaad.click();
        return this;
    }

    /**
     * Click on Dolnoserbski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDolnoserbskiLink() {
        dolnoserbski.click();
        return this;
    }

    /**
     * Click on Dorerin Naoero Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDorerinNaoeroLink() {
        dorerinNaoero.click();
        return this;
    }

    /**
     * Click on Download Wikipedia For Android Or Ios Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDownloadWikipediaForAndroidOrLink() {
        downloadWikipediaForAndroidOr.click();
        return this;
    }

    /**
     * Click on Dzhudezmo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickDzhudezmoLink() {
        dzhudezmo.click();
        return this;
    }

    /**
     * Click on Eegbe Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEegbeLink() {
        eegbe.click();
        return this;
    }

    /**
     * Click on Eesti Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEestiLink() {
        eesti.click();
        return this;
    }

    /**
     * Click on Emaitka Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEmaitkaLink() {
        emaitka.click();
        return this;
    }

    /**
     * Click on Emiglinrumagnl Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEmiglinrumagnlLink() {
        emiglinrumagnl.click();
        return this;
    }

    /**
     * Click on English 5 930 000 Articles Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEnglish5930000ArticlesLink() {
        english5930000Articles.click();
        return this;
    }

    /**
     * Click on English Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEnglishLink() {
        english.click();
        return this;
    }

    /**
     * Click on Espaol 1 545 000 Artculos Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEspaol1545000ArtculosLink() {
        espaol1545000Artculos.click();
        return this;
    }

    /**
     * Click on Espaol Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEspaolLink() {
        espaol.click();
        return this;
    }

    /**
     * Click on Esperanto Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEsperantoLink() {
        esperanto.click();
        return this;
    }

    /**
     * Click on Estremeu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEstremeuLink() {
        estremeu.click();
        return this;
    }

    /**
     * Click on Etina Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEtinaLink() {
        etina.click();
        return this;
    }

    /**
     * Click on Euskara Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickEuskaraLink() {
        euskara.click();
        return this;
    }

    /**
     * Click on Faka Tonga Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFakaTongaLink() {
        fakaTonga.click();
        return this;
    }

    /**
     * Click on Fiji Hindi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFijiHindiLink() {
        fijiHindi.click();
        return this;
    }

    /**
     * Click on Franais 2 139 000 Articles Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFranais2139000ArticlesLink() {
        franais2139000Articles.click();
        return this;
    }

    /**
     * Click on Franais Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFranaisLink() {
        franais.click();
        return this;
    }

    /**
     * Click on Froyskt Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFroysktLink() {
        froyskt.click();
        return this;
    }

    /**
     * Click on Frysk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFryskLink() {
        frysk.click();
        return this;
    }

    /**
     * Click on Fulfulde Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFulfuldeLink() {
        fulfulde.click();
        return this;
    }

    /**
     * Click on Furlan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickFurlanLink() {
        furlan.click();
        return this;
    }

    /**
     * Click on Gaeilge Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGaeilgeLink() {
        gaeilge.click();
        return this;
    }

    /**
     * Click on Gaelg Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGaelgLink() {
        gaelg.click();
        return this;
    }

    /**
     * Click on Gagana Smoa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGaganaSmoaLink() {
        gaganaSmoa.click();
        return this;
    }

    /**
     * Click on Gagauz Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGagauzLink() {
        gagauz.click();
        return this;
    }

    /**
     * Click on Galego Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGalegoLink() {
        galego.click();
        return this;
    }

    /**
     * Click on Gidhlig Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGidhligLink() {
        gidhlig.click();
        return this;
    }

    /**
     * Click on Gky Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickGkyLink() {
        gky.click();
        return this;
    }

    /**
     * Click on Hakkng Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickHakkngLink() {
        hakkng.click();
        return this;
    }

    /**
     * Click on Hausa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickHausaLink() {
        hausa.click();
        return this;
    }

    /**
     * Click on Hornjoserbsce Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickHornjoserbsceLink() {
        hornjoserbsce.click();
        return this;
    }

    /**
     * Click on Hrvatski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickHrvatskiLink() {
        hrvatski.click();
        return this;
    }

    /**
     * Click on Ido Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickIdoLink() {
        ido.click();
        return this;
    }

    /**
     * Click on Ilokano Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickIlokanoLink() {
        ilokano.click();
        return this;
    }

    /**
     * Click on Interlingua Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickInterlinguaLink() {
        interlingua.click();
        return this;
    }

    /**
     * Click on Interlingue Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickInterlingueLink() {
        interlingue.click();
        return this;
    }

    /**
     * Click on Inuktitut Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickInuktitutLink() {
        inuktitut.click();
        return this;
    }

    /**
     * Click on Isixhosa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickIsixhosaLink() {
        isixhosa.click();
        return this;
    }

    /**
     * Click on Isizulu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickIsizuluLink() {
        isizulu.click();
        return this;
    }

    /**
     * Click on Italiano 1 552 000 Voci Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickItaliano1552000VociLink() {
        italiano1552000Voci.click();
        return this;
    }

    /**
     * Click on Italiano Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickItalianoLink() {
        italiano.click();
        return this;
    }

    /**
     * Click on Iupiak Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickIupiakLink() {
        iupiak.click();
        return this;
    }

    /**
     * Click on Jawa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickJawaLink() {
        jawa.click();
        return this;
    }

    /**
     * Click on Kalaallisut Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKalaallisutLink() {
        kalaallisut.click();
        return this;
    }

    /**
     * Click on Kapampangan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKapampanganLink() {
        kapampangan.click();
        return this;
    }

    /**
     * Click on Kaszbsczi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKaszbscziLink() {
        kaszbsczi.click();
        return this;
    }

    /**
     * Click on Kernewek Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKernewekLink() {
        kernewek.click();
        return this;
    }

    /**
     * Click on Kinyarwanda Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKinyarwandaLink() {
        kinyarwanda.click();
        return this;
    }

    /**
     * Click on Kirundi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKirundiLink() {
        kirundi.click();
        return this;
    }

    /**
     * Click on Kiswahili Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKiswahiliLink() {
        kiswahili.click();
        return this;
    }

    /**
     * Click on Kompletna Lista Jzykw Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKompletnaListaJzykwLink() {
        kompletnaListaJzykw.click();
        return this;
    }

    /**
     * Click on Kongo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKongoLink() {
        kongo.click();
        return this;
    }

    /**
     * Click on Konknni Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKonknniLink() {
        konknni.click();
        return this;
    }

    /**
     * Click on Kreyl Ayisyen Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKreylAyisyenLink() {
        kreylAyisyen.click();
        return this;
    }

    /**
     * Click on Kurd Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickKurdLink() {
        kurd.click();
        return this;
    }

    /**
     * Click on Latgau Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLatgauLink() {
        latgau.click();
        return this;
    }

    /**
     * Click on Latina Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLatinaLink() {
        latina.click();
        return this;
    }

    /**
     * Click on Latvieu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLatvieuLink() {
        latvieu.click();
        return this;
    }

    /**
     * Click on Lelo Hawaii Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLeloHawaiiLink() {
        leloHawaii.click();
        return this;
    }

    /**
     * Click on Lgure Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLgureLink() {
        lgure.click();
        return this;
    }

    /**
     * Click on Lietuvi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLietuviLink() {
        lietuvi.click();
        return this;
    }

    /**
     * Click on Limburgs Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLimburgsLink() {
        limburgs.click();
        return this;
    }

    /**
     * Click on Lingla Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLinglaLink() {
        lingla.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink1() {
        _1.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink1() {
        _1.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink10() {
        _10.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink11() {
        _11.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink12() {
        _12.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink13() {
        _13.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink14() {
        _14.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink15() {
        _15.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink4() {
        _4.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink5() {
        _5.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink6() {
        _6.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink7() {
        _7.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink8() {
        _8.click();
        return this;
    }

    /**
     * Click on  Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLink9() {
        _9.click();
        return this;
    }

    /**
     * Click on Lnski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLnskiLink() {
        lnski.click();
        return this;
    }

    /**
     * Click on Lojban Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLojbanLink() {
        lojban.click();
        return this;
    }

    /**
     * Click on Ltzebuergesch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLtzebuergeschLink() {
        ltzebuergesch.click();
        return this;
    }

    /**
     * Click on Luganda Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLugandaLink() {
        luganda.click();
        return this;
    }

    /**
     * Click on Lumbaart Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickLumbaartLink() {
        lumbaart.click();
        return this;
    }

    /**
     * Click on Magyar Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMagyarLink() {
        magyar.click();
        return this;
    }

    /**
     * Click on Malagasy Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMalagasyLink() {
        malagasy.click();
        return this;
    }

    /**
     * Click on Malti Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMaltiLink() {
        malti.click();
        return this;
    }

    /**
     * Click on Mediawiki Free Open Wiki Application Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMediawikiFreeOpenWikiLink() {
        mediawikiFreeOpenWiki.click();
        return this;
    }

    /**
     * Click on Metawiki Community Coordination Documentation Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMetawikiCommunityCoordinationDocumentationLink() {
        metawikiCommunityCoordinationDocumentation.click();
        return this;
    }

    /**
     * Click on Mirands Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMirandsLink() {
        mirands.click();
        return this;
    }

    /**
     * Click on Mngdngng Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMngdngngLink() {
        mngdngng.click();
        return this;
    }

    /**
     * Click on Mori Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickMoriLink() {
        mori.click();
        return this;
    }

    /**
     * Click on Na Vosa Vakaviti Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNaVosaVakavitiLink() {
        naVosaVakaviti.click();
        return this;
    }

    /**
     * Click on Nederlands Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNederlandsLink() {
        nederlands.click();
        return this;
    }

    /**
     * Click on Nedersaksisch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNedersaksischLink() {
        nedersaksisch.click();
        return this;
    }

    /**
     * Click on Nglisc Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNgliscLink() {
        nglisc.click();
        return this;
    }

    /**
     * Click on Ngn Ng Khc Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNgnNgKhcLink() {
        ngnNgKhc.click();
        return this;
    }

    /**
     * Click on Nhiyawwin Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNhiyawwinLink() {
        nhiyawwin.click();
        return this;
    }

    /**
     * Click on Nhuatlahtlli Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNhuatlahtlliLink() {
        nhuatlahtlli.click();
        return this;
    }

    /**
     * Click on Nnapulitano Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNnapulitanoLink() {
        nnapulitano.click();
        return this;
    }

    /**
     * Click on Nordfriisk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNordfriiskLink() {
        nordfriisk.click();
        return this;
    }

    /**
     * Click on Norfuk Pitkern Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNorfukPitkernLink() {
        norfukPitkern.click();
        return this;
    }

    /**
     * Click on Nouormand Normaund Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNouormandNormaundLink() {
        nouormandNormaund.click();
        return this;
    }

    /**
     * Click on Novial Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNovialLink() {
        novial.click();
        return this;
    }

    /**
     * Click on Nynorsk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickNynorskLink() {
        nynorsk.click();
        return this;
    }

    /**
     * Click on Occitan Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickOccitanLink() {
        occitan.click();
        return this;
    }

    /**
     * Click on Other Languages Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickOtherLanguagesLink() {
        otherLanguages.click();
        return this;
    }

    /**
     * Click on Otros Idiomas Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickOtrosIdiomasLink() {
        otrosIdiomas.click();
        return this;
    }

    /**
     * Click on Ozbekcha Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickOzbekchaLink() {
        ozbekcha.click();
        return this;
    }

    /**
     * Click on Pangasinn Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPangasinnLink() {
        pangasinn.click();
        return this;
    }

    /**
     * Click on Papiamentu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPapiamentuLink() {
        papiamentu.click();
        return this;
    }

    /**
     * Click on Pflzisch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPflzischLink() {
        pflzisch.click();
        return this;
    }

    /**
     * Click on Picard Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPicardLink() {
        picard.click();
        return this;
    }

    /**
     * Click on Piemontis Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPiemontisLink() {
        piemontis.click();
        return this;
    }

    /**
     * Click on Plattdtsch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPlattdtschLink() {
        plattdtsch.click();
        return this;
    }

    /**
     * Click on Polski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPolskiLink() {
        polski.click();
        return this;
    }

    /**
     * Click on Portugus 1 013 000 Artigos Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPortugus1013000ArtigosLink() {
        portugus1013000Artigos.click();
        return this;
    }

    /**
     * Click on Portugus Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPortugusLink() {
        portugus.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Qaraqalpaqsha Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickQaraqalpaqshaLink() {
        qaraqalpaqsha.click();
        return this;
    }

    /**
     * Click on Qazaqa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickQazaqaLink() {
        qazaqa.click();
        return this;
    }

    /**
     * Click on Qrmtatarca Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickQrmtatarcaLink() {
        qrmtatarca.click();
        return this;
    }

    /**
     * Click on Read Wikipedia In Your Language Button.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickReadWikipediaInYourLanguageButton() {
        readWikipediaInYourLanguage.click();
        return this;
    }

    /**
     * Click on Reo Mohi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickReoMohiLink() {
        reoMohi.click();
        return this;
    }

    /**
     * Click on Ripoarisch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickRipoarischLink() {
        ripoarisch.click();
        return this;
    }

    /**
     * Click on Romani Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickRomaniLink() {
        romani.click();
        return this;
    }

    /**
     * Click on Romn Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickRomnLink() {
        romn.click();
        return this;
    }

    /**
     * Click on Rumantsch Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickRumantschLink() {
        rumantsch.click();
        return this;
    }

    /**
     * Click on Runa Simi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickRunaSimiLink() {
        runaSimi.click();
        return this;
    }

    /**
     * Click on Sardu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSarduLink() {
        sardu.click();
        return this;
    }

    /**
     * Click on Scots Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickScotsLink() {
        scots.click();
        return this;
    }

    /**
     * Click on Search Button.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSearchButton() {
        search.click();
        return this;
    }

    /**
     * Click on Seeltersk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSeelterskLink() {
        seeltersk.click();
        return this;
    }

    /**
     * Click on Sesotho Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSesothoLink() {
        sesotho.click();
        return this;
    }

    /**
     * Click on Sesotho Sa Leboa Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSesothoSaLeboaLink() {
        sesothoSaLeboa.click();
        return this;
    }

    /**
     * Click on Setswana Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSetswanaLink() {
        setswana.click();
        return this;
    }

    /**
     * Click on Shqip Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickShqipLink() {
        shqip.click();
        return this;
    }

    /**
     * Click on Sicilianu Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSicilianuLink() {
        sicilianu.click();
        return this;
    }

    /**
     * Click on Simple English Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSimpleEnglishLink() {
        simpleEnglish.click();
        return this;
    }

    /**
     * Click on Sinugboanong Binisaya Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSinugboanongBinisayaLink() {
        sinugboanongBinisaya.click();
        return this;
    }

    /**
     * Click on Siswati Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSiswatiLink() {
        siswati.click();
        return this;
    }

    /**
     * Click on Slenska Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSlenskaLink() {
        slenska.click();
        return this;
    }

    /**
     * Click on Slovenina Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSlovenina1Link() {
        slovenina1.click();
        return this;
    }

    /**
     * Click on Slovenina Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSlovenina2Link() {
        slovenina2.click();
        return this;
    }

    /**
     * Click on Sng Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSngLink() {
        sng.click();
        return this;
    }

    /**
     * Click on Soomaaliga Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSoomaaligaLink() {
        soomaaliga.click();
        return this;
    }

    /**
     * Click on Sranantongo Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSranantongoLink() {
        sranantongo.click();
        return this;
    }

    /**
     * Click on Srpski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSrpskiLink() {
        srpski.click();
        return this;
    }

    /**
     * Click on Srpskohrvatski Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSrpskohrvatskiLink() {
        srpskohrvatski.click();
        return this;
    }

    /**
     * Click on Suomi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSuomiLink() {
        suomi.click();
        return this;
    }

    /**
     * Click on Svenska Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickSvenskaLink() {
        svenska.click();
        return this;
    }

    /**
     * Click on Tagalog Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTagalogLink() {
        tagalog.click();
        return this;
    }

    /**
     * Click on Taqbaylit Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTaqbaylitLink() {
        taqbaylit.click();
        return this;
    }

    /**
     * Click on Tarandne Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTarandneLink() {
        tarandne.click();
        return this;
    }

    /**
     * Click on Tatara Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTataraLink() {
        tatara.click();
        return this;
    }

    /**
     * Click on Terms Of Use Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTermsOfUseLink() {
        termsOfUse.click();
        return this;
    }

    /**
     * Click on Tetun Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTetunLink() {
        tetun.click();
        return this;
    }

    /**
     * Click on Ting Vit Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTingVitLink() {
        tingVit.click();
        return this;
    }

    /**
     * Click on Tok Pisin Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTokPisinLink() {
        tokPisin.click();
        return this;
    }

    /**
     * Click on Trke Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTrkeLink() {
        trke.click();
        return this;
    }

    /**
     * Click on Trkmene Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTrkmeneLink() {
        trkmene.click();
        return this;
    }

    /**
     * Click on Tshesenstsestotse Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTshesenstsestotseLink() {
        tshesenstsestotse.click();
        return this;
    }

    /**
     * Click on Tshivena Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTshivenaLink() {
        tshivena.click();
        return this;
    }

    /**
     * Click on Twi Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickTwiLink() {
        twi.click();
        return this;
    }

    /**
     * Click on Vahcuengh Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickVahcuenghLink() {
        vahcuengh.click();
        return this;
    }

    /**
     * Click on Vepsn Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickVepsnLink() {
        vepsn.click();
        return this;
    }

    /**
     * Click on Vneto Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickVnetoLink() {
        vneto.click();
        return this;
    }

    /**
     * Click on Volapk Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickVolapkLink() {
        volapk.click();
        return this;
    }

    /**
     * Click on Vro Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickVroLink() {
        vro.click();
        return this;
    }

    /**
     * Click on Walon Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWalonLink() {
        walon.click();
        return this;
    }

    /**
     * Click on Weitere Sprachen Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWeitereSprachenLink() {
        weitereSprachen.click();
        return this;
    }

    /**
     * Click on Westvlams Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWestvlamsLink() {
        westvlams.click();
        return this;
    }

    /**
     * Click on Wikibooks Free Textbooks Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikibooksFreeTextbooksLink() {
        wikibooksFreeTextbooks.click();
        return this;
    }

    /**
     * Click on Wikidata Free Knowledge Base Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikidataFreeKnowledgeBaseLink() {
        wikidataFreeKnowledgeBase.click();
        return this;
    }

    /**
     * Click on Wikimedia Foundation Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikimediaFoundationLink() {
        wikimediaFoundation.click();
        return this;
    }

    /**
     * Click on Wikinews Free News Source Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikinewsFreeNewsSourceLink() {
        wikinewsFreeNewsSource.click();
        return this;
    }

    /**
     * Click on Wikiquote Free Quote Compendium Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikiquoteFreeQuoteCompendiumLink() {
        wikiquoteFreeQuoteCompendium.click();
        return this;
    }

    /**
     * Click on Wikisource Free Library Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikisourceFreeLibraryLink() {
        wikisourceFreeLibrary.click();
        return this;
    }

    /**
     * Click on Wikispecies Free Species Directory Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikispeciesFreeSpeciesDirectoryLink() {
        wikispeciesFreeSpeciesDirectory.click();
        return this;
    }

    /**
     * Click on Wikiversity Free Course Materials Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikiversityFreeCourseMaterialsLink() {
        wikiversityFreeCourseMaterials.click();
        return this;
    }

    /**
     * Click on Wikivoyage Free Travel Guide Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWikivoyageFreeTravelGuideLink() {
        wikivoyageFreeTravelGuide.click();
        return this;
    }

    /**
     * Click on Wiktionary Free Dictionary Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWiktionaryFreeDictionaryLink() {
        wiktionaryFreeDictionary.click();
        return this;
    }

    /**
     * Click on Winaray Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWinarayLink() {
        winaray.click();
        return this;
    }

    /**
     * Click on Wolof Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickWolofLink() {
        wolof.click();
        return this;
    }

    /**
     * Click on Xitsonga Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickXitsongaLink() {
        xitsonga.click();
        return this;
    }

    /**
     * Click on Yorb Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickYorbLink() {
        yorb.click();
        return this;
    }

    /**
     * Click on Zazaki Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickZazakiLink() {
        zazaki.click();
        return this;
    }

    /**
     * Click on Zeuws Link.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia clickZeuwsLink() {
        zeuws.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia fill() {
        setSearchWikipediaSearchField();
        setEnDropDownListField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to En Drop Down List field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia setEnDropDownListField() {
        return setEnDropDownListField(data.get("EN"));
    }

    /**
     * Set value to En Drop Down List field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia setEnDropDownListField(String enValue) {
        new Select(en).selectByVisibleText(enValue);
        return this;
    }

    /**
     * Set default value to Search Wikipedia Search field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia setSearchWikipediaSearchField() {
        return setSearchWikipediaSearchField(data.get("SEARCH_WIKIPEDIA"));
    }

    /**
     * Set value to Search Wikipedia Search field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia setSearchWikipediaSearchField(String searchWikipediaValue) {
        searchWikipedia.sendKeys(searchWikipediaValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia submit() {
        clickSearchButton();
        Wikipedia target = new Wikipedia(driver, data, timeout);
        PageFactory.initElements(driver, target);
        return target;
    }

    /**
     * Unset default value from En Drop Down List field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia unsetEnDropDownListField() {
        return unsetEnDropDownListField(data.get("EN"));
    }

    /**
     * Unset value from En Drop Down List field.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia unsetEnDropDownListField(String enValue) {
        new Select(en).deselectByVisibleText(enValue);
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the Wikipedia class instance.
     */
    public Wikipedia verifyPageLoaded() {
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
     * @return the Wikipedia class instance.
     */
    public Wikipedia verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
