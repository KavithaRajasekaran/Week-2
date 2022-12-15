package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("a");
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(2000);
		
		String Actualtitle = driver.getTitle();
		String expectedtitle= "View Lead | opentaps CRM";

		if(Actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("Page title is correct");
		}
		else
		{
			System.out.println("Page title is incorrect");
		}


		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		String valuepass="Marvel";
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys(valuepass);
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		WebElement orgname = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String Organiname=orgname.getText();
		String[] orgarray=Organiname.split(" ");
		System.out.println(orgarray[0]);
		
		if(orgarray[0].equals(valuepass))
		{
			System.out.println("The Organization name change is successfull");
		}
		else
		{
			System.out.println("The Organization name change is unsuccessfull");
		}
		
		driver.close();
		
		
}

}
