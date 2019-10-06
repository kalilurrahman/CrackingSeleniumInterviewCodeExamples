/**
 * Script Name: {TheDemoSite}
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

console.log('Starting synthetics script: {TheDemoSite}');
console.log('Default timeout is set to ' + (DefaultTimeout/1000) + ' seconds');

// Setting User Agent is not then-able, so we do this first (if defined and not default)
if (UserAgent && (0 !== UserAgent.trim().length) && (UserAgent != 'default')) {
  $browser.addHeader('User-Agent', UserAgent);
  console.log('Setting User-Agent to ' + UserAgent);
}

// Get browser capabilities and do nothing with it, so that we start with a then-able command
$browser.getCapabilities().then(function () { })
	.then(() => {
            logger.log(1, "http://thedemosite.co.uk/");
            return $browser.get("http://thedemosite.co.uk/");
        })
	.then(() => {
            logger.log(2, "clickElement link=4. Login");
            return $browser.waitForAndFindElement(By.linkText("4. Login"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(3, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(4, "type Automation");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Automation');
                })
        })
	.then(() => {
            logger.log(5, "type Testing");
            return $browser.waitForAndFindElement(By.name("password"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Testing');
                })
        })
	.then(() => {
            logger.log(6, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'**No login attempted**\'])[1]/following::td[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='**No login attempted**'])[1]/following::td[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(7, "clickElement name=FormsButton2");
            return $browser.waitForAndFindElement(By.name("FormsButton2"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(8, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(9, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::center[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(10, "verify text of xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::center[1] includes **Failed Login**");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]"), DefaultTimeout)
                .then(function(el){
                    return el.getText().then(function(text){
                        var found = text.includes("**Failed Login**");
                        assert.equal(true, found, "Verification failed! Unable to find text **Failed Login** in element xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::center[1]. Text: " +text);
                    })
                })
        })
	.then(() => {
            logger.log(11, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(12, "type Automation");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Automation');
                })
        })
	.then(() => {
            logger.log(13, "type Tester");
            return $browser.waitForAndFindElement(By.name("password"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Tester');
                })
        })
	.then(() => {
            logger.log(14, "clickElement name=FormsButton2");
            return $browser.waitForAndFindElement(By.name("FormsButton2"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(15, "clickElement link=3. Add a User");
            return $browser.waitForAndFindElement(By.linkText("3. Add a User"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(16, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(17, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(18, "type naveen");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('naveen');
                })
        })
	.then(() => {
            logger.log(19, "type naveen");
            return $browser.waitForAndFindElement(By.name("password"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('naveen');
                })
        })
	.then(() => {
            logger.log(20, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'All code updated April 2014, now uses PHP/PDO for database connectivity\'])[1]/following::blockquote[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='All code updated April 2014, now uses PHP/PDO for database connectivity'])[1]/following::blockquote[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(21, "clickElement name=FormsButton2");
            return $browser.waitForAndFindElement(By.name("FormsButton2"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(22, "clickElement link=4. Login");
            return $browser.waitForAndFindElement(By.linkText("4. Login"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(23, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(24, "type naveen");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('naveen');
                })
        })
	.then(() => {
            logger.log(25, "type naveen");
            return $browser.waitForAndFindElement(By.name("password"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('naveen');
                })
        })
	.then(() => {
            logger.log(26, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'MySQL\'])[1]/following::td[2]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MySQL'])[1]/following::td[2]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(27, "clickElement name=FormsButton2");
            return $browser.waitForAndFindElement(By.name("FormsButton2"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(28, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::center[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::center[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(29, "verify text of xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::b[1] includes **Successful Login**");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='The status was:'])[1]/following::b[1]"), DefaultTimeout)
                .then(function(el){
                    return el.getText().then(function(text){
                        var found = text.includes("**Successful Login**");
                        assert.equal(true, found, "Verification failed! Unable to find text **Successful Login** in element xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'The status was:\'])[1]/following::b[1]. Text: " +text);
                    })
                })
        })
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
