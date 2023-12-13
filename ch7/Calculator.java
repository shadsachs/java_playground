/*

In this project, I will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

1 - Add two integers
2 - Subtract two integers
3- Multiply two integers
4 - Divide two integers
5 - Apply the modulo operator on two integers

Created by Shad Sachikonye 

*/

public class Calculator {

    //constructor 

    public Calculator(){

    }

    //public add() method that returns int 

    public int add(int a, int b){


        int sum = a + b;


        return sum; 
    }


    // subtract method 

    public int subtract(int a, int b){

        int difference = a - b; 

        return difference;
    }

    // multiply method 

    public int multiply(int a, int b){

        int product = a * b;

        return product;
    }

    //divide method 
    public int divide(int a, int b){

        int quotient = a / b;
  
        return quotient;
    }


    // modulo function
    public int modulo(int a, int b){

        int remainder = a % b;

        return remainder;
    }

    //main function
    public static void main(String [] args){


        // calculator object myCalculator 
        Calculator myCalculator = new Calculator(); 

        // call add method using 5 and 7
        System.out.println("\n"+ myCalculator.add(5, 7) + "\n");

        // call subtract method 
        System.out.println("\n"+ myCalculator.subtract(45, 11) + "\n");

        // call divide method 
        System.out.println("\n"+ myCalculator.divide(600, 11) + "\n");


        // call multiplication method 
        System.out.println("\n"+ myCalculator.multiply(20, 6) + "\n");

        //call modulo operator 
        System.out.println("\n"+ myCalculator.modulo(18, 4) + "\n");

    }
    
}
