package CrackSeleniumInterviewExamples.Ch5_EventHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Ch5_EventCaptureExample implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("Before accepting an alert");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("After accepting an alert");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("After dismissing an alert");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("Before dismissing an alert");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Before Navigating to " + s );
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("After Navigating to " + s );
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Before Navigating back" );
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("After Navigating back" );
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Before Navigating Forward" );
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("After Navigating Forward" );
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("Before Navigating Refresh" );
    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("After Navigating Refresh" );
    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Before Find By"+ webElement.getText() );
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("After Find By"+ webElement.getText() );
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("Before Click on "+ webElement.getText() );
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        System.out.println("After Click on "+ webElement.getText() );
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Before Change Value of "+ webElement.getText() );
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("After Change Value of "+ webElement.getText() );
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        System.out.println("Before Script "+ s );
    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        System.out.println("After Script "+ s );
    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("Before Switch Window "+ s );
    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {
        System.out.println("After Switch Window "+ s );
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {
        System.out.println("Exception Thrown "+ throwable.getMessage() );
    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {
        System.out.println("After Get Text \n"+ s  + "\n Web Element is \n" + webElement.getText());
    }
}
