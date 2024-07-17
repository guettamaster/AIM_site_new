package project.ui.pageObj;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;

/**
 * The class contains common methods for working with page elements
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 * @since 2021-01-07
 */
public class CorePageObjects extends PageObject implements CorePageObjectsInterface {
    private static Logger logger = LoggerFactory.getLogger(CorePageObjects.class);

    /**
     * Switches to browser's tab by number
     *
     * @param numberOfTab the integer value that is a number of tab
     * @author Oleg Ivankovskiy
     */
    public void switchToTab(int numberOfTab) {
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(numberOfTab - 1));
    }

    /**
     * Stops going for provided seconds
     *
     * @param sec the integer value that is a number of seconds
     * @author Oleg Ivankovskiy
     */
    public void waitSec(int sec) {
        waitABit(sec * 1000);
    }

    /**
     * Opens page by url
     *
     * @param url the url of the page to open
     * @author Oleg Ivankovskiy
     */
    public void goToURL(String url) {
        getDriver().get(url);
    }

    /**
     * Checks if simple checkbox is selected.
     * true - if checkbox is selected,
     * false - if checkbox is not selected.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public boolean simpleCheckboxIsSelected(String xpath) {
        return getElementByXpath(xpath).isSelected();
    }

    /**
     * Clicks on element by xpath.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public void clickOnElementByXpath(String xpath) {
        boolean staleElement = true;
        while (staleElement) {
            try {
                scrollToElementByXpathUsingJsExecutor(xpath);
                $(xpath).click();
                staleElement = false;
            } catch (StaleElementReferenceException ignored) {
            }
        }
    }

    /**
     * Scrolls to an element by xpath using JavascriptExecutor library.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the url of the page to open
     * @author Oleg Ivankovskiy
     */
    public void scrollToElementByXpathUsingJsExecutor(String xpath) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true);", $(xpath));
    }

    public void findElementByLinkText(String xpath) {
        find(By.xpath(xpath));
    }

    /**
     * Waits default time for invisibility of element and returns boolean value:
     * true - if element is not visible on the page,
     * false - if element is visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public boolean elementByXpathIsInvisible(String xpath) {
        try {
            waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Waits default time for visibility of element and returns boolean value:
     * true - if element is visible on the page,
     * false - if element is not visible on the page.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public boolean elementByXpathIsVisible(String xpath) {
        try {
            waitFor(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Returns a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public WebElementFacade getElementByXpath(String xpath) {
        return find(By.xpath(xpath));
    }

    /**
     * Returns a text from a web element by xpath.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public String getTextFromElementByXpath(String xpath) {
        return find(By.xpath(xpath)).getText();
    }

    /**
     * Waits for visibility of an input field web element by xpath
     * and types a text into this field
     *
     * @param xpath the string that is a path to the element
     * @param text  the string that is a text to type
     * @author Oleg Ivankovskiy
     */
    public void typeTextIntoInputFieldByXpath(String xpath, String text) {
        waitFor(ExpectedConditions.visibilityOf(find(By.xpath(xpath)))).typeInto(find(By.xpath(xpath)), text);
    }

    /**
     * Returns an argument from provided attribute of web element by xpath.
     *
     * @param xpath the string (iframe) that is a path to the element
     * @param xpath1 the string that is a path to the element
     * @param text the string that is a text to type
     * @author Oleg Ivankovskiy
     */
    public void typeTextIntoInputFieldUsingIframeWithTimeoutbyXpath(String xpath, String xpath1, String text) {
        waitABit(7000);
        ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath(xpath)));
        getDriver().switchTo().frame((WebElement) find(By.xpath(xpath)));
        typeInto(find(By.xpath(xpath1)), text);
        getDriver().switchTo().defaultContent();
    }

    /**
     * Returns an argument from provided attribute of web element by xpath.
     *
     * @param xpath the string (iframe) that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public void clickOnTheButtonUsingIframeWithTimeoutbyXpath(String xpath, String xpath1) {
        waitABit(2000);
        ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath(xpath)));
        getDriver().switchTo().frame((WebElement) find(By.xpath(xpath)));
        getDriver().findElement(By.xpath(xpath1)).click();
        getDriver().switchTo().defaultContent();
    }

    /**
     * Returns an argument from provided attribute of web element by xpath.
     *
     * @param xpath the string (iframe) that is a path to the element
     * @param xpath1 the string that is a path to the element
     * @param text the string that is a text to type
     * @author Oleg Ivankovskiy
     */
    public void typeTextIntoInputFieldUsingIframebyXpath(String xpath, String xpath1, String text) {
        ExpectedConditions.frameToBeAvailableAndSwitchToIt((By.xpath(xpath)));
        getDriver().switchTo().frame((WebElement) find(By.xpath(xpath)));
        typeInto(find(By.xpath(xpath1)), text);
        getDriver().switchTo().defaultContent();
    }

    /**
     *
     */
    public void putTextIntoTheCurrentSession(String key, String xpath) {
        Serenity.getCurrentSession().put(key, getTextFromElementByXpath(xpath));
    }

    /**
     *
     */
    public String getTextIntoTheCurrentSession(String key) {
        return (String) Serenity.getCurrentSession().get(key);
    }

    /**
     *
     */
    public void doubleClickOnElementByXpath(String xpath) {
        Actions action = new Actions(getDriver());
        WebElement btn = getDriver().findElement(By.xpath(xpath));
        action.doubleClick(btn).perform();
    }

    /**
     * Removes value from input web element by xpath
     *
     * @param xpath the string that is an identifier of the element
     * @author Oleg Ivankovskiy
     */
    public void clearInputFieldByXpath(String xpath) {
        find(By.xpath(xpath)).clear();
    }

    /**
     *
     */
    public void clickOnFieldByXpath(String xpath) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(xpath)).click().build().perform();
    }

    /**
     *
     */
    public void doubleClickAndTypeOnElementByXpath(String xpath) {
        Actions action = new Actions(getDriver());
        WebElement btn = getDriver().findElement(By.xpath(xpath));
        action.doubleClick(btn).build().perform();
    }

    public void enterInTheInviteMembersField(String xpath, String text) {
        typeInto(find(By.xpath(xpath)), text);
    }

    /**
     * Reloads a page
     *
     * @author Oleg Ivankovskiy
     */
    public void reloadPage() {
        getDriver().navigate().refresh();
    }

    /**
     * Hover on element
     *
     * @author Oleg Ivankovskiy
     */
    public void hoverOnElement(String xpath) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(findBy(xpath)).click().build().perform();
    }

    /**
     * Clicks on element by xpath.
     * XPath is used to navigate through elements and attributes in an XML document.
     *
     * @param xpath the string that is a path to the element
     * @author Oleg Ivankovskiy
     */
    public void clickUsingJSExecutor(String xpath) {
        evaluateJavascript("arguments[0].click();", (findBy(xpath)));
    }


}



