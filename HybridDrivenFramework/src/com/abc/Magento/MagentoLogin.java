package com.abc.Magento;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagentoLogin {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("E:\\ABC Training\\Java\\HybridDrivenFramework\\src\\com\\abc\\utilities\\Hybriddrivenframework.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("url");
		String emaildata = p.getProperty("UserName");
		String passworddata = p.getProperty("Password");
		
		String accountkey = p.getProperty("account");
		String usernamekey = p.getProperty("email");
		String passwordkey = p.getProperty("passwordkey");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(url);
		driver.findElement(By.xpath(accountkey)).click();
		driver.findElement(By.xpath(usernamekey)).sendKeys(emaildata);
		driver.findElement(By.xpath(passwordkey)).sendKeys(passworddata);
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath(logout)).click();
		
		driver.quit();
		

	}

}
