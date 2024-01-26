class Demo1 implements Runnable  //Step 2, Execution Runnable
{
    public void run()
    {
        System.out.println("Child thread Execution start");   //Step 3, Execution Running
        try
        {
            Thread.sleep(3000);   //step 4, Execute Blocked(non - runnable state), if some delay going to step 2
        }
        catch (Exception e)
        {
            System.out.println("Some Error");
        }
        System.out.println("Child thread Execution Stop");   //Step 4, Execute Dead
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        Demo1 d = new Demo1();
        Thread t = new Thread(d);  //Step 1, Execute New
        t.start();  //Starting the execution of Thread , start method
    }
}
