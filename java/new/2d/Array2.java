import java.util.*;
class Test
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int a[][]=new int[5][5];
		int b[][]=new int[5][5];
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
				temp=a[i][j];
				//a[i][j]=b[i][j];
				b[i][j]=temp;
			}
		}
		System.out.println("actual matrix are:-");
		for( i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(a[i][j]+"  ");
			}
			System.out.println();
	    }
		System.out.println("print transpose matrix are:-");
		
		for( i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(b[j][i]+"  ");
			}
			System.out.println();
	    }
	}
}