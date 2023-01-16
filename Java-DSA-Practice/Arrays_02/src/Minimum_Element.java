public class Minimum_Element {

    public static void main(String[] args) {

        int [] arr = {12, 34, 55, 1, 78, 80};

        System.out.println(Minimum_Element(arr));
    }

    static int Minimum_Element(int []arr){

        int min = arr[0];

        for(int i = 0; i<arr.length-1; i++){

            if(arr[i] < min){

                min = arr[i];
            }
        }

        return min;
    }
}
