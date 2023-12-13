package ch2;

import java.util.Scanner;
/*
 Problem sets from chapter 2, how to program, 2011 late objects 
*/
public class additionStatements {


    public static void main(String[] args) {
        int c = 0;
        //int thisIsAVariable = 0;
        //int q76354 = 0;
        //int number = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int userNumber = input.nextInt();

        int value = userNumber;

        System.out.println("This is a Java program");

        System.out.printf("This is a Java%nProgram%n");

        if (value!= 7){
            System.out.println("The variable is not equal to 7");
        }
        else {
            System.out.println("Variable is equal to 7, well done!");
        }

        if (c < 7){

            System.out.println("c is less than 7");
        }

        else{

            System.out.println("c is greater than or equal to 7!");
        }


        // the following statements will calculate the product of three integers 

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter your first numbers: ");
        int x = input2.nextInt();

        System.out.println("Please enter a second number: ");
        int y = input2.nextInt();

        System.out.println("Please enter a third integer: ");
        int z = input2.nextInt();

        int result = x*y*z;

        System.out.printf("The product of the three numbers if %d%n", result);
        input2.close();
        input.close();
    }
    
}
