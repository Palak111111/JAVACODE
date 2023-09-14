class Test
{
  public void display()
  {
	   int a=8;
	   System.out.println("HELLO DISPLAY.....");
	   System.out.println("A="+a);
	   System.out.println("---------------");
	   this.show(a);
   }
     public void show(int x)
      {
       System.out.println("X="+x);
       System.out.println("HELLO SHOW......");
      }
        public static void main(String args[])
        {
         Test ob=new Test();
         ob.display();
        }
   }     
