import java.util.Scanner;
class ArrayOperation
{
	private int a[];
	private int len;
	public void setData(int len)
	{
		this.a= new int [10];
		this.len=len;
	}

	public void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements in array:");
		for(int i=0; i<this.len; i++)
			a[i]=sc.nextInt();
	}
	public void showArray()
	{
		System.out.println("Array elements are:");
		for(int i=0; i<this.len; i++)
			System.out.print(a[i]+" ");
	}
	public int sumArray()
	{
		int sum=0;
		for(int i=0; i<this.len; i++)
		{
			sum=sum+a[i];
		}
		return sum;
	}
	public int maximum()
	{
		int max=0;
		for(int i=0; i<this.len; i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	public int minimum()
	{
		int min=a[0];
		for(int i=0; i<this.len; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		return min;
	}
	public int secMaximum()
	{
		int max=0,sec=0;
		for(int i=0; i<this.len; i++)
		{
			if(max<a[i])
			{
				sec=max;
				max=a[i];
			}
			else if(max>a[i] && sec<a[i])
			{
				sec=a[i];
			}
		}
		return sec;
	}
	public int secMinimum()
	{
		int min=a[0];	
		for(int i=0;i<this.len;i++)
		{
			if(min<=a[i])			
			min=a[i];
		}
		int min2 = a[0];
		for(int i=1; i<this.len ; i++)
	    {
           	if(min2>=a[i])			
			min2=a[i];
		}			
	    for(int i=0 ; i<this.len; i++)
		{
			if(min>a[i]&&min2<a[i])
			{
				min = a[i];
			}
		}
		  return min;
	}	
	public void revArray()
	{
		int temp;
		for(int i=0; i<this.len/2; i++)
		{
			temp=a[i];
			a[i]=a[this.len-(i+1)];
			a[this.len-(i+1)]=temp;
		}
		System.out.println("\nReverse Array Elements are:");
		for(int i=0; i<this.len; i++)
		{
			System.out.print(a[i]+"\t");
		}
	}
	public void bubbleSort()
	{
		
		for(int i=0;i<this.len;i++)
		{
			for(int j=0;j<(this.len-i-1);j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("\nAfter Swapping");
		for( int i=0;i<this.len;i++)
	    System.out.println(a[i]);
	}
	public void selectionSort()
	{
		int min,pos=0;
		for(int i=0; i<this.len; i++)
		{
			min=a[i];
			pos=i;
			for(int j=i+1; j<this.len; j++)
		    {
				if(min>a[j])
				{
					min=a[j];
					pos=j;
				}
			}
			a[pos]=a[i];
			a[i]=min;
		}
		System.out.println("\nSorted Array");
		for(int i=0; i<this.len; i++)
			System.out.println(a[i]+" ");
	}
	public void delDuplicate()
	{
		for(int i=0;i<this.len;i++)
		{
			for(int j=i+1;j<this.len;)
			{
			    if(a[i]==a[j])
			   {
			        a[j]=a[i];
				    for(int k=j;k<this.len;k++)
					{
						a[k]=a[k+1];
					}	
						this.len--;
			   }
		
			  else
			   {
				 j++;
			   }
			}
		}
			System.out.println("\nAfter deleting duplicate elements");
			for(int i=0;i<this.len;i++)
			{
				System.out.println(a[i]);
			}
			
	}
	public void countEvenOdd()
	{
		int even=0,odd=0,i;
		 for(i=0;i<this.len;i++)
	    {
			if(a[i]%2==0)
			{
				 even++;
			}
		    else
			{
			   odd++;
	               }
	    }
	   System.out.println("Count of even elements="+even);
	   System.out.println("Count of odd elements="+odd);
	}
}
class Test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayOperation ob = new ArrayOperation();
		int ch;
		System.out.println("Enter how many elements you want to enter");
		int k=sc.nextInt();
		ob.setData(k);
		do
		{
			System.out.println("\nYour choices are:");
			System.out.println("1 for Input Array Element\n2 for Print Array");
			System.out.println("3 for sum Array Element\n4 for MaxEle of Array");
			System.out.println("5 for minEle Array \n6 for SecMaxEle of Array");
			System.out.println("7 for SecminEle Array \n8 for Revrerse Array");
			System.out.println("9 for bubble Sort \n10 for Selection Sort");
			System.out.println("11 for deleate duplicate elements \n12 for count even odd elements");
			System.out.println("Enter your choice");
		        ch=sc.nextInt();
			switch(ch) 
			{
				case 1:
				ob.inputArray();
				break;
				
				case 2:
				ob.showArray();
				break;
				
				case 3:
				int s=ob.sumArray();
				System.out.println("\nSum of Array="+s);
				break;
				
				case 4:
				int m=ob.maximum();
				System.out.println("\nMax ele of Array="+m);
				break;
				
				case 5:
				int m1=ob.minimum();
				System.out.println("\nMin ele of Array="+m1);
				break;
				
				case 6:
				int sm=ob.secMaximum();
				System.out.println("\nsecmax ele of Array="+sm);
				break;
				
				case 7:
				int sm1=ob.secMinimum();
				System.out.println("\nsecmin ele of Array="+sm1);
				break;
				
				case 8:
				ob.revArray();
				break;
				
				case 9:
				ob.bubbleSort();
				break;
				
				case 10:
				ob.selectionSort();
				break;
				
				case 11:
				ob.delDuplicate();
				break;
				
				case 12:
				ob.countEvenOdd();
				break;
				
				case 0:
				System.exit(0);
				
			}
		}
		while(ch!=0);
	}
}
