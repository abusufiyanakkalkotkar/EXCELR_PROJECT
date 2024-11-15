package wen_shop_webside;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orderpage {

	WebDriver driver;

	@BeforeMethod
public void setUp() {
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
	@Test
	public void test4() throws InterruptedException{
		driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='ico-login']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("Email")).sendKeys("mynameisccocc@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("Password")).sendKeys("Abu@90217276");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    Thread.sleep(2000);
	    //Scroll down
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor rs = (JavascriptExecutor)driver;
	    rs.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Abusufiyan");
	    Thread.sleep(2000);
	    driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("mynameisccocc@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("add-to-cart-button-2")).click();
	    Thread.sleep(2000);
	    JavascriptExecutor ls = (JavascriptExecutor)driver;
	    ls.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	    Thread.sleep(2000);
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	    }
	}

