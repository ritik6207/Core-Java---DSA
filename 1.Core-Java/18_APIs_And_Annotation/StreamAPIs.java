import java.util.*;
import java.util.stream.*;
public class StreamAPIs {
    public static void main(String[] args) {
        
        List <Integer> list = Arrays.asList(2, 4, 6, 8, 10);

        Stream <Integer> streamData = list.stream();

        streamData.forEach(i->System.out.println(i));


        //in Stream APIs work only one time, if you use one more time give errors
        // streamData.forEach(i->System.out.println(i));
    }
}
