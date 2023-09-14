class Array
{
public static void main(String args[])
{
int n,i,temp;
int a[]=new int[10];
java.util.Scanner sc=new java.util.Scanner(System.in);

System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
n=sc.nextInt();
System.out.println("Enter Element in array");
 for (i=0;i<n;i++)
   a[i]=sc.nextInt();
         System.out.println("\t ACTUAL ARRAY ELEMENTS ARE:");
            for(i=0;i<n;i++)
 	           System.out.println("\ta["+i+"]="+a[i]);
 	               for(i=0;i<n/2;i++)
 	               {
 	                 temp=a[i];
 	                 a[i]=a[n-(i+1)];
 	                 a[n-(i+1)]=a[i];

 	               }
 	               System.out.println("\t REVESE ARRAY ELEMENTS ARE:");
                            for(i=0;i<n;i++)
 	                      System.out.println("\ta["+i+"]="+a[i]);
 	                   
} 	               
} 	               
/*
 HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:
5
Enter Element in array
1
2
3
4
5
	 ACTUAL ARRAY ELEMENTS ARE:
	a[0]=1
	a[1]=2
	a[2]=3
	a[3]=4
	a[4]=5
	 REVESE ARRAY ELEMENTS ARE:
	a[0]=5
	a[1]=4
	a[2]=3
	a[3]=4
	a[4]=5

*/

