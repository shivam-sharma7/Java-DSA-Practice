import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {

        int arr[] = {5, 4, 3, 2, 1};

        Bubble_Sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void Bubble_Sort(int arr[]){

        for (int i = 0; i<arr.length; i++){
            for (int j = 1; j<arr.length-i;  j++){

                if(arr[j] < arr[j-1]){
                  //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
