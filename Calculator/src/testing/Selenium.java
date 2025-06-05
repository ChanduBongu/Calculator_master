package testing;

import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Selenium {
	public static void main(String[] arg) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("http://flights.qedgetech.com");
	/*driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("name")).sendKeys("Chandini");
	driver.findElement(By.id("contact")).sendKeys("6304008604");
	driver.findElement(By.id("email")).sendKeys("yogeshpratap511@gmail.com");
	driver.findElement(By.xpath("//input[@id='address']")).sendKeys("chandu@123");
	Select drop = new Select(driver.findElement(By.name("gender")));
	drop.selectByValue("F");
	driver.findElement(By.name("dob")).sendKeys("27-12-1997");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.name("submit")).click();
	
	TakesScreenshot ts= (TakesScreenshot)driver;
	File srcFile=ts.getScreenshotAs(OutputType.FILE);
	File trgFile=new File("C:\\Screens\\ss.png");
	Files.copy(srcFile, trgFile);*/
	
	driver.findElement(By.name("email")).sendKeys("yogeshpratap511@gmail.com");
	
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("chandu@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	driver.findElement(By.id("search-date")).click();
	String month=driver.findElement(By.className("ui-datepicker-month")).getText();
	String year=driver.findElement(By.className("ui-datepicker-year")).getText();
	while(!(month.equals("June")&&year.equals("2025")))
	{
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		month=driver.findElement(By.className("ui-datepicker-month")).getText();
		year=driver.findElement(By.className("ui-datepicker-year")).getText();
		
	}
	
	driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='22']")).click();
	
	Select city1=new Select(driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div[1]/div/div/div[2]/select")));

	
   city1.selectByValue("1");
	
	Select city2=new Select(driver.findElement(By.xpath("//*[@id=\"contact-info\"]/div/div[2]/div/div[2]/div[1]/div/div/div[3]/select")));

	
  city2.selectByValue("2");
  
  driver.findElement(By.id("name")).sendKeys("Chandini");
  
  WebElement radio = driver.findElement(By.xpath("//input[@value='First Class']"));
  if(!(radio.isSelected()))
		  {
	  radio.click();
		  }
	
	
	
	
	}

}
