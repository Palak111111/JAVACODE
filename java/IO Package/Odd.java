import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


class Odd {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
    File obj=new File("f10.txt");
    FileOutputStream fos =new FileOutputStream(obj);
    Scanner sc=new Scanner (System.in);
	    System.out.print("ENTER NUMBER  : ");
		int n=sc.nextInt();
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
			{
				String s=Integer.toString(i);
				s=s+" ";
				byte a[]=s.getBytes();
				fos.write(a);
				fos.flush();
			}
			i++;
		}
		fos.close();
		System.out.print("Process Done.");
	}
}