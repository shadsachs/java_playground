/* this application simulates an automated reservation system. 

assigns seats for the capacity = 10

should allow a user to determine which class of seat they want, 1 - first class, 2 - economy 

seats 1- 5 = first class

seats 5 -10 = economy 

should display a boarding pass with seat number/ section / 

use a boolean array to indicate seat status; false for empty, true for occupied 

application should never assignt a seat that's already assigned 

if economy section full, ask user if they would like first class 

*/

import java.util.Scanner;
import java.security.SecureRandom;


public class airline {

    // scanner obvject for input 

    Scanner input = new Scanner(System.in);

    SecureRandom random = new SecureRandom();



    // main function
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of seats required");
        int seats = input.nextInt();

        System.out.println("Please enter the number of travelclass required by entering 1 or 2:");
        int travelClass = input.nextInt();

        assignSeat(travelClass, seats);

        input.close();

        
    }

    public static void assignSeat(int travelClass, int seats)
    {
    
    // number of seats available on the flight
    final int CAPACITY = 10;

    // empty seats counter
    int emptySeats = 0;
    
    // initialise amount of seats available on a flight to empty
    boolean [] seatStatus = new boolean[CAPACITY];


    // fill requested first class seats
    if(travelClass == 1 && seats <= 5)
    {
        for(int number = 0; number < seats; number ++)
        {
            if(seatStatus[number] == false)
            {
                seatStatus[number] = true;
            }
            else {System.out.println("seats are full!");}
        }
    }

    // fill requested economy seats
    if(travelClass == 2 && seats <= 5)
    {
        for(int number = 0; number < seats; number ++)
        {
            if(seatStatus[number] == false)
            {
                seatStatus[number] = true;
            }
            else {System.out.println("seats are full!");}
        }
    }

    // check for remaining seats
    for(int counter = 0; counter < CAPACITY; counter++)
    {
        if(seatStatus[counter]==false)
        {
            emptySeats++;
        }
    }

    System.out.printf("There are %d empty seats remaining\n\n", emptySeats);

    if(emptySeats > 0)
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of seats required");
        seats = input.nextInt();

        System.out.println("Please enter the number of travelclass required by entering 1 or 2:");
        travelClass = input.nextInt();

        
        if(travelClass == 1 && seats <= 5)
        {
            for(int number = 0; number < seats; number ++)
            {
                if(seatStatus[number] == false)
                {
                    seatStatus[number] = true;
                }
                else {System.out.println("seats are full!");}
            }
        }

        if(travelClass == 2 && seats <= 5)
        {
            for(int number = 0; number < seats; number ++)
            {
                if(seatStatus[number] == false)
                {
                    seatStatus[number] = true;
                }
                else {System.out.println("seats are full!");}
            }
        }

    }

    for(int counter = 0; counter < seatStatus.length; counter++)
    {
        System.out.println(seatStatus[counter]);
    }
    }
    
}
