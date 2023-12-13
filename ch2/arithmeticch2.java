package ch2;

import java.util.Scanner;

// this program takes twoo intergers and returns the square, sum of squares and difference of squares

public class arithmeticch2 {

    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);  //   scanner enables the inputing of values by user 

        System.out.print("Enter your first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter your second number:  ");
        int number2 = input.nextInt();

        int square1 = number1 * number1;

        int square2 = number2 * number2;
        
        int sumOfSquares = square1 + square2;

        int diffOfSquares = square1 - square2;

        if  (square1 >= square2){
            diffOfSquares = square1 - square2;
        }
        else {
            diffOfSquares = square2 -  square1;
        }
     
        System.out.printf("The square of %d is %d and the square of %d is %d%n", number1,square1, number2, square2); //prints the number and corresponding square
        System.out.printf("The sum of squares is %d%n", sumOfSquares);
        System.out.printf("TThe difference of squares is %d%n",diffOfSquares);

        input.close();

    }
    
}
