package firsttest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//for parameterized this is first step
@RunWith(Parameterized.class)

public class perameterized {
//second step
		public String username;
		public String password;
		public String city;
		
//third Step
		
			public perameterized(String username , String password , String city){
				this.username = username;
				this.password = password;
				this.city = city;
			}
			@Parameters
			public static Collection<Object[]> getData(){
				Object[][] data = new Object[3][3];
				//First User
				data[0][0] = "Swaminarayan";
				data[0][1] = "SahajanandSwami";
				data[0][2] = "Chhapaiya";
				
				//Second User
				data[1][0] = "Pramukhswami";
				data[1][1] = "pramukh";
				data[1][2] = "Chansad";
				
				//Second User
				data[2][0] = "Gunatitanand Swami";
				data[2][1] = "swami";
				data[2][2] = "Bhadra";
				
				return Arrays.asList(data);
				
			}
			@Test
			public void runtest(){
				System.out.println("*****Testing Parameterized**** " +username +"---"+password+"---"+city);
			}
		
		
}
