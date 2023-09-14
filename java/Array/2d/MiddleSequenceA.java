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
                   System.out.print(a[i][j]+" ");
               }
                  System.out.println();
             }

            System.out.println("MIDDLE SEQUENCE IS..");
             for (i=0;i<n;i++)
             {
              for (j=0;j<m;j++)
               {
                 if(i!=0&&j!=0&&i!=n-1&&j!=m-1)
                      System.out.print(a[i][j]+" \t ");
                      else 
                       System.out.print(" \t ");
              }
                     System.out.println();
           }
           
  }
  }
  
  /*  MIDDLE SEQUENCE IS..
 	  	  	  	  	 
 	 7 	 8 	 9 	  	 
 	 12 	 13 	 14 	  	 
 	 17 	 18 	 19 	  	 
 	  	  	  	*/
 	  	  	  	
