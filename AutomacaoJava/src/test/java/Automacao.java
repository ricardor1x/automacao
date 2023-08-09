import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class Automacao {

    @Test
    public void acessoSite(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("http://sampleapp.tricentis.com/101/app.php");

        navegar.findElement(By.name("make")).click();


        WebElement comboBoxElement = navegar.findElement(By.id("bmw"));

        Select select = new Select(comboBoxElement);

        //select.selectByValue(By.ById)("Audi");

        // Select select = new Select(driver.findElement)(By.id("oldSelectMenu")));

       // driver.findElement(By.id("make"));

       // List<WebElement> options = select.getOptions();

    }

}