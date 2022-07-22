public class BST {

    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100, 150, 200, 600, 610, 720, 1024, 2045, 6547, 10000};
        bst(arr, 0, arr.length, (arr.length - 1) / 2, 6547);
    }

    public static void bst(int[] arr, int min, int max, int center, int input) {
        if (input == arr[center]) {
            System.out.println(arr[center] + " == " + input);
        } else if (input > arr[center]) {
            min = center + 1;
            center = (((max + min)) / 2);
            bst(arr, min, max, center, input);
        } else if (input < arr[center]) {
            max = center - 1;
            center = ((max + min) / 2);
            bst(arr, min, max, center, input);
        }
    }
}
