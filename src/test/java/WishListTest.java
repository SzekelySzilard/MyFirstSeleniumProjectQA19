import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    public  WebDriver driver;

    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
      //  driver.get("http://testfasttrackit.info/selenium-test/");
       // driver.manage().window().maximize();
    }
    @Test
    public void WishlistSale() {
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");


        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("szilard.tivadar@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("dog4life");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > ul > li:nth-child(1) > a")).click();
        WebElement raceDress =driver.findElement(By.cssSelector("#item_733 > td.wishlist-cell0.customer-wishlist-item-image > a > img"));
        Assert.assertTrue(raceDress.isDisplayed());
    }
}