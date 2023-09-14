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
		int j,i,temp;
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
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
	    }
		//System.out.println(a[0][2]);
		for( i=0;i<n;i++)
		{
			for(j=i+1;j<m;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("transpose matrix are:-");
		for( i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
	    }
		//System.out.println(a[0][2]);
	}
}