package ch4;

import java.util.Scanner;


public class barchartprint 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rows = input.nextInt();

        while (rows != 0)
        {
            for(int i= 1; i <= rows; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
            System.out.print("Enter a number or enter 0 to quit: ");
            rows = input.nextInt();
        }

        input.close();
    }



}
