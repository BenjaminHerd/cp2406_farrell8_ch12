// This class determines the logarithm of a number
public class FixDebugTwelve1
{
  public static void main(String[] args) throws ArithmeticException
  {
     double num = -8.8, result;
     //Try block
     try
     {
         //needs to be an error to catch it
        if(num <= 0)
           throw(new ArithmeticException());

        //Calls corresponding math module to handle logarithmic method
        result = Math.log(num);
        System.out.println("Result is " + result);
     }
     //Catch block
     //Needs to catch the exception and identify it as an error
     catch(ArithmeticException error)
     {
        System.out.println("Can't take logarithm for value of zero or lower");
     }
  }
}