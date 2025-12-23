package com.project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("abs.amalnath@gmail.com");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Amal@1605");

		WebElement btn = driver.findElement(By.xpath("//button[text()='Login']"));
		btn.click();

		WebElement logintext = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		String print = logintext.getText();
		System.out.println(print);

		WebElement btnsearch = driver.findElement(By.id("search"));
		btnsearch.sendKeys("nuts");

		WebElement btnclick = driver.findElement(By.xpath("//i[@class='fa fa-search colorWhite']"));
		btnclick.click();

		WebElement add = driver.findElement(By.xpath(
				"//a[@class='hover1 font16 fontsemibold colorWhite bgTheme px-4 py-1 radius50 dyna_btn addBtn-18']"));
		add.click();

		WebElement add1 = driver.findElement(By.xpath("//button[@id='cart-23']"));
		add1.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement cartclick = driver.findElement(By.xpath("//a[@href='https://omrbranch.com/my-cart']"));
		js.executeScript("arguments[0].click()", cartclick);

		WebElement enteraddress = driver.findElement(By.xpath(
				"//div[@class='diffAddres addAddress d-flex justify-content-center align-items-center mb-md-0 mb-2']"));
		enteraddress.click();

		WebElement worktype = driver.findElement(By.xpath("//select[@name='address_type']"));
		worktype.click();
		driver.findElement(By.xpath("//option[text()='Work ']")).click();

		driver.findElement(By.xpath("//input[@name='first_name'][1]")).sendKeys("Amalnath");
		driver.findElement(By.xpath("//input[@name='last_name'][1]")).sendKeys("Baburaj");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9597880683");
		driver.findElement(By.xpath("//input[@name='apartment']")).sendKeys("No.4");
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Mayiladuthurai");

		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		state.click();
		driver.findElement(By.xpath("//option[text()='Tamil Nadu']")).click();

		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		city.click();
		driver.findElement(By.xpath("//option[text()='Mayiladuthurai']")).click();

		driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("609001");

		Thread.sleep(5000);

		WebElement savebtn = driver.findElement(By.xpath(
				"//button[@class='saveAddress font18 fontSemiBold colorWhite bgTheme radius50 borderNone px-5 py-2 hover1']"));
		Thread.sleep(5000);
		savebtn.click();

		WebElement paymentbtn = driver.findElement(By.xpath("//select[@id='payment_type']"));
		Thread.sleep(3000);
		//paymentbtn.click();
		driver.findElement(By.xpath("//option[text()=' Cash On Delivery ']")).click();

		driver.findElement(By.xpath("//button[@id='placeOrder']")).click();
	}
}
