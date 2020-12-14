package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties  config = new Properties(); 
	public static Properties  OR = new Properties();
	public static FileInputStream fis;
	
	@BeforeMethod
	public void setup() 
	{
	
		if (driver==null)
		{
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				config.load(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				fis =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\OR.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				OR.load(fis);
			} catch (IOException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (config.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\Selenium Jar Files and Driver\\chrome driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if  (config.getProperty("browser").equals("Firefox"))
		{
		
			System.setProperty("webdriver.gecho.driver",System.getProperty("user.dir")+"src\\test/resources\\executables\\geckodriver.exe");
		}
		
		else if  (config.getProperty("browser").equals("edge"))
		{
		
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"src\\test/resources\\executables\\edgedriver.exe");
		}
		String url = config.getProperty("testURL");
		System.out.println(url);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")),TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() {
		
		if(driver!=null)
		{
		driver.quit();
		}
	}

}
