package orange_hrm_webside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;

	@BeforeMethod
public void setUp() {
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Add Employee")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vijay");
	    Thread.sleep(2000);
	    driver.findElement(By.name("middleName")).sendKeys("Ajay");
	    Thread.sleep(2000);
	    driver.findElement(By.name("lastName")).sendKeys("Devgan");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.linkText("Performance")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("a[class='oxd-topbar-body-nav-tab-item']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("view")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("input[placeholder='Type here']")).sendKeys("Excelr Project 2");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("textarea[placeholder='Type here']")).sendKeys("This is test case 1 on OrangeHRM");
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	    Thread.sleep(3000);
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
