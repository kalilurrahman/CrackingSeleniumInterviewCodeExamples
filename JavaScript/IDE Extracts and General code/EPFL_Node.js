/**
 * Script Name: {EPFL}
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

console.log('Starting synthetics script: {EPFL}');
console.log('Default timeout is set to ' + (DefaultTimeout/1000) + ' seconds');

// Setting User Agent is not then-able, so we do this first (if defined and not default)
if (UserAgent && (0 !== UserAgent.trim().length) && (UserAgent != 'default')) {
  $browser.addHeader('User-Agent', UserAgent);
  console.log('Setting User-Agent to ' + UserAgent);
}

// Get browser capabilities and do nothing with it, so that we start with a then-able command
$browser.getCapabilities().then(function () { })
	.then(() => {
            logger.log(1, "https://rapport-annuel.epfl.ch/en");
            return $browser.get("https://rapport-annuel.epfl.ch/en");
        })
	.then(() => {
            logger.log(2, "clickElement link=2018");
            return $browser.waitForAndFindElement(By.linkText("2018"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(3, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'English\'])[1]/following::div[7]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::div[7]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(4, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'View the statements\'])[1]/following::div[12]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View the statements'])[1]/following::div[12]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(5, "clickElement link=Innovation");
            return $browser.waitForAndFindElement(By.linkText("Innovation"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(6, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'English\'])[1]/following::div[9]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::div[9]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(7, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Innovation\'])[1]/following::div[4]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Innovation'])[1]/following::div[4]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(8, "clickElement link=EPFL in figures");
            return $browser.waitForAndFindElement(By.linkText("EPFL in figures"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(9, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'English\'])[1]/following::p[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='English'])[1]/following::p[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(10, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'EPFL in figures\'])[1]/following::div[3]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::div[3]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(11, "type switzerland");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::input[2]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('switzerland');
                })
        })
	.then(() => {
            logger.log(12, "sendKeys $driver.Key.ENTER");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EPFL in figures'])[1]/following::input[2]"), DefaultTimeout)
                .then(function (el) {
                    el.sendKeys($driver.Key.ENTER);
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
