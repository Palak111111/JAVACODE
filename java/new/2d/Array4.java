import java.util.*;
class Test
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		System.out.println("\tenter 1st dimention");
        System.out.println("How many rows you want :- ");
		int n=sc.nextInt();
		System.out.println("How many colome you want :- ");
		int m=sc.nextInt();
		System.out.println("\tenter 2nd dimention");
		System.out.println("How many rows you want :- ");
		int x=sc.nextInt();
		System.out.println("How many colome you want :- ");
		int y=sc.nextInt();
		int j,i,temp;
		if(n==x&&m==y)
		{
			System.out.println("\tenter 1st dimention Arrays");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		    System.out.println("\tenter 2nd dimention Arrays");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("\taddition matrix are:-");
		for( i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(c[i][j]+"  ");
			}
			System.out.println();
	    }
		}
		else
			System.out.println("ADDITION IS NOT POSSIBLE.....!");
	}
}