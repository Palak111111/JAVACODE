class Test
{
  public static void main(String args[])
  {
    java.util.Scanner sc=new java.util.Scanner(System.in);
    int a[]=new int[10];
    System.out.println("HOW MANY ARRAY ELEMENTS YOU WANT TO ENTER:");
    int n=sc.nextInt();
    int i,min,pos;
	System.out.println("Enter Element in array");
	 for (i=0;i<n;i++)
     {
       a[i]=sc.nextInt();
     }
	 for(i=0;i<n;i++)
     {
		 min=a[i];
		 pos=i;
		 for(int j=i+1;j<n;j++)
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
	   System.out.println("in line");
        for (i=0;i<n;i++)
          System.out.println(a[i]);			
  }
}