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
int a[][]=new int[n][m];
System.out.println("Enter Element in array");
  if(n==m)
     {
       if(n%2!=0)
       {
       int d=n/2;
       for(i=0;i<n;i++)
        {
          for (j=0;j<m;j++)
          {
            a[i][j]=sc.nextInt();
          }
         }
         System.out.println(" DIAGNOL ARE");
          for (i=0;i<n;i++)
           {
             for (j=0;j<m;j++)
             {
               if(i==j||j==d||j==m-i-1)
                System.out.print("\t"+a[i][j]);
               else 
                System.out.print("\t");
              }
              System.out.println("\n\n");
              
          }
          }
          }
          }
 }  
 
 /* HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN ROW:
5
HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER IN COLOUM:
5
Enter Element in array
1-25

 DIAGNOL ARE
	1		3		5


		7	8	9	


			13		


		17	18	19	


	21		23		25

*/
       
