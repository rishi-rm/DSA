import java.util.Arrays;

public class SelectionSort {

    static void sort(int[] arr) {
        int n = arr.length - 1;

        int i = 0;
        while (i < arr.length) {

            // find the greatest element and put it at the end
            int g = 0;
            for (int j = 1; j <= n; j++) {
                if (arr[j] > arr[g])
                    g = j;
            }
            int temp = arr[g];
            arr[g] = arr[n];
            arr[n] = temp;
            n--;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 9, 10, 43, 23, 12, 36 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}