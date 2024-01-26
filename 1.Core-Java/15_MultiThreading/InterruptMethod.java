class MyDemo implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            try
            {
                System.out.println("Focus is most Important");
                Thread.sleep(3000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread is Interrupted");
            }
        }
    }
}
public class InterruptMethod {
    public static void main(String[] args) {
        MyDemo m = new MyDemo();
        Thread t = new Thread(m);
        t.start();
        t.interrupt(); // if waited state(for ex:-sleep Method, join method or wait Method etc.)  in Run method or main method then interrupt method working otherwise not
    }
}
