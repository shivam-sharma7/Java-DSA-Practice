import java.util.Scanner;

public class Array_Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i< arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int i = 0; i< arr.length; i++){

            //Printing our array elements
            System.out.println(" "+ arr[i]);
        }

        // Searching an element in array
        for(int i =0; i< arr.length; i++) {

            if (arr[i] == 55) {

                System.out.println("The answer is:" + arr[i]);
            }

        }

    }
}
