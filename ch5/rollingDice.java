
import java.security.*;

/*
this program simulates 20 rolls of a 6 sided dice. 

*/

public class rollingDice{

    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom(); //creates a new random number instance 

        for (int  counter=1; counter<=20;counter++)
        {
        // creates random number by calling the randomNumber method from Secure Random, the number '6' 
        //is the scaling factor i.e. the amount of unique values that next Int should produce
        // the 1 is called a shifting value since a dice has numbers 1-6 and not 0-5 so adding the one initially increments all numbers by 1 i.e. 0 becomes 1. 
        // shifting values specifies the first value in  the desired range 

            int face = 1 + randomNumbers.nextInt(6); 

            System.out.printf("%d ", face);

            if(counter % 5 ==0){
                System.out.println();
            }

        }

    }


}