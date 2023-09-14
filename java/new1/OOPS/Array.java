import java.util.Scanner;
class ArrayOperation
{
  private int a[];
  private int len;
  public void setData(int len)
   {
    this.a=new int[10];
    this.len=len;
   }
   public void inputArray()
   {
    Scanner sc=new java.util.Scanner(System.in);
    System.out.print("ENTER ELEMENTS IN ARRAY");
    for(int i=0;i<this.len;i++)
    a[i]=sc.nextInt();
   }
   public void showArray()
   {
    System.out.println("ARRAY ELEMENTS ARE:");
    for(int i=0;i<this.len;i++)
    System.out.println(a[i]);
   
   }
}
class Test
{
 public static void main(String args[])


}

