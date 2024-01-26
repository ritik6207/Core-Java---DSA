package LambdaExpression;
//Lambda Expression only use functional interface (if only one method in interface, it is called functional interface)
//We use Lambda Expression in the place of Anonymous inner class, With the help of Lambda Expression we reduce the length of code
interface Car
{
//    void drive();     //Non-parametrized method
//    void driving(int avg);  //One parametrized method
    void dri(int avg, int ts);   //Two parametrized method
}
public class LambdaExpe {
    public static void main(String[] args) {
        //Non-Parametrized

   /*     Car c = () -> System.out.println("Driving...");   //Non-parametrized in interface and one line of code
        c.drive();
        //Many line of code
        Car d = () ->  //
        {
            System.out.println("Car is driving...");
            System.out.println("There are many type of Car...");
        };
        d.drive();

    */

        //One parametrized
    /*    Car c = avg -> System.out.println("Car is driving " + avg);
        c.driving(35);

     */

        //Two or more than two Parametrized
        Car c = (avg, ts) ->
        {
            System.out.println("Average speed of Car " + avg);
            System.out.println("Total speed of Car " + ts);
        };
        c.dri(55, 180);
    }
}
