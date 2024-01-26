import java.util.Scanner;
public class OneDarray {
    public static void main(String[] args) {
      /*  int a[] = {2, 4, 2, 5, 1};
        for(int i = 0; i < a.length; i++)
        {
//            System.out.print(a);   //give this type of output [I@4dd8dc3[I@4dd8dc3[I@4dd8dc3[I@4dd8dc3[I@4dd8dc3
            System.out.print(a[i] + " ");   //
        }   */

//        int a[] = {4, 2, 5, 6, 7};
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);

//        int a[] = {2, 4, 2, 5, 1};
//        for(int i = 0; i <= 4; i++)
//        {
//            System.out.println(a[i]);
//        }

//          int a[] = new int[5];
//        a[0] = 4;
//        a[1] = 7;
//        a[2] = 3;
//        a[3] = 5;
//        a[4] = 8;
//        a[5] = 1;
//        a[6] = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
