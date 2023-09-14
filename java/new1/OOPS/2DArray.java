import java.util.Scanner;
class Array2DOperation
{
	private int a[][];
	private int r,c;
	public void setData(int r,int c)
        {
          this.a=new int [5][5];
          this.r=r;
          this.c=c;
        }
        public void input()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Matrix Elements :");
         for(int i=0; i<r; i++)
         {
         	for(int j=0; j<c; j++)
         	{
         		a[i][j]=sc.nextInt();
         	}
         }
        }
        public void show()
         {
		 for(int i=0; i<r; i++)
         {
         	for(int j=0; j<c; j++)
         	{
                   System.out.print(a[i][j]+"\t");
         	}
         	System.out.println(" ");
         }
       }
       public int sum()
        {
          int sum=0;
          for(int i=0; i<r; i++)
         {
         	for(int j=0; j<c; j++)
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
           public int secMaximum()
	      {
		int max=0,sec=0;
	         for(int i=0;i<r;i++)
		  { 
		   for(int j=0;j<c;j++)
		    {
		      if(max<a[i][j])
			{
				sec=max;
				max=a[i][j];
			}
			else if(max>a[i][j] && sec<a[i][j])
			{
				sec=a[i][j];
			}
		    }
              }
               return sec;
	}
     public int secMinimum()
	{
		int min=a[0][0];	
		for(int i=0;i<r;i++)
		  { 
		   for(int j=0;j<c;j++)
		    {
			if(min<=a[i][j])			
			min=a[i][j];
		     }
		int min2 = a[0][0];
		for( i=0;i<r;i++)
		  { 
		   for(int j=0;j<c;j++)
	           {
           	     if(min2>=a[i][j])			
		       min2=a[i][j];
		       }			
	          for( i=0;i<r;i++)
		    { 
		      for(int j=0;j<c;j++)
		       {
			 if(min>a[i][j]&&min2<a[i][j])
			 {
			  min = a[i][j];
			 }
		       }
		      
	          }	
               }
             }
             return min;
         }
         public void countEvenOdd()
	 {
	   int even=0,odd=0;
	    for(int i=0;i<r;i++)
		  { 
		   for(int j=0;j<c;j++)
		    { 
		     if(a[i][j]%2==0)
			{
		           even++;
			}
		    else
			{
			  odd++;
	               }
	           }
	         }
	         System.out.println(even + " " + odd);
	 }
	 
         
}         
class User
   {
       public void use()
          {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n -------------- TWO-D Array --------------\n\n");
		System.out.print("ENTER ROW---> ");
		int r=sc.nextInt();
		System.out.print("ENTER COLOUM---> ");
		int c=sc.nextInt();
		int ch;
		Array2DOperation ob = new Array2DOperation();
		ob.setData(r,c);
		do
		{
		System.out.println("\nOperations Perform on 2D-Array will be -->\n");
		System.out.println("\t1  FOR INPUT  2D-ARRAY ELEMENT.\n\t2 FOR PRINT 2D-ARRAY.");
		System.out.println("\t3 FOR 2D-ARRAY ELEMENTS SUM.\n\t4 FOR MINIMUM ELEMENTS OF 2D-Array.");
		System.out.println("\n\t5 FOR MAXIMUM ELEMENTS OF 2D-ARRAY.\n\t6 FOR SECOND MAXIMUM IN ARRAY ELEMENTS \n\t7 FOR SECOND MINIMUM IN ARRAY ELEMENTS.\n\t8 FOR EVEN ODD IN ARRAY ELEMENTS \n\t9 for Exit.");
		System.out.print("\n\t ENTER YOUR CHOICE :-  ");
		ch=sc.nextInt();
		switch(ch)
		{ 
		 case 1 :
		          ob.input();
		          break;
		 case 2 :
		          ob.show();
		          break;
		 case 3 : 
		         System.out.println("SUM OF MATRIX ="+ob.sum());
		         break;
		case 4 :
		        System.out.println("MINIMUM IS = "+ob.minimum());
		         break;
		case 5 :
		        System.out.println("Max.= "+ob.maximum());
		        break;
	         case 6 : 
                          System.out.println("SECOND MAXIMUN IS= "+ob.secMaximum());	
                          break;
                  case 7:
                          System.out.println("SECOND MINIMUM = "+ob.secMinimum());
	                break;
	        case 8 : 
	                System.out.print("EVEN AND ODD  = ");
	                ob.countEvenOdd();
	                break;
	       }
           }
           while(ch!=9);
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
