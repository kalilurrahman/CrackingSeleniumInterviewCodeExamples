
/*
 * Img1
 * ***************************************************************
 */

 public WebElement getImg1Element() {
     return driver.findElement(By.cssSelector("img[alt='Hans Christian Gram’s 166th Birthday']"));
 }
 
 public void clickImg1() {
     getImg1Element().click();
 }
 
/*
 * Q
 * ***************************************************************
 */

 public WebElement getQElement() {
     return driver.findElement(By.name("q"));
 }

 public String getQ() {
     return getQElement().getAttribute("value");
 }
 
 public void setQ(String value) {
     getQElement().sendKeys(value);
 }

/*
 * Svg1
 * ***************************************************************
 */

 public WebElement getSvg1Element() {
     return driver.findElement(By.cssSelector("span[class*='nS8rZ'] > svg"));
 }
 
 public String getSvg1() {
     return getSvg1Element().getText();
 }

/*
 * Hb2Smf
 * ***************************************************************
 */

 public WebElement getHb2SmfElement() {
     return driver.findElement(By.cssSelector("span[class*='hb2Smf']"));
 }
 
 public String getHb2Smf() {
     return getHb2SmfElement().getText();
 }

/*
 * GoogleSearch
 * ***************************************************************
 */

 public WebElement getGoogleSearchElement() {
     return driver.findElement(By.xpath("(//input[@name='btnK'])[2]"));
 }
 
 public void clickGoogleSearch() {
     getGoogleSearchElement().click();
 }
 
/*
 * ImFeelingLucky
 * ***************************************************************
 */

 public WebElement getImFeelingLuckyElement() {
     return driver.findElement(By.xpath("(//input[@name='btnI'])[2]"));
 }
 
 public void clickImFeelingLucky() {
     getImFeelingLuckyElement().click();
 }
 
/*
 * SDkEp
 * ***************************************************************
 */

 public WebElement getSDkEpElement() {
     return driver.findElement(By.cssSelector("div[class*='SDkEP']"));
 }
 
 public String getSDkEp() {
     return getSDkEpElement().getText();
 }

/*
 * About
 * ***************************************************************
 */

 public WebElement getAboutElement() {
     return driver.findElement(By.linkText("About"));
 }
 
 public void clickAbout() {
     getAboutElement().click();
 }
 
/*
 * Fsettl
 * ***************************************************************
 */

 public WebElement getFsettlElement() {
     return driver.findElement(By.id("fsettl"));
 }
 
 public void clickFsettl() {
     getFsettlElement().click();
 }
 
/*
 * Gmail
 * ***************************************************************
 */

 public WebElement getGmailElement() {
     return driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
 }
 
 public void clickGmail() {
     getGmailElement().click();
 }
 