package com.PracticeFeb2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo6 {
	private static Logger log = LogManager.getLogger(Demo6.class.getName());

	@Test
	public void test10() {
		log.info("Test--10");
		System.out.println("Appium Practice---10");

	}

	@Test
	public void test11() {
		log.info("Test--11");
		System.out.println("RestApi Practice!!!---11");

	}

	@Test(priority=1, enabled=true)
	public void test12() {
		log.info("Test--12");
		System.out.println("Cucumber Practice!!!---12");
		Assert.assertEquals("Hello", "Hello");

	}

	@Test(priority=2, enabled=true)
	public void test13() {
		log.info("Test--13");
		System.out.println("Cucumber Practice!!!---13");
		Assert.assertTrue(false);// passed test
	}

	@Test(priority=3, enabled=true,dependsOnMethods = { "test13", "test12" })
	public void test14() {
		log.info("Test--14");
		System.out.println("Cucumber Practice!!!---14");
		Assert.assertFalse(false);

	}

}
