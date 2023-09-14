//storing Premitive Type Data
import java.io.*;
class Test
{
	public static void main(String args[]) throws FileNotFoundException,IOException
	{
			File fobj=new File("F10.text");
			FileOutputStream fos=new FileOutputStream(fobj);
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeByte(56);
			dos.writeInt(156);
			dos.writeDouble(123.45);
			dos.writeBoolean(true);
			dos.close();
			fos.close();
			DataInputStream dis=new DataInputStream(new FileInputStream(fobj));
			System.out.println("VALUE = "+dis.readByte());
			System.out.println("VALUE = "+dis.readInt());
			System.out.println("VALUE = "+dis.readDouble());
			System.out.println("VALUE = "+dis.readBoolean());
			dis.close();
	}
}