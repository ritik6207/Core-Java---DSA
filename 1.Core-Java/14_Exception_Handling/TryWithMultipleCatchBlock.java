public class TryWithMultipleCatchBlock {
    public static void main(String[] args) {
        int a = 23;
        int b = 2;
        int result = 0;
        int values[] = {2, 1, 4, 7, 3};
        String name = null;
        try
        {
            result = a / b;
            System.out.println(values[7]);
            int val = name.length();
        }
        catch (ArithmeticException e)
        {
            System.out.println("can not divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(values[values.length-1]);
            System.out.println("Stay in your limits");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..." + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
