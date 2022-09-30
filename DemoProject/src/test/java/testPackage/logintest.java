package testPackage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class logintest {
	public String baseUrl = "http://localhost/polarion/#/home";  
	String driverPath = "C:\\Users\\AshfaqMohiuddinMoham\\Downloads\\chromedriver_win32\\chromedriver.exe";  
	public WebDriver driver ;   
	@Test             
	public void test() {      
	// set the system property for Chrome driver      
	System.setProperty("webdriver.chrome.driver", driverPath);  
	// Create driver object for CHROME browser  
	driver = new ChromeDriver();  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.println(URL);  
	//get the title of the page  
	String title = driver.getTitle();                  
	System.out.println(title);
	Assert.assertEquals(title, "0Login");
	}     
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	} 
}
