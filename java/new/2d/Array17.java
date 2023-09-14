import java.util.*;
class Test
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int a[][]=new int[5][5];
        System.out.println("How many rows you want :- ");
		int n=sc.nextInt();
		System.out.println("How many colome you want :- ");
		int m=sc.nextInt();
		int j,i;
		int sum=0;
	    System.out.println("ENTER ELIMENTS:-");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();		
			}
		}
		System.out.println("\n\tMatrix formed:- ");
		System.out.println("\n");
		int max=a[0][0];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{   System.out.print(a[i][j]+"  ");
				    if(max<a[i][j])
					    max=a[i][j];
			}
			System.out.println();
		}
		System.out.println("\n\tmax number from given matrix:- "+max);
		int min=a[0][0];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{   System.out.print(a[i][j]+"  ");
				    if(min>a[i][j])
					    min=a[i][j];
			}
			System.out.println();
		}
		System.out.println("\n\tmin number from given matrix:- "+min);
		int smax=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{   System.out.print(a[i][j]+"  ");
				    if(max>a[i][j]&&min<a[i][j])
					    max=a[i][j];
			}
			System.out.println();
		}
		System.out.println("\n\tsecond min number from given matrix:- "+max);
	}
}