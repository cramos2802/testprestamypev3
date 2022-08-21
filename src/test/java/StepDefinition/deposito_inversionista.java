package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class deposito_inversionista {

    WebDriver driver;
    @Dado("realizo el deposito en la cuenta bancaria soles y dolares")
    public void realizo_el_deposito_en_la_cuenta_bancaria_soles_y_dolares() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://public.test.prestamype.com");
        // driver.get("https://www.prestamype.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.manage().timeouts().implicitlyWait(1130, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input#emailID")).sendKeys("cramos+tstinv03@prestamype.com");
        driver.manage().timeouts().implicitlyWait(1150, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input:nth-child(2)")).sendKeys("781783cerhC");
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();
        driver.findElement(By.xpath("//a[normalize-space()='Inversionista']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Estados de Cuenta']")).click();
        driver.manage().timeouts().implicitlyWait(1150, TimeUnit.SECONDS);
    }
    @Cuando("ingreso el monto correspondiente")
    public void ingreso_el_monto_correspondiente() {

        driver.findElement(By.xpath("//button[normalize-space()='+ Depósito']")).click();
        driver.findElement(By.xpath("//input[@id='nOperacion']")).sendKeys("12121233");
        driver.findElement(By.xpath("//input[@id='monto-deposit']")).sendKeys("12000");
        //driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/div[4]/div[2]/div[2]/div/div[5]/div[1]/div[3]/div[2]/div")).click();
        //driver.findElement(By.xpath("C://Users/cerh2/OneDrive/Escritorio/Prestapyme/captura.PNG")).click();
        //driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/div[4]/div[2]/div[2]/div/div[5]/div[1]/div[3]/div[2]/div).sendKeys(C://Users//cerh2//OneDrive//Escritorio//Prestapyme//captura.png"));
        driver.manage().timeouts().implicitlyWait(1150, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='aceptTerms']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Registrar depósito']")).click();


    }
    @Entonces("click para aceptar el monto correspondiente")
    public void click_para_aceptar_el_monto_correspondiente() {


    }
}
