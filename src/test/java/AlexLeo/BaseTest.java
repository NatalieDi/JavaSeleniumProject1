package AlexLeo;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import org.testng.annotations.BeforeSuite;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//import java.time.Duration;
//
//
//public class BaseTest {
//
//    WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.get("https://askomdch.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//}
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-debugging-port=9222");

        driver = new ChromeDriver(options);
        driver.get("https://askomdch.com");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
