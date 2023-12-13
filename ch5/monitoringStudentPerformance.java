import java.security.SecureRandom;
import java.util.Scanner;


/*
This program will ask the student ten questions and then calculate the student's percentage and then display a messge
based on their performance 10 questions
*/

public class monitoringStudentPerformance 
{
    public static void main(String[] args) 
    {
        askQuestion();
    }

    public static void askQuestion()
    {
        SecureRandom randomNumber = new SecureRandom(); // secure random number generator object
        Scanner input = new Scanner(System.in); // scanner object to take inputs from user 

        double correctCount =  0;
        double incorrectCount = 0;
        int count = 1;
        //double percentage = ((correctCount/(correctCount+incorrectCount))*100); // why  does this evaluate to zero at the end or NaN? - this  is due to scope issues and principles of least priviledge


        int number1 = 1 + randomNumber.nextInt(9); // generate first number and initialise it to variable  
        int number2 = 1 + randomNumber.nextInt(9); // generate first number and initialise it to variable 
        int correctAnswer = number1 * number2;
        


        System.out.printf("What is %d multiplied by %d? or enter 0 to quit:  ",number1, number2);
        int userAnswer = input.nextInt();

        while((userAnswer != 0) &  (count<=10))
        {
            if (userAnswer  == correctAnswer)
            {

                correctCount++;
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
                number1 = 1 + randomNumber.nextInt(9);
                number2 = 1 + randomNumber.nextInt(9);
                correctAnswer = number1 * number2;

                System.out.printf("What is %d multiplied by %d? or enter 0 to quit:  ",number1, number2);
                userAnswer = input.nextInt();
            }


            if (userAnswer != correctAnswer & userAnswer != 0)
            {
                incorrectCount++;
                int response =  1 + randomNumber.nextInt(4);

                switch(response)
                {
                    case 1:
                        System.out.println("No! Please try again! (or enter 0 to quit): ");
                        userAnswer = input.nextInt();
                        break;
                    case 2:
                        System.out.println("\nWrong Try Once More  (or enter 0 to quit): ");
                        userAnswer = input.nextInt();
                        break;
                    case 3:
                        System.out.println("\nDon't Give Up! (or enter 0 to quit): ");
                        userAnswer = input.nextInt();
                        break;
                    case 4:
                        System.out.println("\nNo! But, keep trying (or enter 0 to quit): ");
                        userAnswer = input.nextInt();
                        break;
                }
                
            }
            
            count++;
        }

        double percentage = ((correctCount/(correctCount+incorrectCount))*100); // due to principle of least priviledge this works

        if(percentage >= 75.0)
        
        {
            System.out.printf("Congrats you achieved %.2f you can proceed to the next  level\n", percentage);
        }
        else
        {
            System.out.printf("You were below the threshold, and you achieved %.2f please see your teacher.\n", percentage);
        }

        input.close();
    }

}
