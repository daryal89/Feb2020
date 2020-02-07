package com.PracticeFeb2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginTest {

	Logger log = Logger.getLogger(LoginTest.class); // For customizing the log

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		log.info("*************** Starting the test cases***************************");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//src/main/resources//chromedriver.exe");

		driver = new ChromeDriver();
		log.info("launching chrome browser");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://freecrm.com/");

		log.info("entering  application Url");
		log.warn("This is just a warning message");
		log.fatal("hey this is just fatal error message");
		log.debug("This is debug message");
		log.error("This is error message");

	}

	@Test(priority = 1)
	public void freeCrmTitleTest() {
		log.info("---------------freeCRMTitleTest Started ------------------");
		String title = driver.getTitle();
		log.info("page title is: " + title);
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");

		log.info("--------FreeCRMTitleTest finished -----------------");
	}

	@Test(priority = 2)
	public void freeCRMLogoTest() {
		boolean b = driver.findElement(By.cssSelector("a.brand-name")).isDisplayed();

		log.info("Logo is present: " + b);

		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
