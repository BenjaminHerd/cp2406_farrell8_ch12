// Catch exceptions for array index out of bounds
// or dividing by 0 
import javax.swing.*;
public class FixDebugTwelve3
{
   public static void main(String[] args) 
   {
      String inStr;
      int num, result;
      int[] array = {12, 4, 6, 8};
      inStr = JOptionPane.showInputDialog(null, "Enter a number ");
      num = Integer.parseInt(inStr);
      try
      {
         for(int x = 0; x < array.length; ++x)
         {
            result =  array[x] / num;
            JOptionPane.showMessageDialog(null, "Result of division is " + result);
            result = array[num];
            JOptionPane.showMessageDialog(null, "Result accessing array is " + result);
         }
      }
      //Catching error of dividing by 0
      catch(ArithmeticException error)
      {
          JOptionPane.showMessageDialog(null, "Arithmetic error - division by 0");   
      }
      //Needs to be IndexOutOfBoundsException error to catch input is outside the scope of the array
      catch(IndexOutOfBoundsException error)
      {
         JOptionPane.showMessageDialog(null, "Index error - subscript out of range");
      }
   }
}