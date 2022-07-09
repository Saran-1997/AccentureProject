package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\saran\\eclipse-workspace\\SeleniumDay2\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
	text.sendKeys("iphones 12pro");
	WebElement tst = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	
	tst.click();
	WebElement saran = driver.findElement(By.xpath("//img[@alt='Apple iPhone 12 (64GB) - Blue']"));
	
	saran.click();
	
}

}
