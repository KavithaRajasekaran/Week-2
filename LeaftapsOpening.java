package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsOpening {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("Demosalesmanager");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("crmsfa");
		
		WebElement Btnlogin = driver.findElement(By.className("decorativeSubmit"));
		Btnlogin.click();
		
		driver.close();
		
		

	}

}
