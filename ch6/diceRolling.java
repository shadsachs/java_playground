/*
This program simulates the rolling of two dice  and uses the secure random class to roll one dice and then another dice. 
The program then sums the value of the two rolls. 
The di should be rolled 36,000,000 times
Use a a one-dimensional array to keep track of the scores
*/


import java.security.SecureRandom;

public class diceRolling 
{
	public static void main (String[] args) 
	{
        rollDice();
	
	}

	public static void rollDice()
	{
		// create a new SecureRandom object 
		SecureRandom random = new SecureRandom();
		
		final int ROLL_AMOUNT = 36_000_000;

        // create a tabular grid to display the occurrence of each combination 
        int[][] grid = new int[7][7];

        // create a one-dimensional array to display  the frequency of each option
        int [] frequency = new int[13];

		// loop to get the value of the dice 36,000,000 times	
		for(int counter= 1; counter <= ROLL_AMOUNT; counter++)
		{	

		 	// generate the two dice rolls 
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			
			//sum up the two dice rolls
			int sum = dice1 + dice2;

            // increment the correct frequency counter
            frequency[sum]++;


            //increment appropriate tabular counter for combination
            grid[dice1][dice2]++;
		}

        System.out.printf("\nValues in frequency counter are:\n\n");

        // print numbers 1 to 12 for column headers for frequency

        for(int printer = 1; printer <= 12; printer++)
        {
            System.out.printf("%10d ", printer);
        }

        System.out.println();
        System.out.println();

        // loop to display the frequence of a sum
        for(int counter = 1; counter < frequency.length;counter++)
        {
            System.out.printf("%10d  ", frequency[counter]);
        }

        System.out.println();
        System.out.println();

        System.out.printf("\nValues in our grid are:\n");

        // loop to display frequency counter
        for(int row = 1; row < grid.length;row++) // loops through arrays rows 
        {
            // loop through array's columns 
            for(int column = 1; column < grid[row].length;column++)
            {
                System.out.printf("%d  ", grid[row][column]);
            }
            System.out.println();
        }
	}


}
