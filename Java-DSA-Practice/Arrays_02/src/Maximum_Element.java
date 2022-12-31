public class Maximum_Element {

    public static void main(String[] args) {

        int arr[] = {21, 44, 56, 67, 3, 2};

        System.out.println(Max_Element(arr));
    }

    static int Max_Element(int [] arr){

        int max = arr[0];
        for(int i = 0; i< arr.length; i++) {

            if(arr[i] > max){

                max = arr[i];
            }

        }
        return max;
    }
}
