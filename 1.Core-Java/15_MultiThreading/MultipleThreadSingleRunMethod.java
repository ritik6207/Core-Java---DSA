import java.util.Scanner;
//MultiThreading using single Run Method
class MyThread1 extends Thread
{
    public void run()
    {
        String tName = Thread.currentThread().getName();
        if(tName.equals("Cals"))
        {
            calc();
        }
        else {
            importantMassage();
        }
    }
    public void calc()
    {
        System.out.println("Calculate task started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int num2 = sc.nextInt();
        int res = num1  + num2;
        System.out.println("Sum of two number : " + res);
        System.out.println("Calculate task end");
        System.out.println("*************************************");
    }
    public void importantMassage()
    {
        System.out.println("Displaying Important Massage task Started");
        try
        {
            for(int i = 0; i < 4; i++)
            {
                System.out.println("Focus is the important key of Skills");
                Thread.sleep(2000);
            }
        }
       catch (Exception e)
       {
           System.out.println("Some error");
       }
        System.out.println("Displaying Important Massage task End");
        System.out.println("****************************************");
    }
}
public class MultipleThreadSingleRunMethod {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread1 thread2 = new MyThread1();

        //changing name of the Thread
        thread1.setName("Cals");
        thread2.setName("ImportantMassage");

        //Resister Thread Scheduler
        thread1.start();
        thread2.start();

    }
}
