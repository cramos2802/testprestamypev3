package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class empresario {
    WebDriver driver;
    private WebElement iniciosesion;
    private WebElement biniciosesion;
    private WebElement empcorre;
    private WebElement empcont;
    private WebElement venderfactura;
    private WebElement completardatos;
    private WebElement ocupacion;
    private WebElement departament;
    private WebElement provincia;
    private WebElement distrito;
    String url= "https://public.test.prestamype.com/";


    @Dado("realizar click en login {string} y {string}")
    public void realizar_click_en_login_y(String empcorreo, String empcontrasena) {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        // driver.get("https://www.prestamype.com/");
        driver.manage().window().maximize();
        iniciosesion = driver.findElement(By.linkText("Iniciar sesión"));
        iniciosesion.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        empcorre = driver.findElement(By.cssSelector(".input#emailID"));
        empcorre.sendKeys(empcorreo);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        empcont = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        empcont.sendKeys(empcontrasena);
        biniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        biniciosesion.click();

    }
    @Cuando("ingreso a la seccion de factoring a vender facturas")
    public void ingreso_a_la_seccion_de_factoring_a_vender_facturas() {

        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/section/div/div[2]/a[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/main/div/div/div/section/div/div[2]/a[1]/div")).click();
        venderfactura = driver.findElement(By.xpath("//ul[@class='list']//a[normalize-space()='Vender facturas']"));
        venderfactura.click();


    }
    @Entonces("me solicitan completar mis datos de perfil")
    public void me_solicitan_completar_mis_datos_de_perfil() {

        completardatos =driver.findElement(By.xpath("//div//div//a[normalize-space()='Completar mis datos']"));
        completardatos.click();
        ocupacion = driver.findElement(By.xpath("//input[@data-qa='ocupation']"));
        ocupacion.sendKeys("analista");
        departament = driver.findElement(By.xpath("//select[@placeholder='Selecciona el departamento']//option[@value='13']"));
        //departament = driver.findElement(By.xpath("(//option[normalize-space()='AMAZONAS'])[1]"));
        departament.click();
        provincia = driver.findElement(By.xpath("//select[@placeholder='Selecciona la provincia']//option[@value='113']"));
        provincia.click();
        distrito = driver.findElement(By.xpath("//select[@placeholder='Selecciona el distrito']//option[@value='1160']"));
        distrito.click();
        driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("av larco 564");
       // driver.findElement(By.xpath("//a[normalize-space()='Guardar']")).click();


    }

}
