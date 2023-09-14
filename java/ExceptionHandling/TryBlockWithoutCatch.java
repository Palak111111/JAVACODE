class TryBlockWithoutCatch 
{
     public static void main(String[] args) {
	 int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
      try {
	    int c=a/b;
		System.out.println(c);
         System.out.println("Try Block");
      } 
	  finally{
         System.out.println(" DO NOT ENTER B AS ZERO..... ");
      }
   }
}