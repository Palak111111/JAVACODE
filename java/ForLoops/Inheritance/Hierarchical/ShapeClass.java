abstract class Shape
{
    String name;
    double side1;
	
	public Shape()
	{
		
	}
	
	public Shape(double side1)
	{
		this.side1=side1;
	}
    
	public abstract double area();
	
} 

abstract class TwoD extends Shape
{
    public TwoD()
	{
		
	}
	
	public TwoD(double side1)
	{
		super(side1);
	}
	public abstract double perimeter();
}

abstract class OneSide extends TwoD
{	
    public OneSide()
	{
		
	}
	
	public OneSide(double side1)
	{
		super(side1);
	}
	
}

class Circle extends OneSide
{
	public Circle()
	{
		
	}
	
	public Circle(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (Math.PI*side1*side1);
	}
	
	public double perimeter()
	{
		return (2*Math.PI*side1);
	}
} 

class Square extends TwoD
{
	Square()
	{
		
	}
	
	Square(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (side1*side1);
	}
	
	public double perimeter()
	{
		return (4*side1);
	}
	
}

class EquiTriangle extends TwoD
{
	EquiTriangle()
	{
		
	}
	
	EquiTriangle(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (0.433*side1*side1);
	}
	
	public double perimeter()
	{
		return (3*side1);
	}
}

class Hexagon extends TwoD
{
	Hexagon()
	{
		
	}
	
	Hexagon(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return (2.598*side1*side1);
	}
	
	public double perimeter()
	{
		return (6*side1);
	}
}

abstract class TwoSide extends TwoD
{
	double side2;
	TwoSide()
	{
		
	}
	
	TwoSide(double side1,double side2)
	{
		super(side1);
		this.side2=side2;
	}
}

class Rectangle extends TwoSide
{
	Rectangle()
	{}
	
	Rectangle(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (side1*side2);
	}
	
	public double perimeter()
	{
		return (2*(side1+side2));
	}	
}

class Isosceles extends TwoSide
{

	Isosceles()
	{}
	
	Isosceles(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (.5*side2*5);
	}
	
	public double perimeter()
	{
		return (2*(side1)+side2);
	}	
}


class Parallelogram extends TwoSide
{
	Parallelogram()
	{}
	
	Parallelogram(double side1,double side2)
	{
		super(side1,side2);
	}
	
     public double area()
	{
		return (side1*side2);
	}
	
	public double perimeter()
	{
		return (2*(side1+side2));
	}	
}

abstract class ThreeSide extends TwoD
{
	double side2,side3;
	ThreeSide()
	{}
	
	ThreeSide(double side1,double side2,double side3)
	{
		super(side1);
		this.side2=side2;
		this.side3=side3;
	}
}

class Rhombus extends ThreeSide
{
	Rhombus()
	{}
	
	Rhombus(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (4*(side3));
	}	
}


class Trapezoid extends ThreeSide
{
	Trapezoid()
	{}
	
	Trapezoid(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (side1+side2+(2*side3));
	}	
}


class Scalene extends ThreeSide
{
	Scalene()
	{}
	
	Scalene(double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	
     public double area()
	{
		return (.5*(side1+side2)*side3);
	}
	
	public double perimeter()
	{
		return (side1+side2+(2*side3));
	}	
}
abstract class ThreeD extends Shape
{
	public ThreeD()
	{
		
	}
	
	public ThreeD(double side1)
	{
		super(side1);
	}
	public abstract double csa();
	public abstract double volume();
}
abstract class SideOne extends ThreeD
{	
    public SideOne()
	{
		
	}
	
	public SideOne(double side1)
	{
		super(side1);
	}
	
}
class Cube extends SideOne
{
	public Cube()
	{
		
	}
	
	public Cube(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return 6*side1;
	}
	
	public double csa()
	{
		return 4*side1;
	}
	public double volume()
	{
		return side1*side1*side1;
	}
	
}
class Sphere extends SideOne
{
	public Sphere()
	{
		
	}
	
	public Sphere(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return 4*(Math.PI*side1*side1);
	}
	
	public double csa()
	{
		return 0;
	}
	public double volume()
	{
		return (Math.PI*side1*side1*side1)*1.3333;
	}
	
}
class Hemisphere extends SideOne
{
	public Hemisphere()
	{
		
	}
	
	public Hemisphere(double side1)
	{
		super(side1);
	}
	
	public double area()
	{
		return 3*(Math.PI*side1*side1);
	}
	
	public double csa()
	{
	
		return 2*(Math.PI*side1*side1);
	}
	public double volume()
	{
		return (Math.PI*side1*side1*side1)*0.6667;
	}
	
}
abstract class SideTwo extends ThreeD
{
	double side2;
	SideTwo()
	{
		
	}
	
	SideTwo(double side1,double side2)
	{
		super(side1);
		this.side2=side2;
	}
}
class Cyclinder extends SideTwo
{
	public Cyclinder()
	{
		
	}
	
	public Cyclinder(double side1,double side2)
	{
		super(side1,side2);
	}
	
	public double area()
	{
		return 2*Math.PI*side1*side2;
	}
	
	public double csa()
	{
		return 2*(Math.PI*side1*side1);
	}
	public double volume()
	{
		return (Math.PI*side1*side1*side2);
	}
}
abstract class SideThree extends ThreeD
{
	double side2,side3;
	SideThree()
	{}
	
	SideThree(double side1,double side2,double side3)
	{
		super(side1);
		this.side2=side2;
		this.side3=side3;
	}
	
}
class Cuboid extends SideThree
{
   Cuboid()
	{}
	
	Cuboid (double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	public double area()
	{
		return 2*(side1*side2+side2*side3+side3*side1);
	}
	
	public double csa()
	{
		return 2*side3*(side1+side2);
	}
	public double volume()
	{
		return side1*side2*side3;
	}
    	
}
class Cone extends SideThree
{
   Cone()
	{}
	
	Cone (double side1,double side2,double side3)
	{
		super(side1,side2,side3);
	}
	public double area()
	{
		return (Math.PI*side1*(side2+side1));
		//pi*r(l+r);
	}
	
	public double csa()
	{
		return Math.PI*side1*side2;
	}
	public double volume()
	{
		return 0.333*(Math.PI*side1*side1*side3);
	}
    	
}



class ClassShape
{
	public static void main(String args[])
	{
		System.out.println("-----------*********-------*********-----------------");
		
		Circle circle = new Circle(2.0);
		
		System.out.println("Area Of Circle = "+circle.area());
		System.out.println("Perimeter Of Circle = "+circle.perimeter());
		System.out.println("-----------------------------------------------------");
		
		Square square = new Square(2.0);
		
		System.out.println("Area Of Square = "+square.area());
		System.out.println("Perimeter Of Square = "+square.perimeter());
		System.out.println("-----------------------------------------------------");
		
		EquiTriangle eq = new EquiTriangle(2.0);

		System.out.println("Area Of Equilateral Triangle = "+eq.area());
		System.out.println("Perimeter Of Equilateral Triangle = "+eq.perimeter());
		System.out.println("-----------------------------------------------------");
	    
		Hexagon hx = new Hexagon(2.0);
		
		System.out.println("Area Of Hexagon = "+hx.area());
		System.out.println("Perimeter Of Hexagon = "+hx.perimeter());
	    System.out.println("-----------------------------------------------------");
		
		Rectangle rt = new Rectangle(2.0,4.0);
		
		System.out.println("Area Of Rectangle = "+rt.area());
		System.out.println("Perimeter Of Rectangle = "+rt.perimeter());
		System.out.println("-----------------------------------------------------");
		
		Isosceles isc = new Isosceles(2.0,4.0);
		
		System.out.println("Area Of Isosceles = "+isc.area());
		System.out.println("Perimeter Of Isosceles = "+isc.perimeter());
		System.out.println("-----------------------------------------------------");
		
		Parallelogram prl = new Parallelogram(2.0,4.0);
		
		System.out.println("Area Of Parallelogram = "+prl.area());
		System.out.println("Perimeter Of Parallelogram = "+prl.perimeter());
        System.out.println("-----------------------------------------------------");
		
		Rhombus rmb = new Rhombus(2.0,4.0,6.0);
		
		System.out.println("Area Of Rhombus = "+rmb.area());
		System.out.println("Perimeter Of Rhombus = "+rmb.perimeter());
        System.out.println("-----------------------------------------------------");
		
		
		Trapezoid tp = new Trapezoid(2.0,4.0,6.0);
		
		System.out.println("Area Of Trapezoid = "+tp.area());
		System.out.println("Perimeter Of Trapezoid = "+tp.perimeter());
		System.out.println("-----------------------------------------------------");
		
		
		Cube cube=new Cube (5.6);
		
		System.out.println("TOTAL SURFACE AREA OF CUBE = "+cube.area());
		System.out.println("CURVED SURFACE AREA OF CUBE = "+cube.csa());
		System.out.println("VOLUME OF CUBE = "+cube.volume());
		System.out.println("-----------------------------------------------------");
		
		
		Sphere sph=new Sphere (3.9);
		
		System.out.println("TOTAL SURFACE AREA OF SPHERE = "+sph.area());
		System.out.println("CURVED SURFACE AREA OF SPHERE = "+sph.csa());
		System.out.println("VOLUME OF SPHERE = "+sph.volume());
		System.out.println("-----------------------------------------------------");


		Hemisphere hemi=new Hemisphere(3.5);
		
		System.out.println("TOTAL SURFACE AREA OF HEMISPHERE = "+hemi.area());
		System.out.println("CURVED SURFACE AREA OF HEMISPHERE = "+hemi.csa());
		System.out.println("VOLUME OF HRMISPHERE = "+hemi.volume());
        System.out.println("-----------------------------------------------------");
		
		
		Cyclinder cyc=new Cyclinder (3.9,4.5);
		
		System.out.println("TOTAL SURFACE AREA OF CYCLINDER= "+cyc.area());
		System.out.println("CURVED SURFACE AREA OF CYCLINDER= "+cyc.csa());
		System.out.println("VOLUME OF CYCLINDER = "+cyc.volume());
        System.out.println("-----------------------------------------------------");
        
		
		Cuboid cuboid=new Cuboid (3.9,4.5,6.7);
		
		System.out.println("TOTAL SURFACE AREA OF CUBOID= "+cuboid.area());
		System.out.println("CURVED SURFACE AREA OF CUBOID= "+cuboid.csa());
		System.out.println("VOLUME OF CUBOID = "+cuboid.volume());
        System.out.println("-----------------------------------------------------");


        Cone cone=new Cone (3.9,4.5,6.9);
		
		System.out.println("TOTAL SURFACE AREA OF CONE= "+cone.area());
		System.out.println("CURVED SURFACE AREA OF CONE= "+cone.csa());
		System.out.println("VOLUME OF CONE  = "+cone.volume());
        System.out.println("-----------------------------------------------------");



	}
}