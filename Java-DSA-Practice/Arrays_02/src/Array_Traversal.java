public class Array_Traversal {

    public static void main(String[] args) {

        int arr[] = {1, 2, 34, 56, 43, 32};


      /*  This is method 1

      for(int i = 1; i< arr.length; i++){

            System.out.println(arr[i]);
        }
        */

        for(int e : arr){

            System.out.println(e);
        }
    }
}
