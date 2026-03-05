package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Baseclass {
    public static WebDriver driver;


@BeforeTest
    public void openBrowser() throws MalformedURLException {

    String browser="firefox";

    if("firefox".equalsIgnoreCase(browser)){
        FirefoxOptions options=new FirefoxOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
    }

    else if("chrome".equalsIgnoreCase(browser)){
        ChromeOptions chromeOption=new ChromeOptions();
        driver=new RemoteWebDriver(new URL("http://localhost:4444"),chromeOption);
    }

        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/openaccount.htm");

    }


    public void closeBrowser(){
        driver.quit();
    }
}
