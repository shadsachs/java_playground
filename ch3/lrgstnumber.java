package ch3;

import java.util.Scanner;

/*

this program determines the largest value in a given input of numbers 

we will permit the entering of 10 integers and use a counter to count how many  numbers have been entered 

every new number entered will stored in number and compared to largest to gauge if it's  the largest or not

*/

public class lrgstnumber 
{

    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number =  0;
        int largest = 0;

        while (count <= 10)
        {
    
            System.out.println("Enter a number: ");
            number = input.nextInt();
            count++;
            if (number > largest)
            {
                largest = number;
            }
        }
        System.out.printf("\nlargest number was %d\n",largest);
        input.close();

    }
    
}
