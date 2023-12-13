import java.util.Scanner;
import java.security.SecureRandom;

/* 
This program will help elementary school students learn multiplication.
 
1 - produce two random single digit integers using SecureRandom

2 - prompt the user to input an answer based on the two  inputs 

3 - check if the answer is correct

4 -  if correct "congrats, well done" ask another question

5 - if  incorrect print "this is incorrect, try again"

6 - create a method to ask the question

7 - check if the answer is  correct, if so, execute the question method again,  if incorrect, ask for another question.  

*/


public class computerAssisstedInstruction 
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
                
                System.out.println("Your  answer is correct!\n\n");
                System.out.println("Ready for the next question?...\n\n");

                number1 = 1 + randomNumber.nextInt(9);
                number2 = 1 + randomNumber.nextInt(9);
                correctAnswer = number1 * number2;

                System.out.printf("What is %d multiplied by %d? or enter 0 to quit:  ",number1, number2);
                userAnswer = input.nextInt();


            }

            if (userAnswer != correctAnswer & userAnswer != 0)
            {
                System.out.println("Your  answer is WRONG, try again! (or enter 0 to quit");
                userAnswer = input.nextInt();
            }
        }

        input.close();

    }

    
}
