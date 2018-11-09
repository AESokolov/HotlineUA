package ua.falcon.HotlineUA;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasketTest {
	
	private static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Tester\\Software\\Selenium\\Chrome\\chromedriver.exe");
		//driver = new ChromeDriver();
						
		System.setProperty("webdriver.gecko.driver", "D:\\Tester\\Software\\Selenium\\Firefox\\geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
						
		//System.setProperty("webdriver.opera.driver", "D:\\Tester\\Software\\Selenium\\operadriver_win32\\operadriver.exe");
		//OperaOptions options = new OperaOptions(); 
		//options.setBinary("C:\\Program Files\\Opera\\56.0.3051.52\\opera.exe");
		//driver = new OperaDriver(options); 
						
						driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
						driver.manage().window().maximize();
						driver.get("https://hotline.ua/"); 
	}

	

	@Test
	public void test() {
		
		WebElement enterCity = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div[2]/span[1]")); 
 		enterCity.click();
 		
 		WebElement enterEnter = driver.findElement(By.xpath("//*[@id=\"page-index\"]/header/div[1]/div/div/div[2]/div[4]"));
  		enterEnter.click();
 		
 		WebElement email = driver.findElement(By.name("login"));
  		email.sendKeys("sigizmundok@i.ua");
  		
  		WebElement password = driver.findElement(By.name("password"));
  		password.sendKeys("fqw12345SD");	
  		
  		WebElement start = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/form/div/div/div[3]"));  
 		start.click();
 		
 		WebElement search = driver.findElement(By.id("searchbox")); 
 		search.sendKeys("iPhone 7");
 		
 		WebElement ssearch = driver.findElement(By.id("doSearch")); 
 		ssearch.click();
 		
 		WebElement iphone = driver.findElement(By.xpath("//*[@id=\"page-search\"]/div[2]/div/div[1]/div[3]/div/ul/li[1]/div[3]/p/a"));  
 		iphone.click();
 		
 		WebElement piphone = driver.findElement(By.xpath("//*[@id=\"page-product\"]/div[2]/div/div/div[2]/div/div[1]/div[1]/p/span"));  
 		piphone.click();
 		
 		WebElement buy = driver.findElement(By.xpath("//*[@id=\"page-product\"]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[2]/span[1]"));
 		buy.click();
 		
 		WebElement trash = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[3]/i"));  
 		trash.click();
 		
 		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[4]")).click();                      //exit
 		driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[4]/div[2]/ul/li[10]/a/i")).click(); //exit
		
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		//driver.quit();
		
	}

}
