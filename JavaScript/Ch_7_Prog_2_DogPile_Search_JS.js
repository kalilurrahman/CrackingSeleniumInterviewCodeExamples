const { Builder, By, Key, until } = require('selenium-webdriver')
const assert = require('assert')

describe('Untitled', function() {
  this.timeout(600000)
  let driver
  let vars
  beforeEach(async function() {
    driver = await new Builder().forBrowser('chrome').build()
    vars = {}
  })
  afterEach(async function() {
    await driver.quit();
  })
  it('Untitled', async function() {
    // Test name: Untitled
    // Step # | name | target | value | comment
    // 1 | open | / |  |
    await driver.get("https://www.dogpile.com/")
    var fs = require('fs')
    // 2 | Take a Screenshot
    await driver.takeScreenshot().then(
        function (ScreenShotImage, err) {
            fs.writeFile('dogpile_screen_shot_1.png', ScreenShotImage, 'base64', function (error) {
                  if (error != null)
                      console.log("Error occured during screenshot" + error);
            });
        }
    );
    // 3 | click | id=q |  |
    await driver.findElement(By.id("q")).click()
    // 4 | type | id=q | selenium |
    await driver.findElement(By.id("q")).sendKeys("selenium")
    // 5 | sendKeys | id=q | ${KEY_ENTER} |
    await driver.findElement(By.id("q")).sendKeys(Key.ENTER)
    // 6 | Take a Screenshot
    await driver.takeScreenshot().then(
        function (ScreenShotImage, err) {
            fs.writeFile('dogpile_screen_shot_2.png', ScreenShotImage, 'base64', function (error) {
                  if (error != null)
                      console.log("Error occured during screenshot" + error);
            });
        }
    );
    // 7 | click | css=.aylf-bing-sidebar__result:nth-child(9) > .aylf-bing-sidebar__title |  |
    await driver.findElement(By.css(".aylf-bing-sidebar__result:nth-child(9) > .aylf-bing-sidebar__title")).click()
    // 8 | close |  |  |
    await driver.close()
  })
})
