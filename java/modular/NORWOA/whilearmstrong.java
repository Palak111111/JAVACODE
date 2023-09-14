class Arms
{
public void arm()
{
java.util.Scanner sc=new java.util.Scanner(System.in);
       System.out.print("ENTER ANY NUMBER ");
	int n=sc.nextInt();
	int r=1;
	int sum=0;
	int d=1;
	int m=n;
   while(n>0)
  {
    r=n%10;
    d=r*r*r;
    n=n/10;
    sum=sum+d;
   }
   if(sum==m)
   {
     System.out.print(" Armstrong number");
   }
    else
      System.out.print("NOT...");
}
public static void main(String args[])
  {
   java.util.Scanner sc=new java.util.Scanner(System.in);
   Arms ob=new Arms();
   ob.arm();
  }
}
