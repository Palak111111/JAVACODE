class Test
{
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int[10];
    System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
    int n=sc.nextInt();
    int i;
	boolean b=false;
    System.out.println("Enter Element in array");
	 for ( i=0;i<n;i++)
 {
   a[i]=sc.nextInt();
 }
 System.out.println("enter the element you want to search");
 int item=sc.nextInt();
 for(i=0;i<n;i++)
 {
	 if(a[i]==item)
		 b=true;
 }
    if(b==true)
		System.out.println("found");
	else
		System.out.println("not found");
  }
}