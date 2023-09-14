//Fibonacci Series

import java.io.*;
import java.util.Scanner;

class IO
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		File ob = new File("f5.txt");
		FileOutputStream fos = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Position Number to get Fibonacci Series : ");
		int n = sc.nextInt();
		
		int i=1,a=-1,b=1;
		
		while(i<=n)
		{
			int fib=a+b;
			a=b;
			b=fib;
			String s=Integer.toString(fib);
			s=s+" ";
			byte x[]=s.getBytes();
			fos.write(x);
			fos.flush();
			i++;
		}
		fos.close();
		System.out.println("Process Done.");
	}
}