class SwitchFour
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("Your Choice Are:");
System.out.println("Choose 1 case");
System.out.println("Choose 2 case");
System.out.println("Choose 3 case");
System.out.println("Choose 4 case");
System.out.println("Choose 5 case");
System.out.println("Enter Your Choices");
int ch=sc.nextInt();
switch(ch)
{
 case 1:
  System.out.print("Enter any number:");
   int n=sc.nextInt();
   int  i=1;
   double sum=1;
   double s=0;
   double div=0;
   while(i<=n)
    {
	    System.out.print("!"+i+"/"+i);
		if(i<n){
		System.out.print(" + ");
		}
   sum=sum*i;
   div=sum/(i*2);
   s=s+div;
   i++;
   }
   System.out.println("="+s);
   break;
   
   case 2:
   
    System.out.print("Enter any number:");
   n=sc.nextInt();
    i=1;
   sum=1;
    s=0;
    div=0;
   while(i<=n)
   {
	    System.out.print("!"+i+"/"+i);
		if(i%2==0 && i<n)
		System.out.print(" + ");
		else if(i<n)
		System.out.print(" - ");
   sum=sum*i;
   div=sum/(i*2);
   if(i%2==0)
       s=s-div;
   else
	   s=s+div;
   i++;
   }
   System.out.println("="+s);
   break;
   
   case 3:
   
    System.out.print("Enter any number:");
     n=sc.nextInt();
     i=1;
    sum=1;
    s=0;
    div=0;
   while(i<=n)
   {
	    System.out.print("!"+i+"/"+i);
		if(i%2==0 && i<n)
		System.out.print(" - ");
		else if(i<n)
		System.out.print(" + ");
   sum=sum*i;
   div=sum/(i*2);
   if(i%2==0)
       s=s+div;
   else
	   s=s-div;
   i++;
   }
   System.out.println("="+s);
   break;
   
   case 4:
   
   System.out.print("Enter any number:");
    n=sc.nextInt();
    i=1;
    sum=1;
    s=0;
    div=0;
   while(i<=n)
   {
	    System.out.print("!"+i+"/"+i);
		if(i%2==0 && i<n)
		System.out.print(" - ");
		else if(i<n)
		System.out.print(" + ");
   sum=sum*i;
   div=(i*2)/sum;
   if(i%2==0)
       s=s+div;
   else
	   s=s-div;
   i++;
   }
   System.out.println("="+s);
   break;
   
   case 5:
   
   System.out.print("Enter any number:");
    n=sc.nextInt();
   i=1;
    sum=1;
    s=0;
    div=0;
   while(i<=n)
   {
	    System.out.print("!"+i+"/"+i);
		if(i<n){
		System.out.print(" + ");
		}
   sum=sum*i;
   div=sum/(i+2);
   s=s+div;
   i++;
   }
   System.out.println("="+s);
   break;
}
}
}

