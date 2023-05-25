package Automation.TestNgJenkinsPipeProject;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups = "Regression")
	public void regressionTest1() {
		System.out.println("Regression");
	}
	@Test(groups = "Functional")
	public void functionalTest2() {
		System.out.println("Functional");
	}
	@Test(groups = "Sanity")
	public void sanityTest() {
		System.out.println("sanityTest");
	}
	@Test(groups = "Performance")
	public void performanceTest() {
		System.out.println("Performance");
	}
}