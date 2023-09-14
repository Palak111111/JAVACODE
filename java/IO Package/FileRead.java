 import java.io.*;
class TestRead{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
		FileInputStream fin=new FileInputStream(new File("f1.txt"));
		int x=fin.read();
		fin.close();
		System.out.println((char)x);
		FileOutputStream fos=new FileOutputStream(new File("f1.txt"),true);
		fos.write(65);
		//fos.write()
		fos.flush();
		fos.close();
	}

}