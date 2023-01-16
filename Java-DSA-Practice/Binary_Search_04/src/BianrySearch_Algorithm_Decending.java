public class BianrySearch_Algorithm_Decending {

    public static void main(String[] args) {

        int [] arr = {12, 9, 6, 5, 3, -1};

        int target = 9;

        System.out.println(binary_search(arr, target));

    }

     static int binary_search(int [] arr, int target) {

        int start = 0;
        int end = arr.length-1;

        while (start<=end){

            int mid = start+(end-start)/2;

            if(target== arr[mid]){

                return mid;
            }
            else if (target > arr[mid]) {

                end = mid - 1;
            }

            else {

                start = mid + 1;
            }
        }

        return -1;
     }
}
