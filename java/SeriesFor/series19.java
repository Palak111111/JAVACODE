class PowerSeries19
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int x=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
    int a=2;
       int sum=0;
            for(int i=1;i<=x;i++)
               {
                   System.out.print(+y+"^"+a);
                    if(i<x)
                        System.out.print("+");
                            int b=1;
                            for(int j=1;j<=a;j++)
                             {
                               b=b*y;
                             }
                            sum=sum+b;
                           a=a+2;
                }
                               System.out.print("=" +sum);

}
}
// ENTER ANY NUMBER: 3
//ENTER ANY  Second NUMBER: 3
//3^2+3^4+3^6=819



//20.
class PowerSeries20 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
int sum=0;
	for(int i=1;i<=n;i++)
	    {
            System.out.print(+y+"^"+a);
                if(i<n&&i%2==0)
                     System.out.print("+");
                      else if(i<n)
                         System.out.print("-");
               int b=1;
               for(int j=1;j<=a;j++)
               {
		b=b*y;
               }
		if(i<n&&i%2==0)
		       sum=sum-b;
	          else 
                      sum=sum+b;
	                      	a=a+2;
              }
                 System.out.print("=" +sum);

}
}
// ENTER NUMBER :3     ENTER ANY  Second NUMBER: 3
// 3^2-3^4+3^6=657

//21.
class PowerSeries21 
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER :");
int n=sc.nextInt();
System.out.print("ENTER ANY  Second NUMBER: ");
int y=sc.nextInt();
int a=2;
int sum=0;
	for(int i=1;i<=n;i++)
	    {
            System.out.print(+y+"^"+a);
                if(i<n&&i%2==0)
                     System.out.print("-");
                      else if(i<n)
                         System.out.print("+");
               int b=1;
               for(int j=1;j<=a;j++)
               {
		b=b*y;
               }
		if(i<n&&i%2==0)
		       sum=sum+b;
	          else 
                      sum=sum-b;
	                      	a=a+2;
              }
                 System.out.print("=" +sum);

}
}

//ENTER NUMBER :3       ENTER ANY  Second NUMBER: 3
// 3^2+3^4-3^6=-657
