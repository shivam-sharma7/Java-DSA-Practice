public class BinarySearch_Algorithms {
    public static void main(String[] args)
    {
        System.out.println(" Hello Binary Search World!");

        int [] arr = {2, 4, 9, 10, 12, 14, 18};

        int target = 14;

        System.out.println(binary_Search(arr, target));

    }

    static int binary_Search(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start+(end- start)/2;

            if(target == arr[mid]){

                return mid;
            }

            else if(target > arr[mid]){
                start = mid + 1;
            }

            else {

                end = mid - 1;
            }
        }

        return -1;
    }
}