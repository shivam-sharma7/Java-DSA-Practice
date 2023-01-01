import java.util.Arrays;

public class FindDublicateNumber {

    public static void main(String[] args) {

        int [] arr = {12, 45, 4, 1, 3, 1, 6};

        Arrays.sort(arr);

        for (int i = 0; i< arr.length-1; i++){

            if(arr[i]== arr[i+1]){

                System.out.println(arr[i]);

            }
        }
     }
}

