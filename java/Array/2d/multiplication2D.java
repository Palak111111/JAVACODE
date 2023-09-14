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
if(m==p)
{
System.out.println("ENTER ELEMENTS IN FIRST ARRAY :");
 for(i=0;i<m;i++)
        {
          for (j=0;j<n;j++)
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
                for(j=0;j<q;j++)
                  {
                    for(k=0,c[i][j]=0;k<q;k++)
                     {
                        c[i][j]=c[i][j]+a[i][k]*b[k][j];
                     }
                  }
              }
                System.out.println("MULTIPLICATION MATRIX IS: ");
                  for(i=0;i<n;i++)
                   {
                     for (j=0;j<q;j++)
                     {
                      System.out.print("\t"+c[i][j]);
                     }
                      System.out.println("\n\n");
                   }  
                   }
                    else 
                    System.out.print("MULTIPLICATION NOT POSSIBLE:");
}
}

                    
                    
