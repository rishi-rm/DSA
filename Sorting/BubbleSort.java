import java.util.Arrays;

public class BubbleSort{

    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 7, 19, 21};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}