package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Contactenos_Test {
	
	private WebDriver driver;
	PaginaContactenos paginaContactenos;

	@Before
	public void setUp() throws Exception {
		paginaContactenos = new PaginaContactenos(driver);
		driver = paginaContactenos.chrimeDriverConection();
		paginaContactenos.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		paginaContactenos.contactenos();
		assertTrue(paginaContactenos.DisplayPaginaContact());
	}

}
