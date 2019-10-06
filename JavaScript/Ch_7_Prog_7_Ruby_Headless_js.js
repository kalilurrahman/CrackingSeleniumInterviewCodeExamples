const chrome = require('../chrome');
const firefox = require('../firefox');
const {Builder, By, Key, until} = require('..');

const width = 1280;
const height = 800;

let driver = new Builder()
    .forBrowser('chrome')
    .setChromeOptions(
        new chrome.Options().headless().windowSize({width, height}))
    .setFirefoxOptions(
        new firefox.Options().headless().windowSize({width, height}))
    .build();

let fs = require('fs');

driver.get('https://sites.google.com/view/crackingseleniuminterview/home')
    .then(_ => 
       driver.takeScreenshot(fs.writeFile('Ch_7_Prog_7_js_Headless.png','base64')))
    .then(
        _ => driver.quit(),
        e => driver.quit().then(() => { throw e; }));



