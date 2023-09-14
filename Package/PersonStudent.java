import MyPack1.Person;
import MyPack2.Student;
import java.util.Scanner;
class Test
{
 public static void main(String args[])
 {
   String name;
   double weight,height,per;
   int roll;
  Scanner sc=new Scanner(System.in);
		System.out.print("Enter name=");
		name=sc.nextLine();
		System.out.print("Enter Weight=");
		weight=sc.nextDouble();
		System.out.print("Enter Height=");
		height=sc.nextDouble();
		System.out.print("Enter Percentage=");
		per =sc.nextDouble();
		System.out.print("Enter Roll number =");
		roll=sc.nextInt();
		
		 Student ob=new Student(name,weight,height,per,roll);
		 System.out.println("-----------------------------------------------------------");
		 System.out.println("NAME OF STUDENT/ PERSON = "+ob.name());
		  System.out.println("HEIGHT OF STUDENT/ PERSON = "+ob.height());
		   System.out.println("WEIGHT OF STUDENT/ PERSON = "+ob.weight());
		    System.out.println("PERCENTAGE OF STUDENT/ PERSON = "+ob.per());
			 System.out.println("ROLL NUMBER OF STUDENT/ PERSON = "+ob.roll());
            System.out.println("-----------------------------------------------------------"); 
 }


}