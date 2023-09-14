import java.util.Scanner;

class Test
{
   public void arr(int a[])
   {
       Scanner sc = new Scanner(System.in);
	   
	   System.out.print("How many Elements U wanna to enter : ");
	   int n = sc.nextInt();
	   
	   System.out.print("\nEnter Elements in array ->\n");
	   
	   for(int i=0;i<n;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   for(int i=0;i<n;i++)
	   {
	       System.out.println("a["+i+"] = "+a[i]);
	   }
   }
   
   public static void main(String args[])
   {
       Test ob = new Test();
	   int a[]= new int [20];
	   ob.arr(a);
   }
}