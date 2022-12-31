public class Search_Range {

    public static void main(String[] args) {

        int [] arr = {45, 85, 89, 44, 90};

        int target = 85;

        int ans = search_In_Range(arr, target);
        System.out.println(ans);
    }

    static int search_In_Range(int [] arr, int target){

        if(arr.length == 0){

            return -1;
        }

        int s = 0;
        int e = arr.length;

        for(int i = s; i<e; i++){

            if(arr[i] == target){

                return 1;
            }
        }

        return -1;
    }
}
