import java.util.Scanner;
public class Pattern_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int n = in.nextInt();

        for(int  row = 1;  row<=n;  row++) {
            for (int  col = 1;  col <=n;  col++) {

                System.out.print(" "+ col);
                /* If you want print '*' then use above - System.out.print(" *"); */

            }
            // Taking new Line
            System.out.println();
        }
    }
}
