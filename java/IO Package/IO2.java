//Square of Numbers

import java.io.*;
import java.util.Scanner;

class IO
{
	public static void main(String args[]) throws IOException
	{
		File ob = new File("f2.txt");
		FileOutputStream fos = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number to get its under lying Square Value : ");
		int n = sc.nextInt();
		
		int i=1;
		for(;i<n;i++)
		{
			int p=i*i;
			String s=Integer.toString(p);
			s=s+" ";
			byte a[]=s.getBytes();
			fos.write(a);
			fos.flush();
			//if(i==100)
				//break;
		}
		fos.close();
		System.out.print("Process Done.");
	}
}