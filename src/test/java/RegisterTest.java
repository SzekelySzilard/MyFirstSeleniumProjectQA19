import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegisterTest {

    public void Account(){

        WebDriver driver= new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
          driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a")).click();
          driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
          driver.findElement(By.cssSelector("#firstname")).sendKeys("Szekely");
         driver.findElement(By.cssSelector("#lastname")).sendKeys("Szilard");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("szilard.tivadar@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123456");
        driver.quit();



    }
}


