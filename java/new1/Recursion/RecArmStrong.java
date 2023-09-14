class Test
{
 public int arm(int n)
  {
   int s=0,d=0;
         if(n==0)
         {
         return 0;
         }
         else 
        {
         s=n%10;
         d=(s*s*s)+d;
         return (d+arm();
         
        }
       
   }
      int arm=0;
      public static void main(String args[])
     {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter number= ");
     int n=sc.nextInt();
     Test ob=new Test();
      System.out.println ("ARMSTRONG NO.="+ob.arm(n)); 
     }
} 
