class Discount
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER AMOUNT");
int cost=sc.nextInt();
	if(cost>=2000)
	{
	System.out.println("THE DISCOUNT IS 20%");
	System.out.println("COSTUMER PRICE="+cost*0.8);}
	  else if(cost>=1500)
		{
		System.out.println("THE DISCOUNT IS 15%");
		System.out.println("COSTUMER PRICE="+cost*0.85);}
	      else if(cost>=1000)
			 {
			System.out.println("THE DISCOUNT IS 10%");
			System.out.println("COSTUMER PRICE="+cost*0.9);}
	        else if(cost>=500)
			{
			System.out.println("THE DISCOUNT IS 5%");
			System.out.println("COSTUMER PRICE="+cost*0.95);}
	else {
		System.out.println("NO DISCOUNT");
		System.out.println("COSTUMER PRICE="+cost);}
				
	}
	}
			
	
	


