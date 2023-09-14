class Test
{
public static void main(String args[])
{
for(int i=0;i<10;i++)
   {
      if(i==4)
      {
        break;
        }
        System.out.println(i);
  }
  }
  }
  // 2. 
  class Test2
{
public static void main(String args[])
{
for(int i=1;i<=10;i++)
   {
   System.out.println(i++);
      if(i>10)
        break;
  }
  }
  }
   
  //3.
  
class Test3
{
public static void main(String args[])
{
for(int i=1;i<=5;i++)
   {
     if(i<=4)
      {
     System.out.println(i++);
     }
     
        break;
  }
  }
  }
  
//4. 
class Test4
{
public static void main(String args[])
{
for(int i=1;  ;)
     {
     System.out.println(i++);
      if(i>10)
     
     
        break;
  }
  }
  }
   //5. 
    

class Test5
{
public static void main(String args[])
{
for(int i=1;  ;)
     {
       if(i>3)
       {
     System.out.println(i++);
      break;
  }
  System.out.println(i++);
  }
  }
  }    
   
   //6.
   
class Test6
{
public static void main(String args[])
{
int i=1;
for(;  ;)
     {
     System.out.println(i++);
     if(i>10)
      break;
  }
  }
  }    
  // 7.
      
class Test7
{
public static void main(String args[])
{
for(int i=1;i<=3;i++)
     {
     for(int j=0;j<=3;j++)
     {
     if(i==2&&j==2)
      break;
      System.out.println(i+"  "+j);
  }
  }
  } 
  }
  //8.
  class Test8
{
public static void main(String args[])
{
for(int i=0;i<10;i++)
   {
      if(i==5)
      {
        break;
        }
        System.out.println(i);
  }
  }
  }
/*s9.
class Test9
{
public static void main(String args[])
{
for(int i=1;  ;)
     {
      System.out.println(i++);
       if(i>=10)
       {
      break;
      continue;
  }
  System.out.println(i++);
  }
  }
  }  */
  
//10.
class Test10
{
	public static void main(String args[])
	{
		for(int i=0;i<=10;i++)
     		{
     			for(int j=0;j<=3;j++)
     			{
			     if(j==2)
			      break;
			      System.out.println(j);
  			}
  		}
  	} 
  }
  
  //11.  
class Test11
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
     		{
     			for(int j=1;j<=5;j++)
     			{
     			//System.out.println(i+"  "+j);
			     if(i==2&&j==2)
			       
			        break;
			       
			      System.out.println(i+"  "+j);
  			}
  		}
  	} 
  }
//12.
class Test12
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
     		{
     			for(int j=1;j<=100;j++)
     			{
			     if(j==5)
			       
			        break;
			       
			      System.out.println(i+"  "+j);
  			}
  		}
  	} 
  }
     
 //13.
 
 class Test13
{
	public static void main(String args[])
	{
	int j;
		for(int i=1;i<4;i++)
     		{
     			for(j=1;j<4;j++)
     			{
			     if(i*j>5)
			       
			        break;
			}       
			System.out.println(i+"  "+j);
  			
  		}
  	} 
  }
     
 //14.
 class Test14
{
	public static void main(String args[])
	{
		for(int i=1;i<=15; )
     			{
     			  System.out.println(i);
     			     i=i+1;
			     if(i==5)
			        break;
			}
  			
  		
  	} 
  }
  
     
   
     
  
  
  
