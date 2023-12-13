package ch4;


/*
this application takes integers from user and determines the minimum and maximum

*/
import java.util.Scanner;

public class extremes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers you wish to compare: ");
        int looptimes = input.nextInt();

        int min = 1;
        int max = 0;

        for (int counter = 1; counter <= looptimes; counter++)
        {
            System.out.printf("Enter number %d: ", counter);
            int number = input.nextInt();

            if (counter == 1)
            {
                min = number;
                max = number;
            }

            if (number > max)
            {
                if (max <= min)
                {
                    min = max;
                }
                max = number;
            }

            if ((number <= max) && (number<= min))
            {
                min = number;
            }

        }
        System.out.printf("\n\n The min is %d and the max is %d\n\n", min, max);
        System.out.printf("\n\n The sum of the min and max is %d\n\n", (min +max));
        input.close();
    }
    
}
