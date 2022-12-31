public class return_index {

    public static void main(String[] args) {

        int [] arr = {12, 43, 56, 76, 3};

        int target = 76;

        System.out.println(index_return(arr, target));

    }

    static int index_return(int [] arr, int target){

        for (int i = 0; i<arr.length; i++){

            if(arr[i]== target){

                return i;
            }
        }

        return -1;
    }
}
