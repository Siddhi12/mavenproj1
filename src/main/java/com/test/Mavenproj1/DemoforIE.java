package com.test.Mavenproj1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

//import org.openqa.selenium.remote.server.handler.SendKeys;

//import javafx.beans.property.SetProperty;

public class DemoforIE {

	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void f () throws InterruptedException
		{
		System.out.println("website demo");
		System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement User= driver.findElement(By.id("email"));
		User.sendKeys("qwet23@gmail.com");
		
		WebElement Password= driver.findElement(By.id("passwd"));
		Password.sendKeys("12345");
		
		WebElement signin= driver.findElement(By.id("SubmitLogin"));
		signin.click();
		
		//WebElement forgot= driver.findElement(By.linkText("Forgot your password?"));
		//forgot.click();
		
		//WebElement search= driver.findElement(By.xpath("//button[@type='submit']"));
		//search.click();
		
		WebElement msg= driver.findElement(By.xpath("html/body/div/div/header/div[3]/div/div/div[2]/form/input[4]"));
		msg.sendKeys("casual");

		WebElement option= driver.findElement(By.xpath("//a[@title='Women']"));
	 option.click();
	 
	 WebElement tops= driver.findElement(By.className("replace-2x"));
		tops.click();
		

		//WebElement zoom= driver.findElement(By.id("bigpic"));
		//zoom.click();
		
		//Selecting the size from dropdown//
		Select dropdownforsize = new Select(driver.findElement(By.id("group_1")));
		  dropdownforsize.selectByVisibleText("M");
	
		//WebElement color= driver.findElement(By.id("color_15"));
		//color.click();
		
		WebElement addtocart= driver.findElement(By.xpath("//span[text()='Add to cart']"));
		addtocart.click();

		Thread.sleep(5000);
	WebElement checkout= driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		
		WebElement p= driver.findElement(By.xpath("//p//a[@title='Proceed to checkout']"));
		p.click();
   
		WebElement addresssubmit= driver.findElement(By.xpath("//p//button[@type='submit']"));
		addresssubmit.click();
		
		//WebElement shipping= driver.findElement(By.xpath("//p//button[@type='submit']"));
		//shipping.click();
		
		//  WebElement accept= driver.findElement(By.id("cgv"));
		//accept.click();
		
		Thread.sleep(5000);
		WebElement done = driver.findElement(By.xpath("//div[@id='uniform-cgv']"));	
		done.click();
		
		
		WebElement last= driver.findElement(By.xpath("//p//button[@type='submit']"));
		last.click();
		 
		 driver.quit();
	}
}
