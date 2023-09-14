//Armstrong Number Series(3 digit)

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class IO
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
		File ob = new File("f6.txt");
		FileOutputStream fos = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number to check it is Armstrong Number or not : ");
		int n = sc.nextInt();
		
		int user,rem,res=0;
		user=n;
		
		while(user!=0)
		{
			rem=user%10;
			res=res + Math.pow(rem,3);
			user=user/10;
		}
		if(res==n)
			fos.write(1);
		else
		    fos.write(0);
		fos.close();
		System.out.println("Process Done.");
	}
}