class Test
{
  public static void main(String args[])
  {
	int a[]=new int[10];
	int n,i,min;
    System.out.println("How many array element u want to enter");
    java.util.Scanner sc=new java.util.Scanner(System.in);
    n=sc.nextInt();
    System.out.println("Enter Element in array");
      for ( i=0;i<n;i++)
        a[i]=sc.nextInt();
          for ( i=0;i<n;i++)
		  {
	        if (a[i]>150&&a[i]<250)
		      System.out.println("\ta["+i+"]="+a[i]);
  }
}