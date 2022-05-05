package com.hrms.lib;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {
// DEFINING THE REUSABLE FUNCTIONS 
	
	public void openapplication() throws Exception  {
		System.setProperty("webdriver.gecko.driver","C:\\testing\\DRIVERS\\geckodriver.exe" );
	driver = new FirefoxDriver();
	driver.navigate().to(url);
	Thread.sleep(3000);
	System.out.println("Application Opened");	
	Thread.sleep(3000);	
	}
	public void closeApplication() throws Exception {
		driver.close();
		driver.quit();
		System.out.println("Application closed");
		Thread.sleep(3000);
		}
	public void login() throws Exception {
		driver.findElement(By.name(txt_loginname)).sendKeys("nareshit");
		driver.findElement(By.name(txt_password)).sendKeys("nareshit");
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		Thread.sleep(3000);
			}
	
	public void logout()  throws Exception{
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Thread.sleep(3000);
	}
	    public void enterFrame() throws Exception {
	    	Thread.sleep(2000);
		driver.switchTo().frame(frame_emp);
		System.out.println("Entered into Frame");
		Thread.sleep(5000);
		}
		public void exitFrame() throws Exception  {
		driver.switchTo().defaultContent();
		System.out.println("exit from frame");
		}
		public void addEmp() throws Exception {
			Thread.sleep(2000);	
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New Emp added");
		}
		public void editEmp() throws Exception{
			Thread.sleep(2000);
		driver.findElement(By.xpath(name_emp)).click();
		driver.findElement(By.name(btn_edit_save)).click();
		driver.findElement(By.name(txt_EFN)).clear();
		driver.findElement(By.name(txt_ELN)).clear();
		driver.findElement(By.name(txt_EFN)).sendKeys(FN);
		driver.findElement(By.name(txt_ELN)).sendKeys(LN);
		driver.findElement(By.name(btn_edit_save)).click();
		System.out.println("Edit emp completed");
		}
		public void delEmp() throws Exception{
			driver.findElement(By.xpath(Chk_box)).click();
			driver.findElement(By.name(btn_del)).click();
			
			System.out.println("Emp deleted");
			Thread.sleep(3000);
			
		}
		
}
