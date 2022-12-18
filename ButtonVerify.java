package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class ButtonVerify {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/button.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		System.out.println("The title of the page is - " + driver.getTitle());
		driver.navigate().back();

		//Checking if button is disabled
		boolean flag = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-state-disabled']")).isEnabled();
		if(!flag)
		{
		System.out.println("Button is disabled ");
		}
		else
		{
			System.out.println("Button is enabled ");
		}

		//Get the position of the button
		System.out.println("The position is "+driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());


		//	Get the color of the button
		System.out.println("The color of the button is " + driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color"));
		
		//	Get the Height and Width
		System.out.println("The height and width of the button is " + driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());

	}

}
