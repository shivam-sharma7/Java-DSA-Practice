import java.util.Arrays;


public class Selection_Sort {

    public static void main(String[] args) {

        // Selection sort is select greater or min element and put it at right index using swap.

        int arr[] = {4, 1, 2, 3};

        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection_sort(int arr[]){

    for (int i = 0; i<arr.length; i++){
        
        int last = arr.length- i - 1;
        
        // find the greater element in arr
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
    }
}

 static void swap(int arr[], int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
}

  static int getMaxIndex(int[] arr, int start, int end) {

        int max = start;

        for (int i = start; i<=end; i++){

            if (arr[max] < arr[i]){

                max = i;
            }
        }
      return max;
    }
}
