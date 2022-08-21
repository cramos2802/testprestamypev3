package StepDefinition;

import io.cucumber.java.es.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class factoring_public {

    WebDriver driver;



    @Dado("que las oportunidades se pueden visualizar para los inversionistas")
    public void que_las_oportunidades_se_pueden_visualizar_para_los_inversionistas() {

        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://public.test.prestamype.com");
        // driver.get("https://www.prestamype.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input#emailID")).sendKeys("cramos+010inversionista@prestamype.com");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(".input:nth-child(2)")).sendKeys("781783cerhC");
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div/aside/div[3]/div[1]/ul/li[1]")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona empresa']")).click();
        driver.findElement(By.xpath("//option[@value='62e164823e90ab8944df2b2a']")).click();
        driver.findElement(By.xpath("//select[@placeholder='Selecciona cliente']")).click();
        driver.findElement(By.xpath("//option[@value='62b62f4a67d52633832f07eb']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Continuar']")).click();
        driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[@class='application']/div[@class='application--wrap']/main[@class='main']/div[@class='main__wrap']/div[@class='container']/div[@class='page-main']/div[@class='page-body']/div[@class='grid content']/div[@class='col-12 col-md-9']/div[@class='grid']/div[@class='col-12 col-md-11']/div[@class='steps']/div[@class='tab-step-2']/div[@class='grid']/div[@class='col-12 col-md-4 date']/div[@class='wct-input-datepicker']/div[@class='vdp-datepicker']/div[1]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"moneda\"]/select")).click();
        driver.findElement(By.xpath("//option[@value='5fb5a0e69cf11dcf52f63f26']")).click();


    }
}
