package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookOpening {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kavitha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajasekaran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Kavi.raja@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("facebook@123"); 
		
		WebElement daydd = driver.findElement(By.id("day"));
		Select daydropdown = new Select(daydd);
		daydropdown.selectByVisibleText("25");
		
		WebElement mondd = driver.findElement(By.id("month"));
		Select monthdropdown = new Select(mondd);
		monthdropdown.selectByVisibleText("Jun");
		
		WebElement yrdd = driver.findElement(By.id("year"));
		Select yeardropdown = new Select(yrdd);
		yeardropdown.selectByVisibleText("2010");
		
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
				
	}

}
