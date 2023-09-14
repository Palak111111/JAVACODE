class Car 
{
  int modelno,capacity,number,door;
  String colour,company,fuel;
  double weight,rating,fuelTankCap;
  public void setData(int modelno,double fuelTankCap,int capacity,int number,int door,String colour,String company,String fuel,double weight,double rating)
  {
	  this.modelno=modelno;
	  this.capacity=capacity;
	  this.number=number;
	  this.door=door;
	  this.colour=colour;
	  this.company=company;
	  this.fuel=fuel;
	  this.fuelTankCap=fuelTankCap;
	  this.weight=weight;
	  this.rating=rating;
  }
  public int getModel()
  {
	return modelno;  
  }
  public int getCapacity()
  {
	return capacity;  
  }
  public int getNumber()
  {
	return number;  
  }
  public int getDoor()
  {
	return door;  
  }
  public String getColour()
  {
	return colour;  
  }
  public String  getCompany()
  {
	return company;  
  }
  public String getFuel()
  {
	return fuel;  
  }
  public double getFueltank()
  {
   return fuelTankCap;  
  }
  public double getWeight()
  {
	return weight;  
  }
  public double getRating()
  {
	return rating;  
  }
  
}
class Mahindra extends Car
{
	String speciousInterior, driveType;
	public void setData(int modelno,double fuelTankCap,int capacity,int number,int door,String colour,String company,String fuel,double weight,double rating,String speciousInterior,String driveType)
	{
		this.setData(modelno,fuelTankCap,capacity,number,door,colour,company,fuel,weight,rating);
		this.speciousInterior=speciousInterior;
		this.driveType=driveType;
	}
	public String getSpeciousInterior()
	{
	 return speciousInterior;	
	}
	public String getDriveType()
	{
		return driveType;
	}
}
class Thar extends Mahindra
{
	String offRoading,name;
	int cyclinder;
	public void setData(int modelno,double fuelTankCap,int capacity,int number,int door,String colour,String company,String fuel,double weight,double rating,String speciousInterior,String driveType,String offRoading,int cyclinder,String name)
	{
		this.setData(modelno,fuelTankCap,capacity,number,door,colour,company,fuel,weight,rating,speciousInterior,driveType);
		this. offRoading=offRoading;
		this.cyclinder=cyclinder;
		this.name=name;
	}
	public int getCyclinder()
	{
		return cyclinder;
	}
	public String getOff()
	{
		return offRoading;
	}
	public String getName()
	{
		return name;
	}
}
class Test
{
	public static void main(String args[])
	{
		Thar th=new Thar();
		th.setData(1234567,43.4,4,3636,4,"Black","Mahindra","Diesel",500,4.6,"More Comfortable","RWD","Yes",4,"Thar LX");
		System.out.println("NAME OF COMPANY = "+th.getCompany());
		System.out.println("NAME OF CAR  = "+th.getName());
		System.out.println("MODEL NUMBER  = "+th.getModel());
		System.out.println("FUEL TANK CAPACITY  = "+th.getFueltank());
		System.out.println("FUEL TYPE = "+th.getFuel());
		System.out.println("RATING  = "+th.getRating());
		System.out.println("WEIGHT  = "+th.getWeight());
		System.out.println("OFFROADING  = "+th.getOff());
		System.out.println("DRIVE TYPE  = "+th.getDriveType());
		System.out.println("NUMBER OF CAR  = MP 09 SC "+th.getNumber());
		System.out.println("COLOUR OF CAR  = "+th.getColour());
		System.out.println("SPECIOUS INTERIOR OF CAR  = "+th.getSpeciousInterior());
	}
}