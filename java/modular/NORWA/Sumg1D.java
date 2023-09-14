class Array
{
 public static void main(String args[])
  {
       Array ob = new Array();
	   int a[]= new int [10];
	   ob.sum(a);  
  }
 public void sum(int a[])
  {
   java.util.Scanner sc=new java.util.Scanner(System.in);
   System.out.print("HOW MANY ELEMENTS YOU NEED:");
   int n=sc.nextInt();
   int a[]=new int[20];
   int j=0;
   System.out.println("ENTER ELEMENTS IN ARRAY---");
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
	 j=j+a[i];
   }
   System.out.println("SUM IS="+j);
  }

}