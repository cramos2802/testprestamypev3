package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class admin_aprobar_inversionista {

    WebDriver driver;

    @Dado("realizo la busqueda del nombre del inversionista")
    public void realizo_la_busqueda_del_nombre_del_inversionista() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://admin.test.prestamype.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//div//input[@class='input'])[1]")).sendKeys("info@prestamype.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yaVGedM9Tr");
        driver.manage().timeouts().implicitlyWait(230, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[normalize-space()='Comenzar']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]")).click();
        driver.findElement(By.xpath("//a[@href='/inversionistas']//span[@class='title-menu'][normalize-space()='Listado']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Ingrese texto']")).sendKeys("Roberto Villafuerte Cañari");
        driver.manage().timeouts().implicitlyWait(8230, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//div[@class='combobox mr3']")).click();
        driver.findElement(By.xpath("//div[@class='combobox__tags__item'][normalize-space()='Nombre']")).click();
        driver.findElement(By.xpath("//button[@class='p-relative custom-btn btn btn-primary']")).click();

    }
    @Cuando("ingreso los datos faltantes")
    public void ingreso_los_datos_faltantes() {
        driver.findElement(By.xpath("//span[@class='btn-edit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='cerrar']")).click();
        driver.manage().timeouts().implicitlyWait(9130, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//span[@class='btn-edit'])[1]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[9]/div[1]/div[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[@value='male']")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[19]/div[1]/div[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[@value='single']")).click();
        driver.findElement(By.xpath(("//textarea[@placeholder='Comentarios referentes al inversionista']"))).sendKeys("Roberto Villafuerte Cañari");
        driver.manage().timeouts().implicitlyWait(9130, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("(//div[@class='d-flex'])[1]//div[@class='d-flex']//div[1]//label[1]")).click();
        driver.findElement(By.xpath("(//select[@placeholder='Seleccione'])[8]")).click();



    }
    @Entonces("realizo la aprobacion del inversionista")
    public void realizo_la_aprobacion_del_inversionista() {


    }

}
