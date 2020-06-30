import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectWithUs {

     WebDriver driver;
    @Before
    public void init(){

       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe")  ;
        driver=new ChromeDriver();
       driver.get("http://testfasttrackit.info/selenium-test/");
       driver.manage().window().maximize();

    }



    @Test
    public void ConnectFacebook(){

        driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div.links.social-media > ul > li:nth-child(1) > a")).click();

        Assert.assertEquals("https://www.facebook.com/",driver.getTitle());


    }
    @Test
    public void  connectTwitter(){
        driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div.links.social-media > ul > li:nth-child(2) > a")).click();

        Assert.assertEquals("https://www.tweeter.com/",driver.getTitle());


    }
}
