import java.util.Scanner;

class TwoDArraySingle
{
    private int a[][];
	private int r,c;
	public void setData(int r,int c)
	{
		this.a = new int [5][5];
		this.r=r;
               this.c=c;
	}
	
	public void input2DArray()
	{
	    Scanner sc =new Scanner(System.in);
		System.out.println("Enter elements in Array -->");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	public void show2DArray()
	{
		System.out.println("Array will be -->");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("   "+a[i][j]);
			}
			System.out.println("\n"); 
		}
	}
	
	public int twoDArraySum()
	{
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=sum+a[i][j];
			}
		}
		return sum;
	}
	
	public int minimum()
	{
		int min=a[0][0];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(min>a[i][j])
					min=a[i][j];
			}
		}
		return min;
	}
	
	public int maximum()
	{
		int max=a[0][0];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		return max;
	}
}

class User
{ 
 
       public void use()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("\n -------------- TWO-D Array --------------\n\n");
         System.out.print("Enter Rows Of 2D-Array :");
          int r=sc.nextInt();
	   System.out.print("Enter Coloumns Of 2D-Array :");
             int c=sc.nextInt();
	      int ch,m;
	     TwoDArraySingle td = new TwoDArraySingle();
                td.setData(r,c);
	do
	{
		System.out.println("\nOperations Perform on 2D-Array will be -->\n");
		System.out.println("Press 1 for Input 2D-Array Element.\nPress 2 for Print 2D-Array.");
		System.out.println("Press 3 for 2D-Array Element Sum.\nPress 4 for Minimum Element of 2D-Array.");
		System.out.println("Press 5 for Maximum Element of 2D-Array.\nPress 6 for Exit.");
		System.out.print("\nEnter Ur Choice : ");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1: td.input2DArray();
		            break;
	       
		    case 2: td.show2DArray();
		            break;
		
		    case 3: m=td.twoDArraySum();
					System.out.println("Sum of 2D-Array = "+m);
			        break;
					
		    case 4: m=td.minimum();
					System.out.println("Minimum Element of 2D-Array = "+m);
			        break;
					
		    case 5: m=td.maximum();
					System.out.println("Maximum Element of 2D-Array = "+m);
			        break;
		}
	}while(ch!=6);
	}
}

class Test
{
    public static void main(String args[])
	{
	
             
	          User ob = new User();
		   ob.use();
	}
}
