import java.util.Scanner;
class  Test
{
	public static void main(String args[])
	{ 
	    Scanner sc= new Scanner (System.in);
		int i,j,k;
		int a[][]= new int[5][5];
		System.out.println("Enter any two dimesion of matrix:");
		int row = sc.nextInt();
		int column = sc.nextInt();
		
			System.out.println("Enter a Element");
			for(i=0 ; i<row; i++)
			{
				for(j=0 ; j<column ; j++)
				{
				  a[i][j]=sc.nextInt();
				}
			}
			System.out.println(" A matrix Element are:");
			for(i=0 ; i<row ; i++)
			{
				for(j=0 ; j<column ; j++)
				{
					System.out.print("\t"+a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println(" A matrix Element are:");
			for(i=0 ; i<row ; i++)
			{
				for(j=0 ; j<column ; j++)
				{
					if(i==j||(i>=0&&i<=row-1&&j==column/2)||i+j==row-1)
					System.out.print(a[i][j]);
			        if(a[i][j]<10)
				    System.out.print("  ");
			        else
				    System.out.print(" "); 
				}
					System.out.println();
			}
		
	}
}
//output
//1               3               5
//        7       8       9
//                13
//        17      18      19
//21              23              25