import java.util.*;
import java.util.ArrayList;
import java.util.function.Consumer;
public class ForEachMethod {
    public static void main(String[] args) {
        
        //First method to print array list
        // List<Integer> list1 = new ArrayList<Integer>();
        // list1.add(2);
        // list1.add(4);
        // list1.add(6);
        // list1.add(8);
        // System.out.println(list1);


        //Second method to print array list
        List <Integer> list2 =  Arrays.asList(2, 4, 6, 8);
        // System.out.println(list2);

        //Third method to print array list using for each 
        // for(Integer i : list2)
        // {
        //     System.out.println(i);
        // }
        

        //Fourth method to print arraay list using Lambda expression
        // list2.forEach(i->System.out.println(i));    //this method of default 


        //Five method to print array list using anonymous class
        // Consumer <Integer> cons = new Consumer <Integer>()
        // {
        //     @Override
        //     public void accept(Integer i)
        //     {
        //         System.out.println(i);
        //     }
        // };
        // list2.forEach(cons);
        

        //6th method ot implements forEach method
        // Consumer <Integer> cons = (Integer i) ->
        // {
        //     System.out.println(i);
        // };
        // list2.forEach(cons);


        //7th method to implements forEach method
        Consumer <Integer> cons = i->System.out.println(i);
        list2.forEach(cons);
    }
}
