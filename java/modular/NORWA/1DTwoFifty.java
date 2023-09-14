class Array
{
  public static void main(String args[])
  { 
       Array ob = new Array();
	   int a[]= new int [10];
	   ob.twof(a);  
  }
  public void twof (int a[])
  { 
	int a[]=new int [10];
	int n,i;
	java.util.Scanner sc=new java.util.Scanner(System.in);
	System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
	 n=sc.nextInt();
    System.out.println("Enter Element in array");
	  for ( i=0;i<n;i++)
	  a[i]=sc.nextInt();
	   for ( i=0;i<n;i++)
      {
       if(a[i]>150&&a[i]<250)
       System.out.println("\ta["+i+"]="+a[i]);   
     }
  }
}