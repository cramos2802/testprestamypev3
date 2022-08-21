package StepDefinition;

import io.cucumber.java.es.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Desaprobar_inversionista {

    WebDriver driver;

    @Dado("realizo la busqueda del nombre del inversionista por nombre corroborar que esta en la seccion desaprobar")
    public void realizo_la_busqueda_del_nombre_del_inversionista_por_nombre_corroborar_que_esta_en_la_seccion_desaprobar() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://admin.test.prestamype.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div//input[@class='input'])[1]")).sendKeys("info@prestamype.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yaVGedM9Tr");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Comenzar']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]")).click();
        driver.findElement(By.xpath("//a[@href='/inversionistas']//span[@class='title-menu'][normalize-space()='Listado']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[2]/div/div[2]/div[1]/ul/li[3]")).click();
        driver.findElement(By.xpath("//input[@placeholder='Ingrese texto']")).sendKeys("Lourdes Castro Cortez");
        driver.findElement(By.xpath("//div[@class='combobox mr3']")).click();
        driver.findElement(By.xpath("//div[@class='combobox__tags__item'][normalize-space()='Nombre']")).click();
        driver.findElement(By.xpath("//button[@class='p-relative custom-btn btn btn-primary']")).click();


    }
}
