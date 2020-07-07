import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    @Test

    public void Search(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("LINEN");
        driver.findElement(By.cssSelector(".search-button")).click();
        driver.findElement(By.cssSelector(".col-main")).getText();
        WebElement Search= driver.findElement(By.cssSelector(".col-main"));
        Assert.assertTrue(Search.getText().contains("LINEN"));
    }
    @Test

    public void Src(){
        System.setProperty("webdriver.chrome.driver" , "resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#search")).sendKeys("LINEN");
        driver.findElement(By.cssSelector(".search-button")).click();
    }
}
