
class SeriesPower25
{
 public static void main(String[] agrs)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in)
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 float sum=0;
	 for(int i=1;i<=n;i++)
		 {
	    System.out.print(a+"/"+y+"^"+a);
		if(i<n)
		System.out.print(" + ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
	    sum=sum+(a/b);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 2/3^2 + 4/3^4 + 6/3^6 = 0.279835

//26.

class SeriesPower26
{
 public static void main(String[] agrs)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in)
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 float sum=0;
	 for(int i=1;i<=n;i++)
		 {
	       System.out.print(a+"/"+y+"^"+a);
		   if(i%2==0 && i<n)
		   System.out.print(" + ");
	       else if(i<n)
		   System.out.print(" - ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum-(b/z);
         else
	     sum=sum+(b/z);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 2/3^2 - 4/3^4 + 6/3^6 = 0.18106996
  
  
  //27.
  
class SeriesPower27
{
 public static void main(String[] agrs)
 {
	 java.util.Scanner sc=new java.util.Scanner(System.in)
	 System.out.print("Enter number :");
	 int n=sc.nextInt();
	 System.out.print("Enter second number :");
	 int y=sc.nextInt();
	 int a=2;
	 float sum=0;
	     for(int i=1;i<=n;i++)
		 {
	       System.out.print(a+"/"+y+"^"+a);
		   if(i%2==0 && i<n)
		   System.out.print(" - ");
	       else if(i<n)
		   System.out.print(" + ");
	    float b=1;
	    for(int j=1;j<=a;j++)
		 {
	      b=b*y;
		 }
		 if(i%2==0)
	     sum=sum+(b/z);
         else
	     sum=sum-(b/z);
		a=a+2;
	     }
		 
	     System.out.println(" = "+sum);
	 }
	 }
	 
//output
// 2/3^2 + 4/3^4 - 6/3^6 = -0.18106996
