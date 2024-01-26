package By_Extend_keyword_create_thread;
//Dependent upon the execution time, which code is executed first
import java.util.Scanner;

class Calc extends Thread
{
    public void run()
    {
        System.out.println("Calculating Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter first number");
        int num1 = sc.nextInt();                         //in this line of code take few MM Second , so executed Massage class of Thread
        System.out.println("Please Enter 2nd number");
        int num2 = sc.nextInt();  //same as
        int sum = num1 + num2;
        System.out.println("Sum of two number is : " + sum);
        System.out.println("Calculating Task End");
        System.out.println("*************************************************");
    }
}
class Massage extends Thread
{
    public void run()
    {
        System.out.println("Displaying massage task stared");
        try {
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Focus is the master of skills");
            Thread.sleep(2000);
        }
        //using Thread , we are create own time delay when we create own delay time give error, so we use Exception Handling Concept
        } catch (Exception e) {
            System.out.println("some problem");
        }
        System.out.println("Displaying massage task end");
        System.out.println("**************************************************");
    }
}
public class CreateMultipleThread {
    public static void main(String[] args) {
        System.out.println("Main Thread started");

        Calc t1 = new Calc();
        Massage t2 = new Massage();

        t1.start();
        t2.start();
    }
}
