package com.proyect.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;// declaramos el objeto
	
	//creamos el contructor con el objeto webdriver q acabamos de declarar
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	// para llamar chrome driver para la automatizacion
	// es public WebDriver por q se va a regresar un objeto del tipo WebDriver
	public WebDriver chrimeDriverConection() {//este es el metodo para la conexion con el navegador
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		
	}
	
	//con este metodo creamos envioltorio llamamos los elementos q necesitamos
	/* con estos metodos se llaman los metodos de la API de selenium en caso de un cambio
	de version solo se modifica el metodo*/
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	//este metodo devuelve lista de elementos
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	//devuelve el texto de elementos q estoy pasando como parametros string webelement
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	// este devuelve atravez del localizador string locator
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	//con este se envia entrada por teclado type=teclado en ingles
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	//metodo para detectar click
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	//metodo booleano si esta listo para ser utilizado retorna verdadero o falso
	//catch es por q no detecta y devuelve falso
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	//abre url la pagina visit
	
	public void visit(String url) {
		driver.get(url);
	}
	
	//mio espera
	
	public void timeWait() {
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	}
	
	//clear
	
	public void clear(By locator) {
		driver.findElement(locator).clear();
	}
	
	
}
