import MyPack1.AreaCuboid;
import MyPack2.VolumeCuboid;
import MyPack3.DensityCuboid;
import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  double l,b,h,m;
	  System.out.print("ENTER LENGTH:= ");
	  l=sc.nextDouble();
	  System.out.print("ENTER BREATH := ");
	  b=sc.nextDouble();
	  System.out.print("ENTER HEIGHT := ");
	  h=sc.nextDouble();
	  System.out.print("ENTER MASS := ");
	  m=sc.nextDouble();
	  
     DensityCuboid ob= new DensityCuboid (l,b,h,m);
	 System.out.println("-----AREA---VOLUME----DENSITY----- OF CUBOID----->");
	 System.out.println("Area of Cuboid = "+ob.tsa());
	 System.out.println("Volume of Cuboid = "+ob.volume());
	 System.out.println("Desnity of Cuboid = "+ob.density());
  
  }
}