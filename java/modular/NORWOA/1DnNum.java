class Test
{
   public void num()
   {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int [5];
    System.out.println("how many array enlment you need ");
    int n=sc.nextInt();
    System.out.println("enter elements in array"); 
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("array elemnts are:");
    for(int i=0;i<n;i++) 
    System.out.println("\t a["+i+"]="+a[i]);
   }
        public static void main(String args[])
	{
	java.util.Scanner sc=new java.util.Scanner(System.in);
	Test ob=new Test();
	ob.num();
	}
}
    
           












