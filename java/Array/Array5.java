class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int a[]=new int[5];
System.out.println("Enter Element in array");
 for (int i=0;i<a.length;i++)
   a[i]=sc.nextInt();
         System.out.println("\t ARRAY ELEMENTS ARE:");
         
 	for(int i=0;i<a.length;i++)
 	    System.out.println("\ta["+i+"]="+a[i]);
}
}
/* Enter Element in array
12
33
45
45
65
	 ARRAY ELEMENTS ARE:
	a[0]=12
	a[1]=33
	a[2]=45
	a[3]=45
	a[4]=65
*/

