package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputcomponents {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.leafground.com/input.xhtml");

		driver.manage().window().maximize();


		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[1]")).sendKeys("Kavitha Rajasekaran");

		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all city ui-state-filled']")).sendKeys(" India");

		boolean flag = driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-disabled']")).isEnabled();
		if(flag!=true)
		{
			System.out.println("Yes !, this field is disabled");
		}

		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();

		WebElement retrievetxt= driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String retrievetxt1 = retrievetxt.getAttribute("value");
		System.out.println("The string displayed in the textbox is -  " + retrievetxt1);

		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys(Keys.TAB);

		WebElement l=driver.findElement(By.xpath("//textarea[@placeholder='About yourself']"));
		if(l.equals(driver.switchTo().activeElement()))
			System.out.println("After pressing tab, the next Element is focused");
		else
			System.out.println("After pressing tab, the next Element is not focused");
		l.sendKeys("I am learning selenium with Java");
		
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("This is a big text editor field");
		
		driver.findElement(By.xpath("(//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all'])[2]")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-error']"));
		boolean displayederror = driver.findElement(By.xpath("//span[text()=\"Age is mandatory\"]")).isDisplayed();

		if(displayederror != false)
		{
			System.out.println("The error message is displayed");
		}
		else
		{
			System.out.println("The error message is not displayed");
		}
		
		//Was not seeing anything on the dropdown
		//driver.findElement(By.xpath("//ul[@class='ui-autocomplete-multiple-container ui-autocomplete-dd-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-left']")).sendKeys("Kavitha Raj");
		
		driver.findElement(By.xpath("//input[@class='ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad']")).click();
		boolean enabledkeyboard = driver.findElement(By.xpath("//div[@class='ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay']")).isEnabled();
		if(enabledkeyboard != false)
		{
			System.out.println("The keyboard is displayed");
		}
		else
		{
			System.out.println("The keyboard is not displayed");
		}
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).sendKeys("20");
		//String attribute = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']")).getAttribute("style");
		//String[] attribute1=attribute.split(":");
		//System.out.println(attribute1[1]);
		//driver.close();

	}

}
