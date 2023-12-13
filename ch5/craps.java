
import java.security.SecureRandom;

public class craps {

        //create a secure random number generator
        private static final  SecureRandom randomNumbers = new SecureRandom();

        // ENUM type with constnats that represent game status
        private enum Status {CONTINUE,  WON, LOST}; // enum types declare a set of constants represented by identifiers

        // constants that represent common rolls of the dice
        private static final int SNAKE_EYES = 2;
        private static final int TREY = 3;
        private static final int SEVEN = 7;
        private static final int YO_ELEVEN = 11;
        private static final int BOX_CARS = 12;

        public static void main(String[] args) {

            int myPoint = 0; //point if no wins or losses
            Status gameStatus; // can contain CONTINUE,WIN,LOST

            int sumofDice = rollDice();

            // determine game status and point based on first roll

            switch(sumofDice)
            {

                case SEVEN: // SEVEN ON THE FIRST ROLL WINS
                case YO_ELEVEN: // win with 11 on first roll
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumofDice;
                    System.out.printf("Point is %d%n", myPoint);
                    break;
            }

            // while game is not complete
            while (gameStatus == Status.CONTINUE) 
            {// not won or lost
                sumofDice = rollDice(); // roll dice again

                // determine game status 
                if(sumofDice==myPoint) // win by making point
                {
                    gameStatus = Status.WON;
                }


                else // lose by rolling 7 before point 
                {
                    if(sumofDice==SEVEN)
                    {
                        gameStatus = Status.LOST;
                    }
                }
            }

            // display won or lost message 

            if (gameStatus == Status.WON)
            {
                System.out.println("Player Wins");
            }
            else
            {
                System.out.println("Player Loses");
            }

        }


        //  method rollDice simulates the rolling of two die. this method takes no arguments, and returns sum of dice eveytime it's rolled 
        public static int rollDice(){

            //pick random die values 

            int die1 = 1 + randomNumbers.nextInt(6); // first die roll
            int die2 = 1 + randomNumbers.nextInt(6); // second die roll

            int sum = die1 + die2;

            // display results of this roll

            System.out.printf("Player rolled %d +  %d = %d%n", die1,die2, sum);

            return sum;
        }
    
}
