class SumInput
{
  public static void main(String args[])
   {
    java.util.Scanner sc=new java.util.Scanner (System.in);
     System.out.println("Enter number :");
     int n=sc.nextInt();
     SumInput ob=new SumInput();
     ob.sum(n);
     }
    public void sum(int n)
     {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     int sum=0;
     int i=0;
     int r=0;
      while(n>0)
        {
         r=n%10;
         sum=sum+r;
         n=n/10;
         i++;
        }
        System.out.println("sum="+sum);
     
     }
}
