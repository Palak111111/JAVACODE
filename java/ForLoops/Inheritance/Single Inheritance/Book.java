class Book
{
 String author,name,language;
 double price;
 int yearofpublish;
 public void setData(String author,String name,String language,double price,int yearofpublish )
 {
    this.author=author;
	this.name=name;
	this.language=language;
	this.price=price;
	this.yearofpublish=yearofpublish;
 
 }
  public String getAuthor()
  {
	return author;  
	  
  }
  public String getName()
  {
	return name;  
	  
  }
  public String getLanguage()
  {
	return language;  
	  
  }
  public double getPrice()
  {
	return price;  
	  
  }
  public int getYear()
  {
	return yearofpublish ; 
	  
  }
  
}
class Novel extends Book
{
	private String n,genera;
	private int page;
    public void setData(String author,String name,String language,double price,int yearofpublish,String n,String genera,int page)
	{
	  this.setData(author,name,language,price,yearofpublish);
      this.n=n;
      this.genera =genera;
      this.page=page;	  
		
	}
	public String getN()
	{
		return n;
	}
	public String getGenera()
	{
		return genera;
		
	}
	public int getPage()
	{
		return page;
	}
	
}
 class Test
 {
	public static void main(String args[])
	{
		Novel ob=new Novel();
		ob.setData ("KK Raman","GOLDEN AXE ","Hindi/English",200,1945,"Abc","MOral",240);
		System.out.println("NAME OF THE BOOK="+ob.getName());
		System.out.println("NAME OF THE AUTHOR="+ob.getAuthor());
		System.out.println("LANGUAGE OF BOOK="+ob.getLanguage());
		System.out.println("GENERA OF BOOK="+ob.getGenera());
		System.out.println("PAGES ="+ob.getPage());
		System.out.println("PRICE="+ob.getPrice());
		System.out.println("YEAR OF PUBLISH ="+ob.getYear());
		
	}
	 
 }
