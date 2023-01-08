public class findPeak {

    public static void main(String[] args) {

        int [] arr = {0, 1, 0};


        System.out.println(find_Peak(arr));
    }

    static int find_Peak(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start< end){

            int mid = start +(end- start)/2;

            if(arr[mid] > arr[mid+1]){

                end = mid;
            }
            else {

                start = mid +1;
            }
        }
        return start;
    }
}
