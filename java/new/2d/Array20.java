class Test
{
 public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
	int a[][]=new int[5][5];
	int i,j;
	System.out.println("enter row:  ");
	int m=sc.nextInt();
	System.out.println("enter column: ");
	int n=sc.nextInt();
	System.out.println("How much element do you want to enter:");
	  for(i=0;i<m;i++)
	   {
	      for(j=0;j<n;j++)
            {
			   a[i][j]=sc.nextInt();
			}		  
	   }
	   System.out.println("matrix series:");
	   for(i=0;i<m;i++)
	     {
		   for(j=0;j<n;j++)
		     {   
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
/*
matrix series:
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/