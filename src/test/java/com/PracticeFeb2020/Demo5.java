package com.PracticeFeb2020;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo5 {

	@Test
	public void test5() {
		System.out.println("Appium Practice---5");

	}

	@Test
	public void test6() {
		System.out.println("RestApi Practice!!!---6");

	}

	@Test
	public void test7() {
		System.out.println("Cucumber Practice!!!---7");
		Assert.assertEquals("Hello", "hello");

	}

	@Test
	public void test8() {
		System.out.println("Cucumber Practice!!!---7");
		Assert.assertTrue(false);// failed test
	}

	@Test(dependsOnMethods = { "test7", "test6" })
	public void test9() {
		System.out.println("Cucumber Practice!!!---7");

	}

}
