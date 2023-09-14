import java.util.Scanner;
  class Array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [7];
		
		int i;
		System.out.println("How Many elemnt you Want");
		int n=sc.nextInt();
		System.out.println("Enter the Element in array");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
		for(i=0;i<n;i++)
		{
			int Temp = i;  
            for (int j=i+1;j<n;j++)
			{  
                if (a[j]<a[Temp])
				{  
                    Temp=j;  
                }  
            }  
            int temp = a[Temp];   
            a[Temp] = a[i];  
            a[i] = temp;  
        } 
		System.out.println("***Ater the Selection Sorting**");
		for(i=0;i<n;i++)
		System.out.println("a["+i+"]="+a[i]);
	}
}
/* How Many elemnt you Want
5
Enter the Element in array
2
3
1
4
6
a[0]=2
a[1]=3
a[2]=1
a[3]=4
a[4]=6
***Ater the Selection Sorting**
a[0]=1
a[1]=2
a[2]=3
a[3]=4
a[4]=6
*/

