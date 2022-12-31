import java.util.Scanner;
public class Pattern_3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();

        for(int i =1; i<=n; i++){
            // Pattern 3 is same as Pattern 4
            for(int j = 1; j<=n-i+1; j++){

                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
