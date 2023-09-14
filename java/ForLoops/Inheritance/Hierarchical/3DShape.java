abstract class ThreeD
{
 double l;
 public ThreeD()
 {
	 
	 
 }
  public ThreeD(double l)
  {
   this.l=l;
  }  
  public abstract double tsa ();
  public abstract double csa();
  public abstract double volume();

}
class Cube extends ThreeD
{
   int a;
   public Cube(int a)
   {
     this.a=a;
   }
   public double tsa()
   {
     return 6*a*a;
   }
   public double csa()
    {
	  return 4*a*a;
	}
   public double volume()
    {
	  return a*a;
	}
	
} 
class Cuboid extends ThreeD
{
   double h,w;
   public Cuboid(double h,double w,double l)
   {
	 super(l); 
     this.h=h;
	 this.w=w;
   }
   public double tsa()
   {
     return 2*(l*h+l*w+h*w);
   }
   public double csa()
    {
	  return 2*h*(l+w);
	}   
	   public double volume()
    {
	  return l*w*h;
	}
	
}
class Cone extends ThreeD
{
   double r,pi=3.14,h;
   public Cone (double r,double l,double h)
   {
	 super(l); 
     this.r=r;
	 this.h=h;
   }
   public double tsa()
   {
     return pi*r*(l+r);
   }
   public double csa()
    {
	  return pi*r*l;
	}
    public double volume()
    {
	  return (pi*r*r*h)/3;
	}
		
	
} 
 
class Test
{
	public static void main(String args[])
	{
	 Cuboid ob= new Cuboid (2.2,3.5,4.7);
	 Cube ob1=new Cube(4);
	 Cone ob2=new Cone(2.2,2,4);
	 System.out.println("TOTAL SURFACE AREA OF CUBOID = "+ob.tsa());
	 System.out.println("CURVED SURFACE AREA OF CUBOID = "+ob.csa());
	  System.out.println("VOLUME OF CUBOID = "+ob.volume());
	System.out.println("TOTAL SURFACE AREA OF CUBE = "+ob.tsa());
	 System.out.println("CURVED SURFACE AREA OF CUBE = "+ob.csa());
	  System.out.println("VOLUME OF CUBE = "+ob.volume());
	System.out.println("TOTAL SURFACE AREA OF CONE = "+ob.tsa());
	 System.out.println("CURVED SURFACE AREA OF CONE = "+ob.csa());
	  System.out.println("VOLUME OF CONE = "+ob.volume());
		
	}
	
}