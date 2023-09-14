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
		if(n==m)
		{
			System.out.println("ENTER ELIMENTS:-");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix are:-");
		for( i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			  if(i<=j)
			  {
			  System.out.print(a[i][j]+"  ");
		      sum+=a[i][j];
			  }
			  else
			  System.out.print("   ");
			}
			System.out.println();
	    }
		}
		else
			System.out.println("NOT POSIBLE....!");
		System.out.println("UPPER TRIENGLE SUM:- "+sum);
	}
}