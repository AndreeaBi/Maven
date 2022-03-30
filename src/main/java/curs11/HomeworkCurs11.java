package curs11;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeworkCurs11 {
	
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver =  new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://keybooks.ro/");
		
	}
	
	
	
	@Test
	public void Login() throws InterruptedException {
		
		WebElement booksLink = driver.findElement(By.linkText("Login"));
		booksLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/");	
   
		WebElement loginBox =  driver.findElement(By.xpath("//input[@id='log']"));
		loginBox.sendKeys("TestUser");
		Thread.sleep(1000);
		
		WebElement passBox =  driver.findElement(By.xpath("//input[@id='password']"));
		passBox.sendKeys("12345@67890");
		
		WebElement loginButton =  driver.findElement(By.className("submit_button"));
		assertTrue(loginButton.isDisplayed());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
	}
	
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}