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
	public void getAvailableRoom()
	{
		int size=room.size();
		
		for(int i=0;i<size;i++)
		{
			if(room.get(i).status==false)
			{
				System.out.println("The Room "+i+1+" is available.");
			}
		}
	}
	
}
