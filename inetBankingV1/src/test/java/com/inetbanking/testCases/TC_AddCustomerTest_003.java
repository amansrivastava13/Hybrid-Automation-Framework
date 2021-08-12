package com.inetbanking.testCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		logger.info("providing customer details...");
		
		addcust.custName("Warrior");
		addcust.custgender("male");
		addcust.custdob("10", "13", "1997");
		Thread.sleep(5000);
		addcust.custaddress("India");
		addcust.custcity("Lucknow");
		addcust.custstate("UP");
		addcust.custpinno("226027");
		addcust.custtelephoneno("987901456");
		// Now we have to generate email id dynamically. Because this system will not take the same-id again
		String email = randomString()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("qwerty12345");
		addcust.custsubmit();
		
		Thread.sleep(5000);
		
		logger.info("validation started...");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res == true)
		{
			Assert.assertTrue(true);
			logger.info("test case passed...");
		}
		else
		{
			logger.info("test case failed...");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
	}
		
}
