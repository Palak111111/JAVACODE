import java.util.Scanner;
class Num
{
 private int n;
   public void setData(Scanner sc)
   {
    System.out.print("enter N=");
    int n=sc.nextInt();
    this.n=n;
   }
    public void getData()
    {
     System.out.println("N= "+this.n); 
    }
     public void Natural()
     {
     int i=1,sum=1;
  while(i<=n)
  {
   System.out.print(" "+sum);
   sum=sum+i;
   i++;
  }
  
   
  }
}
class Test
{
 public static void main(String args[])
 { 
 Scanner sc=new Scanner(System.in);
 Num ob=new Num();
 ob.setData(sc);
 ob.getData();
 ob.Natural();
 
 }
}

/* N= 5
 1 2 4 7=11
Sum=11
*/

