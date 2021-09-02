package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Registro_Test {
	
	private WebDriver driver;//declaremos el webdriver
	PaginaRegistro paginaRegistro;//declaramos un objero de la pagina registro para traer los metos de esa pagina

	@Before
	public void setUp() throws Exception {
		paginaRegistro = new PaginaRegistro(driver);
		driver = paginaRegistro.chrimeDriverConection();// aqui llamamos el metodo donde creamos la conexion xon el chrome driver
		paginaRegistro.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		paginaRegistro.registro();
		//assertTrue(paginaRegistro.DisplayPaginaWelcome());
	}

}
