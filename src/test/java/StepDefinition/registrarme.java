package StepDefinition;/*
package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class registrarme {


    WebDriver driver;

    */
/*@Dado("^ingreso al navegador e ingreso a la pagina$")
    public void ingreso_al_navegador_e_ingreso_a_la_pagina() throws MalformedURLException {

//
//        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();

    }
    @Cuando("ingreso al registro de la web prestamype")
    public void ingreso_al_registro_de_la_web_prestamype() {
        driver.navigate().to("https://public.test.prestamype.com/");
        driver.get("https://www.prestamype.com");
        driver.findElement(By.linkText("Regístrate")).click();
        driver.manage().timeouts().implicitlyWait(2030, TimeUnit.SECONDS);
    }
    @Entonces("ingreso tipo de documento dni, numero de documento, telefono, correo electronico, contraseña,confirmar contraseña")
    public void ingreso_tipo_de_documento_dni_numero_de_documento_telefono_correo_electronico_contraseña_confirmar_contraseña() {
//        WebElement dni = driver.findElement(By.id("document"));
//        dni.sendKeys("44645678"); //32021203 // empresaria 47150499 inversionista 98467563
//        driver.findElement(By.id("phone")).sendKeys("98548956");
//        driver.findElement(By.id("email")).sendKeys("cramos+tstinv02@prestamype.com");
//        driver.findElement(By.xpath("//div//input[@type=\"password\"]")).sendKeys("781783cerhC");
//        driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("781783cerhC");
//        driver.manage().timeouts().implicitlyWait(12190, TimeUnit.SECONDS);

    }
    @Entonces("aceptar terminos y condiciones")
    public void aceptar_terminos_y_condiciones() {
//        driver.findElement(By.id("aceptTerms")).click();

    }
    @Entonces("realizar click en el boton Registrame")
    public void realizar_click_en_el_boton_registrame() {
//        driver.findElement(By.xpath("//div//a[@class='send btn-primary-default']")).click();

    }
    @Entonces("recepcion a correo registrado")
    public void recepcion_a_correo_registrado() {

    }*//*


    @Cuando("ingreso al registro de la web prestamype")
    public void ingreso_al_registro_de_la_web_prestamype() {
        driver.navigate().to("https://public.test.prestamype.com/");
        driver.get("https://www.prestamype.com");
        driver.findElement(By.linkText("Regístrate")).click();
        driver.manage().timeouts().implicitlyWait(2030, TimeUnit.SECONDS);
    }

    @Dado("^ingreso al navegador e ingreso a la pagina de prestamype$")
    public void ingreso_al_navegador_e_ingreso_a_la_pagina_de_prestamype() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://public.test.prestamype.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Regístrate")).click();

    }
//    @Entonces("^ingreso dni, {int}, {int}, cramos+tstinv03@prestamype.com, 781783cerhC,781783cerhC, true, true$")
//    public void ingreso_dni_cramos_tstinv03_prestamype_com_781783cerh_c_781783cerh_c_true_true(Integer int1, Integer int2) {
//
//           WebElement dni = driver.findElement(By.id("document"));
//           dni.sendKeys("44645678"); //32021203 // empresaria 47150499 inversionista 98467563
//          driver.findElement(By.id("phone")).sendKeys("98548956");
//          driver.findElement(By.id("email")).sendKeys("cramos+tstinv02@prestamype.com");
//          driver.findElement(By.xpath("//div//input[@type=\"password\"]")).sendKeys("781783cerhC");
//          driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("781783cerhC");
//          driver.manage().timeouts().implicitlyWait(12190, TimeUnit.SECONDS);
//    }

}
*/
