import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

   private WebDriver driver;


    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }



@Test
    public void login(){

    driver.findElement(By.cssSelector(".skip-account .label")).click();
    driver.findElement(By.cssSelector("[title=\"Log In\"] ")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("szilard.tivadar@yahoo.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("dog4life");
    driver.findElement(By.cssSelector("#send2")).click();
    WebElement longin=driver.findElement(By.cssSelector(".page-title"));
    Assert.assertEquals("MY DASHBOARD", longin.getText());

    }
@Test
    public void invalidPassLogin(){

    driver.findElement(By.cssSelector(".skip-account .label")).click();
    driver.findElement(By.cssSelector("[title=\"Log In\"] ")).click();
    driver.findElement(By.cssSelector("#email")).sendKeys("szilard.tivadar@yahoo.com");
    driver.findElement(By.cssSelector("#pass")).sendKeys("dog4life12334");
    driver.findElement(By.cssSelector("#send2")).click();
    WebElement invalid=driver.findElement(By.cssSelector(".page-title"));
        Assert.assertNotEquals("MY DASHBOARD", invalid);

    }
 @Test
    public void invalidPasswordLogin(){

     driver.findElement(By.cssSelector(".skip-account .label")).click();
     driver.findElement(By.cssSelector("[title=\"Log In\"] ")).click();
     driver.findElement(By.cssSelector("#email")).sendKeys("szilard.tivadar");
     driver.findElement(By.cssSelector("#pass")).sendKeys("dog4life");
     driver.findElement(By.cssSelector("#send2")).click();
     WebElement invalid=driver.findElement(By.cssSelector(".page-title"));
     Assert.assertNotEquals("MY DASHBOARD", invalid);
    }

@After
public void quit(){
    driver.quit();
}


}
