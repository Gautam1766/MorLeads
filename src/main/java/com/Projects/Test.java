package com.Projects;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vishvasdelhi.com/");
	List <WebElement> hy=driver.findElements(By.tagName("a"));
		
		System.out.println(hy.size());
		for(WebElement hy1:hy) 
		{
			String url=hy1.getAttribute("href");
			URL u=new URL(url);
			HttpURLConnection request=(HttpURLConnection) u.openConnection();
			request.setRequestMethod("HEAD");
			request.connect();
			System.out.println(hy1.getText());
		}

	}

}
