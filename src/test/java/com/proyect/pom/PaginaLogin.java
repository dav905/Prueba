package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin extends Base {
	
	By registerLinkLocator = By.linkText("Sign in");
	By registerPage2Locator = By.id("email_create");
	By emailLoginLocator = By.name("email");
    By passLoginLocator = By.name("passwd");
    By loginBtnLocator = By.name("SubmitLogin");
    By back = By.xpath("//*[@id=\"header_logo\"]/a/img");
    
    public PaginaLogin(WebDriver driver) {
    	super(driver);
    }
    
    public void login() throws InterruptedException {
    	
    	 click(registerLinkLocator);
         Thread.sleep(2000);
         if (isDisplayed(registerPage2Locator)) {
             type("kiplin@gmail.com",emailLoginLocator);
             type("12345",passLoginLocator);

             click(loginBtnLocator);
             click(back);
	    }
	
	}
}