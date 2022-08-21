package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejemplogoogle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.falabella.com.pe/";
        String url2 = "https://simple.ripley.com.pe/";
        driver.get(url);
        driver.getCurrentUrl();


        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    }
}
