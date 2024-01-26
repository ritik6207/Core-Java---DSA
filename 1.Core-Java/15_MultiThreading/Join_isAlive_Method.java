class Example implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 0; i < 3; i++)
            {
                System.out.println("Focus is most Important for Expert");
                Thread.sleep(3000);
            }
        }
        catch (Exception e)
        {
            System.out.println("Some Problem");
        }
    }
}
public class Join_isAlive_Method {
    public static void main(String[] args) throws Exception  //Here Ducking the Exception
    {
        System.out.println("Main Thread Started");

        Example e = new Example();
        Thread t1 = new Thread(e);
        System.out.println(t1.isAlive());   //false
        t1.start();
        System.out.println(t1.isAlive());   //true
        t1.join();   //Join method use for continues working Example Class ,

        System.out.println("Main Thread finished work");
    }
}
