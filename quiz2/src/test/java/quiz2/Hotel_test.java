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
		Assert.assertEquals(true, bol);
		
		bol = hotel.ReserveRoom(1, "Syed");		//will not reserve already reserved room
		Assert.assertEquals(false, bol);
		
		bol = hotel.ReserveRoom(5, "Abdurrafay"); //reserving a non existant room
		Assert.assertEquals(false, bol);
	}
	@Test
	public void Book_Room()
	{
		hotel.addRoom();
		
		Assert.assertEquals(true, hotel.BookRoom(1, 5, 5, 2022, 10));	//Booking a room that exist
		Assert.assertEquals(false, hotel.BookRoom(2, 5, 5, 2022, 10));	//Booking a room that does not exist
	}
}
