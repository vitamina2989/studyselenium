package studyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai3xpath {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "http://juggle:Juggl3F1sh@dev.juggle.codeenginestudio.com/";driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// Select Login button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		// Input email/password to Login form
		String email = "today1905@mailinator.com", password = "Vitamin@1234";
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		// Click Login button 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Click Space
		driver.findElement(By.xpath("//div[@data-testid='space-dropdown']")).click();
		
		// Click the 5th space 
		driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root')][position()='5']")).click();
		
		/* Print the name of 5th space
		String name = driver.findElement(By.xpath("//li[contains(@class,'MuiButtonBase-root')][position()='5']")).getText();
		System.out.println(name);*/
		
		//driver.quit();
		//driver.close();
	}

}
