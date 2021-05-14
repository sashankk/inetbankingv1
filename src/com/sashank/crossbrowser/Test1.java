package com.sashank.crossbrowser;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	@parameter(browser)
	public void method1() {
		System.out.println("method 1");
	}
	
	@Test
	public void method2() {
		System.out.println("method 2");
	}
	
	@Test
	public void method3() {
		System.out.println("method 3");
	}
}
