package The_Pattren;

public class DimondPattren {
    public static void main(String[] args) {
        int n = 19;
        for(int i = 0; i < n; i++)
        {
            // X pattren
            for(int j = 0; j < n; j++)
            {
                if(i == j || i + j == (n - 1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // X pattren with boddar
            for(int j = 0; j < n; j++)
            {
                if(i == j || i + j == (n - 1) || i == 0 || j == 0 || i == n - 1 || j == n - 1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            //Diamond pattren
            for(int j = 0; j < n; j++)
            {
                if(i + j == (n - 1)/2 || i - j == (n - 1)/2 || j - i == (n - 1)/2 || i + j == (n - 1) + (n - 1)/2)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // Diamond with edg boddar
            for(int j = 0; j < n; j++)
            {
                if(i + j == (n - 1)/2 || i - j == (n - 1)/2 || j - i == (n - 1)/2 || i + j == (n - 1) + (n - 1)/2 || i == 0 || j == 0 || i == (n - 1) || j == (n - 1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            //complex diamond
            for(int j = 0; j < n; j++)
            {
                if(i + j == (n - 1)/2 || i - j == (n - 1)/2 || j - i == (n - 1)/2 || i + j == (n - 1) + (n - 1)/2 || i == 0 || j == 0 || i == (n - 1) || j == (n - 1) || i == j || i + j == (n - 1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
