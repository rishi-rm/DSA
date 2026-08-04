public class Main {
    public static void main(String[] args) {
        int[] arr = new int[500];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i*5)+7;
        }

        int target = 2072;
        int start = 0;
        int end = 1;
        int mid = start + (end-start)/2;
        while(arr[end] < target){
            System.out.println(start+"\t"+end);
            int temp = start;
            start = end+1;
            // end = previous end + 2*(previous end - previous start)
            end = end + 2*(end-temp+1);
        }
    }
}
