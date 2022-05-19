package studyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bai6xpath {
	
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://flywheel:mecoxclone@mecoxcloud.flywheelstaging.com//";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Click Furniture category
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='horizontal']//ul[@id='menu-header-menu-left']//span[starts-with(text(),'FURNITURE')]"))).perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Select DRESSER AND CHESTS sub-category
		driver.findElement(By.xpath("//div[@class='horizontal']//span[contains(text(),'DRESSERS AND CHESTS')]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.quit();
		driver.close();
		
	}

}
