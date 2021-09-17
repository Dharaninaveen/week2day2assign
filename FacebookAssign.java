package week2c.day2assign;

import java.time.Duration;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssign {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement createnewacc=driver.findElement(By.xpath("//form[@class='_9vtf']/div[5]/a"));
		createnewacc.click();
		driver.findElement(By.name("firstname")).sendKeys("Dharani");
		driver.findElement(By.name("lastname")).sendKeys("ridhuna");
		driver.findElement(By.name("reg_email__")).sendKeys("9443790524");
		driver.findElement(By.id("password_step_input")).sendKeys("vvcxzbA");
		WebElement dropdate=driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(dropdate);
		dd1.selectByIndex(12);
		WebElement dropmonth=driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(dropmonth);
		dd2.selectByValue("8");
		WebElement dropyear=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(dropyear);
		dd3.selectByVisibleText("1995");
		driver.findElement(By.className("_58mt")).click();
		//driver.findElement(By.name("websubmit")).click();
		
	}

}
