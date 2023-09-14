class Array
{
	public static void main(String[]args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a[] = new int[10];
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
/* How many element you want to enter
5
Enter element of array
3
2
3
4
5
repetetion of array element 
3 = 2
2 = 1
4 = 1
5 = 1
*/
	
