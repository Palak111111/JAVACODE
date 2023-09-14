class Array
{
public static void main(String args[])
{
	int temp=1;
java.util.Scanner sc=new java.util.Scanner(System.in);
int a[]=new int [20];
int j,i;
System.out.println("How much Element You want too Enter");
int n=sc.nextInt();
System.out.println("Enter Your Array Element");
   for( i=0;i<n;i++)
   {
	   a[i]=sc.nextInt();
   }
       for( i=0;i<n-1;i++)
	   {
	     for(j=0;j<n-i-1;j++)
	     {
		   if(a[j]>a[j+1])
		   {
			    temp=a[j+1];
		        a[j+1]=a[j];
	           a[j]=temp;
			}
		 }
	   }
	   for( i=0;i<n;i++)
	   {
	   System.out.println("After Swaping is "+a[i]);
	   }
	   System.out.println();
	   
   }
}
/*  How much Element You want too Enter
5
Enter Your Array Element
2
3
1
4
6
After Swaping is 1
After Swaping is 2
After Swaping is 3
After Swaping is 4
After Swaping is 6
*/

