package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login_Test {
	
	private WebDriver driver;
	PaginaLogin paginaLogin;


	@Before
	public void setUp() throws Exception {
		paginaLogin = new PaginaLogin(driver);
		driver = paginaLogin.chrimeDriverConection();
		paginaLogin.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		paginaLogin.login();
		//falta comprobar
	}

}
