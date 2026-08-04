// in a sorted array find the smallest number that is greater than or equal to TARGET

public class FindCeiling {

    static int get_ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int res = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(arr[mid] >= target){
                res = arr[mid];
                end = mid-1;
            }else start = mid+1;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 10, 15, 58, 61 };
        int target = 9;
        System.out.println(get_ceiling(arr, target));
    }
}