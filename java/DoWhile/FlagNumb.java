class FlagPrime
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER ANY NUMBER: ");
int n=sc.nextInt();
int i = 2;
int flage =1;
do
	
	{
	if (n%i==0)
	{
	flage=0;
	break;
	}
	i++;
	}
	while(i<n);
if(flage==1)
System.out.print("...PRIME NUMBER....");
else
System.out.print("....NOT A PRIME NUMBER..");
}
}

