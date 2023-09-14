class Array
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
char a[]=new char[5];
//System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
//int n=sc.nextInt();
System.out.println("Enter Element in array");
 for (int i=0;i<a.length;i++)
   a[i]=sc.next().charAt(0);
         System.out.println("\t ARRAY ELEMENTS ARE:");
         
 	for(int i=0;i<a.length;i++)
 	    System.out.println("\ta["+i+"]="+a[i]);
}
}

