class AddArray
{
    public  int add(int[] numbs)
    {
        int sum = 0;
        for(int n : numbs)   //Enhanced for loop
        {
            sum += n;
        }
        return sum;
    }
}
public class AnonymousArray {
    public int sum(int x, int y)
    {
        return  x + y;
    }
    public static void main(String[] args) {
        AddArray obj = new AddArray();
        int result = obj.add(new int[] {3, 4, 6, 15, 7, 9});   //in this line using Anonymous Array , if you are using one time array than you can use Anonymous array
        System.out.println("sum of all elements of array " + result);
        AnonymousArray a = new AnonymousArray();
        int res = a.sum(5, 8);
        System.out.println("Sum of two number " + res);
    }
}
