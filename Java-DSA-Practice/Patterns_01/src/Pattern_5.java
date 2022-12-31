import java.util.Scanner;

public class Pattern_5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = in.nextInt();

       for(int row = 1; row<=n; row++){
           for(int col  = 1; col<=row; col++ ){

               System.out.print("* ");
           }
           System.out.println();
       }

       for(int row = 5; row>=1; row--){
           for(int col = 1; col<=row-1; col++){

               System.out.print("* ");
           }

           System.out.println();
       }
    }
}
