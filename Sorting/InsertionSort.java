import java.util.Arrays;

public class InsertionSort{
    static void sort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int j = i+1;
            for(; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
    }
}
    public static void main(String[] args) {
         int[] arr = { 8, 1, 2, 9, 10, 43, 23, 12, 36 };

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}