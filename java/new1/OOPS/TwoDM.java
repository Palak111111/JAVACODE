import java.util.Scanner;
class Array2D
{
	private int a[][],b[][];
	private int r,c,m,n;
	public void setData(int r,int c,int m,int n)
        {
          this.a=new int [5][5];
          this.b=new int [5][5];
          this.r=r;
          this.c=c;
          this.m=m;
          this.n=n;
        }
 public void input()
        {
         Scanner sc=new Scanner(System.in);
		System.out.println("ENTER DIMENSION OF FIRST MATRIX ROW:");
		 r=sc.nextInt();
		System.out.println("ENTER DIMENSION OF FIRST MATRIX COLOUMN:");
		 c=sc.nextInt();
		System.out.println("ENTER DIMENSION OF SECOND MATRIX ROW:");
		m=sc.nextInt();
		System.out.println("ENTER DIMENSION OF SECOND MATRIX COLOUMN:");
		n=sc.nextInt();
		
        }
}		
