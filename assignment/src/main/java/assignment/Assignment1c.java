package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1c {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Jar and driver\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
		
		WebElement From=driver.findElement(By.id("draggable"));	
		 WebElement To=driver.findElement(By.id("droppable"));	
		 Actions act=new Actions(driver);	
		 act.dragAndDrop(From, To).build().perform();
//Print drag and drop element

String str1= driver.findElement(By.id("droppable")).getText();
		 System.out.println(str1);
		 String str2= driver.findElement(By.id("draggable")).getText();
		 System.out.println(str2);

	}

}
