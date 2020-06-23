import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCartTest {
//am incercat dar nu am reusit sa selectez din grua Woman...
    public static void AddToCart(){

       // WebDriver driver= new ChromeDriver();
      //  WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
       // Select dropdown = new Select(testDropDown);

        WebDriver driver1= new ChromeDriver();
        driver1.get("http://testfasttrackit.info/selenium-test/");
     //  Select listbox = new Select(driver1.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]")));
       //listbox.selectByIndex(3);

        //  Select listox=new Select(driver1.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")));
         // listox.selectByValue("New Arrivals");


     //  Select mydrpdwn= new Select(driver1.findElement(By.id("//*[@id=\"nav\"]/ol/li[1]")));
       // mydrpdwn.selectByVisibleText("New Arrivals");
        // driver.findElement(By.cssSelector("#billing\\:country_id")).click();
        //     dropdown.selectByValue("România");
      //  driver1.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent>")).click();
         driver1.findElement(By.cssSelector("#product-collection-image-421")).click();
        driver1.findElement(By.cssSelector("#swatch22 > span.swatch-label > img")).click();
        driver1.findElement(By.cssSelector("#swatch78 > span.swatch-label")).click();
        driver1.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        driver1.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button > span > span")).click();
        driver1.findElement(By.cssSelector("#onepage-guest-register-button > span > span")).click();
        driver1.findElement(By.cssSelector("#billing\\:firstname")).sendKeys("szekely");
        driver1.findElement(By.cssSelector("#billing\\:lastname")).sendKeys("szialrd");
        driver1.findElement(By.cssSelector("#billing\\:email")).sendKeys("szilard.tivadar@yahoo.com");
        driver1.findElement(By.cssSelector("#billing\\:street1")).sendKeys("iazului 3");
        driver1.findElement(By.cssSelector("#billing\\:city")).sendKeys("aiud");
        driver1.findElement(By.cssSelector("#billing\\:country_id")).click();
      //  dropdown.selectByValue("România");
        driver1.findElement(By.cssSelector("#billing\\:region_id")).click();
     //   dropdown.selectByValue("Alba");
        driver1.findElement(By.cssSelector("#billing\\:postcode")).sendKeys("515220");
        driver1.findElement(By.cssSelector("#billing\\:telephone")).sendKeys("25485646");
        driver1.findElement(By.cssSelector("#billing-buttons-container > button")).click();
        driver1.quit();


    }

    public void AddFromHomepage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.std > div.widget.widget-new-products > div.widget-products > ul > li:nth-child(1) > a > img")).click();
        driver.findElement(By.cssSelector("#swatch22 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#swatch78 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > div > a")).click();
        driver.findElement(By.cssSelector("#header-cart > div.minicart-wrapper > div.minicart-actions > ul > li > a")).click();
        driver.findElement(By.cssSelector("#onepage-guest-register-button > span > span")).click();
        driver.findElement(By.cssSelector("#billing\\:firstname")).sendKeys("szekely");
        driver.findElement(By.cssSelector("#billing\\:lastname")).sendKeys("szialrd");
        driver.findElement(By.cssSelector("#billing\\:email")).sendKeys("szilard.tivadar@yahoo.com");
        driver.findElement(By.cssSelector("#billing\\:street1")).sendKeys("iazului 3");
        driver.findElement(By.cssSelector("#billing\\:city")).sendKeys("aiud");

        Select listbox = new Select(driver.findElement(By.xpath("//*[@id=\"billing:country_id\"]")));
        listbox.selectByIndex(3);

      //  Select listox=new Select(driver.findElement(By.xpath("//*[@id=\"billing:country_id\"]")));
      //  listox.selectByValue("Rusia");


       // Select mydrpdwn= new Select(driver.findElement(By.id("Country")));
        //mydrpdwn.selectByVisibleText("România");
       // driver.findElement(By.cssSelector("#billing\\:country_id")).click();
        //     dropdown.selectByValue("România");
        //driver.findElement(By.cssSelector("#billing\\:region_id")).click();
        //   dropdown.selectByValue("Alba");


        driver.findElement(By.cssSelector("#billing\\:postcode")).sendKeys("515220");
        driver.findElement(By.cssSelector("#billing\\:telephone")).sendKeys("25485646");
        driver.findElement(By.cssSelector("#billing-buttons-container > button")).click();
        //driver.findElement(By.cssSelector("#checkout-shipping-method-load > dl > dd:nth-child(4) > ul > li > label")).click();
      //  WebElement Ratio=driver.findElement(By.id("s_method_flatrate_flatrate"));
        //Ratio.click();

        //driver.quit();
    }
}
