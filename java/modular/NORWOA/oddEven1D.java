class Array
{
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    Array ob=new Array();
    ob.odev();
  }
  public void odev()
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int[10];
    System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
    int n=sc.nextInt();
    int i;
	int c1=0;
	int c2=0;
    System.out.println("Enter Element in array");
      for ( i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
	  for ( i=0;i<n;i++)
	  {
		  if(a[i]%2==0)
			 c1++;
		 else if(a[i]%2!=0)
			 c2++;
	  }
		  System.out.println("total even number in Array: "+c1);
		  System.out.print("total odd number in Array: "+c2);
  }
}
