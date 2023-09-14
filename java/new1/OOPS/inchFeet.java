class Height
{
  private int feet,inch;
  public void setData(int feet,int inch)
   {
    this.feet=feet;
	this.inch=inch;
   }
   public void display()
   {
    System.out.println("FEET= "+ feet);
    System.out.println("INCH= "+ inch);
   }
   public void add(Height a, Height b)
   {
    this.feet=a.feet+b.feet;
	this.inch=a.inch+b.inch;
	if(this.inch>12)
	{
	 int t=this.inch/12;
	 this.feet=feet+t;
	 this.inch=inch-(t*12);
	}
   }
}
class Test
{
  public static void main(String args[])
  {
    Height h1=new Height();
	Height h2=new Height();
    Height h3=new Height();
    h1.setData(5,8);
    h2.setData(12,5);
    h3.add(h1,h2);
    h3.display();	
  }
}