class Test
{
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int[10];
    System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
    int n=sc.nextInt();
    int i;
    System.out.println("Enter Element in array");
      for ( i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
	  for ( i=0;i<n;i++)
	  {
		  if(i%2==0)
			  a[i]=a[i]+5;
	  }
	  for ( i=0;i<n;i++)
		  System.out.println("\ta["+i+"]="+a[i]);
  }
}