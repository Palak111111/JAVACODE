import java.util.Scanner;
class Test
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		
		System.out.println("How many element you want to enter");
		int n = sc.nextInt();
		
		int count=0;
		System.out.println("Enter element of array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Searching Element");
		int num= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(num==a[i])
			{
				count++;
				System.out.println("Index of repeatind element are:- "+i);
			}
		}
		System.out.println("repetetion of array element "+num+" is "+count+" time");
	}
}