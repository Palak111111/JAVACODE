class Rectangle
{
    int l,b;
    public void setData(int l,int b)
	{
	 this.l=l;
	 this.b=b;
	}
	  public int larea()
	 {
	  return this.l*this.b;
	 }
}
class Triangle extends Rectangle
{
 private int base,height;
 private float t;
 public void setData(int base,int height,int l)
 {
  this.base=base;
  this.height=height;
 }
  public float res()
  {
    t=(float)this.l*1/2 *this.base*this.height;
	return t;
  }
}
class Test
{
  public static void main (String args[])
  {
  Triangle ob=new Triangle();
  ob.setData(40,8,7);
  ob.setData(10,6);  
  System.out.println("Area of Triangle="+ob.larea());
  System.out.println("Area of Rectangle="+ob.res());
  

   }
}