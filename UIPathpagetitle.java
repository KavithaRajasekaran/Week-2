package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIPathpagetitle {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.name("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.name("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println("The title of the page is " + driver.getTitle());
		
		driver.findElement(By.partialLinkText("Log Out")).click();
		
		driver.close();

	}

}
