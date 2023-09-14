class Test
{
 public static void main(String args[])
 {
  java.util.Scanner sc=new java.util.Scanner(System.in);
 System.out.println("HOW MANY ELEMENTS DO YOU WANT TO ENTER---->");
 System.out.println("\t PRESS 1. FOR TWO VARIABLE\n\t PRESS 2.FOR THREE VARIABLE\n\t PRESS 3.FOR FOUR VARIABLE\n\t PRESS 4.FOR FIVE VARIABLE");
 int o=sc.nextInt();
 int a,b,c,d,e;
 int x,y,z,w;
 Test ob=new Test();
 switch(o)
  {
   case 1: System.out.println("ENTER TWO NUMBER..");
   a=sc.nextInt();
   b=sc.nextInt();
   w=ob.add(a,b);
   System.out.println("Addition="+w);
   break;
   case 2: System.out.println("ENTER THREE NUMBER..");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   x=ob.add(a,b,c);
   System.out.println("Addition="+x);
   break;
   case 3: System.out.println("ENTER FOUR NUMBER..");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   y=ob.add(a,b,c,d);
   System.out.println("Addition="+y);
   break;
   case 4: System.out.println("ENTER FIVE NUMBER..");
   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   d=sc.nextInt();
   e=sc.nextInt();
   z=ob.add(a,b,c,d,e);
   System.out.println("Addition="+z);
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
}
