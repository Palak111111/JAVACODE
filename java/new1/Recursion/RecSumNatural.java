class Test
{
  public int sum(int x)
  {
   int s;
   if(x==0)
   s=0;
   else
   s=x+sum(x-1);
   return s;
  }
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner (System.in);
    System.out.print("Enter number..");
    int x=sc.nextInt();
    Test ob=new Test();
    System.out.println("Sum of natural number is="+ob.sum(x));  
  }

}

