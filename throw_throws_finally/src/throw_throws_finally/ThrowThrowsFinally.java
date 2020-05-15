package throw_throws_finally;

class Test
{
  static void check() throws ArithmeticException
  {  
    System.out.println("Inside check function");
    throw new ArithmeticException("demo");
  }

  public static void main(String args[])
  {
    try
    {
      check();
    }
    catch(ArithmeticException e)
    {
      System.out.println("caught" + e);
    }
  }
}

public class ThrowThrowsFinally {

	public static void main(String[] args) {
		int a[] = new int[2];
	    System.out.println("out of try");
	    try
	    {
	      System.out.println("Access invalid element"+ a[3]);
	      /* the above statement will throw ArrayIndexOutOfBoundException */
	    }
	    finally
	    {
	      System.out.println("finally is always executed.");
	    }
	}

}
