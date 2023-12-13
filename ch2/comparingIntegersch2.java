package ch2;
import java.util.Scanner;

public class comparingIntegersch2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        int sq = number * number;

        if (number == 100){
            System.out.printf("%d is equal to a 100\n", number);
        }
        if (number > 100){
            System.out.printf("%d is greater than a 100\n", number);
        }
        if (number < 100){
            System.out.printf("%d is less than a 100\n", number);
        }

        if (sq > 100){
            System.out.printf("%d is greater than a 100\n", sq);
        }
        if (sq == 100){
            System.out.printf("%d is greater than a 100\n", sq);
        }
        if (sq < 100){
            System.out.printf("%d is less than a 100\n", sq);
        }

        input.close();
    }
}
