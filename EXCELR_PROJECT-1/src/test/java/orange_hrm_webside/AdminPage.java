package orange_hrm_webside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdminPage {

	WebDriver driver;

	@BeforeMethod
public void setUp() {
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
	@Test
	public void test2() throws InterruptedException {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Maintenance")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("yedghjb1 ru84 90jsnd");
	    Thread.sleep(2000);  
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a [@href='/web/index.php/auth/logout']")).click();
	    Thread.sleep(3000);
	}
	@AfterMethod
	 public void tearDown() {
		 driver.quit();
	    }
}
