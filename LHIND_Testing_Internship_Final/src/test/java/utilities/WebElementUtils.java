package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;

public class WebElementUtils {
    WebDriver driver = BaseInformation.getDriver();

    private final BaseInformation baseInformation;
    private final WaitUtils waitUtils;


    public WebElementUtils(BaseInformation baseInformation, Duration defaultDuration) {
        this.baseInformation = baseInformation;
        this.waitUtils = new WaitUtils(baseInformation, defaultDuration);
    }

    public void clickWebElement(WebElement webElement) {
        waitUtils.waitForElementClickable(webElement)
                .click();
    }

    public void javaScriptClick(WebElement webElement) {
        waitUtils.waitForElementClickableWithCustomTime(10000,webElement);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", webElement);
    }

    public void moveMouseToElement(WebElement element) {
        new Actions(driver)
                .moveToElement(element)
                .perform();
        WaitUtils.waitFor(5000);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollOffset(int x, int y) {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollBy(arguments[0],arguments[1])", x, y);
    }

    public void scrollToBottomOfPage() {
        ((JavascriptExecutor) driver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    public String getTextWithoutSubElements(WebElement element) {
        String fullText = element.getText()
                .trim();
        for (WebElement subElement : element.findElements(By.xpath(".//*"))) {
            fullText = fullText.replace(subElement.getText().trim(), "");
        }
        fullText = fullText.replaceAll("\n", "");
        return fullText;
    }


    public void sendKeysToElementWithWait(WebElement element, String value, long millsWait) {
        element.sendKeys(value);
        WaitUtils.waitFor(millsWait);
    }


    public boolean isElementVisibleWithWait(int mills, WebElement element) {
        try {
            waitUtils.waitForElementVisibleWithCustomTime(mills, element);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }




    //METODA TE REJA

    public void selectFromDropDownElementByVisibleText(WebElement element, String visibleText) {
        try {
            waitUtils.waitForElementVisible(element);
            Select s = new Select(element);
            s.selectByVisibleText(visibleText);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void verifyElementIsDisplayed(WebElement element) {
        try {
            waitUtils.waitForElementVisible(element);
            Assert.assertTrue(element.isDisplayed());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void verifyElementIsNotDisplayed(WebElement element) {
        try {
            Assert.assertTrue(!element.isDisplayed());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clearField(WebElement element) {
        Actions actions = new Actions(driver);
        try {
            waitUtils.waitForElementClickable(element);
            actions.moveToElement(element).doubleClick(element).keyDown(Keys.BACK_SPACE).build().perform();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void verifyColorMatches(WebElement element,String colorCode) {
        try {
            waitUtils.waitForElementVisible(element);
            Assert.assertTrue((Color.fromString(element.getCssValue("color")).asHex()).equals(colorCode));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
