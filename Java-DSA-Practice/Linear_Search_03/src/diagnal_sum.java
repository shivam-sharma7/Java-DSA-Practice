public class diagnal_sum {

    public static void main(String[] args) {

        int arr[][] = {
                {1, 3, 5},
                {23, 45, 67},
                {30, 60, 7}
        };

        int ans = diagnal_sum(arr);
        System.out.println(ans);
    }
        static int diagnal_sum(int arr[][] ){

         int sum = 0;

         for (int i = 0; i<arr.length;i++){
             for (int j = 0; j< arr.length; j++){

                 if(i == j){

                     sum += arr[i][j];
                 }
             }
         }
        return sum;
    }
}
