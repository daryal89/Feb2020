package com.PracticeFeb2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {
	private static Logger log = LogManager.getLogger(Demo5.class.getName());

	@Test
	public void test5() {
		log.info("Test--5");
		System.out.println("Appium Practice---5");

	}

	@Test
	public void test6() {
		log.info("Test--6");
		System.out.println("RestApi Practice!!!---6");

	}

	@Test
	public void test7() {
		log.info("Test--7");
		System.out.println("Cucumber Practice!!!---7");
		Assert.assertEquals("Hello", "hello");

	}

	@Test
	public void test8() {
		log.info("Test--8");
		System.out.println("Cucumber Practice!!!---7");
		Assert.assertTrue(false);// failed test
	}

	@Test(dependsOnMethods = { "test7", "test6" })
	public void test9() {
		log.info("Test--9");
		System.out.println("Cucumber Practice!!!---7");

	}

}
