package assignment;

//https://www.makemytrip.com/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment33 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar and driver\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
        Thread.sleep(4000);
        WebElement e = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label/span"));
	     e.click();
	    
	     Thread.sleep(4000);
	     WebElement f = driver.findElement(By.xpath("//p[contains(.,'Chhatrapati Shivaji International Airport')]"));
	     f.click();
	     
	     Thread.sleep(4000);
	        WebElement g = driver.findElement(By.xpath("//input[contains(@placeholder,'To')]"));
		     g.click();
		    
		     Thread.sleep(4000);
		     WebElement h = driver.findElement(By.xpath("//p[contains(.,'Netaji Subhash Chandra Bose International Airport')]"));
		     h.click();
     	
		     driver.findElement(By.xpath("//span[contains(.,'DEPARTURE')]")).click();
		     driver.findElement(By.cssSelector("#root > div > div.minContainer > div > div > div.fsw.widgetOpen > div.fsw_inner > div.fsw_inputBox.dates.inactiveWidget.activeWidget > div.datePickerContainer > div > div > div > div.DayPicker > div > div.DayPicker-Months > div:nth-child(1) > div.DayPicker-Body > div:nth-child(3) > div:nth-child(6) > div > p:nth-child(1)")).click();
		 	Thread.sleep(2000);
		     
		 	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]/div/p[1]")).click();

		 	
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")).click();
				Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='fli_primary_btn text-uppercase '][contains(.,'Book Now')]")).click();
	}

}
