package quiz2;

public class Food 
{
	private String service;
	private int amount;
	
	//constructor
	Food()
	{
		
	}
	Food(String service, int amount)
	{
		this.setService(service);
		this.setAmount(amount);
	}
	//getter setter
	public String getService() 
	{
		return service;
	}
	public void setService(String service) 
	{
		this.service = service;
	}
	public int getAmount() 
	{
		return amount;
	}
	public void setAmount(int amount) 
	{
		this.amount = amount;
	}
	

}
