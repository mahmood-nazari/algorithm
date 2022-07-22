import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 23, 15, 8, 4, 3, 25, 30, 34, 2, 19};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        for (int j : arr) {
            if (j == number) {
                counter++;
                System.out.println("Your number find after " + counter + " try ---->" + j);
                break;
            } else counter++;
        }
    }
}
