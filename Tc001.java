package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc001 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//to log in
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7397453551");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yuvaneshyuvi4693");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//to log out
		driver.findElement(By.xpath("(//div[@class='aglvbi8b om3e55n1 i8zpp7h3 g4tp4svg'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	driver.close();
		

	}

}
