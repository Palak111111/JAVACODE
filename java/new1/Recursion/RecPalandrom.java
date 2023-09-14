class Test
{
 public int pal(int n)
  {
   int s=0;
         if(n==0)
         {
         return 0;
         }
         else 
        {
         s=n%10;
         pal=pal*10+s;
         this.pal(n=n/10);
         return pal;
         
        }
       
   }
     int pal =0;
      public static void main(String args[])
     {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter number= ");
     int n=sc.nextInt();
     Test ob=new Test();
      int a=ob.pal(n);
        if (a==n)
        {
         System.out.println("PALANDROM NUMBER!!!!");
        }
         else  
         System.out.println("NOT A PALANDROM NUMBER!!!!");
     }
} 
