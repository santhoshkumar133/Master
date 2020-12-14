package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends Testbase {
	
	@Test
	public void loginfacebook() throws FileNotFoundException
	
	{
		
		//driver.get(config.getProperty("testURL"));
		driver.findElement(By.xpath(OR.getProperty("email"))).sendKeys("rajnatarajan04");
		driver.findElement(By.xpath(OR.getProperty("password"))).sendKeys("852906");
		driver.findElement(By.xpath(OR.getProperty("login"))).click();
	}
	
	
	
	

}
