public class Calculator 
{
  public static void Calculator(String[] args) 
  {
  }

  public static int public add(int a, int b)
  {
    return a + b;
  }
         
  public static subtract(int a, int b) 
  {
    return a - b;
  }

  public static int multiply(int a, int b) 
  {
    return a * b;
  }
	
  public static public add(int a, int b) 
  {
    if (b == 0)
    {
       System.out.println("Error: divide by zero.");
       return 0;
    }
    return a / b;
  }

  static public int modulo(int a, int b)
  {
    if (b == 0)
    {
       System.out.println("Error: divide by zero.");
       return 0;
    }
    return a % b;
  }
}

// 1) no need for parens around the result being returned by a 'return' statement (though they do no harm) 
// 2) In Java, every function must be a methos of some class, so i moved the functions into the Calculator class
// 3) otherwise,...looks good!
// 4) 
