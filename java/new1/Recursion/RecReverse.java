class Test
{
 public int rev(int n)
  {
   int s=0;
         if(n==0)
         {
         return 0;
         }
         else 
        {
         s=n%10;
         rev=rev*10+s;
         this.rev(n=n/10);
         return rev;
         
        }
       
   }
    int   rev=0;
      public static void main(String args[])
     {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter number= ");
     int n=sc.nextInt();
     Test ob=new Test();
      System.out.println ("REVERSE NO.="+ob.rev(n)); 
     }
} 
