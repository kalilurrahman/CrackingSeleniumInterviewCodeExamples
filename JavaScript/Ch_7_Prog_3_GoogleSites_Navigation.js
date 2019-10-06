/**
 * Script Name: {Ch_7_Prog_3_GoogleSites_Navigation}
 * 
 * Generated using  New Relic Synthetics Formatter for Katalon
 *
 * Feel free to explore, or check out the full documentation
 * https://docs.newrelic.com/docs/synthetics/new-relic-synthetics/scripting-monitors/writing-scripted-browsers
 * for details.
 */

/** CONFIGURATIONS **/

// Theshold for duration of entire script - fails test if script lasts longer than X (in ms)
var ScriptTimeout = 180000;
// Script-wide timeout for all wait and waitAndFind functions (in ms)
var DefaultTimeout = 30000;
// Change to any User Agent you want to use.
// Leave as "default" or empty to use the Synthetics default.
var UserAgent = "default";

/** HELPER VARIABLES AND FUNCTIONS **/

const assert = require('assert'),
	By = $driver.By,
	browser = $browser.manage()
/** BEGINNING OF SCRIPT **/

console.log('Starting synthetics script: {Ch_7_Prog_3_GoogleSites_Navigation}');
console.log('Default timeout is set to ' + (DefaultTimeout/1000) + ' seconds');

// Setting User Agent is not then-able, so we do this first (if defined and not default)
if (UserAgent && (0 !== UserAgent.trim().length) && (UserAgent != 'default')) {
  $browser.addHeader('User-Agent', UserAgent);
  console.log('Setting User-Agent to ' + UserAgent);
}

// Get browser capabilities and do nothing with it, so that we start with a then-able command
$browser.getCapabilities().then(function () { })
	.then(() => {
            logger.log(1, "https://sites.google.com/view/crackingseleniuminterview/home");
            return $browser.get("https://sites.google.com/view/crackingseleniuminterview/home");
        })
	.then(() => {
            logger.log(2, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Selenium Automation\'])[4]/following::p[2]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[4]/following::p[2]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(3, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Selenium Automation\'])[2]/following::a[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[2]/following::a[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(4, "clickElement css=svg.HSFYNb.iWs3gf");
            return $browser.waitForAndFindElement(By.css("svg.HSFYNb.iWs3gf"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(5, "type login");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[2]/preceding::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('login');
                })
        })
	.then(() => {
            logger.log(6, "sendKeys $driver.Key.ENTER");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Selenium Automation'])[2]/preceding::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.sendKeys($driver.Key.ENTER);
                })
        })
	.then(() => {
            logger.log(7, "clickElement link=login - Selenium Automation");
            return $browser.waitForAndFindElement(By.linkText("login - Selenium Automation"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })


	// WARNING: unsupported command close. Object= {"command":"close","target":"win_ser_local","value":""}

	.then(function() {
		logger.end();
		console.log('Browser script execution SUCCEEDED.');
	}, function(err) {
		logger.end();
		console.log ('Browser script execution FAILED.');
		throw(err);
	});


//** Export Functions
const logger=(function (timeout=3000, mode='production') {

    var startTime = Date.now(),
        stepStartTime = Date.now(),
        prevMsg = '',
        prevStep = 0;


    if (typeof $util == 'undefined'  ){
        $util = {
            insights: {
                set: (msg) => {
                    console.log(`dryRun: sending to Insights using ${msg}`)
                }
            }
        }

    }

    function log(thisStep, thisMsg) {

        if (thisStep > prevStep && prevStep != 0) {
            end()
        }

        stepStartTime = Date.now() - startTime;

        if (mode != "production") {
            stepStartTime = 0

        }

        console.log(`Step ${thisStep}: ${thisMsg} STARTED at ${stepStartTime}ms.`);

        prevMsg = thisMsg;
        prevStep = thisStep;

    }

    function end() {
        var totalTimeElapsed = Date.now() - startTime;
        var prevStepTimeElapsed = totalTimeElapsed - stepStartTime;

        if (mode != 'production') {
            prevStepTimeElapsed = 0
            totalTimeElapsed = 0
        }

        console.log(`Step ${prevStep}: ${prevMsg} FINISHED. It took ${prevStepTimeElapsed}ms to complete.`);

        $util.insights.set(`Step ${prevStep}: ${prevMsg}`, prevStepTimeElapsed);
        if (timeout > 0 && totalTimeElapsed > timeout) {
            throw new Error('Script timed out. ' + totalTimeElapsed + 'ms is longer than script timeout threshold of ' + timeout + 'ms.');
        }
    }

    return {
        log,
        end
    }
})(ScriptTimeout)
