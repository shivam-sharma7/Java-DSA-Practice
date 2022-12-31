public class find_Target {

    public static void main(String[] args) {

        int [] arr = {12, 43, 2, 56, 78};

        int target = 2;

        System.out.println(target(arr, target));

    }

    static int target(int [] arr, int target){

        for(int i = 0; i< arr.length; i++){

            if(arr[i] == target){

                target = arr[i];
            }
            // return my target value
            return target;
        }

        // return -1 if you not get target value

        return -1;
    }
}
