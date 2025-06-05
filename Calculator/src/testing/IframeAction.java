package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeAction {
	public static void main(String arg[]) {
	System.setProperty("webdriver.chromedriver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	/*driver.get("https://jqueryui.com/");
	driver.findElement(By.linkText("Droppable")).click();
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement drop,drag;
	drag=driver.findElement(By.id("draggable"));
	drop=driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.dragAndDrop(drag, drop);
	act.build().perform();*/
	driver.get("https://snapdeal.com");
	Actions re=new Actions(driver) ;
	re.moveToElement(driver.findElement(By.linkText("Women's Fashion")));
	//contextClick(driver.findElement(By.linkText("Women's Fashion")));
    re.build().perform();
	}

}
