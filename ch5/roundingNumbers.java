import  java.util.Scanner;



public class roundingNumbers {


    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        double number = input.nextDouble();

        System.out.printf("The original number entered was: %.2f%n", number);

        System.out.printf("The number rounded to an integer is: %.2f%n", roundToInteger(number));

        System.out.printf("The number rounded to an Tenths is: %.2f%n", roundToTenths(number));

        System.out.printf("The number rounded to an Hundreths is: %.2f%n", roundToHundreths(number));

        System.out.printf("The number rounded to an Thousandths is: %.2f%n", roundToThousandths(number));

        input.close();

    }


    public static double roundToInteger(double number)
    {
        double y = Math.floor(number);
        return y;
    }
    


    public static double roundToTenths(double number)
    {
        double y = Math.floor(number + .5)/ 10;
        return y;
    }

    public static double roundToHundreths(double number)
    {
        double y = Math.floor(number + .5)/100;
        return y;

    }

    public static double roundToThousandths(double number)
    {
        double y = Math.floor(number + .5)/1000;
        return y;

    }

}
