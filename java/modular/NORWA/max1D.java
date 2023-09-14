class Array
{
  public static void main(String args[])

	{
       Array ob = new Array();
	   int a[]= new int [10];
	   ob.max(a);
    }
  public void max(int a[])
  {  
    java.util.Scanner sc=new java.util.Scanner(System.in);
      int i;
      System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
      int n=sc.nextInt();
      System.out.println("Enter Element in array");
       for (i=0;i<n;i++)
      a[i]=sc.nextInt();
      int j=a[0];
       for(j=a[0],i=1;i<n;i++)
       {
        if(j<a[i])
        j=a[i];
       }
    System.out.println("MAX. ELEMENT OF ARRAY IS:"+j);
   }
}
