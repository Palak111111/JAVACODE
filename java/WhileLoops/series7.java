class SeriesSeven
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=1;
int s=0;
int  div=0;
while (i<=n)
{
System.out.print(i+"/!"+i);
	if(i<n )
{
	System.out.print(" + ");
	}
sum=sum*i;
div=sum/i;
s=s+div;
i++;

}
System.out.print("="+s);
}
}
// OUTPUT ENTER NUMBER = 5
//1/!1 + 2/!2 + 3/!3 + 4/!4 + 5/!5=34
