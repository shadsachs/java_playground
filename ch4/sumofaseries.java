package ch4;

import java.util.Scanner;

/*
 This program seeks to find the summation of the sequence of numbers 1,2,3,...n where n can range from 0-100.

 use type long.

 display 

*/
public class sumofaseries {

    public static void main(String[] args) {

        long sum = 0;
        Scanner input = new Scanner(System.in);

        //loop until user wants to exit the summation series printer
        while(input.hasNext()){
            
            System.out.print("\nEnter value for 'n': "); //user prompt
            int n = input.nextInt(); //input  for n  to sum series 

            for (int counter = 0; counter<= n; counter++)
            {
                sum += counter;
            }
            
            System.out.printf("\nsum of series to value of n = %d = %d\n",n,sum);
            sum = 0;
        }
        input.close();
    }
}
