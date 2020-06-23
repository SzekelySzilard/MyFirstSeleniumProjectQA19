import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckOutTest {
//teoretic ar trebui sa mearga fara partea cu selectarea din dropdown , am copiat toata partea asta in Add to cart si a mers pana la dropdown
    public void Checkout(){


      // WebElement testDropDown = driver1.findElement(By.id("testingDropdown"));
      //  Select dropdown = new Select(testDropDown);

        WebDriver driver= new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a")).click();
        driver.findElement(By.cssSelector("#header-cart > div.minicart-wrapper > div.minicart-actions > ul > li > a")).click();
        driver.findElement(By.cssSelector("#onepage-guest-register-button > span > span")).click();
        driver.findElement(By.cssSelector("#billing\\:firstname")).sendKeys("szekely");
        driver.findElement(By.cssSelector("#billing\\:lastname")).sendKeys("szialrd");
        driver.findElement(By.cssSelector("#billing\\:email")).sendKeys("szilard.tivadar@yahoo.com");
        driver.findElement(By.cssSelector("#billing\\:street1")).sendKeys("iazului 3");
        driver.findElement(By.cssSelector("#billing\\:city")).sendKeys("aiud");
     //   Select mydrpdwn= new Select(driver.findElement(By.id("Country")));
       // mydrpdwn.selectByVisibleText("România");
     //   driver.findElement(By.cssSelector("#billing\\:country_id")).click();
    //     dropdown.selectByValue("România");
        driver.findElement(By.cssSelector("#billing\\:region_id")).click();
     //   dropdown.selectByValue("Alba");
        driver.findElement(By.cssSelector("#billing\\:postcode")).sendKeys("515220");
        driver.findElement(By.cssSelector("#billing\\:telephone")).sendKeys("25485646");
        driver.findElement(By.cssSelector("#billing-buttons-container > button")).click();
       // driver.quit();
    }
}
