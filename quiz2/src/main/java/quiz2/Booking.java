package quiz2;

public class Booking 
{
	private int sday;
	private int smonth;
	private int syear;
	private int stay;
	
	//constructor
	Booking()
	{
		
	}
	Booking(int d,int m,int y,int s)
	{
		this.setSday(d);
		this.setSmonth(m);
		this.setSyear(y);
		this.setStay(s);
	}
	//getter setter
	public int getSday() 
	{
		return sday;
	}
	public void setSday(int sday) 
	{
		this.sday = sday;
	}
	public int getSmonth() 
	{
		return smonth;
	}
	public void setSmonth(int smonth) 
	{
		this.smonth = smonth;
	}
	public int getSyear() 
	{
		return syear;
	}
	public void setSyear(int syear) 
	{
		this.syear = syear;
	}
	public int getStay() 
	{
		return stay;
	}
	public void setStay(int stay) 
	{
		this.stay = stay;
	}
}
