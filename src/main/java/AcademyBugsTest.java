import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcademyBugsTest {
    public WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/rukshanjs/Dev/chromedriver-mac-arm64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://academybugs.com/find-bugs/");
    }

    public void testAddToCart(String id){
        WebElement addToCartButton = driver.findElement(By.id(id));
        addToCartButton.click();

    }

    public void tearDown() {
        driver.quit();
    }


}
