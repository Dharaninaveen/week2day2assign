package week2c.day2assign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssign {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("UserFirstName")).sendKeys("Dharani");
		driver.findElement(By.name("UserLastName")).sendKeys("naveen");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
		WebElement jobtitle=driver.findElement(By.name("UserTitle"));
		Select dd1=new Select(jobtitle);
		dd1.selectByVisibleText("Customer Service Manager");
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		WebElement compemp=driver.findElement(By.name("CompanyEmployees"));
		Select dd2=new Select(compemp);
		dd2.selectByValue("1600");
		driver.findElement(By.name("UserPhone")).sendKeys("9876543211");
		WebElement checkbox=driver.findElement(By.className("checkbox-ui"));
		checkbox.click();
		driver.close();
		
		
		
		
		

	}

}
