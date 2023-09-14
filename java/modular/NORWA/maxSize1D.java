class Sum
{
  public void sum(int a[])
  {
    
	
	for(int i=0;i<a.length;i++)
	{
	    System.out.println("a["+i+"] = "+a[i]);
	}
  }
  
  public static void main(String args[])
  {
    Sum ob=new Sum();
	int a[]=new int[5];
	System.out.println("max size of array="+a.length);
	a[0]=9;
	a[1]=3;
	a[2]=6;
	a[3]=5;
	a[4]=7;
	ob.sum(a);

  }


}
