class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int a[][]=new int[5][5];
int b[][]=new int[5][5];
int c[][]=new int[5][5];
int i,j,m,n,p,q,k;
System.out.println("ENTER DIMENSION OF FIRST MATRIX ROW:");
 n=sc.nextInt();
System.out.println("ENTER DIMENSION OF FIRST MATRIX COLOUMN:");
 m=sc.nextInt();
System.out.println("ENTER DIMENSION OF SECOND MATRIX ROW:");
p=sc.nextInt();
System.out.println("ENTER DIMENSION OF SECOND MATRIX COLOUMN:");
q=sc.nextInt();
if(n==p&&m==q)
{
System.out.println("ENTER ELEMENTS IN FIRST ARRAY :");
 for(i=0;i<n;i++)
        {
          for (j=0;j<m;j++)
          {
            a[i][j]=sc.nextInt();
          }
         }  
         System.out.println("ENTER ELEMENTS IN SECOND ARRAY :");
             for(i=0;i<p;i++)
             {
               for (j=0;j<q;j++)
                {
                   b[i][j]=sc.nextInt();
                }
             }  
             for(i=0;i<n;i++)
              {
                for(j=0;j<m;j++)
                    
                     {
                        c[i][j]= a[i][j]+b[i][j];
                     }
                  
              }
                System.out.println(" ADDITION OF MATRIX IS: ");
                  for(i=0;i<n;i++)
                   {
                     for (j=0;j<m;j++)
                     {
                      System.out.print("\t"+c[i][j]);
                     }
                      System.out.println("\n\n");
                   }  
                   }
                    else 
                    System.out.print("ADDITION NOT POSSIBLE:");
}
}
/* ENTER DIMENSION OF FIRST MATRIX ROW:
3
ENTER DIMENSION OF FIRST MATRIX COLOUMN:
2
ENTER DIMENSION OF SECOND MATRIX ROW:
3
ENTER DIMENSION OF SECOND MATRIX COLOUMN:
2
ENTER ELEMENTS IN FIRST ARRAY :
1
2
3
4
5
6
ENTER ELEMENTS IN SECOND ARRAY :
1
2
3
4
5
6
 ADDITION OF MATRIX IS: 
	2	4


	6	8


	10	12

*/

                    
