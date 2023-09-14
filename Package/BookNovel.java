import MyPack1.Book;
import MyPack2.Novel;
import java.util.Scanner;
class Test
 {
	public static void main(String args[])
	{
	  Scanner sc=new Scanner (System.in);
	    String author,name,language,genera;
		double price;
		int yearofpublish,pages;
		
		System.out.print("NAME OF THE BOOK = ");
		name=sc.nextLine();
		System.out.print("NAME OF THE AUTHOR = ");
		author=sc.nextLine();
		System.out.print("LANGUAGE OF THE BOOK = ");
		language=sc.nextLine();
		System.out.print("GENERA OF THE BOOK = ");
		genera=sc.nextLine();
		System.out.print("PRICE OF THE BOOK = ");
		price=sc.nextDouble();
		System.out.print("YEAR OF PUBLISH = ");
		yearofpublish=sc.nextInt();
		System.out.print("PAGES IN THE BOOK = ");
		pages=sc.nextInt();
		
		
		Novel ob=new Novel(author,name,language,price,yearofpublish,genera,pages);
		System.out.println("----------------------------------------------------------------------------------------");
		
        System.out.println("NAME OF THE BOOK="+ob.name());
		System.out.println("NAME OF THE AUTHOR="+ob.author());
		System.out.println("LANGUAGE OF BOOK="+ob.language());
		System.out.println("GENERA OF BOOK="+ob.genera());
		System.out.println("PAGES ="+ob.pages());
		System.out.println("PRICE="+ob.price());
		System.out.println("YEAR OF PUBLISH ="+ob.year());
		
		System.out.println("----------------------------------------------------------------------------------------");
	}
}