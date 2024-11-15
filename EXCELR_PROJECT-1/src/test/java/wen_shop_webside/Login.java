package wen_shop_webside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
	@Test
	public void test3() throws InterruptedException{
		driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("gender-male")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("FirstName")).sendKeys("rakesh");
	    Thread.sleep(2000);
	    driver.findElement(By.id("LastName")).sendKeys("kadam");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Email")).sendKeys("mynameiscctgdfvsv@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='text-box single-line password']")).sendKeys("Abu@90217276");
	    Thread.sleep(2000);
	    driver.findElement(By.id("ConfirmPassword")).sendKeys("Abu@90217276");
	    Thread.sleep(2000);
	    driver.findElement(By.id("register-button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    Thread.sleep(2000);
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	    }
}
