package com.Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Staging {

	public static void main(String[] args) throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		

			driver.get("https://morleads-staging.herokuapp.com/");
			driver.findElement(By.xpath("//span[text()='Log In']")).click();
			driver.findElement(By.xpath("//button[text()='Password Login']")).click();
			
			WebElement Input_mailid=driver.findElement(By.id("mat-input-0"));
			
			WebElement Input_Password=driver.findElement(By.id("mat-input-1"));
			Input_mailid.sendKeys("daryl@darylcolin.com");
			Input_Password.sendKeys("Intralink2");
			
			WebElement Click_on_login_button=driver.findElement(By.xpath("//button[@class='justify-end mat-stroked-button mat-button-base button-blue']"));

			Click_on_login_button.click();
			Thread.sleep(5000);
			WebElement MIL=driver.findElement(By.xpath("//app-menu-item[@label='Manual Import Lead']"));
			MIL.click();
			Thread.sleep(5000);
			WebElement s1=driver.findElement(By.tagName("select"));s1.click();
			
			Select sc=new Select(s1);
			//sc.selectByVisibleText("LeadExample");
			sc.selectByIndex(5);
			Thread.sleep(10000);
			WebElement Upload=driver.findElement(By.xpath("//input[@type='file']"));
			Actions act=new Actions(driver); 
			act.click(Upload).perform();
		//	driver.findElement(By.xpath("//a[@download='sample.csv']")).click();
		//	Upload.sendKeys("C:\\Users\\reliq\\Downloads\\sample (3).csv");
			Robot robo=new Robot();
			robo.delay(2000);
			StringSelection copy=new StringSelection("C:\\Users\\reliq\\Downloads\\sample.csv");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(copy, null);
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyPress(KeyEvent.VK_ENTER);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			//driver.findElement(By.xpath("//a[@download='sample.csv']")).click();
			driver.findElement(By.xpath("//button[text()='Import']")).click();
			
			//Thread.sleep(5000);
//			WebElement snap=driver.findElement(By.xpath("//div[@class='dashboard-part']"));
//			File sourc=snap.getScreenshotAs(OutputType.FILE);
//			File Dest=new File("C:\\Users\\reliq\\eclipse-workspace\\Projects\\Screenshot\\ss.png");
//			FileUtils.copyFile(sourc, Dest);
			
		//	driver.navigate().refresh();
			
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//app-menu-item[@label='Spousal Buy Out']")).click();

			Thread.sleep(5000);
			WebElement snap1=driver.findElement(By.xpath("//div[@class='dashboard-part']"));
			File sourc1=snap1.getScreenshotAs(OutputType.FILE);
			File Dest1=new File("C:\\Users\\reliq\\eclipse-workspace\\Projects\\Screenshot\\ss.png");
			FileUtils.copyFile(sourc1, Dest1);
	}
	

}
