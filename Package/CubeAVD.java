import MyPack1.AreaCube;
import MyPack2.VolumeCube;
import MyPack3.DensityCube;
import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  double a,m;
	  System.out.print("ENTER Area:= ");
	  a=sc.nextDouble();
	  System.out.print("ENTER MASS := ");
	  m=sc.nextDouble();
	  
     DensityCube ob= new DensityCube (a,m);
	 System.out.println("-----AREA---VOLUME----DENSITY----- OF CUBOID----->");
	 System.out.println("Area of Cube = "+ob.tsa());
	 System.out.println("Volume of Cube = "+ob.volume());
	 System.out.println("Desnity of Cube = "+ob.density());
  
  }
}