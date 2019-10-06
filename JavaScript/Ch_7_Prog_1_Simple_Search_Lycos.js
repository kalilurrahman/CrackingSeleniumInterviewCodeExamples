var webdriver = require('selenium-webdriver'),
    By = webdriver.By,
    until = webdriver.until;

var driver = new webdriver.Builder()
    .forBrowser('chrome')
    .build();

driver.get("http://www.lycos.com");

driver.getTitle().then(function (title) {
    console.log('Page title is: ' + title);
});

var element = driver.findElement(webdriver.By.className('search-input'));
element.sendKeys('Selenium');
element.sendKeys(webdriver.Key.ENTER);

driver.wait(function() {
  return driver.getTitle().then(function(title) {
    return title.toLowerCase().lastIndexOf('selenium', 0) === 0;
  });
}, 3000);

driver.getTitle().then(function(title) {
  console.log('Page title is: ' + title);
});

driver.quit();