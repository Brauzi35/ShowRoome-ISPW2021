package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


import static org.junit.Assert.*;

public class Testselenium {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	   WebDriver driver3 = new ChromeDriver();
	   driver3.get("http://localhost:8080/FinaleIspw/register");
	   driver3.findElement(By.xpath("//*[@id=\"username\"]")).clear();
	   driver3.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("valerio");
	   driver3.findElement(By.xpath("//*[@id=\"password\"]")).clear();
	   driver3.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("valeprova");

	   driver3.findElement(By.xpath("/html/body/p[2]/input")).click();
	   driver3.close();
	  
   }
}


