var webdriver = require('selenium-webdriver'),
    By = webdriver.By,
    until = webdriver.until;

var driver = new webdriver.Builder()
    .forBrowser('chrome')
    .build();

driver.get('https://www.bing.com');
console.log('Opening Bing Web site');
driver.findElement(By.xpath("/html//input[@id='sb_form_q']")).sendKeys('webdriver');
driver.sleep(3000).then(function() {
    driver.findElement(By.xpath("/html//input[@id='sb_form_q']")).sendKeys(webdriver.Key.TAB);
}); 
console.log('Typing the Search String');
// Take a Screenshot
var fs = require('fs')
driver.takeScreenshot().then(
  function (ScreenShotImage, err) {
    fs.writeFile('bing_screen_shot_1.png', ScreenShotImage, 'base64', function (error) {
      if (error != null)
        console.log("Error occured during screenshot" + error);
    });
  }
);
// Let's click search
driver.findElement(By.xpath("/html//input[@id='sb_form_go']")).click();
// New screen appears 
console.log('Taking Screenshot of the results');
driver.sleep(5000).then(function() {
  driver.getTitle().then(function(title) {
    // Take another screenshot
    driver.takeScreenshot().then(
      function (ScreenShotImage, err) {
        fs.writeFile('bing_screen_shot_2.png', ScreenShotImage, 'base64', function (error) {
          if (error != null)
            console.log("Error occured during screenshot" + error);
        });
      }
    );

    if (title === 'webdriver - Bing') {
      console.log('Test passed');
    } else {
      console.log('Test failed');
    }
    driver.quit();
  });
});