class Vehical
{
 String brand,name,colour,diesel;
 double price,weight;
 int capacity,wheel;
 public void setData(String brand,String name,String colour,double price,double weight,int capacity,int wheel,String diesel )
 {
    this.brand=brand;
	this.name=name;
	this.colour=colour;
	this.price=price;
	this.weight=weight;
    this.capacity=capacity;
	this.wheel=wheel;
	this.diesel=diesel;
 }
	public String getBrand()
	{
		return brand;
	}
	public String getName()
	{
		return name;
	}
	public String getColour()
	{
		return colour;
	}
	public double getPrice()
	{
		return price;
	}
	public double getWeight()
	{
		return weight;
	}
	public int getCapacity()
	{
		return capacity;
	}
		public int getWheel()
	{
		return wheel;
	}
	public String getDiesel()
	{
	   return diesel;	
	}
 
 }
 class Bus extends Vehical
 {
	private  int modelNo;
	private String service;
	public void setData(String brand,String name,String colour,double price,double weight,int capacity,int wheel,String diesel,int modelNo,String service )
    {
		this.setData(brand, name,colour, price,weight,capacity,wheel,diesel );
	    this.modelNo=modelNo;
		this.service=service;
	}	
	public int getModel()
	{
		return modelNo;
	}
	public String getService()
	{
		return service;
	}
 }
 class Test
 {
	public static void main(String args[])
	{
		Bus ob =new Bus();
		ob.setData("VOLVO","ASHOK TRAVEL","BLUE",2000000,589,48,6,"diesel and cng",1234567,"Travel");
		System.out.println("BRAND OF VEHICAL = "+ob.getBrand());
		System.out.println("NAME OF VEHICAL = "+ob.getName());
		System.out.println("COLOUR OF VEHICAL = "+ob.getColour());
		System.out.println("PRICE OF VEHICAL = "+ob.getPrice());
		System.out.println("WEIGHT OF VEHICAL = "+ob.getWeight());
		System.out.println("CAPACITY OF VEHICAL = "+ob.getCapacity());
		System.out.println("WHEELES IN VEHICAL = "+ob.getWheel());
		System.out.println("FUEL OF VEHICAL = "+ob.getDiesel());
		System.out.println("MODEL NUMBER OF VEHICAL = "+ob.getModel());
		System.out.println("SERVICE OF VEHICAL = "+ob.getService());
	}	
 }