package StepDefinition;

import io.cucumber.java.es.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class cuentasbancariasdolares {

    WebDriver driver;


    @Dado("realizar la apertura de cuentas bancarias dolares")
    public void realizar_la_apertura_de_cuentas_bancarias_dolares() {

        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://public.test.prestamype.com");
        // driver.get("https://www.prestamype.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input#emailID")).sendKeys("cramos+tstinv03@prestamype.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input:nth-child(2)")).sendKeys("781783cerhC");
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();
        driver.findElement(By.xpath("//a[normalize-space()='Inversionista']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Mis cuentas bancarias']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Nueva cuenta']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona el banco']")).click();
        driver.findElement(By.xpath("//option[@value='5fbb148fc41714735242402a']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo de cuenta']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/div/div[2]/div[2]/div/div[6]/div/div/select/option[2]")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona la moneda']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/div/div[2]/div[2]/div/div[8]/div/div/select/option[3]")).click();
        driver.findElement(By.xpath("//input[@id='cc']")).sendKeys("11111111111");
        driver.findElement(By.xpath("//input[@id='cci']")).sendKeys("123456789012345600000");
        driver.findElement(By.xpath("//a[normalize-space()='Guardar']")).click();

    }
}
