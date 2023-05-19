package TestNGpractice;

import org.testng.annotations.Test;

public class GroupsConsept 
{
	@Test(groups="Sanity Test")
	public void logoTest()
	{
		System.out.println("logo is displayed");
	}
	@Test(groups = "Sanity Test")
	public void validateLoginTest()
	{
		System.out.println("Logged in successfully");
		
	}
	@Test(groups= "Regression Test")
	public void createContactTest()
	{
		System.out.println("Contact has been created");
	}
	@Test(groups="Regression Test")
	public void createCompanyTest()
	{
		System.out.println("company has been created" );
	}
}
