public class findPostion_InfiniteArray {

    public static void main(String[] args) {

     int [] arr = {3, 5, 6, 34, 43, 56, 66, 67, 134, 233, 235, 321, 344, 367};

     int target = 66;

        System.out.println(findingRange(arr, target));

    }

    static int findingRange(int [] arr, int target){
        // first find the range
        // start with a box 2

        int start = 0;
        int end = 1;

        // condition for the target to lie in the range

        while(target > arr[end]){

            int temp = end +1;
            //double the box value

            end = end + (end - start + 1)* 2;

            start = temp;
        }

        return binary_Search(arr, target, start, end);

    }

    static int binary_Search(int[] arr, int target, int start, int end) {


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {

                return mid;

            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else {

                end = mid - 1;
            }
        }

        return -1;
    }
}