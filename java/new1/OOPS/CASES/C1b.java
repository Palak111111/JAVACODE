class Test
{
   public static void display()
   {
    System.out.println("HELLO DISPLAY....."); 
   }
   public static void main(String ags[])
   {
     System.out.println("BYE...");
   }
   static 
   {
    System.out.println("HELLO STATIC BLOCK....");
    Test.display();
   }
}
/*  HELLO STATIC BLOCK....
HELLO DISPLAY.....
BYE...  */


