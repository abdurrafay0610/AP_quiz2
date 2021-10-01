package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Customer_test 
{
	Customer client;

	@Before
	public void setup()
	{
		client=new Customer("Abdurrafay");
	}
	@Test
	public void bill() 
	{
		client.OrderFood(1000);
		client.OrderService(500);
		
		Assert.assertEquals(1500, client.getBill());
	}

}
