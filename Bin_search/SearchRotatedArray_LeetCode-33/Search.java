public class Search{

    static int bin_search(int[] list, int target, int start, int end){
        int idx = -1;

        boolean isAsc = list[start] <= list[end];

        while(start <= end){
            int mid = (start+end)/2;

            if(list[mid]==target){
                idx = mid;
                break;
            }

            if(isAsc){
                if(target < list[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > list[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return idx;
    } 

    static int RSearch(int[] nums, int target){
        int ans = -1;
        int n = nums.length;
        int lb = 0;
        int ub = n-1;
        int pivot = n-1;

        while(lb<=ub){
            int m = lb + (ub-lb)/2;
            if(m < n-1){
                if(nums[m] > nums[m+1]){
                    pivot = m;
                    break;
                }
                if(nums[lb]<=nums[m]){
                    lb = m+1;
                }else{
                    ub = m-1;
                }
            }
        }

        if(target == nums[pivot]) {
            ans = pivot;
        }
        else if(target > nums[pivot]){
            ans = bin_search(nums, target, 0, pivot-1);
        }else{
            ans = bin_search(nums, target, pivot+1, n-1);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(RSearch(arr, 3));
    }
}