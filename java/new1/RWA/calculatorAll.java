class Test
{
   public static void main(String args[])
   {
    Test ob=new Test();
    ob.var();
   }
      public void var()
     {
      java.util.Scanner sc=new java.util.Scanner(System.in);
      System.out.println("HOW MANY ELEMENTS DO YOU WANT TO ENTER---->");
      System.out.println("\t PRESS 1. FOR TWO VARIABLE\n\t PRESS 2.FOR THREE VARIABLE\n\t PRESS 3.FOR FOUR VARIABLE\n\t PRESS 4.FOR FIVE  VARIABLE");
            int o=sc.nextInt();
            System.out.println("\t    CHOICES ARE ");
            System.out.println("\t	PRESS 1 FOR ADDITION");
            System.out.println("\t	PRESS 2 FOR SUBSTRACTION");
            System.out.println("\t	PRESS 3 FOR MULTIPLICATION");
            System.out.println("\t	PRESS 4 FOR DIVISION");
            System.out.println("\t	PRESS 5 FOR MODULAS");
            System.out.println("\t    PRESS 6 FOR EXIT ");
            System.out.print("\t ENTER YOUR CHOICES =");
	    int ch=sc.nextInt();

     switch(o)
     {
      case 1 : 
              this.inp2(ch);
              break;
      case 2 :
             this.inp3(ch);
             break;
      case 3 :
             this.inp4(ch);
             break;
      case 4 :
              this.inp5(ch);
              break;
     } 
   }
   
    public int add(int a,int b)
    {
     return a+b;
    }
   public int add(int a,int b,int c)
   {
    return this.add (a,b)+c;
   }
   public int add(int a,int b,int c,int d)
   {
    return this.add (a,b,c)+d;
   }
   public int add(int a,int b,int c,int d,int e)
   {
    return this.add (a,b,c,d)+e;
   }
  public int sub(int a,int b)
    {
     return a-b;
    }
   public int sub(int a,int b,int c)
   {
    return this.sub (a,b)-c;
   }
   public int sub(int a,int b,int c,int d)
   {
    return this.sub (a,b,c)-d;
   }
   public int sub(int a,int b,int c,int d,int e)
   {
    return this.sub (a,b,c,d)-e;
   }
  public int multi(int a,int b)
    {
     return a*b;
    }
   public int multi(int a,int b,int c)
   {
    return this.multi (a,b)*c;
   }
   public int multi(int a,int b,int c,int d)
   {
    return this.multi (a,b,c)*d;
   }
   public int multi(int a,int b,int c,int d,int e)
   {
    return this.multi (a,b,c,d)*e;
   }
  public int divi(int a,int b)
    {
     return a/b;
    }
   public int divi(int a,int b,int c)
   {
    return this.divi(a,b)/c;
   }
   public int divi(int a,int b,int c,int d)
   {
    return this.divi (a,b,c)/d;
   }
   public int divi(int a,int b,int c,int d,int e)
   {
    return this.divi (a,b,c,d)/e;
   }
     public int mod(int a,int b)
    {
     return a%b;
    }
   public int mod(int a,int b,int c)
   {
    return this.mod(a,b)%c;
   }
   public int mod(int a,int b,int c,int d)
   {
    return this.mod (a,b,c)%d;
   }
   public int mod(int a,int b,int c,int d,int e)
   {
    return this.mod (a,b,c,d)%e;
   }
 
   public void inp2 (int ch)
   {
    java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("ENTER TWO NUMBER..");
     int a=sc.nextInt();
     int b=sc.nextInt();
     switch (ch)
     {
      case 1: 
             System.out.println(" solution is="+this.add(a,b));
             break;
     case 2 :
             System.out.println(" solution is="+this.sub(a,b));
             break;
     case 3: 
            System.out.println(" solution is="+this.multi(a,b));
            break;
     case 4: 
            System.out.println(" solution is="+this.divi(a,b));
            break;
     case 5: 
           System.out.println(" solution is="+this .mod(a,b));
           break;
     }
   }

   public void inp3(int ch)
    {
    java.util.Scanner sc=new java.util.Scanner(System.in);
     System.out.println("ENTER THREE NUMBER..");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     switch (ch)
     {
      case 1: 
             System.out.println(" solution is="+this.add(a,b,c));
             break;
     case 2 :
             System.out.println(" solution is="+this.sub(a,b,c));
             break;
     case 3: 
            System.out.println(" solution is="+this.multi(a,b,c));
            break;
     case 4: 
            System.out.println(" solution is="+this.divi(a,b,c));
            break;
     case 5: 
           System.out.println(" solution is="+this .mod(a,b,c));
           break;
     }

   }
   public void inp4(int ch)
   {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("ENTER FOUR NUMBER..");
    int  a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    switch (ch)
     {
      case 1: 
             System.out.println(" solution is="+this.add(a,b,c,d));
             break;
     case 2 :
             System.out.println(" solution is="+this.sub(a,b,c,d));
             break;
     case 3: 
            System.out.println(" solution is="+this.multi(a,b,c,d));
            break;
     case 4: 
            System.out.println(" solution is="+this.divi(a,b,c,d));
            break;
     case 5: 
           System.out.println(" solution is="+this .mod(a,b,c,d));
           break;
     }
   }
   public void inp5(int ch)
   {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    System.out.println("ENTER FIVE NUMBER..");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    switch (ch)
     {
      case 1: 
            System.out.println(" solution is=" + this.add(a,b,c,d,e));
             break;
     case 2 :
            System.out.println(" solution is=" +this.sub(a,b,c,d,e));
             break;
     case 3: 
            System.out.println(" solution is="+this.multi(a,b,c,d,e));
            break;
     case 4: 
            System.out.println(" solution is="+this.divi(a,b,c,d,e));
            break;
     case 5: 
           System.out.println(" solution is="+this .mod(a,b,c,d,e));
           break;
     }
   }
}

 
