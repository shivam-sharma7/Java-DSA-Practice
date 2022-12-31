public class Reverse_Array {

    public static void main(String[] args) {

        int arr[] = {23, 56, 76, 88, 90};

        reverse_Array(arr);
    }

    static void reverse_Array(int arr[]){

        for(int i = arr.length-1; i>=0; i--){

            System.out.println(arr[i]);
        }
    }
}
