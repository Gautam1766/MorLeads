package com.Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vishvas {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mzskin.com/");
		driver.findElement(By.className("searchwp-modal-form-trigger-el" )).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dfd-searchbox-main']/input")).sendKeys("lad mask");
		Thread.sleep(2000);
		driver.findElement(By.id("dfd-results-gtSIc")).click();
//		List <WebElement> l1=driver.findElements(By.tagName("a"));
//		System.out.println("Total Hyperlink " + " = " + l1.size());
//		for(WebElement l2:l1) 
//		{
//			
//			System.out.println(l2.getText());
//		}
				
//"dfd-results-gtSIc"
	}

}
