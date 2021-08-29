package com.proyect.pom;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaContactenos extends Base {
	
	By contacLocator = By.xpath("//*[@id=\"contact-link\"]/a");
    By subjectLocator = By.name("id_contact");
    By emailContacLocator = By.cssSelector("input[id='email']");
    By messagecLocator = By.cssSelector("textarea[id='message']");
    By sendLocator = By.xpath("//*[@id=\"submitMessage\"]");
    By confirmSendLocator = By.xpath("//*[@id=\"center_column\"]/p");


	public PaginaContactenos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void contactenos() throws InterruptedException {
		
		click(contacLocator);
    	Thread.sleep(2000);
    	if (isDisplayed(messagecLocator)) {
    		
    		WebElement sub=findElement(subjectLocator);
	        Select sel=new Select(sub);
	        sel.selectByVisibleText("Webmaster");
	        type("kiplin@gmail.com",emailContacLocator);
	        type("Abc 123 %&/",messagecLocator);
	        click(sendLocator);
	        
	        //assertTrue(driver.findElement(confirmSendLocator).isDisplayed());
    	}
		
	}
	
	public boolean DisplayPaginaContact() {
		return isDisplayed(confirmSendLocator);
		
	}
	
	
}
