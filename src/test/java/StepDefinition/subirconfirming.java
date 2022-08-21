package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class subirconfirming {
    WebDriver driver;

    @Dado("ingreso al navegador e ingreso a web prestamype")
    public void ingreso_al_navegador_e_ingreso_a_web_prestamype() {

        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://public.test.prestamype.com");
        // driver.get("https://www.prestamype.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input#emailID")).sendKeys("cramos+testemp06@prestamype.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input:nth-child(2)")).sendKeys("781783cerhC");
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();

    }
    @Cuando("realizo el login, me dirijo a la plataforma intranet")
    public void realizo_el_login_me_dirijo_a_la_plataforma_intranet() {

        driver.findElement(By.xpath("//a[@class='nuxt-link-exact-active active-link']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[3]/div[2]/ul/li[1]")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Agregar empresa']")).click();

    }
    @Entonces("ingreso la empresa y proveedor e ingreso los datos faltantes")
    public void ingreso_la_empresa_y_proveedor_e_ingreso_los_datos_faltantes() {

        driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo']")).click();
        driver.findElement(By.xpath("//option[@value='5fbb2d636bb2106227967fa2']")).click();
//        driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20145038384");
//        driver.findElement(By.xpath("//input[@data-qa='businessName']")).sendKeys("AQA QUIMICA SA");
          driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20502073401");
          driver.findElement(By.xpath("//input[@data-qa='businessName']")).sendKeys("CENTURY ECOLOGICAL CORPORATION S.A.C. - ECOCENTURY S.A.C");
        driver.findElement(By.xpath("//input[@id='phoneProvider']")).sendKeys("8984774747");
        driver.findElement(By.xpath("//input[@id='terms_and_conditions']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Guardar']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Aceptar']")).click();
        //driver.findElement(By.xpath("//i[@class='fas fa-times']")).click();

        driver.findElement(By.xpath("//label[normalize-space()='Agregar proveedor']")).click();
        //driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20502073401");
        //driver.findElement(By.xpath("//input[@data-qa='razon_social']")).sendKeys("CENTURY ECOLOGICAL CORPORATION S.A.C");

        driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20603366426");
        driver.findElement(By.xpath("//input[@data-qa='razon_social']")).sendKeys("LLABA PERU E.I.R.L.");
        driver.findElement(By.xpath("//input[@id='phoneClient']")).sendKeys("98376453");
        driver.findElement(By.xpath("//input[@id='nombre_contacto']")).sendKeys("Luis Eduardo");//nombre de proveedor con 4 carcteres
        driver.findElement(By.xpath("//input[@data-qa='email_contacto']")).sendKeys("wrios@yopmail.com");
        driver.findElement(By.xpath("//input[@id='phoneContact']")).sendKeys("98477473");
        driver.findElement(By.xpath("//a[normalize-space()='Guardar']")).click();

    }
}
