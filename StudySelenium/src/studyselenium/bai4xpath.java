package studyselenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class bai4xpath {
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://tiki.vn/dien-thoai-smartphone/c1795");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.findElement(By.xpath("//a[contains(text(),'Bán chạy')]")).click();
		String price = driver.findElement(By.xpath("//h3[contains(text(),'i iPhone 13 Pro Max 128GB')]//ancestor::span//div[@class='price-discount__price']")).getText();
		System.out.println("Price of iPhone 13 is " + price);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		driver.quit();
	}

}
