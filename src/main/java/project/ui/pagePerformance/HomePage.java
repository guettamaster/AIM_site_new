package project.ui.pagePerformance;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * The class contains common methods for working with page elements
 *
 * @author Oleg Ivankovskiy
 * @version 1.0
 * @since 2023-02-23
 */

public class HomePage extends PageObject {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        StopWatch pageLoad = new StopWatch();
        pageLoad.start();
        //Open your web app (In my case, I opened Home page for Aimprosoft site)
        driver.get("https://aim-dev.aimprosoft.com/");
        // Wait for the required any element (I am waiting for AIM logo in Aimprosoft site)
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//source[@src='https://aim-dev.aimprosoft.com/wp-content/themes/aimprosoft/assets/hero-video-lg.mp4']")));

        pageLoad.stop();
        //Get the time
        long pageLoadTime_ms = pageLoad.getTime();
        long pageLoadTime_Seconds = pageLoadTime_ms / 1000;
        System.out.println("Total Page Load Time: " + pageLoadTime_ms + " milliseconds");
        System.out.println("Total Page Load Time: " + pageLoadTime_Seconds + " seconds");
        driver.close();
    }
}

