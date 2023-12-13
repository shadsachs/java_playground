package ch2;

import java.util.Scanner; // program uses class scanner


public class addition {

public static void main(String[] args) {

    // creating a scanner to obtain input from the command window

    Scanner input = new Scanner (System.in);

    System.out.printf("Enter the first integer: "); // user prompt 
    int number1 = input.nextInt(); //  reads first number from user

    System.out.printf("Enter second interger: "); // prompt for second integer
    int number2 = input.nextInt();  // reads second number from user 

    int sum = number1 + number2; // adds the two numbers together 

    System.out.printf("Sum is %d%n", sum); //display sum

    if (number1 == number2)
    {
        System.out.printf("%d == %d%n", number1,number2);
    }

    if (number1 != number2){
        System.out.printf("%d != %d%n", number1,number2);
    }
    else{

        System.out.printf("Nothing to see here!");
    }
    input.close();
}

}


