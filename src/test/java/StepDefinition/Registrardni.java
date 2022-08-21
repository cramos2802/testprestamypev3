package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registrardni {

    WebDriver driver;

    //private WebElement ces;
    private WebElement phone;
    private WebElement email;
    private WebElement pass;
    private WebElement repass;
    private WebElement doc;
    String url= "https://public.test.prestamype.com/";

    @Dado("ingreso al navegador")
    public void ingreso_al_navegador() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Regístrate")).click();

    }
    @Cuando("ingreso web prestamype en la seccion registro")
    public void ingreso_web_prestamype_en_la_seccion_registro() {

        driver.manage().timeouts().implicitlyWait(2030, TimeUnit.SECONDS);
    }

    @Entonces("ingresar {string} y {string} y {string} y {string} y  {string}")
    public void ingresar_y_y_y_y(String documentnacional, String fono, String mail, String pas, String repas) {

        doc = driver.findElement(By.id("document"));
        doc.sendKeys(documentnacional);
        phone = driver.findElement(By.id("phone"));
        phone.sendKeys(fono);
        email= driver.findElement(By.id("email"));
        email.sendKeys(mail);
        //cramos+testce01@prestamype.com
        pass = driver.findElement(By.xpath("//div//input[@type=\"password\"]"));
        pass.sendKeys(pas);
        repass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        repass.sendKeys(repas);

    }
    @Entonces("acepto terminos condiciones")
    public void acepto_terminos_condiciones() {

        driver.findElement(By.id("aceptTerms")).click();

    }
    @Entonces("realizar click boton registrarme")
    public void realizar_click_boton_registrarme() {

        driver.findElement(By.xpath("//div//a[@class='send btn-primary-default']")).click();

    }
    @Entonces("recepcion de correo registrado")
    public void recepcion_de_correo_registrado() {
        driver.manage().timeouts().implicitlyWait(12030, TimeUnit.MINUTES);
        //driver.navigate().refresh();
//        driver.findElement(By.xpath("(//p[normalize-space()='Vende tus facturas o solicita un préstamo.'])[1]")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Confirming']")).click();
//        driver.findElement(By.xpath("//*[@id=\"//a[normalize-space()='Inversionista']\"]/div/div/main/div/div/div/section/div/div[2]/a[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"//a[normalize-space()='Oportunidades']\"]/div/div/main/div/div/div/section/div/div[2]/a[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"//a[normalize-space()='Completar mis datos']\"]/div/div/main/div/div/div/section/div/div[2]/a[2]")).click();
//


    }
    @Entonces("ingreso a la seccion de inversionista")
    public void ingreso_a_la_seccion_de_inversionista() {

    }
    @Entonces("solicitan completar mis datos de perfil de inversionista")
    public void solicitan_completar_mis_datos_de_perfil_de_inversionista() {

    }


}
