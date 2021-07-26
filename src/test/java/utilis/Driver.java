package utilis;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
//    WebDriverManager driver= new ChromeDriverManager().setup();
//    driver.get(url)
//
//    public void setDriverManager(WebDriverManager driverManager) {
//        this.driver = driverManager;
//    }
    private Driver (){// this is our constructor and we make it private
    }
    private static WebDriver driver;

    public static WebDriver get(){
        if (driver == null) {
            String browser = ConfigurationReader.get("browser");

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    break;

            }

        }
        // This same driver will be returned every time we call Driver.getDriver() method
        return driver;

    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
