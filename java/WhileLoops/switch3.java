class SwitchThree
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Your Choice Are:");
System.out.println("Chose 1 case");
System.out.println("Chose 2 case");
System.out.println("Chose 3 case");
System.out.println("Chose 4 case");
System.out.println("Chose 5 case");
System.out.println("Enter Your Choicess");
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
		if(i%2==0 && i<n)
		System.out.print(" + ");
		else if(i<n)
		System.out.print(" - ");
   sum=sum*i;
   div=sum/(i+1);
   if(i%2==0)
       s=s-div;
   else
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
		System.out.print(" - ");
		else if(i<n)
		System.out.print(" + ");
   sum=sum*i;
   div=sum/(i+1);
   if(i%2==0)
       s=s+div;
   else
	   s=s-div;
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
		if(i<n){
		System.out.print(" + ");
		}
   sum=sum*i;
   div=(i+1)/sum;
   s=s+div;
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
		System.out.print(" + ");
		else if(i<n)
		System.out.print(" - ");
   sum=sum*i;
   div=(i+1)/sum;
   if(i%2==0)
       s=s-div;
   else
	   s=s+div;
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
		if(i%2==0 && i<n)
		System.out.print(" - ");
		else if(i<n)
		System.out.print(" + ");
   sum=sum*i;
   div=(i+1)/sum;
   if(i%2==0)
       s=s+div;
   else
	   s=s-div;
   	    i++;
   }
   System.out.println("="+s);
   break;
   }
   }
   }
