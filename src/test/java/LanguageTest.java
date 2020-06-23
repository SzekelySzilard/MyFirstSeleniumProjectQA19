import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguageTest {
    public void Language(){
        WebDriver driver= new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");



         Select mydrpdwn= new Select(driver.findElement(By.id("select-language")));
        mydrpdwn.selectByVisibleText("German");

    }
}
