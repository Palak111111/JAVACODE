class Area
{
     private int l;
	 protected int b;
     public void setData(int l,int b) 
	{
	 this.l=l;
	 this.b=b;
	}
	 public int area()
	 {
	  return this.l*this.b;
	 }
}
class Volume extends Area 
{
	private int h;
	public void setData(int l,int b,int h)
	{
		this.setData(l,b);
		this.h=h;
	}
	public int vol()
	{
		return this.area()*this.h;
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Volume ob=new Volume();
	//	ob.setData(2,3);
		ob.setData(5,4,2);
		System.out.println("Area = "+ob.area());
		System.out.println("Volume = "+ob.vol());
	}
	
}