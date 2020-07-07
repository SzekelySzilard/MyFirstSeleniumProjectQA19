import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTest {


    public  WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
    }
    @Test
    public void Account(){

        driver= new ChromeDriver();

          driver.findElement(By.cssSelector(".skip-account")).click();
          driver.findElement(By.cssSelector(".links [title=\"Register\"]a")).click();
          driver.findElement(By.cssSelector("#firstname")).sendKeys("Szekely");
         driver.findElement(By.cssSelector("#lastname")).sendKeys("Szilard");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("szilard.tivadar@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        // Din moment ce nu dau register nu are cum sa se creze contul dar am simulat ca s-a creat si verific daca apare
        //un text anume dupa registrare
     //   WebElement register=driver.findElement(By.cssSelector(""));
        // Assert.assertEquals("welcome x", register);
       // driver.quit();



    }
}


