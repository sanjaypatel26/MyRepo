package firsttest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class secondtestcase {

	public static boolean checkloginTest(){
		return false;
		
	}
	@Test
	public void secondloginTest(){
		System.out.println("This is Second Login");
	}
	@Test
	@Ignore
	public void secondadminloginTest(){
		System.out.println("This is Second Admin Login");
	}
	@Before
	public void beforeTest(){
		System.out.println("Before");
		
	}
	@After
	public void afterTest(){
		System.out.println("After");
	}
	@BeforeClass
	public static void beforeclassTest(){
		System.out.println("**********BeforeClass************");
		Assume.assumeTrue(checkloginTest());
	}
	@AfterClass
	public static void afterclassTest(){
		System.out.println("**********AfterClass************");
	}
}
