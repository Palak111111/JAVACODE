class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);

System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
int n=sc.nextInt();
int a[]=new int[n];
    int j=0;
System.out.println("Enter Element in array");
 for (int i=0;i<n;i++)
 {
   a[i]=sc.nextInt();
      j=j+a[i];
      }
         System.out.println("SUM IS= "+j);
         }
         }
