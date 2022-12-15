package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Kavitha");
		driver.findElement(By.id("lastNameField")).sendKeys("Rajasekaran");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("kavi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("raja");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("Seleniumtraining");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("ahtivak17@gmail.com");
		
		WebElement statedd = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select Statedropdown=new Select(statedd);
		Statedropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This field is recently edited.");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println("The title of the end result page is " +driver.getTitle());

		
	}

}
