//Read Array From File
import java.io.*;
class ArrayRead{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		FileInputStream fin=new FileInputStream(new File("f9.text"));
		int x;
		while((x=fin.read())!=-1)
		{
			System.out.println("Value = "+(char)x);
		}
		fin.close();
	}
}