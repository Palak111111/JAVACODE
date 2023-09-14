import java.util.Scanner;
class Discount
{
	private int cost;
	public int setData(Scanner sc)
	{
		System.out.print("Enter cost=");
		int cost=sc.nextInt();
		this.cost=cost;
		return cost;
	}
	public void price()
	{
	if(cost>=2000)
	{
	System.out.println("THE DISCOUNT IS 20%");
	System.out.println("COSTUMER PRICE="+cost*0.8);
	}
	  else if(cost>=1500)
		{
		System.out.println("THE DISCOUNT IS 15%");
		System.out.println("COSTUMER PRICE="+cost*0.85);
		}
	         else if(cost>=1000)
			 {
			System.out.println("THE DISCOUNT IS 10%");
			System.out.println("COSTUMER PRICE="+cost*0.9);
			}
	        else if(cost>=500)
			{
			System.out.println("THE DISCOUNT IS 5%");
			System.out.println("COSTUMER PRICE="+cost*0.95);
			}
	       else 
	       {
		System.out.println("NO DISCOUNT");
		System.out.println("COSTUMER PRICE="+cost);
		}
				
	}
	}
	 class  Test
	 {
	  public static void main(String args[])
	  {
	  Discount ob=new Discount();
	  Scanner sc=new Scanner(System.in);
	   ob.setData(sc);
	   ob.price();
	  
	  }
	 }
			
	
