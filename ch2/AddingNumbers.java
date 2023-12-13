// addition program that inputs numbers and displays their sum
import java.util.Scanner; // scanner object to read inputs


public class AddingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // creates new Scanner object instance called input which takes input from the system. 

        System.out.print("Please enter a number: "); // prompt asking user for number
        int firstNumber = input.nextInt();

        System.out.print("Please enter a second number: "); // prompt for second number
        int secondNumber = input.nextInt(); 

        int sumOfTwoNumbers = firstNumber + secondNumber; 

        System.out.printf("Sum of your two numbers is: %d%n", sumOfTwoNumbers);

        input.close();
    }
    
}
