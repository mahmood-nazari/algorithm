import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};
        selectionSort(a);
    }

    public static void selectionSort(int[] a) {

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            int[] min = {a[i], i};
            for (int j = 0; j < a.length; j++) {
                if (j + i < a.length && j + 1 < a.length && min[0] > a[j+i]) {
                    min[0] = a[j+i];
                    min[1] = j+i;
                }
            }
            int temp = 0;
            temp = a[i];
            a[i] = min[0];
            a[min[1]] = temp;
            l.add(a[i]);

        }
        System.out.println(l);
    }
}
