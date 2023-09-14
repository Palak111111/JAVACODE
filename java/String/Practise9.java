public class Practise9
{
	public static void main(String args[])
	{
	  String s1="PALAK";
	  String s2=new String("palak");
	    System.out.println("LOWER CASE = "+s1.toLowerCase());  // palak
		 System.out.println("UPPER CASE  = "+s2.toUpperCase()); // PALAK
		   System.out.println("INDEX OF = "+s2.indexOf('v'));   // -1 
		    System.out.println("INDEX OF = "+s1.indexOf('K'));			//  4
	        System.out.println("LAST INDEX OF = "+s1.lastIndexOf('K'));  // 4
			 System.out.println("LAST INDEX OF = "+s2.lastIndexOf('a'));   // 3
			   System.out.println("INDEX OF = "+s1.indexOf('K'));
	
	
	}
}