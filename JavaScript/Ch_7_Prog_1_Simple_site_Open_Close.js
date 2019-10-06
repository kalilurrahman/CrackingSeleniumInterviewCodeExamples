var webdriver = require('selenium-webdriver'),
    By = webdriver.By,
    until = webdriver.until;
var driver = new webdriver.Builder().forBrowser('chrome').build();
driver.get('https://sites.google.com/view/crackingseleniuminterview/home');
console.log('Opening  Web site');
// Take a Screenshot
var fs = require('fs')
var err = ''
console.log('Taking Screenshot of the results');
driver.sleep(5000).then(function() {
  driver.getTitle().then(function(title) {
    driver.takeScreenshot().then( function (ScreenShotImage, err) {
        fs.writeFile('simple_screen_shot_1.png', ScreenShotImage, 'base64', function (error) { if (error != null) {
            console.log("Error occured during screenshot" + error);
            err = error;
          }
        });
      }
    );
    if (err  != null) { console.log('Test passed');
    } else { console.log('Test failed');
    }
    driver.quit();
  });
});