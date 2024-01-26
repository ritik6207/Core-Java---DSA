public class TypeOfString {
    public static void main(String[] args) {
        String name = "Ritik";    //immutable String , when you can not change and add any string in same object
        System.out.println(name);
        name.concat("Kumar");
        System.out.println(name);

        System.out.println();

        StringBuilder name1  = new  StringBuilder("Ritik");    //Mutable String , when you change the same object
        System.out.println(name1);
        name1.append(" Kumar");
        System.out.println(name1);
    }
}
