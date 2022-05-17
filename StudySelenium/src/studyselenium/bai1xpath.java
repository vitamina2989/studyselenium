package studyselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_demo {

	public static void main(String[] args) {
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
				
		//Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
				
		//Navigate to web page
		driver.get("http://www.demo.guru99.com/V4/");
				
		//Maximizing window
		driver.manage().window().maximize();
				
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	   //login 
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr403042");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("saqUvEs");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
					
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
      //Navigate to New Customer
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
		//Continue checking the xpath of element in New Customer after here
		// Register a new customer
		driver.findElement(By.xpath ("//input[@name='name']")).sendKeys ("Anh Do");
		driver.findElement(By.xpath ("//input[@value='f']")).click();
		//driver.findElement(By.xpath ("//input[@value='m']")).click();
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("2/9/1989");
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("My villa street");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Da Nang");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("California");
		driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys("What is pino");
		driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys("0357709999");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("anh.do@mailinator.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vitamin@1234");
		//driver.findElement(By.xpath("//input[@name='sub']")).click();
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		//Question: Khi run nhung field nay thuong chay rat nhanh ko kip nhin, minh co the dung imlicitlyWait cho tung cai find Element duoc khong? 
		// Neu khong thi co the dung cai gi de giup no chay cham lai. Thanks anh!
		//Reset

		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Closing browser session
		//driver.quit();
		//driver.close();
			}	

}


