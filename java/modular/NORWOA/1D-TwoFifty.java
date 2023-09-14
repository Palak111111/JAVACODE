class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
Array ob=new Array();
ob.TwoF();
}
public void TwoF()
{
int a[]=new int [10];
int n,i;
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
 n=sc.nextInt();
System.out.println("Enter Element in array");
  for ( i=0;i<n;i++)
  a[i]=sc.nextInt();
   for ( i=0;i<n;i++)
 {
  if(a[i]>150&&a[i]<250)
  System.out.println("\ta["+i+"]="+a[i]);   
 }
}
}
