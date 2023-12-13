package ch3;

/* 

This application determines the total ttax for each of three citizens 

Tax rate is 15% for earnings up to 30000 USD 

For earnings from 30000 up it's 20%. 

This program will take inputs for citizens and their earnings and determine  the correct tax rate for them

*/

import java.util.Scanner;

public class taxCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        //take name of first citizen 
        System.out.print("Enter Name of Citizen: ");
        String firstName = input.nextLine();
        //take earnings first citizen

        System.out.print("Enter annual earnings of citizen: ");
        double firstEarnings = input.nextDouble();
        
        // take second name
        System.out.print("Enter Name of Second Citizen: ");
        String secondName = input.next();

        //take earnings second citizen

        System.out.print("Enter annual earnings of Second citizen: ");
        double secondEarnings = input.nextDouble();

        System.out.print("Enter Name of third Citizen: ");
        String thirdName = input.next();

        //take earnings third citizen

        System.out.print("Enter annual earnings of third citizen: ");
        double thirdEarnings = input.nextDouble();

        //calculate tax band 

        if (firstEarnings  <=  30000.00)
        {
            double firstTax = firstEarnings * 0.15;
            System.out.printf("\nTotal tax for %s user is %.2f  based on earnings of %.2f",firstName ,firstTax, firstEarnings);

        }
        else
        {
            double firstTax = ((firstEarnings - 30000)*0.2) + (30000*0.15);
            System.out.printf("\nTotal tax for %s is %.2f  based on earnings of %.2f",firstName, firstTax, firstEarnings);

        }

        //  second user tax band 

        if (secondEarnings  <=  30000.00)
        {
            double secondTax = secondEarnings * 0.15;
            System.out.printf("\nTotal tax for  %s  is %.2f  based on earnings of %.2f",secondName, secondTax, secondEarnings);

        }
        else
        {
            double secondTax = ((secondEarnings - 30000)*0.2) + (30000*0.15);
            System.out.printf("\nTotal tax for  %s is %.2f  based on earnings of %.2f",secondName, secondTax, secondEarnings);

        }

        //  third user tax band

        if (thirdEarnings  <=  30000.00)
        {
            double thirdTax = thirdEarnings * 0.15;
            System.out.printf("\nTotal tax for  %s is %.2f  based on earnings of %.2f",thirdName, thirdTax, thirdEarnings);

        }
        else
        {
            double thirdTax = ((thirdEarnings - 30000)*0.2) + (30000*0.15);
            System.out.printf("\nTotal tax for  %s is %.2f  based on earnings of %.2f",thirdName, thirdTax, thirdEarnings);

        }

        input.close();
    }
    
}
