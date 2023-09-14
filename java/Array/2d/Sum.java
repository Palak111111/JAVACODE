class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int i,j,sum=0;
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN ROW:");
int n=sc.nextInt();
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN COLOUM:");
int m=sc.nextInt();
int a[][]=new int[5][5];
System.out.println("Enter Element in array");
 for (i=0;i<n;i++)
     {
        for (j=0;j<m;j++)
          {
            a[i][j]=sc.nextInt();
            sum+=a[i][j];
          }
     }
        for (i=0;i<n;i++)
         {
           for (j=0;j<m;j++)
            {
                 if(n==m)
                 System.out.print("\t" +a[i][j]);
            }
                  System.out.println();
           }
           System.out.println(sum);
}
}
/* Enter Element in array
1
2
3
4
5
6
7
8
9
	1	2	3
	4	5	6
	7	8	9
45
*/

