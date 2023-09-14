class Calculator
{
  private double a,b;
  public void setData(double a,double b)
  {
   this.a=a;
   this.b=b;
  }
   public double add()
   {
    return this.a+this.b;
   }
   public double sub()
   {
    return this.a-this.b;
   }
   public double multi()
   {
    return this.a*this.b;
   }
   public double div()
   {
    return this.a/this.b;
   }
   public double mod()
   {
    return this.a%this.b;
   }
}
class Test
{
   public static void main(String args[])
  { 
    java.util.Scanner sc=new java.util.Scanner(System.in);
     int ch;
     double x,y,res;
     Calculator ob=new Calculator();
      do
       {
        System.out.println("\n\t YOUR CHOICES ARE:");
        System.out.println("\t1 FOR ADDITION:\n\t2 FOR SUBSTRACTION:");
        System.out.println("\t3 FOR MULTIPLICATION:\n\t4 FOR DIVISION:");
        System.out.println("\t5 FOR MODULUS:\n\t6 OR EXIT:");
        System.out.print("SELECT YOUR CHOICE:-------------> ");
        ch=sc.nextInt();
        switch(ch)
         {
          case 1:
                  System.out.print("ENTER FIRST NUMBER--");
                  x=sc.nextDouble();
                  System.out.print("ENTER SECOND NUMBER--");
                  y=sc.nextDouble();
                  ob.setData(x,y);
                  res=ob.add();
                  System.out.println("ADDITION="+res);
                  break;
        case 2:
                  System.out.print("ENTER FIRST NUMBER--");
                  x=sc.nextDouble();
                  System.out.print("ENTER SECOND NUMBER--");
                  y=sc.nextDouble();
                  ob.setData(x,y);
                  res=ob.sub();
                  System.out.println("SUBSTRACTION ="+res);
                  break;
       case 3:
                  System.out.print("ENTER FIRST NUMBER--");
                  x=sc.nextDouble();
                  System.out.print("ENTER SECOND NUMBER--");
                  y=sc.nextDouble();
                  ob.setData(x,y);
                  res=ob.multi();
                  System.out.println("MULTIPLICATION ="+res);
                  break;
       case 4:
                  System.out.print("ENTER FIRST NUMBER--");
                  x=sc.nextDouble();
                  System.out.print("ENTER SECOND NUMBER--");
                  y=sc.nextDouble();
                  ob.setData(x,y);
                  res=ob.div();
                  System.out.println("DIVISION="+res);
                  break;
        case 5:
                  System.out.print("ENTER FIRST NUMBER--");
                  x=sc.nextDouble();
                  System.out.print("ENTER SECOND NUMBER--");
                  y=sc.nextDouble();
                  ob.setData(x,y);
                  res=ob.mod();
                  System.out.println("MODULAS ="+res);
                  break;
          }
        }
        while(ch!=6);
  }

}
