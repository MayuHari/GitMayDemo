package com.junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationTypesEx {

	@BeforeClass
	public static void first() {

		System.out.println("Hai");
	}

	@Before
	public void welcome() {
		System.out.println("Welcome To The world");
	}

	@Test
	public void msg() {
		System.out.println("Siddu");
	}

	@After
	public void  text() {
		System.out.println("By");
	}

	@AfterClass
	public static void end() {

		System.out.println("Mommy");
	}

}
