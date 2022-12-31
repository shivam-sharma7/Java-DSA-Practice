public class introduction {

    public static void main(String[] args) {

        int [][] arr = {
                {1, 23, 45},
                {32, 4, 67},
                {10, 66, 6}
        };

        for (int row = 0; row<arr.length; row++){
            for(int col = 0; col< arr.length; col++){

                System.out.println(" "+ arr[row][col]);
            }
        }
    }
}
