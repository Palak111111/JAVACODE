class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int i,j,temp;
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
           int x=a[0][0];
          for(i=0;i<n;i++)
          {
            for(j=0;j<m;j++)
             {
             if(x<a[i][j])
                 x=a[i][j]; 
              }
          }
           System.out.println("MAX. ELEMENT OF ARRAY IS:"+x);
}
}
