import MyPack1.Animal;
import MyPack2.DogAnimal;
import java.util.Scanner;
class Test
{
  public static void main(String args[])
  {
     String breed, nutrition,colour,quality;
     double weight;
        Scanner sc=new Scanner(System.in);
			
			System.out.println("ENTER DETAILS OF DOG ");
			
			
			System.out.print("Enter BREED= ");
			breed=sc.nextLine();
			System.out.print("Enter NUTRITION = ");
			nutrition=sc.nextLine();
			System.out.print("Enter COLOUR = ");
			colour=sc.nextLine();
			System.out.print("Enter WEIGHT =");
			weight =sc.nextDouble();
			System.out.print("Enter QUALITY OF DOG..=");
			quality=sc.next();
			System.out.println("--------------------------------------------------------------------");
			
			  DogAnimal ob =new DogAnimal(breed,nutrition,colour,weight,quality);
			  System.out.println("BREED OF DOG = "+ob.breed());
			  System.out.println("NUTRITION OF DOG = "+ob.nutrition());
			  System.out.println("COLOUR OF DOG = "+ob.colour());
			  System.out.println("WEIGHT OF DOG = "+ob.weight());
			  System.out.println("QUALITY OF DOG = "+ob.qualityD());
			   	System.out.println("--------------------------------------------------------------------");
  
  }
}