package com.testNG;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority=0)   // (AttributeName = AttributeValue)
	public void front() {
		System.out.println("First Step");
	}
	@Test(priority=1)
	public void interior() {
		System.out.println("Second Step");
	}
	@Test(priority=2)
	public void rear() {
		System.out.println("Third Step");
	}
	@Test(priority=3)
	public void seat() {
		System.out.println("Fourth Step");
	}
	@Test(priority=4)
	public void safety() {
		System.out.println("Fifth Step");
	}
	@Test(priority=-1)           
	public void tank() {
		System.out.println("Sixth Step");
	}
	

}
