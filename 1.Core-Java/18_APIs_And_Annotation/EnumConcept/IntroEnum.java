package EnumConcept;
//Introduce in java 1.5 version
//enum use for constant that's means not changeable, and you can say that universal truth
//for ex:- Week name, Month name, Color name etc.
//Enum is not a class.
//Creating enum
enum Week
{
    SUN, MON, TUE, WED, THU, FRI, SAT;   //enumerators or enum instances, always define in UPPERCASE
}
public class IntroEnum {
    // Creating enum in inside the class
    enum Result
    {
        PASS, FAIL, NR;
    }
    public static void main(String[] args) {

        Week w = Week.FRI;
        System.out.println(w);

        //print index of that element
        int index = Week.FRI.ordinal();
        System.out.println(index);

        //Print all values of enums
        Week []wr =   Week.values();
        for(Week w1 : wr)
        {
            System.out.println(w1 + " " + w1.ordinal());
        }

        //Operation for inside the class enum
        Result r = Result.PASS;
        System.out.println(r);
    }
}
