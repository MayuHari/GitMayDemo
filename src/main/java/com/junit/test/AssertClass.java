package com.junit.test;

import org.junit.After;
import org.junit.Test;

import junit.framework.Assert;

public class AssertClass {

	@Test
	public void msg() {
		String name = "Siddu";
		System.out.println(name);	
		Assert.assertEquals(name, "siddu");	
		System.out.println(name);
	}

	@After
	public void str() {
		boolean name1 = true;
		Assert.assertTrue(name1);
		System.out.println(name1);
	}



}
