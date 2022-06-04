package com.testNG;

import org.testng.annotations.Test;

public class DependenciesManagementExample {
	
    @Test(priority=0,enabled=true)
	public void orderBooking() {
		System.out.println("Customer Booked Swift,");
	}
    
    @Test(priority=1,dependsOnMethods="orderBooking")
	public void allotment() {
		System.out.println("Zxi + model Allotment was done,");
	}
    
    @Test(priority=2)
	public void invoice() {
		System.out.println("Billing processed,");
	}
    
    @Test(priority=3,enabled=false)
	public void rto() {
		System.out.println("Registration done for Swift and");
	}
    
    @Test(priority=4,dependsOnMethods="rto")
	public void delivery() {
		System.out.println("Delivered the Car to the customer");
	}
}
