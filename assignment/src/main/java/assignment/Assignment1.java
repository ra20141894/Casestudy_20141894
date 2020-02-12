package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar and driver\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).click();
		String text1 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]")).getText();
		System.out.println(text1);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).click();
		String text2 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]")).getText();
		System.out.println(text2);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).click();
		String text3 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]")).getText();
		System.out.println(text3);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).click();
		String text4 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]")).getText();
		System.out.println(text4);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).click();
		String text5 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]")).getText();
		System.out.println(text5);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).click();
		String text6 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]")).getText();
		System.out.println(text6);
		
		driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).click();
		String text7 =	driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]")).getText();
		System.out.println(text7);

	}

}
