import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguageTest {



     @Test
    public void Language(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");

         Select mydrpdwn= new Select(driver.findElement(By.id("select-language")));
        mydrpdwn.selectByVisibleText("German");
         WebElement german=driver.findElement(By.cssSelector(".skip-account"));

         Assert.assertNotEquals("ACCOUNT", german.getText());

    }
}
