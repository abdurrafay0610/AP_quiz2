package quiz2;

import java.util.ArrayList;
import java.util.List;

public class Customer 
{
	private String name;
	ArrayList<Food> service = new ArrayList<Food>();
	
	//constructor
	Customer()
	{
		
	}
	Customer(String name)
	{
		this.setName(name);
	}
	
	//getter setter
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//ftns
	public void OrderFood(int bill)
	{
		Food obj=new Food("Food",bill);
		service.add(obj);
	}
	public void OrderService(int bill)
	{
		Food obj=new Food("Misc",bill);
		service.add(obj);
	}
	public int getBill() 
	{
		int bill=0;
		
		int size=service.size();
		
		for(int i=0;i<size;i++)
		{
			bill+=service.get(i).getAmount();
		}
		
		return bill;
	}
	
}
