package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonfunctions {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		
		driver.manage().window().maximize();
		
		//chrome
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]")).click();
		
		//chennai
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[13]")).click();

		//Safari
		boolean flag= driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[5]")).isSelected();
		
		if(!flag)
		{
			System.out.println("The default button is selected here");
		}
		else
		{
			System.out.println("The default button is not selected here");
		}
		
		//Select if not selected
		boolean flag1= driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[6]")).isSelected();
		
		if(!flag1)
		{
			System.out.println("The Age group button is selected here");
		}
		else
		{
			System.out.println("The age group button is not selected here, so choosing one radio button ");
			driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[16]")).click();
		}
		
		driver.close();

	}

}
