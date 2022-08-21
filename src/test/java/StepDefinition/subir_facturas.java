package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class subir_facturas {

    WebDriver driver;

    @Dado("ingreso al navegador e ingreso a la pagina web")
    public void ingreso_al_navegador_e_ingreso_a_la_pagina_web() {

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
    @Cuando("realizo el login, me dirijo a la plataforma web")
    public void realizo_el_login_me_dirijo_a_la_plataforma_web() {
        driver.findElement(By.xpath("//ul[@class='list']//a[normalize-space()='Vender facturas']")).click();

    }
    @Entonces("seleciono la empresa y cliente, ingreso la empresa e ingreso los datos de confirming")
    public void seleciono_la_empresa_y_cliente_ingreso_la_empresa_e_ingreso_los_datos_de_confirming() {

        /*driver.findElement(By.xpath("//label[normalize-space()='Agregar empresa']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona el tipo']")).click();
        driver.findElement(By.xpath("//option[@value='5fbb2d636bb2106227967fa2']")).click();
        driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20607873098");
        driver.findElement(By.xpath("//input[@data-qa='businessName']")).sendKeys("FABRIMETAL ELLEN EMPRESA INDIVIDUAL DE RESPONSABLIDAD LIMITADA.");
        driver.findElement(By.xpath("//input[@id='phoneProvider']")).sendKeys("974664773");
        driver.findElement(By.xpath("//input[@id='terms_and_conditions']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Guardar']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Aceptar']")).click();
        driver.findElement(By.xpath("//div[@class='panel-close']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona empresa']")).click();
        driver.findElement(By.xpath("//option[@value='62ed9cc7a2afb2ac202663c1']")).click();*/


        driver.findElement(By.xpath("//label[normalize-space()='Agregar cliente']")).click();
        driver.findElement(By.xpath("//input[@id='idRuc']")).sendKeys("20278966004");
        driver.findElement(By.xpath("//input[@data-qa='razon_social']")).sendKeys("PESQUERA CENTINELA SOCIEDAD ANONIMA CERRADA");
        driver.findElement(By.xpath("//input[@id='phoneClient']")).sendKeys("974664773");
        driver.findElement(By.xpath("//input[@id='nombre_contacto']")).sendKeys("Walter rios");
        driver.findElement(By.xpath("//input[@data-qa='email_contacto']")).sendKeys("wrios@yopmai.com");
        driver.findElement(By.xpath("//input[@id='phoneContact']")).sendKeys("984757455");
        driver.findElement(By.xpath("//a[normalize-space()='Guardar']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Aceptar']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Continuar']")).click();
        driver.findElement(By.xpath("//input[@id='fecha_pago']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/div/div/div[1]/div/div/div/div[4]/div[3]/div[1]/div/div[1]/div[2]/div/span[39]")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona moneda']")).click();
        ///WebElement soles = driver.findElement(By.xpath("//option[@value='5fb5a0e69cf11dcf52f63f26']"));
        //soles.click();
        driver.findElement(By.xpath("//option[@value='5fb5a0e69cf11dcf52f63f27']")).click();
        WebElement subir = driver.findElement(By.xpath("//div[@class='btn-upload']"));
        subir.click();
        driver.findElement(By.xpath("//div[@class='btn-upload']")).sendKeys("C:\\fakepath\\dolares_20550081327_XLOG_TERMINALES_S_A_C.xml");

    }
    @Entonces("selecciono la empresa y proveedor para confirming, ingresi los datos incompletos")
    public void selecciono_la_empresa_y_proveedor_para_confirming_ingresi_los_datos_incompletos() {

    }

}
