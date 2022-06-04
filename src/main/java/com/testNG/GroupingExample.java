package com.testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Arena"})
	public void model1() {
		System.out.println("Swift");
	}
	@Test(groups= {"Arena"})
	public void model2() {
		System.out.println("Dzire");
	}
	@Test(groups= {"Arena"})
	public void model3() {
		System.out.println("Vittara Brezza");
	}
	@Test(groups= {"Arena"})
	public void medel4() {
		System.out.println("Next gen Ertiga");
	}
	@Test(groups= {"Nexa"})
	public void model5() {
		System.out.println("Baleno");
	}
	@Test(groups= {"Nexa"})
	public void model6() {
		System.out.println("Scross");
	}

}
