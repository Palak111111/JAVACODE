
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


class Fabnichi {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
    File obj=new File("f2.text");
    FileOutputStream fos =new FileOutputStream(obj);
    Scanner sc=new Scanner (System.in);
	    System.out.print("ENTER NUMBER  : ");
		int val=sc.nextInt();
		int i=1;
		int a=0;
		int b=1;
				while(i<=val)
				{
					int p=a+b;
					String st=Integer.toString(p);
					a=b;
					b=p;
					byte x[]=st.getBytes();
					i++;
					fos.write(x);
					fos.flush();
				}
    fos.close();
        }
            
            
        
        
}
