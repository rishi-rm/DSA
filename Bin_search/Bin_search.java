import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Bin_search{
    static int search(ArrayList <Integer> list, int target){
        int idx = -1;

        int start = 0;
        int end = list.size()-1;

        boolean isAsc = list.get(start) < list.get(end);

        while(start <= end){
            int mid = (start+end)/2;

            if(list.get(mid)==target){
                idx = mid;
                break;
            }

            if(isAsc){
                if(target < list.get(mid)){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > list.get(mid)){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }

        return idx;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(91, 75, 43, 8, 0));
        System.out.print("Enter: ");
        int target=sc.nextInt();
        System.out.println(search(list, target));

        sc.close();
    }
}