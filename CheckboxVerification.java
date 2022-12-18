package week2.day2.assignments;
import java.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/checkbox.xhtml");

		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();


		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[4]")).click();


		//	Toggle Switch
		//driver.findElement(By.xpath("//div[@class='ui-toggleswitch ui-widget ui-toggleswitch-checked']")).click();

		//  Verify if the checkbox is disabled
		
		boolean flag = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		if(flag)
		{
		System.out.println("Checkbox is enabled ");
		}
		else
		{
			System.out.println("Checkbox is disabled ");
		}
		
	
		
	}

}
