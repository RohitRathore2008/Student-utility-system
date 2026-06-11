package Projects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student_Utility_system {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check Even/Odd");
        System.out.println("2. Factorial");
        System.out.println("3. Sum of Digits");
        System.out.println("4. Reverse Number");
        System.out.println("5. Palindrome check");
        System.out.println("6. Multiplication table");
        System.out.println("7. Print pattern triangle ");
        System.out.println("8. Print inverted triangle");
        System.out.println("9. Exit");
        System.out.println("Enter choice : ");

        int choice = sc.nextInt();
        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int sum =0;
        int rev =0;
        int original = number;
        int multiplication = 0;



        if(choice == 1){
            if(number%2==0){
                System.out.println("Even");
            }else System.out.println("Odd");
        }else if(choice == 2){
            int factorial = 1;
            for (int i = 1; i <=number ; i++) {
                factorial = factorial*i;

            }System.out.println(factorial);

        }else if (choice==3){
            while(number>0){
                int digit = number%10;
                sum = sum+digit;
                number = number/10;
            }
            System.out.println(sum);
        }else if (choice==4){
          while(number>0){
              int digit = number%10;
              number = number/10;
              rev=rev*10+digit;

          }
            System.out.println(rev);
        }else if(choice==5){
            while(number>0){
                int digit = number%10;
                number = number/10;
                rev = rev*10+digit;

            }if(rev==original){
                System.out.println("Palindrome");
            }else System.out.println("Not a palindrome");
        }else if(choice == 6){
            for (int i = 1; i <=10 ; i++) {
                multiplication = i*number;
                System.out.println(multiplication);
            }
        }else if(choice == 7){
            for (int i = 1; i <= number ; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        }else if(choice==8){
            for (int i = 1; i <=number ; i++) {
                for (int j = i; j <=number ; j++) {
                    System.out.print("* ");

                }
                System.out.println();

            }
        }else if(choice==9){
            System.out.println("Thank you");
        }else System.out.println("Invalid input");


    }
}
