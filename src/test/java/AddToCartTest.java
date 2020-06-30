import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCartTest {

    public  WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
    }

@Test
    public void AddToCart(){

    driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
    driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("szilard.tivadar@yahoo.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("dog4life");
    driver.findElement(By.cssSelector("#send2 > span > span")).click();
    WebElement longin=driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.page-title > h1"));
    Assert.assertEquals("MY DASHBOARD", longin.getText());
    driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
    driver.findElement(By.cssSelector("#product-collection-image-423")).click();
    driver.findElement(By.cssSelector("#swatch18 > span.swatch-label > img")).click();
    driver.findElement(By.cssSelector("#swatch77 > span.swatch-label")).click();
            driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button")).click();
            WebElement added=driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > ul > li > ul > li > span"));
           Assert.assertEquals("Racer Back Maxi Dress was added to your shopping cart.", added.getText());




    }

    @Test
    public void AddFromHomepage(){

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
        driver.findElement(By.cssSelector("#s_method_flatrate_flatrate")).click();

        //driver.findElement(By.cssSelector("#checkout-shipping-method-load > dl > dd:nth-child(4) > ul > li > label")).click();
      //  WebElement Ratio=driver.findElement(By.id("s_method_flatrate_flatrate"));
        //Ratio.click();

        //driver.quit();
    }
 @After
 public void exit(){
  //   driver.quit();
 }
}
