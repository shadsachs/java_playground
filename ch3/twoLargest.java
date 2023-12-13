package ch3;

import java.util.Scanner;

public class twoLargest {

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int largest = 0;
        int secondLargest = 0;

        while (count <= 10)
        {
            System.out.print("Enter a number:  ");
            int number = input.nextInt();

            if (number >= largest){

                secondLargest = largest;
                largest = number;
            }
            if (number < largest){
                
                if (number >= secondLargest){
                    secondLargest = number;
                }
            }
            count++;
        }
        System.out.printf("\nLargest number entered was %d and second largest number entered was %d\n", largest, secondLargest);

        input.close();
    }
    
}
