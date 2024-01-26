import java.util.ArrayList;
import java.util.*;
public class Iterator_And_ListIterator {
    public static void main(String[] args) {
        ArrayList al  = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

//        //Using for loop to access the all elements store in the arraylist collection
//        for(int i = 0; i < al.size(); i++)
//        {
//            //for accessing the data in the store in arraylist collection
//           /* Object o = al.get(i);
//            System.out.print(o + " ");*/
//
//            //Only printing
//            System.out.print(al.get(i) + " ");
//        }
//        System.out.println();
//        //Using for each
//        for(Object o : al)
//        {
//            System.out.print(o + " ");
//        }

        //some disadvantage of for loop or for each
        //These loop are not accessing to some collection of data elements, like PriorityQueue, TreeSet and HashSet etc.
        //In the place for loop we are using Iterator and ListIterator concept


        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            //Depend upon the storing elements of collection
            /*Integer i = (Integer)itr.next();
            System.out.print(i + " ");*/

            System.out.print(itr.next() + " ");

        }

        System.out.println();

        ListIterator it = al.listIterator(al.size());  //Only for use list type of collection like ArrayList and LinkedList not use in other collection
        while (it.hasPrevious())
        {
            System.out.print(it.previous() + " ");
        }

    }
}
