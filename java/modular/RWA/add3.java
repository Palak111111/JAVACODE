class Test
{
 public int add(int x,int y,int z)
 {
  return x+y+z;
 }
 public int add1(int x,int y)
 {
  return x+y;
 }
  public static void main(String args[])
  {
   int res=new Test().add(4,5,3);
   int res1=new Test().add1(4,5);
   System.out.println("RESULT= "+res);
   System.out.println("RESULT= "+res1);
  }

}
// RESULT= 12            RESULT= 9