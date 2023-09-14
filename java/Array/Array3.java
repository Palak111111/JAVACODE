class Array
{
public static void main(String args[])
{
int a[]=new int[5];
 a[0]=8;
 a[1]=10;
 a[2]=7;
 a[3]=89;
 a[4]=67;
 for(int i=0;i<7;i++)
 System.out.println("\ta["+i+"]="+a[i]);
}
}
/* a[0]=8
	a[1]=10
	a[2]=7
	a[3]=89
	a[4]=67
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at Array.main(Array3.java:12)
*/
