package com.Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Moreleads {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
	    driver.get("https://morleads-staging.herokuapp.com/");
	//	driver.get("https://www.mzskin.com/product-category/bestsellers/"); 
		driver.manage().window().maximize();
//		 driver.findElement(By.xpath("//div[@class='searchwp-modal-form-trigger-el']")).click();
//		 Thread.sleep(5000);
//		 driver.findElement(By.xpath("//div[@class='dfd-searchbox-main']/input")).sendKeys("Face Mask");
//		// driver.findElement(By.xpath("(//div[@class=\"dfd-searchbox-slot\"])[1]")).click();
		//	
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@aria-label='Close dialog']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(" //a[@data-product_id='213227']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@class='cfw-primary-btn']")).click();
	}

}
