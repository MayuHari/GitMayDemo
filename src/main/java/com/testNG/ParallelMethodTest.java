package com.testNG;
import org.testng.annotations.Test;

public class ParallelMethodTest {
	@Test
	public void firstMsg() {
		System.out.println("Welcome");
		System.out.println("Thread ID"+Thread.currentThread().getId());
	}
	@Test
	public void mainMsg() {
		System.out.println("Study Well");
		System.out.println("Thread ID:"+Thread.currentThread().getId());
	}
	@Test
	public void subMsg() {
		System.out.println("practise well");
		long treadId = Thread.currentThread().getId();
		System.out.println(treadId);
	}
	@Test
	public void endMsg() {
		System.out.println("Finnaly get placed");
		System.out.println("Tread id:"+ Thread.currentThread().getId());
	}
}
