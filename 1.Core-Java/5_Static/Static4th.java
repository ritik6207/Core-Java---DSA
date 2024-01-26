import java.util.Scanner;

class Farmer
{
    int principalAmount;
    float timeDuration;
    static float rateOfInterst;
    float simpleInterst;
    static
    {
        rateOfInterst = 5.6f;
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount , Required of Farmer");
        principalAmount = sc.nextInt();
        System.out.println("Enter time Duration, Required of Farmer");
        timeDuration = sc.nextFloat();
    }

    void compute()
    {
        simpleInterst = (principalAmount * timeDuration * rateOfInterst) / 100;
    }

    void display()
    {
        System.out.println("Simple Interst is " + simpleInterst);
    }
}
public class Static4th {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.display();
    }
}
