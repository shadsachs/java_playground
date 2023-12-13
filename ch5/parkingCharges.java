/*
  1- parking garage charges  min 2.00 <= 3hrs parking

  2 - garage charges an additional 0.50c for every additional hour, or partial hour t >3 hours 

  3 - in  any  24hour  period,  maximum is 10.00,  no  car parks for more than 24hrs per day 

  4 - calculate and  display parking charges for each customer and display the charge. 
  
  program accepts  values for hours parked as a double

  program steps:

  --> take user input for hours parked;

  --> determine  if less than 3 but greater than 0; 

  --> greater than 3hrs <=  18


  --> determine equal to or greater than 19 since max charge is 10.00 per 24hrs; 


  --> determine additional hours after 3, if  any; 
*/

import java.util.Scanner;



public class parkingCharges 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter hours parked: ");
        double hours = Math.abs(input.nextDouble());


        System.out.printf("The charge for parking for %.2f hours  is: %.2f%n ", hours, calculateCharges(hours));


        input.close();
    }


    public static double calculateCharges(double hours)
    {

        double charges  = 0;

        if((hours) > 0 && (hours <= 3))
        {
            charges = 2.00;

            return charges;
        }

        if((hours>3.0) && (hours<= 18.0))
        {
            charges = 2.0 + ((Math.ceil(hours) -   3.0) * 0.5);

            return charges;
        }

        else
        {
            charges = 10.00;

            return  charges;
        }

    }

}
