//When we have multiple Thread but one Resource, in this case we are using Synchronized keyword to Handle the Thread
//Synchronized keyword use two-ways:-
//1. using in Run method
//2. using in particular code of block


//1. Using in Run Method
/*
class Car implements Runnable
{
    synchronized public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Got into Cat to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
    }
}

 */
//2. Using in particular code of block
class Car implements Runnable
{
    public void run()
    {
        try {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(2000);
            synchronized (this)  //using in particular code of block
            {
                System.out.println(Thread.currentThread().getName() + " Got into Cat to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
            }
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
    }
}
public class SynchronizedKeyword {
    public static void main(String[] args) {
        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();
    }
}
