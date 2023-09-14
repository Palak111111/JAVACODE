class Test
{
  public int fab(int n)
  {
   if(n==1)
   return 0;
   else if(n==2)
   return 1;
   return fab(n-1)+fab(n-2);
  }
  public static void main(String args[])
  {
   java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.print("Enter number= ");
     int n=sc.nextInt();
      Test ob=new Test();
      for(int i=1;i<=n;i++)
      System.out.println("FAB IS="+ob.fab(i));
    }
}
