class Prism
{
  double h,b;
    public void setData(double h,double b)
	{
	 this.h=h;
	 this.b=b;
	}
	 public double parea()
	 {
	  return this.h*this.b;
	 }

}
class  Pyramid extends Prism
{
	private double  a=1/3;
	public void setData(double a,double b,double h)
	{
		this.setData(b,h);
		this.a=a;
	}
	public double pa()
	{
		return this.a/ this.parea();
	}
	
}
class Test
{
	public static void main(String args[])
	{
		Pyramid ob=new Pyramid();
	//	ob.setData(2,3);
		ob.setData(4,2,6);
		System.out.println("Prism = "+ob.parea());
		System.out.println("Pyramid = "+ob.pa());
	}
	
}