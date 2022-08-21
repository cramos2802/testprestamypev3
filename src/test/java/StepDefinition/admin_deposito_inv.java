package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class admin_deposito_inv {

    WebDriver driver;

    @Dado("realizo la busqueda del nombre del inversionista con los depositos pendientes")
    public void realizo_la_busqueda_del_nombre_del_inversionista_con_los_depositos_pendientes() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://admin.test.prestamype.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div//input[@class='input'])[1]")).sendKeys("info@prestamype.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yaVGedM9Tr");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Comenzar']")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[12]/label[1]")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Depósitos y retiros']")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/span[2]")).click();

    }
    @Cuando("ingreso los datos faltantes del deposito")
    public void ingreso_los_datos_faltantes_del_deposito() {

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[5]/div/div[2]/div[2]/div[13]/div/div[2]/input")).sendKeys("121234");
        driver.findElement(By.xpath("//textarea[@class='input textarea']")).sendKeys("prueba test");

    }
    @Entonces("proceder con la transferencia")
    public void proceder_con_la_transferencia() {

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[5]/div/div[2]/div[2]/div[12]/div/div[2]/div/div[1]")).click();


    }
}
