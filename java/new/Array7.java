class Test
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);

System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
int n=sc.nextInt();
int a[]=new int[n];
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
5
Enter Element in array
34
34
23
12
12
	 ARRAY ELEMENTS ARE:
	a[0]=34
	a[1]=34
	a[2]=23
	a[3]=12
	a[4]=12
*/
