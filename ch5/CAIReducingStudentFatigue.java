/*

this program augments /Users/shadsachikonye/Desktop/java_development/ch5/computerAssisstedInstruction.java by reduciinig student fatigure...
through varied responses. 

This will be done using a switch statement to determine which response to print 



*/


import java.security.SecureRandom; 
import java.util.Scanner;

public class CAIReducingStudentFatigue 
{

    public static void main(String[] args) 
    {
        askQuestion();
    }


    // method  to ask question

    public static void askQuestion()
    {
        SecureRandom randomNumber = new SecureRandom(); // secure random number generator object
        Scanner input = new Scanner(System.in); // scanner object to take inputs from user 

        int number1 = 1 + randomNumber.nextInt(9); // generate first number and initialise it to variable  
        int number2 = 1 + randomNumber.nextInt(9); // generate first number and initialise it to variable 
        int correctAnswer = number1 * number2;
        


        System.out.printf("What is %d multiplied by %d? or enter 0 to quit:  ",number1, number2);
        int userAnswer = input.nextInt();

        while(userAnswer != 0)
        {
            if (userAnswer  == correctAnswer)
            {

                int response =  1 + randomNumber.nextInt(4);

                switch(response)
                {
                    case 1:
                        System.out.println("\nVery  Good!\n");
                        break;
                    case 2:
                        System.out.println("\nExcellent\n");
                        break;
                    case 3:
                        System.out.println("\nNice Work\n");
                        break;
                    case 4:
                        System.out.println("\nKeep up the good work\n");
                        break;
                }

                System.out.println("\nReady for the next question?...\n");

                number1 = 1 + randomNumber.nextInt(9);
                number2 = 1 + randomNumber.nextInt(9);
                correctAnswer = number1 * number2;

                System.out.printf("What is %d multiplied by %d? or enter 0 to quit:  ",number1, number2);
                userAnswer = input.nextInt();


            }

            if (userAnswer != correctAnswer & userAnswer != 0)
            {
                int response =  1 + randomNumber.nextInt(4);

                switch(response)
                {
                    case 1:
                        System.out.println("No! Please try again! (or enter 0 to quit): ");
                        break;
                    case 2:
                        System.out.println("\nWrong Try Once More  (or enter 0 to quit): ");
                        break;
                    case 3:
                        System.out.println("\nDon't Give Up! (or enter 0 to quit): ");
                        break;
                    case 4:
                        System.out.println("\nNo! But, keep trying (or enter 0 to quit): ");
                        break;
                }
                userAnswer = input.nextInt();
            }
        }

        input.close();

    }

    
}
