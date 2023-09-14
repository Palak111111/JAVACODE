class Mobile
{
	String company,display,colour;
	int modnum,batterycap;
	double weight,price;
	public void setCompany(String company)
	{
		this.company=company;
	}
	public void setDisplay(String display)
	{
		this.display=display;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	public void setModel(int modnum)
	{
		this.modnum=modnum;
	}
	public void setBattery(int batterycap)
	{
	 this.batterycap=batterycap;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	public String getCompany()
	{
		return company;
	}
	public String getDisplay()
	{
		return display;
	}
	public String getColour()
	{
		return colour;
	}
	public int getModel()
	{
	  return modnum;
	}
	public int getBattery()
	{
	  return batterycap;
	}
	public double getPrice()
	{
		return this.price;
	}
	public double getWeight()
	{
		return this.weight;
	}
}
class Xiaomi extends Mobile
{
	String  remotecon;
	int camera;
	public void setRemote(String remotecon)
	{
		this.remotecon=remotecon;
	}
	public  void  setCam(int camera)
	{
		this.camera=camera;
	}
	public String getRemote()
	{
		return remotecon;
	}
	public int getCam()
	{
		return camera;
	}
	
}
class RedmiNote extends Xiaomi
{
	int memory,imei;
	public void setImei(int imei)
	{
		this.imei=imei;
	}
	public void setMemory(int memory)
	{
		this.memory=memory;
	}
	public int getImei()
	{
		return imei;
	}
	public int getMemory()
	{
		return memory;
	}
}
class Test
{
	public static void main(String args[])
	{
		RedmiNote ob=new RedmiNote();
		ob.setCompany("Redmi Note TC");
		ob.setDisplay("Amoled Display");
		ob.setColour("Black");
		ob.setModel(12345);
		ob.setBattery(24);
		ob.setPrice(12000);
		ob.setWeight(500);
		ob.setRemote("Yes ");
		ob.setCam(64);
		ob.setImei(234567);
		ob.setMemory(32);
		System.out.println("COMPANY NAME  = "+ob.getCompany());
		System.out.println("DISPLAY = "+ob.getDisplay());
		System.out.println("COLOUR  = "+ob.getColour());
		System.out.println("MODEL NUMBER = "+ob.getModel());
		System.out.println("BATTERY = "+ob.getBattery()+"amh");
		System.out.println("WEIGHT IN GMS = "+ob.getWeight());
		System.out.println("PRICE  rs.= "+ob.getPrice());
		System.out.println("REMOTE CONTROL = "+ob.getRemote());
		System.out.println("CAMERA QUALITY  = "+ob.getCam()+"mg pixcle");
		System.out.println("IMEI NUMBER  = "+ob.getImei());
		System.out.println("MEMORY = "+ob.getMemory()+"GB");
	
	}
}