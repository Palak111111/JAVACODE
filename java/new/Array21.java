class Test
{
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int[10];
    System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
    int n=sc.nextInt();
    int i;
	int temp=a[0];
	System.out.println("Enter Element in array");
	 for (i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
		 for(int j=1;j<n;j++)
		 {   
			 for(i=0;i<n-j;i++)
			 {
				if(a[i]>a[i+1])
				{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;}
			 }
		 }
	 
	   System.out.println("in line");
        for (i=0;i<n;i++)
          System.out.println(a[i]);			
  }
}