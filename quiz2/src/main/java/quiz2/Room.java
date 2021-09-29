package quiz2;

import java.util.ArrayList;

public class Room 
{
	int key;
	Customer client;
	boolean status;
	ArrayList<Booking> booked = new ArrayList<Booking>();
	
	//constructor
	Room()
	{
		
	}
	Room(int k)
	{
		key=k;
		status=false;
	}
	public boolean BookRoom(int d,int m,int y,int s)
	{
		Booking obj = new Booking(d,m,y,s);
		booked.add(obj);
		return true;
	}
}
