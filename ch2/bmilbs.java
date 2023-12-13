package ch2;

import java.util.Scanner;

public class bmilbs {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        int weighInLbs = input.nextInt();

        System.out.print("Enter your height in inches: ");
        int heightInInches = input.nextInt();
        
        int bmi = (weighInLbs * 703)/ (heightInInches*heightInInches);

        String underweight = "Below 18.5 = Underweight";
        String healthyWeight = "Between 18.5 and 24.9 is a healthy weight range";
        String overweight = "Between 25 and 29.9 is overweight";
        String obese  = "Between 30 and 39.9 is obese";

        System.out.printf("The BMI categories are as follows: %n %s%n%s%n%s%n%s%n", underweight,healthyWeight,overweight, obese);

        System.out.printf("Your BMI is %s%n", bmi);

        input.close();

    }
    
}
