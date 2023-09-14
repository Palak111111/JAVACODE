import java.io.*;

class MergeFiles
{
	public static void main(String args[])throws FileNotFoundException,IOException
	{
	    File f1 = new File("F2.text");
		File f2 = new File("F3.text");
		
		if(f1.exists() && f2.exists())
		{
			FileInputStream fin1= new FileInputStream(f1);
			FileInputStream fin2= new FileInputStream(f2);
			FileOutputStream fos = new FileOutputStream("Mum.text",true);
			
			int x;
			while((x=fin1.read())!=-1)
			{
				fos.write(x);
				fos.flush();
			}
			fin1.close();
			fos.write('\n');
			
			while((x=fin2.read())!=-1)
			{
				fos.write(x);
				fos.flush();
			}
			fin2.close();
			fos.close();
			System.out.println("Process Done...");
		}
		else
		{
			System.out.println("File Does't Exist...");
			System.out.println(fos.list());
			System.out.println(f2.list());
		}
	}
}