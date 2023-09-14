
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


class IOpackage {
    public static void main(String args[]) throws FileNotFoundException, IOException
    {
    File obj=new File("f1.text");
    FileOutputStream fos =new FileOutputStream(obj);
    //Scanner sc=new Scanner (System.in);
    fos.write(65);
    fos.flush();
    fos.close();
        }
            
            
        
        
}
