class Test
{
 public int sum(int n)
  {
   int s;
   if(n==0)
    s=0;
    else 
    s=n%10+sum(n/10);
    return s;
   }
   public static void main(String args[])
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter number= ");
     int n=sc.nextInt();
      Test ob=new Test();
      System.out.println("Sum of inpuut digit is="+ob.sum(n)); 
   }
} 
