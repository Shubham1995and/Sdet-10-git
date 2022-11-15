package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class providers {

	@Test(dataProvider="asc")
	public void datap(String username,String pass)
	{
		System.out.println(username);
		System.out.println(pass);
	}
	@DataProvider(name="asc")
	public Object[][] data()
	{
		Object[][] arr   =new Object [2][2];
		
		arr[0][0]="mumbai";
		arr[0][1]="pune";
		arr[1][0]="satara";
		arr[1][1]="nashik";
		return arr;
		
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
