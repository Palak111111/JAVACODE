abstract class Shape
{
 
 public abstract double area();
 public abstract double perimeter();
} 
class Rectangle extends Shape
{
  double l,b;
  public Rectangle(double l, double b)
  {
    this.l=l;
	this.b=b;
  }
     public double area()
	 {
	   return l*b;
	 }
	 public double perimeter()
	 {
	   return 2*(l+b);
	 }

}
class Triangle extends Shape
{
 double l,b;
 public Triangle(double l, double b)
  {
    this.l=l;
	this.b=b;
  }
     public double area()
	 {
	   return (l*b)/2;
	 }
	 public double perimeter()
	 {
	   return 2*(l+b);
	 }
 
}
class Circle extends Shape
{
  double r,pi=3.1416;
  public Circle( double r)
  {
    this.r=r;
  }
     public double area()
	 {
	   return pi*r*r;
	 }
	 public double perimeter()
	 {
	   return 2*pi*r;
	 }

}
class Square extends Shape
{
 double a;
 public Square(double a)
  {
    this.a=a;
  }
     public double area()
	 {
	   return (l*b)/2;
	 }
	 public double perimeter()
	 {
	   return 2*(l+b);
	 }
 
	
	
	
}
class Test
{
  public static void main(String args[])
  {
   // Shape ref;
	 Rectangle ob= new Rectangle(2,3);
	 Triangle ob1=new Triangle(4,5);
	 Circle ob2=new Circle(2.2);
	// ref=ob;
	 System.out.println("Area of Rectangle="+ob.area());
	 System.out.println("perimeter of Rectangle="+ob.perimeter());
	// ref =ob1;
	 System.out.println("Area of triangle ="+ob1.area());
	 System.out.println("perimeter of triangle="+ob1.perimeter());
	 System.out.println("Area of Circle="+ob2.area());
	 System.out.println("perimeter of Circle="+ob2.perimeter());
  }

}