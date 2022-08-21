package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class inversionista {

    WebDriver driver;
    private WebElement correo;
    private WebElement contra;
    private  WebElement iniciosesion;
    private WebElement ocupacion;
    private WebElement departamento;
    private WebElement provincia;
    private WebElement distrito;
    private WebElement direccion;
    String url="https://public.test.prestamype.com";


    @Dado("ingreso al navegador e ingresar a la web prestamype")
    public void ingreso_al_navegador_e_ingresar_web_prestamype() {

        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        correo = driver.findElement(By.cssSelector(".input#emailID"));
        //correo.sendKeys(correos);
       /* driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input:nth-child(2)")).sendKeys("781783cerhC");
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();
*/
    }
//    @Cuando("ingreso a la seccion de inversionista a invertir")
//    public void ingreso_a_la_seccion_de_inversionista_a_invertir() {
//
//        /*driver.findElement(By.xpath("//p[normalize-space()='Vende tus facturas o solicita un préstamo.']")).click();
//        driver.findElement(By.xpath("//p[normalize-space()='Vender las facturas de mi empresa.']")).click();
//        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[2]/div[1]/ul/li[2]/a")).click();*/
//        driver.findElement(By.xpath("//a[normalize-space()='Inversionista']")).click();
//
//        driver.findElement(By.xpath("//a[normalize-space()='Oportunidades']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Completar mis datos']")).click();
//
//
//    }
//    @Entonces("me solicitan completar mis datos de perfil de inversionista")
//    public void me_solicitan_completar_mis_datos_de_perfil_de_inversionista() {
//
//        driver.findElement(By.xpath("//input[@data-qa='ocupation']")).sendKeys("analista");
//        driver.findElement(By.xpath("//select[@placeholder='Selecciona el departamento']//option[@value='13']")).click();
//        driver.findElement(By.xpath("//select[@placeholder='Selecciona la provincia']//option[@value='113']")).click();
//        driver.findElement(By.xpath("//select[@placeholder='Selecciona el distrito']//option[@value='1160']")).click();
//        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("larco");
//        driver.findElement(By.xpath("//a[normalize-space()='Continuar']")).click();
//        //driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/input[1]")).click();
//
//
//        //File file = new File("C:\\Users\\cerh2\\OneDrive\\Escritorio\\Prestapyme\\captura.png");
//        driver.manage().timeouts().implicitlyWait(12350, TimeUnit.SECONDS);
//        driver.findElement(By.id("aceptContract")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Continuar']")).click();
//
//
//
//    }

    @Cuando("que realizo login ingreso {string} y {string} como inversionista")
    public void que_realizo_login_ingreso_y_como_inversionista(String email, String pas) {

        correo = driver.findElement(By.cssSelector(".input#emailID"));
        correo.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        contra = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        contra.sendKeys(pas);
        iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();


    }
    @Entonces("ingreso a la seccion de inversionista a invertir")
    public void ingreso_a_la_seccion_de_inversionista_a_invertir() {

        driver.findElement(By.xpath("//p[normalize-space()='Vende tus facturas o solicita un préstamo.']")).click();
        driver.findElement(By.xpath("//p[normalize-space()='Vender las facturas de mi empresa.']")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Inversionista']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Oportunidades']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Completar mis datos']")).click();

    }
    @Entonces("me solicitan completar mis datos de perfil de inversionista ingreso ocupacion {string}, direccion {string}")
    public void me_solicitan_completar_mis_datos_de_perfil_de_inversionista(String ocupation, String direc) {

        ocupacion = driver.findElement(By.xpath("//input[@data-qa='ocupation']"));
        ocupacion.sendKeys(ocupation);
        departamento = driver.findElement(By.xpath("//select[@placeholder='Selecciona el departamento']//option[@value='13']"));
        departamento.click();
        provincia = driver.findElement(By.xpath("//select[@placeholder='Selecciona la provincia']//option[@value='113']"));
        provincia.click();
        distrito = driver.findElement(By.xpath("//select[@placeholder='Selecciona el distrito']//option[@value='1160']"));
        distrito.click();
        direccion = driver.findElement(By.xpath("//input[@data-qa='address']"));
        direccion.sendKeys(direc);
//        driver.findElement(By.xpath("//a[normalize-space()='Continuar']")).click();

    }


}
