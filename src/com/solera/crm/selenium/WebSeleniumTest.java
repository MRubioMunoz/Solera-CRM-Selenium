package com.solera.crm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebSeleniumTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		
		 try {
				Thread.sleep(4000);
			
		
		//Loggin
		
		driver.findElement(By.id("user")).sendKeys("solera@solera.com");
		driver.findElement(By.id("pass")).sendKeys("bootcamp4");
		driver.findElement(By.id("sub")).click();
		
		Thread.sleep(5000);
		
		//Create a Oportunity
		
		driver.findElement(By.id("createOportunity")).click();
		
		driver.findElement(By.id("name")).sendKeys("TestSelenium");
		driver.findElement(By.id("telephone")).sendKeys("666111222");
		driver.findElement(By.id("email")).sendKeys("selenium@solera.com");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(5000);
		
		// Create new contact in the test opportunity
		
		driver.findElement(By.id("contactButton3")).click();
		driver.findElement(By.id("createContact")).click();
		driver.findElement(By.id("type")).sendKeys("test");
		driver.findElement(By.id("date")).sendKeys("03/08/2022");
		driver.findElement(By.id("result")).click();
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(5000);
		
		//Delete the test oportunity created before
		
		driver.findElement(By.id("contactButton3")).click();
		driver.findElement(By.id("deleteButtonOp")).click();
		
		
		 } catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
	
}
