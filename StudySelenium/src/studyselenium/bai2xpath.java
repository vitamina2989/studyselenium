package studyselenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bai2xpath {
	public static void main(String[] args) throws Exception
	{ 
		//Setting the driver path
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
				
		//Creating WebDriver instance
		WebDriver driver = new ChromeDriver();
				
		//Navigate to web page
		driver.get("https://emu.sapphiregroup.com.au/");
				
		//Maximizing window
		driver.manage().window().maximize();
				
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
       //Login without inputting the email
		String email = "anh.do@gmail.com";
		//String password = "Vitamin@1234";
		driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")).clear();
		driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")).sendKeys(email);
		//driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_rememberMe']")).click();
		driver.findElement(By.xpath("//button[@class='btn  btn-primary']")).click();
		// Print error message when leaving password field blank
	    System.out.print(driver.findElement(By.xpath("//div[@class='required']")).getText());
	   
		
		//Putting implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Closing browser session
		//driver.quit();
		//driver.close();
			}	

}
	
