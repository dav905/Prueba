package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Compra_Test {
	
	private WebDriver driver;
	PaginaCompras paginaCompras;

	@Before
	public void setUp() throws Exception {
		paginaCompras = new PaginaCompras(driver);
		driver = paginaCompras.chrimeDriverConection();
		paginaCompras.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		paginaCompras.compras();
		assertTrue(paginaCompras.DisplayPagina());
	}

}
