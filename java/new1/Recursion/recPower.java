class Test
{
 public int power (int x,int y)
  {
    int s;
    if (y==0)
     s=1;
     else 
     s=x*power(x,y-1);
     return s;
  }
  public static void main(String args[])
  { 
  java.util.Scanner sc=new java.util.Scanner(System.in);
  System.out.print("ENTER X=");
  int x=sc.nextInt();
   System.out.print("ENTER Y=");
  int y=sc.nextInt();
  Test ob=new Test();
  System.out.println("power of X and Y IS ="+ob.power(x,y));
  } 
}
