package com.Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class urltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WebDriver driver=new ChromeDriver();
//	WebDriver driver=new EdgeDriver();
	//	WebDriver driver=new FirefoxDriver();
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amerilist.com/custom-email-template/data-append-solutions/");
	}

}
