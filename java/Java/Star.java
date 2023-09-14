import java.util.Scanner;
class Star
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner (System.in);
    System.out.println("Enter any number ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	  for(int j=1;j<=i;j++)
	  {
	   System.out.print(" * ");
	   
	  }
	  System.out.println();
	}
  }
}
//2.
class Test
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner (System.in);
      System.out.println("Enter any number ");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
	  for(int j=n;j>i;j--)
	  {
		  System.out.print("  ");
	  }
		  
		  for(int k=1;k<=2*i-1;k++)
		  {
	        System.out.print(" * ");
	        
		  }
	  System.out.println();
	}
  }
}
/*

Enter any number
4
        *
      *  *  *
    *  *  *  *  *
 *  *  *  *  *  * *
 
 */
 
