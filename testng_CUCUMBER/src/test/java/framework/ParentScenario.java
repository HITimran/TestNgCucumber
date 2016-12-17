package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import page.objects.DownloadPage;
import page.objects.MainPage;
 
public class ParentScenario {
 
    private WebDriver driver;
 
    protected DownloadPage downloadPage;
    protected MainPage mainPage;
 
    protected void startBrowser() {
 
    	
    	/*FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
    	FirefoxProfile firefoxProfile = new FirefoxProfile();       
    	 driver = new FirefoxDriver(ffBinary,firefoxProfile);*/
    	 System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver-v0.11.1-win32\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 
        downloadPage = new DownloadPage(driver);
        mainPage = new MainPage(driver);
    }
 
    protected void navigateTo() {
        driver.navigate().to("http://docs.seleniumhq.org/");
    }
 
    protected void closeBrowser() {
        driver.quit();
    }
 
}
