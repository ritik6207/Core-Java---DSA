import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Checked_Unchecked_Exception {
    public static void main(String[] args) {
        //if code is give error in Runtime , It is called Checked Exception
        int result = 8/0;  //in this time give ArithmeticException / by zero

        //if code is give error in Compile time , It is called Unchecked Exception

        //input form user when Scanner class is not Introduced in Java, in this time we use BufferReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String str = br.readLine();
        }
       catch (IOException e)
       {
           e.printStackTrace();
       }
    }
}
