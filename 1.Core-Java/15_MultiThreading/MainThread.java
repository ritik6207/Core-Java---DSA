public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        System.out.println("Before Changing or By default");
        String name = Thread.currentThread().getName();
        System.out.println("The name of Main thread is : " + name);
        System.out.println("The Priority of Main thread is : " + Thread.currentThread().getPriority());
        System.out.println();
        System.out.println("After Changing");
        Thread t = Thread.currentThread();
        t.setName("PW");
        t.setPriority(1);
        String name1 = Thread.currentThread().getName();
        System.out.println("The name of Main thread is : " + name1);
        System.out.println("The Priority of Main thread is : " + Thread.currentThread().getPriority());

        //there are two ways to create thread class :-
//        1. By extending thread class
//        2. By implementing Runnable Interface
    }
}
