package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\saran\\eclipse-workspace\\SeleniumDay1\\Driver\\chromedriver.exe");
WebDriver red = new ChromeDriver();
   red.get("https://www.redbus.in/bus-tickets");
 WebElement a = red.findElement(By.id("txtsource"));
  a.sendKeys("chennai");
   
   WebElement to = red.findElement(By.id("txtdestination"));
   to.sendKeys("bangalore");
   
	}
	

}
