class Mobile
{
 String company, colour,display;
 int weight,price,emi;
 Galaxy galx;
 public Mobile (String company,String colour,int weight,int price,int emi,String display,String series,int variant)
 {
  this.company=company;
  this.colour=colour;
  this.weight=weight;
  this.price=price;
  this.emi=emi;
  //this.battery=battery;
  this.display=display;
  galx=new Galaxy(series,variant);
 }
 void displayMob()
 {
	 System.out.println("COMPANY OF MOBILE = "+this.company);
	 System.out.println("COLOUR  OF MOBILE = "+this.colour);
	 	 System.out.println("WEIGHT OF MOBILE = "+this.weight);
		 	 System.out.println("PRICE OF MOBILE = "+this.price);
			 	 System.out.println("EMI OF MOBILE = "+this.emi);
				  System.out.println("Display OF MOBILE = "+this.display);
				 this.galx.displayGal();
 }
 class Galaxy
 {
	int variant;
    String series;
   	public Galaxy(String series,int variant)
	{
		this.series=series;
		this.variant=variant;
		
	}	
	public void displayGal()
	{
		System.out.println("VARIANT OF PHONE = "+this.variant);
		System.out.println("SERIES OF PHONE = "+this.series);
	}
	}
}
class Test
{
	public static void main(String args[])
	{
	 Mobile ob = new Mobile("SAMSUNG","WHITE",500,200000,23453,"AMOLED","A",54);
	 ob.displayMob();
	}
}