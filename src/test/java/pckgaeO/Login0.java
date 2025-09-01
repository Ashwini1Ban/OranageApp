package pckgaeO;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;






//Login functionality
//Navigate to the PIM module, Add Employees, Verify Employees in the Employee List, logout


// changes mad by User B  ,now A
//new branch
//1/9-25
public class Login0 {

	WebDriver driver;
	

	
	
	
	@BeforeMethod
	public void get()
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\eclipse-workspace\\OrangeApplication\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	
  @Parameters({"username","password"})	
  @Test(description="to verify login functionality with valid usename and valid password",enabled=false)
  public void Login_001(String n, String v) throws InterruptedException {
	  
	  WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement wb=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	  wb.sendKeys(n);
	  
	  
	  WebDriverWait waitz=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement wbz=waitz.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	  wbz.sendKeys(v);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(5000);
	  
	 String url= driver.getCurrentUrl();
	 System.out.println(url);
	 String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	 Assert.assertEquals(expectedurl, url, "testcase failed");
	  
  }
  
  
  
  @Parameters({"Inusername","Inpassword"})	
  @Test(description="to verify login functionality with valid usename and valid password",enabled=false)
  public void Login_002(String nn, String vv) throws InterruptedException {
	  
	  WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement wb=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	  wb.sendKeys(nn);
	  
	  
	  WebDriverWait waitz=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement wbz=waitz.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	  wbz.sendKeys(vv);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);

	 String tt= driver.findElement(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']")).getText();
	 System.out.println(tt);
  }
  
  
  @Parameters({"username","password"})	
  @Test(description="to verify login functionality with valid usename and valid password",enabled =false)
  public void Login_003(String nn, String vv) throws InterruptedException {
	  
	  WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement wb=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	  wb.sendKeys(nn);
	  
	  
	  WebDriverWait waitz=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement wbz=waitz.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	  wbz.sendKeys(vv);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Thread.sleep(5000);

	 String tt= driver.findElement(By.xpath("//span[contains(@class,'oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message')]")).getText();
	 System.out.println("text is" +tt);
  }
  
  
  
  
  
  
  @Parameters({"username","password"})	
  @Test(description="to verify login functionality with valid usename and valid password")
  public void Login_004(String un, String pw) throws InterruptedException {
	  
	  WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(10));
	  WebElement wb=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
	  wb.sendKeys(un);
	  
	  
	  WebDriverWait waitz=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement wbz=waitz.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
	  wbz.sendKeys(pw);
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(10000);

	/*  List<WebElement> menuItems = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li/a/span"));

	  for(WebElement item : menuItems) {
	 //    System.out.println(item.getText().trim());
		  
		  if(item.getText().trim().equals("PIM"))
		  {
			  item.click();
		  }
	  }
	 */
	  
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement pimMenu = wait.until(ExpectedConditions.elementToBeClickable(
	      By.xpath("//ul[@class='oxd-main-menu']/li/a/span[text()='PIM']")
	  ));
	  pimMenu.click();

 
	/*  
	  WebDriverWait waitss=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement empname=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[1]")));
      empname.sendKeys("Arti");	 
	
	  
	  WebDriverWait a=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement id=a.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")));
      id.sendKeys("101");
	
	  WebDriverWait b=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectdrop=b.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[1]")));
	  selectdrop.click();
	
	  
	//div[contains(@class,'oxd-select-text-input') and text[]='Full-Time Permanent']
	  
	  Thread.sleep(2000);
	  
	  
	  WebDriverWait c=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectop=c.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option' and normalize-space()='Full-Time Permanent']")));
	  selectop.click();
	  
	  
	  
	  WebDriverWait d=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectdrop2=d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[2]")));
	  selectdrop2.click();
	  
	  WebDriverWait e=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectop2=e.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option' and normalize-space()='Current and Past Employees']")));
	  selectop2.click();
	  
	  WebDriverWait f=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement supname=f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[2]")));
	  supname.sendKeys("john");	
	  
	  
	  
	  
	  WebDriverWait g=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectdrop3=g.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[3]")));
	  selectdrop3.click();
	  
	  WebDriverWait h=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectop4=h.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option' and normalize-space()='Chief Executive Officer']")));
	  selectop4.click();
	  
	  
	  
	  
	  WebDriverWait i=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectdrop5=i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[4]")));
	  selectdrop5.click();
	  
	  WebDriverWait j=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement selectop6=j.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='listbox']//div[@role='option' and normalize-space()='Engineering']")));
	  selectop6.click();
	  
	 */ 
	

	  WebDriverWait j=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement add=j.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary')])[2]")));
	  add.click();
	  

/*
	  WebDriverWait fn=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement fname=fn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName']")));
	  fname.sendKeys("John");
	  
	  WebDriverWait mn=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement middle=mn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='middleName']")));
	  middle.sendKeys("S");
	  
	  WebDriverWait ln=new WebDriverWait(driver, Duration.ofSeconds(5));
	  WebElement lname=ln.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastName']")));
	  lname.sendKeys("T");
	  
	  

	 WebDriverWait sn=new WebDriverWait(driver, Duration.ofSeconds(5));
	 WebElement save=sn.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]")));
	  save.click();
	  
	  */
	  

	  
	/*	 WebDriverWait sn=new WebDriverWait(driver, Duration.ofSeconds(5));
		 WebElement save=sn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and normalize-space()='Employee List']")));
		 save.click();
		 
		  WebDriverWait waitss=new WebDriverWait(driver, Duration.ofSeconds(5));
		  WebElement empname=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[contains(@placeholder,'Type for hints...')])[1]")));
	      empname.sendKeys("john");	
		 
		  WebDriverWait wq=new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement search=wq.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-form-actions']//button[@type='submit']")));
		  search.click();
		  
		  System.out.println("hi");
		  
		  Thread.sleep(5000);
	*/	  
		

		// Now get the second cell (First Name) from each row
		List<WebElement> tablelis = driver.findElements(
		    By.xpath("//div[@class='oxd-table-body']//div[@role='row']/div[@role='cell'][3]")
		);

		for (WebElement wbs : tablelis) {
		    System.out.println(wbs.getText().trim());
		}
		
		
		
		
		
		
		WebDriverWait logoption=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement logo=logoption.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='oxd-userdropdown-tab']")));
		
        logo.click();
		
		WebDriverWait ss=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement log=ss.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Logout']")));
		
        log.click();
	

  }
  
  
  
  
  
  @AfterMethod
  public void time() 
  {
//	 driver.quit();
  }
  
  
  
  
  
  
}
