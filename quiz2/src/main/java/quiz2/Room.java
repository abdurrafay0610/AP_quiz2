package quiz2;

import java.util.ArrayList;

public class Room 
{
	int key;
	private Customer client;
	boolean status;
	ArrayList<Booking> booked = new ArrayList<Booking>();
	
	//constructor
	Room()
	{
		client = new Customer();
	}
	Room(int k)
	{
		key=k;
		status=false;
		client = new Customer();
	}
	//getter setter
	public Customer getClient() 
	{
		return client;
	}
	public void setClient(Customer client) 
	{
		this.client = client;
	}
	//ftns
	public boolean BookRoom(int d,int m,int y,int s)
	{
		Booking obj = new Booking(d,m,y,s);
		booked.add(obj);
		return true;
	}
}
