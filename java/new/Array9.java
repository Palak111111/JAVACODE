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
       System.out.println("Actual elements are");
        for(i=0;i<n;i++)
         System.out.println("\ta["+i+"]="+a[i]);
         
 	for( i=0;i<n/2;i++)
	{
	    int temp=a[i];
		a[i]=a[n-i-1];
		a[n-i-1]=temp;
		
	}
	System.out.println("revears elements are:-");
	for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
}
}