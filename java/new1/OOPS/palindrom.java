import java.util.Scanner;
class Palindrome
{
	private int n;
	public int setData(Scanner sc)
	{
		System.out.println("Enter a number");
		int a=sc.nextInt();
		this.n=a;
		return a;
	}
	public int isPalindrome()
	{
		int r=0,s=0;
		while(n!=0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		return s;
	}
}
class Test
{
	public static void main(String args[])
	{
		Palindrome ob=new Palindrome();
		Scanner sc=new Scanner(System.in);
		int t=ob.setData(sc);
		int res=ob.isPalindrome();
		System.out.println("reverse="+res);
		if(res==t)
			System.out.println("palindrom");
		else
			System.out.println("Not palindrom");
	}
}