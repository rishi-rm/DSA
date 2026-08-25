import java.util.Arrays;
public class CyclicSort{
    static void sort(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n){
            if(arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                i = 0;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}