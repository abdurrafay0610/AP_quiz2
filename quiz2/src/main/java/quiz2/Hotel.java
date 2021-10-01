package quiz2;

import java.util.ArrayList;

public class Hotel 
{
	ArrayList<Room> room = new ArrayList<Room>();
	private int RoomNumber;
	//constructor
	Hotel()
	{
		RoomNumber=0;
	}
	//ftns
	public boolean addRoom()
	{
		RoomNumber++;
		Room obj=new Room(RoomNumber);
		room.add(obj);
		return true;
	}
	public void getAvailableRoom() throws RoomNotFound
	{
		int size=room.size();
		if(size==0)
		{
			throw new RoomNotFound("No Rooms Found!");
		}
		else
		{	
			for(int i=0;i<size;i++)
			{
				if(room.get(i).status==false)
				{
					System.out.println("The Room "+i+1+" is available.");
				}
			}
		}
	}
	public int SearchGuest(int k)
	{
		int size = room.size();
		
		for(int i=0;i<size;i++)
		{
			if(room.get(i).key==k)
			{
				if(room.get(i).status==false)
				{
					System.out.println("No such guest");
					return 0;
				}
				else
				{
					System.out.println("Customer name is:"+room.get(i).getClient().getName());
					return k;			
				}
			}
		}
		System.out.println("No such Room");
		return 0;
	}
	public boolean BookRoom(int k,int d, int m, int y, int s)
	{
		int size = room.size();
		
		for(int i=0;i<size;i++)
		{
			if(room.get(i).key==k)
			{
				return room.get(i).BookRoom(d, m, y, s);
			}
		}
		return false;
	}
	public boolean ReserveRoom(int k,String n)
	{
		int size = room.size();
		
		for(int i=0;i<size;i++)
		{
			if(room.get(i).key==k)
			{
				if(room.get(i).status==false)
				{
					room.get(i).getClient().setName(n);
					room.get(i).status=true;
					return true;
				}
			}
		}
		return false;
	}
}
