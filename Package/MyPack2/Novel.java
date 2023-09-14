package MyPack2;
import MyPack1.Book;
public class Novel extends Book
{
	String genera;
	 int page;
	 public Novel()
	 {
	 
	 }
	 
    public Novel(String author,String name,String language,double price,int yearofpublish,String genera,int page)
	{
	  super(author,name,language,price,yearofpublish);
      this.genera =genera;
      this.page=page;	  
		
	}
	
	public String genera()
	{
		return genera;
		
	}
	public int pages()
	{
		return page;
	}
	
}
