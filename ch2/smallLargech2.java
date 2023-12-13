package ch2;
import java.util.Scanner;
//this application takes user numbers and returns sum, average, product and smallest/largest of the numbers 


public class smallLargech2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // obtaining 3 integers 
        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter your third number: ");
        int number3 = input.nextInt();

        // sum calculattion
        int sum = number1 + number2 + number3;

        // average calculation
        int avg = sum/3;

        // product calculation
        int product = number1 * number2 * number3;

        //  checking for the largest number 
        if (number1 > number2){
            if (number1 > number3){
                System.out.printf("%d is the largest number\n", number1);
            }
        }

        if (number3 > number2){
            if (number3 > number1){
                System.out.printf("%d is the largest number\n", number3);
            }
        }

        if (number2 > number1){
            if (number2 > number3){
                System.out.printf("%d is the largest number\n", number2);
            }
        }
        // checking the smallest number 
        if (number1 < number2){
            if (number1 < number3){
                System.out.printf("%d is the smallest number\n", number1);
            }
        }

        if (number2 < number3){
            if (number2 < number1){
                System.out.printf("%d is the smallest number\n", number2);
            }
        }

        if (number3 < number2){
            if (number3 < number1){
                System.out.printf("%d is the smallest number\n", number3);
            }
        }
        // displaying the product and averages
        System.out.printf("The product is %d\n",  product);
        System.out.printf("The average is %d\n",  avg);

        input.close();

    }
}
