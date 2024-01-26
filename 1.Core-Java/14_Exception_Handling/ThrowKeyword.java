import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;
        try
        {
            if (num2 < 0)
            {
                //We can create an object SubPackage of Exception
//                Exception e = new ArithmeticException();
                //Create an object of Exception
                Exception e = new Exception("Plzz! Enter Positive number");  //in this Exception object we can pass the massage in the form of string
                throw e;   //throw keyword is throw the exception in catch block
            }
            else {
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch (Exception e)
        {
            System.out.println("Enter a valid number " + "\n" + e);
        }
    }
}
