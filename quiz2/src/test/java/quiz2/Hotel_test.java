package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Hotel_test {

	Hotel hotel;
	
	@Before
	public void setup()
	{
		hotel = new Hotel();
	}
	@Test
	public void Room_add_test() 
	{
		hotel.addRoom();
		hotel.addRoom();
		hotel.addRoom();
		
		Assert.assertEquals(3,hotel.room.size());
	}
	@Test
	public void Reserve_Room_test() 
	{
		hotel.addRoom();
		hotel.addRoom();
		hotel.addRoom();
		
		boolean bol=hotel.ReserveRoom(1, "Abdurrafay");	//room will be reserved
		System.out.println(bol);
		Assert.assertEquals(true, bol);
		System.out.println(bol);
		
		bol = hotel.ReserveRoom(1, "Syed");		//will not reserve already reserved room
		Assert.assertEquals(false, bol);
		
		bol = hotel.ReserveRoom(5, "Abdurrafay"); //reserving a non existant room
		Assert.assertEquals(false, bol);
	}
}
