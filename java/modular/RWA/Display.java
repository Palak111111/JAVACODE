class Test 
{
 public void display()
  {
   int a=8;
   System.out.println("Hello display...");
   System.out.println("A="+a);
   System.out.println("------------------");
   int k=this.show(a);
   System.out.println("value = "+k);
  }
    public int show(int a)
    {
	 int x=7;
	 System.out.println("A="+a);
	 System.out.println("HELLO SHOW..");
	 return x;
    }
	public static void main(String args[])
	 {
	  Test ob=new Test();
	  ob.display();
	 }
}
/* 
Hello display...
A=8
------------------
A=8
HELLO SHOW..
value = 7 
*/
