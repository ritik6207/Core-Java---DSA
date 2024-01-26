import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.io.*;

public class MoreStreamAPIs {
    public static void main(String[] args) {
        
        List <Integer> list = Arrays.asList(8, 6, 4, 7, 9, 2);

        Stream <Integer> streamData = list.stream();

        /*
        //count data in a list
        long cnt = streamData.count();
        System.out.println(cnt);
*/
        /*
        //Filter data
        Stream<Integer> filData = streamData.filter(n->n%2==0);
        //sorted data
        Stream<Integer> streamSorted = filData.sorted();

        //Operation
        Stream<Integer> streamMap = streamSorted.map(n->n*2);
        streamMap.forEach(i->System.out.println(i));
        */

        //above operation work in one line
        Stream<Integer> finalData = streamData.filter(n->n%2==0).sorted().map(n->n*2);
        finalData.forEach(System.out::println);
    }
}
