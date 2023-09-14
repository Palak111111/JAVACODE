class Test
{
   public int squ(int n)
   {
    int s;
    if (n==0)
    s=0;
    else
    s=n*n;
    return s;
   }
   public static void main(String args[])
   {
     java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.print("Enter number--->");
     int n=sc.nextInt();
     Test ob=new Test();
     System.out.println("SQUARE OF NUMMBER IS = "+ob.squ(n)); 
   }
}
