package com.proyect.pom;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCompras extends Base{
	
	By registerLinkLocator = By.linkText("Sign in");
    By registerPage2Locator = By.id("email_create");
    By emailLoginLocator = By.name("email");
    By passLoginLocator = By.name("passwd");
    By loginBtnLocator = By.name("SubmitLogin");
    By back = By.xpath("//*[@id=\"header_logo\"]/a/img");
	
	By addToCar = By.xpath(".//*[text()='Add to cart']");
    By check = By.xpath(".//a[contains(@title,'Proceed to checkout')]");
    By summary = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
    By address = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
    By shipping = By.xpath("//*[@id=\"form\"]/p/button");
    By terms = By.xpath("//*[@id=\"cgv\"]");
    By payBank = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div");
    By confirm = By.xpath("//*[@id=\"cart_navigation\"]/button");
    By viewOrders = By.xpath("//*[@id=\"center_column\"]/p/a");
    By orders = By.xpath("//*[@id=\"center_column\"]/h1");

	public PaginaCompras(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void compras() throws InterruptedException {
		
		 	click(registerLinkLocator);
	        Thread.sleep(2000);
	        if (isDisplayed(registerPage2Locator)) {
	            type("kiplin567@gmail.com",emailLoginLocator);
	            type("12345",passLoginLocator);

	            click(loginBtnLocator);
	            click(back);

	            visit("http://automationpractice.com/index.php?id_product=4&controller=product");
	            timeWait();
	            click(addToCar);
	            click(check);
	            click(summary);
	            click(address);
	            click(terms);
	            click(shipping);
	            click(payBank);
	            click(confirm);
	            click(viewOrders);

	            //assertTrue(isDisplayed(orders));
            
	        }
	        else {
	        	System.out.println("No se encontro pagina de registro");
	        }
	}
	
	public boolean DisplayPagina() {
		return isDisplayed(orders);
	}
	
	

}
