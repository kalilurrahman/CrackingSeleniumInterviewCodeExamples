/**
 * Script Name: {PHPTravels}
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

console.log('Starting synthetics script: {PHPTravels}');
console.log('Default timeout is set to ' + (DefaultTimeout/1000) + ' seconds');

// Setting User Agent is not then-able, so we do this first (if defined and not default)
if (UserAgent && (0 !== UserAgent.trim().length) && (UserAgent != 'default')) {
  $browser.addHeader('User-Agent', UserAgent);
  console.log('Setting User-Agent to ' + UserAgent);
}

// Get browser capabilities and do nothing with it, so that we start with a then-able command
$browser.getCapabilities().then(function () { })
	.then(() => {
            logger.log(1, "https://www.phptravels.net/");
            return $browser.get("https://www.phptravels.net/");
        })
	.then(() => {
            logger.log(2, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Offers\'])[1]/following::a[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Offers'])[1]/following::a[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(3, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'My Account\'])[2]/b[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/b[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(4, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'My Account\'])[2]/following::a[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='My Account'])[2]/following::a[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(5, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(6, "type user@phptravels.net");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('user@phptravels.net');
                })
        })
	.then(() => {
            logger.log(7, "type demouser");
            return $browser.waitForAndFindElement(By.name("password"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('demouser');
                })
        })
	.then(() => {
            logger.log(8, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(9, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(10, "clickElement name=username");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(11, "type user@phptravels.com");
            return $browser.waitForAndFindElement(By.name("username"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('user@phptravels.com');
                })
        })
	.then(() => {
            logger.log(12, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Password\'])[1]/following::button[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::button[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(13, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Hotels\'])[1]/following::span[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Hotels'])[1]/following::span[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(14, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Denver Intl Arpt (DEN)\'])[1]/following::i[2]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::i[2]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(15, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Done\'])[1]/following::ins[2]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Done'])[1]/following::ins[2]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(16, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Denver Intl Arpt (DEN)\'])[1]/following::i[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::i[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(17, "clickElement id=arrival");
            return $browser.waitForAndFindElement(By.id("arrival"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(18, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sa\'])[7]/following::td[42]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[7]/following::td[42]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(19, "clickElement name=totalManualPassenger");
            return $browser.waitForAndFindElement(By.name("totalManualPassenger"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(20, "type 2");
            return $browser.waitForAndFindElement(By.name("totalManualPassenger"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('2');
                })
        })
	.then(() => {
            logger.log(21, "clickElement id=madult");
            return $browser.waitForAndFindElement(By.id("madult"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let valueString = ("label=2").split("=", 2);
            logger.log(22, "select option "+valueString[1]+" from dropdown list id=madult");
            return $browser.waitForAndFindElement(By.id("madult"), DefaultTimeout)
                .then(function(selectElement){
                    return selectElement.findElement(By.xpath('//option[.="'+valueString[1]+'"]'))
                        .then(function(el){
                            el.isSelected().then(function(bool) {if (!bool) { el.click();}})
                        })
                })
        })
	.then(() => {
            logger.log(23, "clickElement id=sumManualPassenger");
            return $browser.waitForAndFindElement(By.id("sumManualPassenger"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(24, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Denver Intl Arpt (DEN)\'])[1]/following::button[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Denver Intl Arpt (DEN)'])[1]/following::button[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(25, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'×\'])[2]/following::img[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='×'])[2]/following::img[1]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let type = ("index=0").split("=")
            var value

            if (type[0] == "index") {
                value = parseInt(type[1]);  // int type
            } else {
                value = type[1]; // string type
            }

            logger.log(26, "switch to frame  index=0");
            return $browser.switchTo().frame(value)
        })
	.then(() => {
            logger.log(27, "clickElement css=button.e1mwfyk10.lc-11466y2.e1m5b1js0 > svg.lc-1mpchac");
            return $browser.waitForAndFindElement(By.css("button.e1mwfyk10.lc-11466y2.e1m5b1js0 > svg.lc-1mpchac"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let type = ("relative=parent").split("=")
            var value

            if (type[0] == "index") {
                value = parseInt(type[1]);  // int type
            } else {
                value = type[1]; // string type
            }

            logger.log(28, "switch to frame  relative=parent");
            return $browser.switchTo().frame(value)
        })
	.then(() => {
            logger.log(29, "clickElement id=name");
            return $browser.waitForAndFindElement(By.id("name"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(30, "type Selenium");
            return $browser.waitForAndFindElement(By.id("name"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Selenium');
                })
        })
	.then(() => {
            logger.log(31, "type User");
            return $browser.waitForAndFindElement(By.id("surname"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('User');
                })
        })
	.then(() => {
            logger.log(32, "type selenium@user.com");
            return $browser.waitForAndFindElement(By.id("email"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('selenium@user.com');
                })
        })
	.then(() => {
            logger.log(33, "type 1234567890");
            return $browser.waitForAndFindElement(By.id("phone"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('1234567890');
                })
        })
	.then(() => {
            logger.log(34, "type 1990-01-01");
            return $browser.waitForAndFindElement(By.id("birthday"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('1990-01-01');
                })
        })
	.then(() => {
            logger.log(35, "type 12345678901234567890");
            return $browser.waitForAndFindElement(By.id("cardno"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('12345678901234567890');
                })
        })
	.then(() => {
            logger.log(36, "type 2022-01-01");
            return $browser.waitForAndFindElement(By.id("expiration"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('2022-01-01');
                })
        })
	.then(() => {
            logger.log(37, "type i");
            return $browser.waitForAndFindElement(By.id("s2id_autogen1"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('i');
                })
        })
	.then(() => {
            let valueString = ("label=Ms.").split("=", 2);
            logger.log(38, "select option "+valueString[1]+" from dropdown list xpath=(.//*[normalize-space(text()) and normalize-space(.)='Title:'])[2]/following::select[1]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Title:'])[2]/following::select[1]"), DefaultTimeout)
                .then(function(selectElement){
                    return selectElement.findElement(By.xpath('//option[.="'+valueString[1]+'"]'))
                        .then(function(el){
                            el.isSelected().then(function(bool) {if (!bool) { el.click();}})
                        })
                })
        })
	.then(() => {
            logger.log(39, "type Selenium");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Name:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Selenium');
                })
        })
	.then(() => {
            logger.log(40, "type Manager");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Surname:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('Manager');
                })
        })
	.then(() => {
            logger.log(41, "type selenium@manager.com");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('selenium@manager.com');
                })
        })
	.then(() => {
            logger.log(42, "type 9876543210");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Phone:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('9876543210');
                })
        })
	.then(() => {
            logger.log(43, "type 1970-01-01");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Birthday:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('1970-01-01');
                })
        })
	.then(() => {
            logger.log(44, "type 9876543210987654321");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card Number:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('9876543210987654321');
                })
        })
	.then(() => {
            logger.log(45, "type 2099-01-01");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Expiration:'])[2]/following::input[1]"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('2099-01-01');
                })
        })
	.then(() => {
            logger.log(46, "type u");
            return $browser.waitForAndFindElement(By.id("s2id_autogen2"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('u');
                })
        })
	.then(() => {
            logger.log(47, "clickElement id=cardtype");
            return $browser.waitForAndFindElement(By.id("cardtype"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let valueString = ("label=Visa").split("=", 2);
            logger.log(48, "select option "+valueString[1]+" from dropdown list id=cardtype");
            return $browser.waitForAndFindElement(By.id("cardtype"), DefaultTimeout)
                .then(function(selectElement){
                    return selectElement.findElement(By.xpath('//option[.="'+valueString[1]+'"]'))
                        .then(function(el){
                            el.isSelected().then(function(bool) {if (!bool) { el.click();}})
                        })
                })
        })
	.then(() => {
            logger.log(49, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Card Type\'])[1]/following::option[5]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Card Type'])[1]/following::option[5]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(50, "clickElement id=card-number");
            return $browser.waitForAndFindElement(By.id("card-number"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(51, "type 1234567890123456");
            return $browser.waitForAndFindElement(By.id("card-number"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('1234567890123456');
                })
        })
	.then(() => {
            logger.log(52, "clickElement id=expiry-month");
            return $browser.waitForAndFindElement(By.id("expiry-month"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let valueString = ("label=July (07)").split("=", 2);
            logger.log(53, "select option "+valueString[1]+" from dropdown list id=expiry-month");
            return $browser.waitForAndFindElement(By.id("expiry-month"), DefaultTimeout)
                .then(function(selectElement){
                    return selectElement.findElement(By.xpath('//option[.="'+valueString[1]+'"]'))
                        .then(function(el){
                            el.isSelected().then(function(bool) {if (!bool) { el.click();}})
                        })
                })
        })
	.then(() => {
            logger.log(54, "clickElement xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Expiration Date\'])[1]/following::option[8]");
            return $browser.waitForAndFindElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Expiration Date'])[1]/following::option[8]"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(55, "clickElement id=expiry-year");
            return $browser.waitForAndFindElement(By.id("expiry-year"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(56, "clickElement id=expiry-year");
            return $browser.waitForAndFindElement(By.id("expiry-year"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            let valueString = ("label=2026").split("=", 2);
            logger.log(57, "select option "+valueString[1]+" from dropdown list id=expiry-year");
            return $browser.waitForAndFindElement(By.id("expiry-year"), DefaultTimeout)
                .then(function(selectElement){
                    return selectElement.findElement(By.xpath('//option[.="'+valueString[1]+'"]'))
                        .then(function(el){
                            el.isSelected().then(function(bool) {if (!bool) { el.click();}})
                        })
                })
        })
	.then(() => {
            logger.log(58, "type 1234567890");
            return $browser.waitForAndFindElement(By.id("cvv"), DefaultTimeout)
                .then(function (el) {
                    el.clear();
                    el.sendKeys('1234567890');
                })
        })
	.then(() => {
            logger.log(59, "clickElement //body");
            return $browser.waitForAndFindElement(By.xpath("//body"), DefaultTimeout)
                .then(function (el) {
                    el.click();
                })
        })
	.then(() => {
            logger.log(60, "clickElement //body");
            return $browser.waitForAndFindElement(By.xpath("//body"), DefaultTimeout)
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
