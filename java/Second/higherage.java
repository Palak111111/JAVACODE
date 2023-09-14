class Highage
{
	public static void main(String args[])
	{
               java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter Age of person");
		int aman=sc.nextInt();
		int rohan=sc.nextInt();
		int amit=sc.nextInt();
		int raj=sc.nextInt();
		int a,b;
	       if(aman>rohan)
	              a= aman;
		else 
			a= rohan;
		if( amit>raj)
			b=amit;
		else
			b=raj;
		if(a>b)
			System.out.println("greater is "+a);
		else
			System.out.println("greater is "+b);

}
}
