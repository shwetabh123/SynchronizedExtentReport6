package com.pulse.Test;
	import java.io.BufferedWriter;



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pulse.Page.Author;
import com.pulse.Page.HomePage;
import com.pulse.Page.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import generic.BasePage;
import generic.BaseTest;

import generic.Excel;
import generic.ExtentManager;
//import mx4j.log.Log;
import generic.ExtentTestManager;



//@Listeners(generic.RealGuru99TimeReport.class)


	public class ValidLogin extends BaseTest{


		


	
	static   Excel eLib = new Excel();
	
	public static String url = eLib.getCellValue(path,"PreCon", 1, 0);
	
	  public static String logfiletimestamp;
	    
		  
	public static	ITestResult result = null;
  
	
	   @Test
	    public void TC1(Method method) throws InterruptedException, IOException {
			
		   //ExtentReports Description
	        ExtentTestManager.getTest().setDescription("Verify that  VALID username and VALID password.");
	     
	        ExtentTestManager.getTest().assignCategory("Smoke Testing");
	      
	   	 
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	    	

			driver.navigate().to(url);

			 Randomaplphanumber R=new Randomaplphanumber();
			  
		       String imagePath=  R.Random();
				
					String un=Excel.getCellValue(XLPATH,"ValidLogin",1,0);
					String pw=Excel.getCellValue(XLPATH,"ValidLogin",1,1);
					String accnt=Excel.getCellValue(XLPATH,"ValidLogin",1,2);
		
					String cb=Excel.getCellValue(XLPATH,"Author",1,3);
					

					LoginPage l=new LoginPage(driver);
					

					
					BasePage b=new BasePage(driver);

					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "username is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
				   	
					 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
		
					 
					l.setPassword(pw);
					
					Thread.sleep(5000);
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Password is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					
					l.clickLogin();
					
					Thread.sleep(30000);

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Login is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			   	  imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
					
					l.dropdowntheaccount(accnt);
					Thread.sleep(5000);
				

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "dropdown is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					l.clickselect();
					Thread.sleep(5000);
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "select is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");

			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
  
	   }
	   
	   

	   @Test
	    public void TC2(Method method) throws InterruptedException, IOException {

		   
		   
		 //ExtentReports Description
	        ExtentTestManager.getTest().setDescription(" Verify that  INVALID username and VALID password");
	      

	        ExtentTestManager.getTest().assignCategory("Regression Testing");
	        
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
	        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
	    	

			driver.navigate().to(url);


			 Randomaplphanumber R=new Randomaplphanumber();
			  
		       String imagePath=  R.Random();
				
					String un=Excel.getCellValue(XLPATH,"ValidLogin",2,0);
					String pw=Excel.getCellValue(XLPATH,"ValidLogin",2,1);
					String accnt=Excel.getCellValue(XLPATH,"ValidLogin",2,2);
		
					String cb=Excel.getCellValue(XLPATH,"Author",1,3);
					
					

					LoginPage l=new LoginPage(driver);
					

					
					BasePage b=new BasePage(driver);

					driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "username is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
		
					 
					l.setPassword(pw);
					
					Thread.sleep(5000);
					
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Password is Typed ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					
					l.clickLogin();
					
					Thread.sleep(30000);

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "Login is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
					
					l.dropdowntheaccount(accnt);
					Thread.sleep(5000);
				

				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "dropdown is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");
			        
			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
			
					l.clickselect();
					Thread.sleep(5000);
				    ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS, "select is clicked ");
					
					
			        ExtentTestManager.getTest(method.getName()).log(LogStatus.INFO, "Snapshot below: ");

			   	 imagePath=	getScreenshot(driver,method.getName());
		            ExtentTestManager.getTest(method.getName()).log(LogStatus.PASS,ExtentTestManager.getTest(method.getName()).addScreenCapture(imagePath));   
	
		
			
		   	   
	   }
	
	/*
	
	@Test
		public void testValidLogin1() throws Exception
		
		{
	  
		

		driver.navigate().to(url);

	
			
				String un=Excel.getCellValue(XLPATH,"ValidLogin",1,0);
				String pw=Excel.getCellValue(XLPATH,"ValidLogin",1,1);
				String accnt=Excel.getCellValue(XLPATH,"ValidLogin",1,2);
	
				String cb=Excel.getCellValue(XLPATH,"Author",1,3);
				
				

				LoginPage l=new LoginPage(driver);
				

				
				BasePage b=new BasePage(driver);

				driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
				

		
	
				 
				l.setPassword(pw);
				
				Thread.sleep(5000);
				

		
				
				l.clickLogin();
				
				Thread.sleep(30000);

				
				l.dropdowntheaccount(accnt);
				Thread.sleep(5000);
			


		
				l.clickselect();
				Thread.sleep(5000);

			
				HomePage h=new HomePage(driver);
		
				driver.close();

				
				ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
		        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
		      
				  Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);

					driver.close();

				  
				  
		}

		




	@Test
	public void testValidLogin2() throws Exception
	
	{
 
	
	driver.navigate().to(url);

		
		 Randomaplphanumber R=new Randomaplphanumber();
		  
	String r=  R.Random();
		
			String un=Excel.getCellValue(XLPATH,"ValidLogin",2,0);
			String pw=Excel.getCellValue(XLPATH,"ValidLogin",2,1);
			String accnt=Excel.getCellValue(XLPATH,"ValidLogin",2,2);

			String cb=Excel.getCellValue(XLPATH,"Author",1,3);
			
			
		

			

			LoginPage l=new LoginPage(driver);
			

			
			BasePage b=new BasePage(driver);
			


			
			
			driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys(un);;
			
	
	    //    r= BaseTest.getScreenshot(driver, method.getName());
				

			 
			 
			l.setPassword(pw);
			
			Thread.sleep(25000);
			


			
	      //  r= BaseTest.getScreenshot(driver, method.getName());
				

			
			l.clickLogin();
			
			Thread.sleep(25000);
			

			
			l.dropdowntheaccount(accnt);
			Thread.sleep(25000);

			
	
			l.clickselect();
			Thread.sleep(5000);
			
			

		
			HomePage h=new HomePage(driver);
			
			
			
			
			   driver.close();
			   
				
			   ExtentTestManager.getTest().log(LogStatus.PASS, "Log from threadId: " + Thread.currentThread().getId());
		        ExtentTestManager.getTest().log(LogStatus.INFO, "Log from threadId: " + Thread.currentThread().getId());
		        Assert.assertEquals(ExtentTestManager.getTest().getRunStatus(), LogStatus.PASS);
		
	}


*/

	}












