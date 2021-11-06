package com.testing.search;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAutomate {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		search.clear();
		search.sendKeys("flipkart.com");
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(100);
		
		driver.close();
	}
}
