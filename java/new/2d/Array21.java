class Test
{
  public static void main(String args[])
  {
	java.util.Scanner sc=new java.util.Scanner(System.in);
     int a[][]=new int[5][5];
	 System.out.println("Enter 1st Dimention:");
	 System.out.println("Enter row:");
	 int m=sc.nextInt();
	 System.out.println("Enter column:");
	 int n=sc.nextInt();
	 int i,j;
	 System.out.println("Enter elements:");
	 for(i=0;i<m;i++)
	 {
	    for(j=0;j<n;j++)
	     {
		   a[i][j]=sc.nextInt();
	     }		   
	 }
	 System.out.println("matrix");
	 for(i=0;i<m;i++)
	 {
	    for(j=0;j<n;j++)
	     {
			if(i==0||j==0||i==m-1||j==n-1)
			{
		      System.out.print(a[i][j]);
			  if(a[i][j]<10)
				  System.out.print("  ");
			  else
				  System.out.print(" ");
			}
            else
             System.out.print("   ");				
	     }
         System.out.println();		 
	 }
  }
}
//output
/*
matrix
1  2  3  4  5
6           10
11          15
16          20
21 22 23 24 25
*/