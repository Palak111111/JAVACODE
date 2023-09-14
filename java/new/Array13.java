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
        int j=a[0];
        for(i=0;i<n;i++)
		{
		  if(j<=a[i])
		  j=a[i];
		}
		  System.out.println("max element of this Array is:-  "+j);
		  int k=a[0];
		  for(i=0;i<n;i++)
		{
		  if(k>=a[i])
		  k=a[i];
		}
		  System.out.println("smallest element of this Array is:-  "+k);
		  int l=a[0];
		  for(i=0;i<n;i++)
		  {
		   if(j>a[i]&&k<a[i])
		    l=a[i];
		  }
		  System.out.println("second max element of this Array is:-  "+l);
 }
 }