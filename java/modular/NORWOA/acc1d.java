class Array
{
	public  void asc()
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
		int a[]=new int [7];
		int min=0;
		int i;
		System.out.println("How Many elemnt you Want");
		int n=sc.nextInt();
		System.out.println("Enter the Element in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			min=a[i];
			int j=i-1;
			   while(j>=0&&a[j]>min)
			{
					a[j+1]=a[j];
					j=j-1;
			}
		     a[j+1]=min;	
		}
		for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
		
	}	
	public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	Array ob=new Array();
	ob.asc();
	}
}
