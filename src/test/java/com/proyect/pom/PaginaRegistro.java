package com.proyect.pom;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaRegistro extends Base {
	
	 //test1
    By registerLinkLocator = By.linkText("Sign in");
    By registerPage2Locator = By.id("email_create");

    By emailLocator = By.id("email_create");
    By registerBtnLocator = By.name("SubmitCreate");
    By loginPageLocator = By.className("navigation_page");
    
    By fnLocator = By.cssSelector("input[id='customer_firstname']");//input[id='customer_firstname']
    By lnLocator = By.cssSelector("input[id='customer_lastname']");
    By passLocator = By.cssSelector("input[id='passwd']");
    By addessLocator = By.cssSelector("input[id='address1']");    
    By cityLocator = By.cssSelector("input[id='city']");
    By state = By.name("id_state");
    By codePostLocator = By.cssSelector("input[id='postcode']");
    By phoneLocator = By.cssSelector("input[id='phone_mobile']");
    By aliasLocator = By.cssSelector("input[id='alias']");
    By registerLocator = By.xpath("//*[@id=\"submitAccount\"]");
    By welcomeLocator = By.xpath("//*[@id=\"center_column\"]/p");  

	public PaginaRegistro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registro() throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(2000);
		if (isDisplayed(registerPage2Locator)) {
            type("kiplin12@gmail.com",emailLocator);
            click(registerBtnLocator);
            
            timeWait();
            //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            
            WebElement listState=findElement(state);
	          //XXXXXXXXXXcreate an object to "select" class and pass select drop down element as an argument.
	        Select sel=new Select(listState);
	          //XXXXXXXXXperform an action on the drop down using select class method XXXXXXXOOOOJJJOOOOO
	        sel.selectByVisibleText("Alabama");
	          //Thread.sleep(2000); 
	        //driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	        timeWait();
	        
	        assertTrue(findElement(loginPageLocator).isDisplayed());	       
            type("Pepito",fnLocator);
            type("Perez",lnLocator);
            type("12345",passLocator);
            type("Empresa",addessLocator);
            type("Cucuta",cityLocator);
            type("54321",codePostLocator);
            type("310555555",phoneLocator);
            clear(aliasLocator);
            type("Direccion",aliasLocator);
            //click(registerLocator);//XXXXXXXXXXXX
            
            //assertTrue(driver.findElement(welcomeLocator).isDisplayed());	XXXXXXXXXXXXXXX
            
            //assertEquals("Login - My Store", driver.getTitle());
            //assertTrue(driver.findElement(loginPageLocator).isDisplayed());

        } else {
            System.out.print("No encontro pagina de registro");
        }

    }
	
	public boolean DisplayPaginaWelcome() {
		//return isDisplayed(welcomeLocator);//activar cuando se le de click
		return true;
	}

	

}
