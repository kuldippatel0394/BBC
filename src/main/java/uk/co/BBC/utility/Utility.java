package uk.co.BBC.utility;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import uk.co.BBC.browserfactory.ManageBrowser;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utility extends ManageBrowser {

    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public void clickOnElement(By by) {
        WebElement element = driver.findElement(by);
        element.click();
    }


    public void clickOnElement(WebElement element) {
        element.click();
    }
    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/uk/co/BBC Failed Test/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        String destination = System.getProperty("user.dir") + "/src/main/java/uk/co/BBC Failed Test/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
