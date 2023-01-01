public class Floor_Number {

    public static void main(String[] args) {

        int [] arr = {2, 3, 44, 53, 56, 78, 98};

        int target = 55;

        System.out.println(Floor_Number(arr, target));

    }

    static int Floor_Number(int [] arr, int target){

        int start = 0;
        int end = arr.length;

        while(start<=end){

            int mid = start+(end - start)/2;

            if(target == arr[mid]){

                return mid;
            }

            else if (target > arr[mid]) {

                start = mid + 1;
            }

            else{

                end = end - 1;
            }
        }

        return end;
    }
}

