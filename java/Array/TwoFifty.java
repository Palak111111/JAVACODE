class Array
{
public static void main(String args[])
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
/* HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:
5
Enter Element in array
200
230
12
211
222
	a[0]=200
	a[1]=230
	a[3]=211
	a[4]=222
*/
