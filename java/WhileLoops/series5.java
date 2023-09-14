class SeriesFive
{
public static void main(String args[])
{
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.print("ENTER NUMBER=");
int n=sc.nextInt();
int i=1;
int sum=1;
int s=0;
int div=0;
while (i<=n)
{
System.out.print("!"+i+ "/"+i);
	if(i<n && i%2==0)
{
	System.out.print("+");
	}
	else if(i<n)
	System.out.print("-");
sum=sum*i;
div=sum/i;

if(i%2==0){
s=s-div;
}
else
s=s+div;
i++;

}
System.out.print("="+s);
}
}

// OUTPUT
// !1/1-!2/2+!3/3-!4/4+!5/5=20
