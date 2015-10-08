package firsttest;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class understandingOfAssertion {
	@Rule
	public ErrorCollector errcollecter = new ErrorCollector();
	
	
	@Test
	public void facebookfriendcount(){
		int actualfriend = 100;
		int expectedfriend = 101;
		
		/*if(actualfriend == expectedfriend){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
		}*/
		System.out.println("A");
		try{
		Assert.assertEquals(actualfriend, expectedfriend);
		}catch(Throwable t){
			System.out.println("Error Counted");
			errcollecter.addError(t);
		}
		System.out.println("B");
	}
}
