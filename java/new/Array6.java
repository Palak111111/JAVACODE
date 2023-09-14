class Test
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int a[]=new int[5];
System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
int n=sc.nextInt();
System.out.println("Enter Element in array");
 for (int i=0;i<n;i++)
   a[i]=sc.nextInt();
         System.out.println("\t ARRAY ELEMENTS ARE:");
         
 	for(int i=0;i<n;i++)
 	    System.out.println("\ta["+i+"]="+a[i]);
}
}
/*
HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:
3
Enter Element in array
12
12
12
	 ARRAY ELEMENTS ARE:
	a[0]=12
	a[1]=12
	a[2]=12
*/
