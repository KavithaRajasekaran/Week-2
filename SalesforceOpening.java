package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SalesforceOpening {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		WebElement usrname = driver.findElement(By.id("username"));
		usrname.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement pswd = driver.findElement(By.id("password"));
		pswd.sendKeys("Testleaf$321");
		
		WebElement Btnlogin = driver.findElement(By.id("Login"));
		Btnlogin.click();
		
		driver.close();

	}

}
