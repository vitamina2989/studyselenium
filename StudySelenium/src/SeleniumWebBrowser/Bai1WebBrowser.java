package SeleniumWebBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai1WebBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the driver path
	    System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
						
	    //Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
						
		//Navigate to web page
		String url = "http://juggle:Juggl3F1sh@dev.juggle.codeenginestudio.com/";
		driver.get(url);
		
		//Maximizing window
		driver.manage().window().maximize();
		
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Print url of JuggleFish page    
		System.out.println("The Juggle Fish url is " + driver.getCurrentUrl());
		//Verify the url is correct
		String expectedurl1 = "http://juggle:Juggl3F1sh@dev.juggle.codeenginestudio.com/";
		String actualurl1 = driver.getCurrentUrl();
		if (expectedurl1.equals(actualurl1))
		{
			System.out.println("Juggle Fish url is correct");	
		}
		else
		{
			System.out.println("Juggle Fish url is not correct");
		}
		
		// Select Login button
		//driver.findElement(By.xpath("//a[@href='/login']")).click();
				
		// Input email/password to Login form
		String email = "today1905@mailinator.com", password = "Vitamin@1234";
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		// Click Login button 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Click Workspace
        driver.findElement(By.xpath("//div[@class='ProfileMenu__Wrapper-a9u1r2-0 iCqUFv']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Select workspace
		driver.findElement(By.xpath("//li[@data-testid='Workspace Settings']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Print url of Workspace     
		System.out.println("The Juggle Fish url is " + driver.getCurrentUrl());
		//Verify the url is correct
		String expectedurl2 = "http://juggle:Juggl3F1sh@dev.juggle.codeenginestudio.com/admin-setting";
		String actualurl2 = driver.getCurrentUrl();
		if (expectedurl2.equals(actualurl2))
		{
			System.out.println("Workspace url is correct");	
		}
		else
		{
			System.out.println("Workspace url is not correct");
		}
		
		
		// Select People tab
		driver.findElement(By.xpath("//a[@title='People']")).click();
				
		//Print url of People tab     
				System.out.println("The People url is " + driver.getCurrentUrl());
				//Verify the url is correct
				String expectedurl3 = "http://juggle:Juggl3F1sh@dev.juggle.codeenginestudio.com/resources";
				String actualurl3 = driver.getCurrentUrl();
				if (expectedurl3.equals(actualurl3))
				{
					System.out.println("People url is correct");	
				}
				else
				{
					System.out.println("People url is not correct");
				}	
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.close();
		driver.quit();
		
		
	}

}
