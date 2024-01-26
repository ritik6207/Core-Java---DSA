import java.util.Scanner;
//This concept only use closed the resource not handing the exception
public class TryFinallyWithResource {
    public static void main(String[] args) {
        int num = 0;
        //try with Resource , It is upgrated version of closed the resource , Now - days we are using in the place of finally block for closed the resource
        try (Scanner sc = new Scanner(System.in);)
        {
            num = sc.nextInt();
        }

        //if resource is not closed then we use finally block in Exceptional Handling
        // finally{
        //     sc.close();
        //     System.out.println("Resource leakage is closed");
        // }
        System.out.println(num);
    }
}
