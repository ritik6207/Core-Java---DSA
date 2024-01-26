public class TryCatch {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 0;  //for try block value of num2 is greater than zero
        int result = 0;
        //if divide by zero then throws Exception and print 'catch' block otherwise 'try' block
        try
        {
            result = num1 / num2;
            System.out.println("In try block");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong.."  + "\n" + "Exception is = " + e);
        }
        System.out.println("Result is " + result);
        System.out.println("Successful run the code...");
    }
}
