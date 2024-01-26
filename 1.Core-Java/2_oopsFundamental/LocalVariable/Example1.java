package LocalVariable;

public class Example1 {
    public static void main(String[] args) {
        int i = 0;
        for(int j = 0; j <= 3; j++)
        {
            i = i + j;
        }
//        System.out.println(j);  cannot find symbol
//        symbol:   variable j
    }
}
