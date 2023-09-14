package MyPack1;
public class Book
{
 String author,name,language;
 double price;
 int yearofpublish;
 
  public Book()
  {
  
  
  }
   public Book(String author,String name,String language,double price,int yearofpublish )
   {
    this.author=author;
	this.name=name;
	this.language=language;
	this.price=price;
	this.yearofpublish=yearofpublish;
 
   }
  public String author()
  {
	return author;  
	  
  }
  public String name()
  {
	return name;  
	  
  }
  public String language()
  {
	return language;  
	  
  }
  public double price()
  {
	return price;  
	  
  }
  public int year()
  {
	return yearofpublish ; 
	  
  }
  
}
