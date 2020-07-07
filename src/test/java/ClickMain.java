import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMain {

    WebDriver driver;
    @Before
    public void init(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.manage().window().maximize();
    }

    @Test
    public void allMen(){
    driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-2.parent > a")).click();
        Assert.assertEquals("http://testfasttrackit.info/selenium-test/men/all-men.html", driver.getTitle());
    }

    @Test
    public void shirtsMen(){

        driver.findElement(By.cssSelector("nav-1-2 ")).click();
        //nu reusesc nici cum sa selectez din meniul acela.....
    }

    @Test
    public void something(){


    }
}

