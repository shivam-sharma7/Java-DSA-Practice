public class search_range {

    public static void main(String[] args) {

        int [] arr = {21, 43, 1, 45, 77, 54, 9};

        int target = 77;

        System.out.println(range(arr, target, 6,1));

    }

    static int range(int [] arr, int target, int start, int end){

        for(int i = start; start<=end; i++){

            if (arr[i] == target){

                target = arr[i];
            }
            return target;
        }

        return -1;

    }
}
