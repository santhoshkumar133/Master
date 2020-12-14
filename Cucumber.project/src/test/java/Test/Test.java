package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","F:\\Selenium Jar Files and Driver\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver();  
     
      // Launch Website  
   driver.navigate().to("http://www.javatpoint.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
     driver.quit();
		
		

	}	

}
