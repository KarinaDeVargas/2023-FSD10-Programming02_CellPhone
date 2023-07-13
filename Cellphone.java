package Activity27thJune;

public class Cellphone 
{
	
	private String brand;  
	private long serialNumber;
	private int snGenerator = 123450678;
	private double price;
	private int count = 0;
	
	
	public Cellphone() //by default constructor - initializing attributes with valid values using constructor 
	{
		System.out.println("Cellphone created by default constructor.");
		brand = "Samsung";
		serialNumber = snGenerator;
		price = 15413.33;
		count++;
		snGenerator = + 1234;
	}
	
	 
	public Cellphone(String br, double pr)//by parameter constructor - passing in parameters - initializing attributes with valid values using constructor 
	{
		System.out.println("Cellphone created by parameter constructor.");
		brand = br;
		serialNumber = snGenerator;
		price = pr;
		count++;
		snGenerator = + 1234;
	}
	
	public Cellphone(Cellphone c) //by copy constructor - initializing attributes with valid values using constructor
	{
		System.out.println("Cellphone created by copy constructor.");
		this.brand = c.brand;
		this.serialNumber = snGenerator;
		this.price = c.price;
		count++;
		snGenerator = + 1234;
	}

	public String getBrand()
	{
		return this.brand;
	}

	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public long getSerialNumber()
	{
		return this.serialNumber;
	}
	
	public void setSerialNumber(long serialNumber)
	{
		this.serialNumber = serialNumber;
	}


	@Override
	public String toString() 
	{
		return "Cellphone brand is " + brand + ", serialNumber is " + serialNumber + ", and price is " + price + "$. ";
	}
	
	
	public boolean equals(Cellphone c) 
	{
		if (this.brand == c.brand && this.price == c.price)
		{	
			return true;
		}
		else
		{
			return false;
		}
	}
		
		
		
}
