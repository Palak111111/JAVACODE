class Array
{
	public static void main(String[]args)
	{
       Array ob = new Array();
	   int a[]= new int [10];
	   ob.rep(a);
    }
	public void rep(int a[])
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int b[] = new int[10];
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		int count;
		System.out.println("Enter element of array");
		for(int i=0;i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=1;
			if(a[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[i]==a[j])
					{
						a[j]=-1;
						count++;
					}
				}
			}
			     b[i]=count;
		}
		  System.out.println("repetetion of array element ");
		
	     	for(int i = 0; i<n;i++)
		    {
			 if(a[i]!=-1)
			  {
			   System.out.println(a[i]+" = "+b[i]);
			  }
		    }
		
	}
}