//Series of Prime Numbers

import java.io.*;
import java.util.Scanner;

class IO
{
	public static void main(String args[]) throws IOException
	{
		File ob = new File("f4.txt");
		FileOutputStream fos = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number to get its under lying Prime Numbers : ");
		int n = sc.nextInt();
		int i=0,count=0;
		for(i=2;i<n;i++)
		{
		    int temp=0;
			for(int j=2;j<=i;j++)
			{
			    if(i%j==0)
					temp++;
			}
			if(temp==1)
			{
				String s=Integer.toString(i);
				s=s+" ";
				byte a[]=s.getBytes();
				count++;
				fos.write(a);
			}
			//if(count==100)
				//break;
		}
		
		fos.close();
		System.out.print("Process Done.");
	}
}