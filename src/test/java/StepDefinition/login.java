package StepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver driver;
    private WebElement correo;
    private WebElement contraseña;
    String url="https://public.test.prestamype.com";

    @Dado("que ingreso a la pagina de prestamype")
    public void que_ingreso_a_la_pagina_de_prestamype() {
        System.setProperty("webdriver.chrome.driver","C:/Webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Iniciar sesión")).click();

    }
    @Cuando("realizo click en login {string} y {string}")
    public void realizo_click_en_login_y(String email, String pass) {
        driver.manage().timeouts().implicitlyWait(1130, TimeUnit.SECONDS);
        correo = driver.findElement(By.cssSelector(".input#emailID"));
        correo.sendKeys(email);
        //.sendKeys("cramos+testce01@prestamype.com");
        driver.manage().timeouts().implicitlyWait(1150, TimeUnit.SECONDS);
        contraseña = driver.findElement(By.cssSelector(".input:nth-child(2)"));
        contraseña.sendKeys(pass);
        WebElement iniciosesion = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/nav/div/div[4]/form/button"));
        iniciosesion.click();

    }


}
