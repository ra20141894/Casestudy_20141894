package assignment;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1b {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Jar and driver\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/html-contact-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
	
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[1]")).sendKeys("ABCC");
		
		driver.findElement(By.cssSelector("#lname")).sendKeys("SDFF");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[3]")).sendKeys("India");
		
		driver.findElement(By.xpath("//*[@id=\"subject\"]")).sendKeys("Hi i m tester i know how to break the code");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/form/input[4]")).click();
		
		driver.findElement(By.partialLinkText("Google")).click();
		
		driver.findElement(By.linkText("Google Link is here")).click();
	}

