package com.PracticeFeb2020;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class Demo1 {
	private static Logger log = LogManager.getLogger(Demo5.class.getName());

	@Test
	public void test1() {
		log.info("Test--1");
		System.out.println("Java Practice!!! --1");

	}

}
