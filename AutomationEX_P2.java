package AutomationEX_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationEX_P2 
{
	WebDriver driver;
	@BeforeSuite
	public void LaunchBrowser() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		Thread.sleep(1500);
	}
	
//  @Test
  public void CreateAccount() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
	  driver.findElement(By.name("name")).sendKeys("Akshay");
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("(//input[@data-qa='signup-email'])[1]")).sendKeys("pune1@mail.com");
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
	  //Enter Account Information
	  
	  driver.findElement(By.id("id_gender1")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.id("password")).sendKeys("abcde@123");
	  Thread.sleep(1500);
	  
	  //Address Information
	  
	  driver.findElement(By.id("first_name")).sendKeys("akshay");
	  Thread.sleep(1500);
	  driver.findElement(By.id("last_name")).sendKeys("Tote");
	  Thread.sleep(1500);
	  driver.findElement(By.id("company")).sendKeys("ABCD");
	  Thread.sleep(1500);
	  driver.findElement(By.id("address1")).sendKeys("ABCD, building 2");
	  Thread.sleep(1500);
	  driver.findElement(By.id("address2")).sendKeys("CA Road Pune");
	  Thread.sleep(1500);
	  driver.findElement(By.id("state")).sendKeys("Maharashtra");
	  Thread.sleep(1500);
	  driver.findElement(By.id("city")).sendKeys("Pune");
	  Thread.sleep(1500);
	  driver.findElement(By.id("zipcode")).sendKeys("12345");
	  Thread.sleep(1500);
	  driver.findElement(By.id("mobile_number")).sendKeys("987654321");
	  Thread.sleep(4500);
	  driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//a[@data-qa=\"continue-button\"]")).click();
  }
  
  @BeforeTest
  public void login() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
	  driver.findElement(By.name("email")).sendKeys("pune@mail.com");
	  Thread.sleep(1500);
	  driver.findElement(By.name("password")).sendKeys("abcde@123");
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  Thread.sleep(1500);
	}
  
  @Test
  (priority=0)
  public void homepage() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/brand_products/Biba\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//a[@href=\"/product_details/21\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[@href=\"/brand_products/Polo\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//a[@data-product-id=\"29\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@data-product-id=\"20\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[@data-product-id=\"42\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.id("scrollUp")).click();
	  Thread.sleep(1400);
  }
  @Test
  (priority=1)
  public void category() throws InterruptedException
  {
	  //women category
	  driver.findElement(By.xpath("//a[normalize-space()='Women']")).click();
	  Thread.sleep(2400);
	  driver.findElement(By.xpath("//div[@id='Women']//a[contains(text(),'Dress')]")).click();
	  Thread.sleep(2400);
	  driver.findElement(By.xpath("//a[@href=\"/product_details/38\"]")).click();
	  Thread.sleep(1400);
	  WebElement qty=driver.findElement(By.id("quantity"));
	  qty.clear();
	  qty.sendKeys("3");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  
	  //men category
	  driver.findElement(By.xpath("//a[normalize-space()='Men']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='Jeans']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@href=\"/product_details/33\"]")).click();
	  Thread.sleep(2000);
	  WebElement qty1=driver.findElement(By.id("quantity"));
	  qty1.clear();
	  qty1.sendKeys("2");
	  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  
	  //selecting brands
	  driver.findElement(By.xpath("//a[@href=\"/brand_products/Allen Solly Junior\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@href=\"/product_details/24\"]")).click();
	  Thread.sleep(2000);
	  WebElement qty2=driver.findElement(By.id("quantity"));
	  qty2.clear();
	  qty2.sendKeys("4");
	  driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
	}
  
  @Test
  (priority=2)
  public void productsSection() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/products\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("search_product")).sendKeys("Tops");
	  Thread.sleep(1500);
	  driver.findElement(By.id("submit_search")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//a[@data-product-id=\"11\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[@data-product-id=\"15\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//button[@data-dismiss=\"modal\"]")).click();
	  Thread.sleep(2500);
	  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
  }
  
  @Test
  (priority=3)
  public void cartSection() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/view_cart\"]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//a[@data-product-id=\"38\"]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//a[@data-product-id=\"24\"]")).click();
	  Thread.sleep(1400);
	  driver.findElement(By.xpath("//a[normalize-space()='Proceed To Checkout']")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//a[@href=\"/payment\"]")).click();
	  Thread.sleep(1500);
	  driver.findElement(By.name("name_on_card")).sendKeys("ABCDE");
	  Thread.sleep(1500);
	  driver.findElement(By.name("card_number")).sendKeys("123456");
	  Thread.sleep(1200);
	  driver.findElement(By.name("cvc")).sendKeys("321");
	  Thread.sleep(1300);
	  driver.findElement(By.name("expiry_month")).sendKeys("12");
	  Thread.sleep(1500);
	  driver.findElement(By.name("expiry_year")).sendKeys("2025");
	  Thread.sleep(1500);
	  driver.findElement(By.id("submit")).click();	
	  Thread.sleep(1500);
  }
  
  @Test
  (priority=4)
  public void contactUs() throws InterruptedException
  {
	  driver.findElement(By.xpath("//a[@href=\"/contact_us\"]")).click();
	  driver.findElement(By.name("name")).sendKeys("Akshay");
	  Thread.sleep(1400);
	  driver.findElement(By.name("email")).sendKeys("pune@mail.com");
	  Thread.sleep(1400);
	  driver.findElement(By.name("subject")).sendKeys("Product not recived");
	  Thread.sleep(1400);
	  driver.findElement(By.name("message")).sendKeys("I didn't get product on date on delivary");
	  Thread.sleep(1400);
	  driver.findElement(By.name("submit")).click();
	  Thread.sleep(1200);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.xpath("//a[normalize-space()='Home']")).click();
  }
  
  @AfterTest
  public void Logout()
  {
	  driver.findElement(By.xpath("//a[@href=\"/logout\"]")).click();
  }
}
