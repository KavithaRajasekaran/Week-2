package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps");

		driver.findElement(By.id("username")).sendKeys("demoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();

		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("a");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);

		WebElement leadtableelement = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
		String leadname = leadtableelement.getText();
		leadtableelement.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();

		String pagetitle = driver.getTitle();

		String expectedtitle= "Duplicate Lead | opentaps CRM";

		if(pagetitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Duplicate Lead page title is correct");
		}
		else
		{
			System.out.println("Duplicate Lead page title is incorrect");
		}
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		WebElement dupfirstname = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String dupleadfirstname=dupfirstname.getText();
		
		if(leadname.equals(dupleadfirstname))
		{
			System.out.println("Names match i.e Duplicating lead operation is successfull");
		}
		else
			System.out.println("Names doesn't match i.e Duplicating lead operation is unsuccessfull");
		
		driver.close();
}

}
