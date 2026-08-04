// find start and end indices of TARGET
public class SearchRange{
    static int[] search_range(int[] nums, int target){
        int target_start = -1;
        int target_end = -1;
        
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                target_start = mid;
                end = mid-1;
            }else{
                if(target < nums[mid]){
                end = mid-1;
                }else start = mid+1;
            }
        }

        start = 0;
        end = nums.length;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                target_end = mid;
                start = mid+1;
            }else 
                end = mid-1;
        }

        int[] ans = {target_start, target_end};
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,8,8,8,10};
        int target = 8;

        int[] ans = search_range(nums, target);
        for(int x: ans) System.out.println(x);
    }
}