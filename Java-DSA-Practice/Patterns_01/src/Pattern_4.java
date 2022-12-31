import java.util.Scanner;

public class Pattern_4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();

        for(int row = 1; row<=n; row++){
            //Pattern 4 is same as Pattern 3 but i use here col = n+1-row
            for(int  col = 1;  col<=n+1-row;  col++){

                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
