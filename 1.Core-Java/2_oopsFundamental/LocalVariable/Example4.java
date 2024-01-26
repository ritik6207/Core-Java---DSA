package LocalVariable;

public class Example4 {
    public static void main(String[] args) {
        int x;
        if(args.length > 0)
        {
            x = 10;
        }
//        System.out.println(x);     variable x might not have been initialized
    }
}
