// ALL METHOD ARE NON STATIC DEFINE WITHIN SAME CLASS 
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
   public void show()
   {
     System.out.println("HELLO SHOW....."); 
   }
   static 
   {
    System.out.println("HELLO STATIC BLOCK....");
    Test.display();
    new Test().show();
   }
}
/* 
HELLO STATIC BLOCK....
HELLO DISPLAY.....
HELLO SHOW.....
BYE...
*/

