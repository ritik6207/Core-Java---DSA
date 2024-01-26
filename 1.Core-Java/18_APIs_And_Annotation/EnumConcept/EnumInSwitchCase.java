package EnumConcept;

enum Result1
{
    PASS, FAIL, NR;
}
public class EnumInSwitchCase {
    public static void main(String[] args) {

        Result1 res = Result1.FAIL;
        switch (res)
        {
            case PASS :
                System.out.println("Passed!");
                break;
            case FAIL:
                System.out.println("Failed!");
                break;
            case NR:
                System.out.println("Not Result");
            default:
                System.out.println("Not matched");
        }
    }
}
