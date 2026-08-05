class Solution {
    static int peakIndexInMountainArray(int[] arr) {
        int res = -1;

        int start = 1;
        int end = arr.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid+1]){
                res = mid;
                end = mid-1;
            }else{
                start=mid+1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 4, 6, 10, 13, 15, 11, 9, 7 };
        System.out.println(peakIndexInMountainArray(arr));
    }
}