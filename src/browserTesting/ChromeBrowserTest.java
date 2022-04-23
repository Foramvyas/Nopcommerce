package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://www.nopcommerce.com/en/demo";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println(baseUrl);
        System.out.println(title);


        driver.close();
        driver.quit();

    }
}
