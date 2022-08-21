package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class registramece {

    WebDriver driver;

    private WebElement ce;
    private WebElement phone;
    private WebElement email;
    private WebElement pass;
    private WebElement repass;
    String url= "https://public.test.prestamype.com/";

    @Dado("^ingreso al navegador chrome$")
    public void ingreso_al_navegador() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Regístrate")).click();

    }
    @Cuando("^ingreso web prestamype al registro$")
    public void ingreso_web_prestamype_al_registro() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Entonces("ingreso {string} y {string} y {string} y {string} y  {string}")
    public void numero_de_documento_telefono_correo_electronico_contraseña_confirmar_contraseña(String carnetextranjeria, String telefono, String correo, String password, String repassword) {

        driver.findElement(By.xpath("//div[@id='__layout']//section[@class='registro']/div[@class='right']/div[@class='Formulario']/div[@class='container']//form[@class='admin-form register-form']//select/option[@value='ce']")).click();
        ce = driver.findElement(By.xpath("/html//input[@id='document']"));
        ce.sendKeys(carnetextranjeria);
        driver.manage().timeouts().implicitlyWait(1929, TimeUnit.SECONDS);
        phone = driver.findElement(By.id("phone"));
        phone.sendKeys(telefono);
        email= driver.findElement(By.id("email"));
        email.sendKeys(correo);
        //cramos+testce01@prestamype.com
        pass = driver.findElement(By.xpath("//div//input[@type=\"password\"]"));
        pass.sendKeys(password);
        repass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
        repass.sendKeys(repassword);
    }
    @Entonces("^aceptar terminos y condiciones$")
    public void aceptar_terminos_y_condiciones() {

        driver.findElement(By.id("aceptTerms")).click();

    }
    @Entonces("^realizar click boton Registrarme$")
    public void realizar_click_boton_Registrarme() {
        driver.findElement(By.xpath("//div//a[@class='send btn-primary-default']")).click();

    }
}
