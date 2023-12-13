package ch3;
import java.util.Scanner;

/*
This application inputs miles driven and gallons used as integers for each trip
the program will then  calculate and display miles per gallon
obtained for each trip uup to the point
All averaging calculations should produce floating-point results

*/


public class gasMileage 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner (System.in); //  obtains user input 

        int totalMiles = 0; // sum of miles travelled in total 
        int tripCounter = 0; // count of how many trips made
        int totalGallons = 0; //total gallons used in trips
        
        System.out.println("Enter miles driven: or 0 to quit");
        int miles = input.nextInt();

        System.out.println("Please enter gallons used: ");
        int gallons = input.nextInt();

        while (miles != 0) //iterates through so long as miles entered is not 0
        {
            totalMiles = totalMiles + miles;
            tripCounter  += 1;
            totalGallons  += gallons;

            System.out.println("Enter miles driven: or 0 to quit");
            miles = input.nextInt();

            System.out.println("Please enter gallons used: ");
            gallons = input.nextInt();

        }
        // termination phase 

        if (tripCounter > 0)
        {
            //calculate average miles per gallon

            double averageMPG =  (double) totalMiles / (double) totalGallons;

            //display total trip  metrics
            
            System.out.printf("%nTotal miles for trip was %d\n", totalMiles);
            System.out.printf("%nTotal trips made was %d\n", tripCounter);
            System.out.printf("%nAverage miles per gallon for trips was %.2f\n", averageMPG);
        }

        else 
        {
            System.out.printf("This trip  had 0 miles\n");
        }
        input.close();
    }

}