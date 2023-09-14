class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int i,j;
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
}
}
                  
/*
HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN ROW:
5
HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN COLOUM:
5
Enter Element in array
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19          
20
21
22
23
24
25
	1	2	3	4	5
	6	7	8	9	10
	11	12	13	14	15
	16	17	18	19	20
	21	22	23	24	25
*/
                  
