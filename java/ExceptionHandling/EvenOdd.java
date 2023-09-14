class EvenOddException extends Exception 
{
	   public EvenOddException() {}
  
    public EvenOddException(String msg) {
        super(msg);
    }
}

class Test 
{
	public static void main(String[] args) 
	{
	try {
            int number=Integer.parseInt(args[0]);
        if (number < 0) 
		{
            throw new EvenOddException("Number must be a positive integer.");
        }

        else if (number % 2 == 0) 
		{
            System.out.println(number + " is an even number.");
        } else 
		{
            System.out.println(number + " is an odd number.");
        }
    }

     catch (EvenOddException ref) 
		{
            System.out.println("Error: " + ref.getMessage());
        }
    }
}
