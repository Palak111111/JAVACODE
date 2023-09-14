import java.util.Scanner;
class Star1
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter number...");
 int n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
   for(int j=1;j<=n;j++)
   {
    System.out.print(" @ ");
   }
    System.out.println();
 }
}
}
/*
 @  @  @  @  @
 @  @  @  @  @
 @  @  @  @  @
 @  @  @  @  @
 @  @  @  @  @ */
 
 //2.
//import java.util.Scanner;
class Star2
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter number...");
 int n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
   for(int j=n;j>=i;j--)
   {
    System.out.print(" * ");
   }
    System.out.println("");
 }
}
} 
/*
Enter number...
5
	 *  *  *  *  *
	 *  *  *  *
	 *  *  *
	 *  *
	 *
 
*/

//3.

class Star3
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter number...");
 int n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
   for(int j=1;j<=n;j++)
   {
	   if(i<=j)
	   {	   
        System.out.print("*");
       }
	   else
         System.out.print(" ");
    }
	System.out.println();
  }
}
}