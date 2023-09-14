class Array
{
public static void main(String args[])
{
       Array ob = new Array();
	   int a[]= new int [10];
	   ob.rev(a);  
}
 public void rev(int a[])
 {

 int n,i,temp;
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