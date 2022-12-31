import java.util.Scanner;

public class Main{

     public static void main(String[] args) {

         Scanner in = new Scanner(System.in);

         System.out.println("Welcome to your in our Calculator App!");

         System.out.println("Enter the first number");
         int a = in.nextInt();
         System.out.println("Enter your second number");
         int b = in.nextInt();

         System.out.println("Chose your operation : + - * /");
         char operation = in.next().charAt(0);
         int result;

         switch (operation){

             case '+':

                  result = a+b;
                 System.out.println("Addition is -> "+ result);
                 break;
             case'-':
                 result = a -b;
                 System.out.println("Substraction is -> "+ result);
                 break;

             case'*':

                 result = a * b;
                 System.out.println("Multiplication is -> "+ result);
                 break;

             case'/':

                 result = a / b;
                 System.out.println("Division is -> "+ result);
                 break;

             default:
                 System.out.println("Haha gadhe ho kya ?");
                 break;
         }
     }

 }