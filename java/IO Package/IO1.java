//How take users input
import java.io.*;
import java.util.Scanner;

class IO
{
	public static void main(String args[]) throws IOException
	{
		File ob = new File("f1.txt");
		FileOutputStream fos = new FileOutputStream(ob);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Numeric Value : ");
		int val = sc.nextInt();
		
		fos.write(val);
		fos.flush();
		fos.close();
		System.out.print("Process Done.");
	}
}