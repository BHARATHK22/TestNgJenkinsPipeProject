package Automation.TestNgJenkinsPipeProject;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups = "Sanity")
	public void smokeTest1() {
		System.out.println("sanityTest");
	}
	@Test(groups = "Smoke")
	public void smokeTest2() {
		System.out.println("smokeTest");
	}

}
