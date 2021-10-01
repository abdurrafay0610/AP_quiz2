package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Room_test 
{
	Room room;
	
	@Before
	public void setup()
	{
		room= new Room(1);
	}
	@Test
	public void RoomBook_test() 
	{
		Assert.assertEquals(true, room.BookRoom(10, 5, 2021, 10));
		
	}

}
