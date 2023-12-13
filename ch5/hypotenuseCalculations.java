import java.util.Scanner;


public class hypotenuseCalculations 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter one side of your right angled triangle: ");
        double side1 = input.nextDouble();

        System.out.println("Please enter the second side of your right angled triangle: ");
        double side2 = input.nextDouble();


        System.out.printf("Hypotenuse of the right angled triangle with side1 of:%.2f and side2 of:%.2f is: %.2f%n", side1, side2, hypotenuse(side1, side2));
        

        input.close();
    }


    public static double hypotenuse(double side1, double side2)
    {
        double hypotenuse = Math.hypot(side1,side2);
        return hypotenuse;
    }
    
}
