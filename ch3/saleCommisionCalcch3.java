package ch3;

import java.util.Scanner;
/*
This application calculates the commission for a sale person based on how many items sold in the week. 

This will use sentinel controlled iteration to enter items sold and then take a percentage of commision from the total of sales 

*/


public class saleCommisionCalcch3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // scanner for accepting inputs 

        // item counts 

        int itemCount = 0;

        // sum of sales 
        int sumOfSales = 0;

        System.out.println("Enter sale value or 0 to quit: ");
        double saleValue = input.nextInt();

        while (saleValue != 0)
        {
            sumOfSales += saleValue;
            itemCount++;

            System.out.println("Enter sale value or 0 to quit: ");
            saleValue = input.nextInt();
        }

        if (sumOfSales > 0)
        {
            double commission = (sumOfSales * 0.09);

            double wage = commission + 200.00;

            System.out.printf("%nThe wage + Commision is %.2f and the seller made %d sales\n", wage, itemCount);
        }
        else
        {
            System.out.print("Nothing earned in commission,  wage is 200\n");
        }
        input.close();
    }
    
}
