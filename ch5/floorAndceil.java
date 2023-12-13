import java.util.Scanner;

// this program creates my own ceiling and floor methods



public class floorAndceil 
{

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a positive integer:  ");
    double number = input.nextDouble();

    System.out.printf("%nMy floor of %.2f is:  %.2f%n", number, myFloor(number));

    System.out.printf("%nMy ceiling of %.2f is:  %.2f%n", number, myCeiling(number));

    input.close();
}

public static double myFloor(double number)
{
    double floor =((int)  number); /// casts a double as an  int, thus truncating it and going to the floor integer. 
    return floor;
}


public static double myCeiling(double number)
{

    if ((int) number < number)
    {
        double ceiling = number + 1;
        ceiling = (int) ceiling;

        return ceiling;
    }

    else 
    {
        double ceiling = ((int) number);
        return ceiling;
    }
}
    
}
