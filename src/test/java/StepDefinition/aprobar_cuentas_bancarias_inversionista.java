package StepDefinition;

import io.cucumber.java.es.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class aprobar_cuentas_bancarias_inversionista {

    WebDriver driver;
    @Dado("realizo la aprobacion de las cuentas bancarias a un inversionista")
    public void realizo_la_aprobacion_de_las_cuentas_bancarias_a_un_inversionista() {

        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://admin.test.prestamype.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div//input[@class='input'])[1]")).sendKeys("info@prestamype.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yaVGedM9Tr");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Comenzar']")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[12]/label[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Cuentas bancarias']")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/div[1]/span[2]/i[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[7]/div/div[2]/div[1]/div/div[1]")).click();

    }
}
