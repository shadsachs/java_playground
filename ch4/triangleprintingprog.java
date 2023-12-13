package ch4;

import java.util.Scanner;

/* 
This program disaplys traignle patters , separately. One below the other.

*/
public class triangleprintingprog {

    public static void main(String[] args) 
    {
        // scanner object to take user input 

        Scanner input = new  Scanner(System.in);

        // declare how many  rows the triangle should be 

        System.out.print("How many rows do you want: ");
        int rows = input.nextInt();

        // iterate per row and print a star  based on row number, i.e. row 1 should print one star, row 2 two stars 
        // print a right angle triangle whose base is equal to the number of useer specified rows
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j<= i; j++)
            {
                System.out.print("  *  ");
            }
            System.out.println();
        }
        System.out.print("\n");


        /// print an upside down right angled triangle whose base is equal to rows 
        for(int i = 1; i <= rows; i++)
        {

            for(int j = rows; j >= i; j--)
            {
                System.out.print("  *  ");
            }
            System.out.println();
        }

        // print an inverse upside down triangle 
        for(int i = 1; i <=  rows; i++)
        {
            for(int j = 1; j < i; j++)
            {
                System.out.print("     ");
            }
            for (int j = i; j <= rows; j++)
            {
                System.out.print("  *  ");
            }
            System.out.print("\n");

        }   
        for(int i = 1; i <=  rows; i++)
        {
            for(int j = rows; j > i ; j--)
            {
               System.out.print("     ");
            }
            for (int j = 1; j <=  i; j++)
            {
                System.out.print("  *  ");
            }
            System.out.print("\n");

        }
        input.close();
    }
}
