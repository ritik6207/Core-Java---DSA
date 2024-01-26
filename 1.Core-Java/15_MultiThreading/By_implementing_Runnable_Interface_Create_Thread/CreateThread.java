package By_implementing_Runnable_Interface_Create_Thread;

import java.util.Scanner;

class Cals implements Runnable
{
    public void run()
    {
        System.out.println("Calculating task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("Sum of two number is : " + res);
        System.out.println("Calculating task end");
        System.out.println("**********************************************");
    }
}
class Massage implements Runnable
{
    public void run()
    {
        System.out.println("Displaying Important Massage task Started");
        try
        {
            for(int i = 0; i < 4; i++)
            {
                System.out.println("Focus is the Important key of skills");
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Some error");
        }
        System.out.println("Displaying Important massage task End");
        System.out.println("***********************************************");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        System.out.println("Main Thread started");
        Cals c1 = new Cals();
        Massage m1 = new Massage();

        Thread t1 = new Thread(c1);  //Runnable Thread , passing reference variable of Clas class
        Thread t2 = new Thread(m1);   //Runnable Thread , passing reference variable of Massage class

        t1.start();
        t2.start();
    }
}
