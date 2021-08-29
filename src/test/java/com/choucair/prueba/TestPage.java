package com.choucair.prueba;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue ;

//import java.util.List;
import java.util.concurrent.TimeUnit ;

import org.junit.After ;
import org.junit.Before ;
import org.junit.Test ;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver ;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class TestPage {

    private WebDriver driver;
    
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

    //test2 
    By emailLoginLocator = By.name("email");
    By passLoginLocator = By.name("passwd");
    By loginBtnLocator = By.name("SubmitLogin");
    By back = By.xpath("//*[@id=\"header_logo\"]/a/img");

    //test3  
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
    
    //test4 
    By contacLocator = By.xpath("//*[@id=\"contact-link\"]/a");
    By subjectLocator = By.name("id_contact");
    By emailContacLocator = By.cssSelector("input[id='email']");
    By messagecLocator = By.cssSelector("textarea[id='message']");
    By sendLocator = By.xpath("//*[@id=\"submitMessage\"]");
    By confirmSendLocator = By.xpath("//*[@id=\"center_column\"]/p");

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");

    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void registro() throws InterruptedException {

        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPage2Locator).isDisplayed()) {
            driver.findElement(emailLocator).sendKeys("kiplin5@gmail.com");
            driver.findElement(registerBtnLocator).click();
            
            
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            
            WebElement listState=driver.findElement(state);
	          //XXXXXXXXXXcreate an object to "select" class and pass select drop down element as an argument.
	        Select sel=new Select(listState);
	          //XXXXXXXXXperform an action on the drop down using select class method XXXXXXXOOOOJJJOOOOO
	        sel.selectByVisibleText("Alabama");
	          //Thread.sleep(2000); 
	        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	        assertTrue(driver.findElement(loginPageLocator).isDisplayed());	       
            driver.findElement(fnLocator).sendKeys("Pepito");
            driver.findElement(lnLocator).sendKeys("Perez");
            driver.findElement(passLocator).sendKeys("12345");
            driver.findElement(addessLocator).sendKeys("Empresa");
            driver.findElement(cityLocator).sendKeys("Cucuta");
            driver.findElement(codePostLocator).sendKeys("54321");
            driver.findElement(phoneLocator).sendKeys("310555555");
            driver.findElement(aliasLocator).clear();
            driver.findElement(aliasLocator).sendKeys("Direccion");
            //driver.findElement(registerLocator).click();XXXXXXXXXXXX
            
            //assertTrue(driver.findElement(welcomeLocator).isDisplayed());	XXXXXXXXXXXXXXX
            
            //assertEquals("Login - My Store", driver.getTitle());
            //assertTrue(driver.findElement(loginPageLocator).isDisplayed());

        } else {
            System.out.print("No encontro pagina de registro");
        }

    }

    @Test
    public void login() throws InterruptedException {
        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPage2Locator).isDisplayed()) {
            driver.findElement(emailLoginLocator).sendKeys("kiplin@gmail.com");
            driver.findElement(passLoginLocator).sendKeys("12345");

            driver.findElement(loginBtnLocator).click();
            driver.findElement(back).click();

        }
    }

    @Test
    public void compra() throws InterruptedException {
        //Thread.sleep(5000);

        driver.findElement(registerLinkLocator).click();
        Thread.sleep(2000);
        if (driver.findElement(registerPage2Locator).isDisplayed()) {
            driver.findElement(emailLoginLocator).sendKeys("kiplin@gmail.com");
            driver.findElement(passLoginLocator).sendKeys("12345");

            driver.findElement(loginBtnLocator).click();
            driver.findElement(back).click();

            driver.get("http://automationpractice.com/index.php?id_product=4&controller=product");
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            driver.findElement(addToCar).click();;
            driver.findElement(check).click();
            driver.findElement(summary).click();
            driver.findElement(address).click();
            driver.findElement(terms).click();
            driver.findElement(shipping).click();
            driver.findElement(payBank).click();
            driver.findElement(confirm).click();
            driver.findElement(viewOrders).click();

            assertTrue(driver.findElement(orders).isDisplayed());

            //driver.close();
        }

    }
    
    @Test
    public void contatenos() throws InterruptedException {
    	
    	driver.findElement(contacLocator).click();
    	Thread.sleep(2000);
    	if (driver.findElement(messagecLocator).isDisplayed()) {
    		
    		WebElement sub=driver.findElement(subjectLocator);
	        Select sel=new Select(sub);
	        sel.selectByVisibleText("Webmaster");
	        driver.findElement(emailContacLocator).sendKeys("kiplin@gmail.com");
	        driver.findElement(messagecLocator).sendKeys("Abc 123 %&/");
	        driver.findElement(sendLocator).click();
	        
	        assertTrue(driver.findElement(confirmSendLocator).isDisplayed());
    	}
    }
    
    

}
