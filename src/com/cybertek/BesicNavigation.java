import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BesicNavigation {

    public static void main(String[] args) throws Throwable {

       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver",
                "/Users/anar0140/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver= new ChromeDriver();

        String url="https://google.com";
        String url2="https://amazon.com";
        driver.get(url);  // will open browser
        Thread.sleep(3000);

        driver.navigate().to(url2);
      // driver.get(url2);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit(); // will close browser

    }
}
