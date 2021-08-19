package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreateOrganization {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver= new ChromeDriver();

		driver.get("http://localhost:8888/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("user_name")).sendKeys("admin");

		driver.findElement(By.name("user_password")).sendKeys("12345");

		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.xpath("//a[text()='Organizations']")).click();

		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

		driver.findElement(By.name("accountname")).sendKeys("SDET125");

		WebElement industry_dd = driver.findElement(By.name("industry"));

		Select select = new Select(industry_dd);
		select.selectByVisibleText("Banking");


		WebElement rating_dd = driver.findElement(By.name("rating"));

		Select select1 = new Select(rating_dd);
		select1.selectByValue("Active");
		
		WebElement type_dd = driver.findElement(By.name("accounttype"));

		Select select2 = new Select(type_dd);	
		select2.selectByIndex(2);
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement()
		
		
		
		
		
		
		
		
		
	}

}
