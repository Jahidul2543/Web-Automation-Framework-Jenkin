package base;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.amazon.com/") String url){
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        /*
        System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
        driver = new FirefoxDriver();*/
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public  static void after(){
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }

    public  void  findElementById(String id, String value ){
        driver.findElement(By.id(id)).sendKeys(value);
    }

    public List<String> getTextFromWebElements(String locator){
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        try {
            element = driver.findElements(By.cssSelector(locator));
        }catch (Exception ex){
            ex.printStackTrace();
            element=driver.findElements(By.xpath(locator));
        }
        for(WebElement web:element){
            text.add(web.getText());
        }

        return text;
    }

}
