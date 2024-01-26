import java.util.Scanner;

public class PrifixSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Plzz! Enter Squire Matrix");
            System.out.println("Enter the size of row");
            int row = sc.nextInt();
            System.out.println("Enter the size of coloumn");
            int col = sc.nextInt();
            int arr[][] = new int[row][col];
            System.out.println("Enter the elements of Matrix ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Your Matrix!");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            int sum = 0;
            System.out.println("Enter first Cordinate of matrix");
            System.out.println("Enter the row cordiate R1");
            int r1 = sc.nextInt();
            System.out.println("Enter the Col cordinate C1");
            int c1 = sc.nextInt();
            System.out.println("Your First Cordinate are : - " + "(" + r1 + " , " + c1 + ")");
            System.out.println();
            System.out.println("Enter Second Cordinate of Matrix");
            System.out.println("Enter the row cordiate R2");
            int r2 = sc.nextInt();
            System.out.println("Enter the Col cordinate C2");
            int c2 = sc.nextInt();
            System.out.println("Your Second Cordinate are : - " + " (" + r2 + " , " + c2 + ")");
            System.out.println();
            for (int i = r1; i <= r2; i++) {
                for (int j = c1; j <= c2; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println("Prifix Sum of Cordinates  " + "(" + r1 + " , " + c1 + ")" + " & " + " (" + r2 + " , " + c2
                    + ")" + " are " + sum);
        }
    }
}
