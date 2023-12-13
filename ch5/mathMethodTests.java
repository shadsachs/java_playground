import java.util.Scanner;

public class mathMethodTests 
{
    static  Scanner input = new Scanner(System.in);

    public static void main(String[] args) 
    {
    
        System.out.println("Enter a value for x: ");
        int x = input.nextInt();

        System.out.println("Enter a value for y: ");
        int y = input.nextInt();

        System.out.printf("Abs value of x  is %d%n",Math.abs(x));
        
        System.out.printf("Ceiling value of x is %f%n",Math.ceil(x));

        System.out.printf("Cos value of x  is %f%n",Math.cos(x));

        System.out.printf("exp value of x  is %f%n",Math.exp(x));

        System.out.printf("Floor value of x  is %f%n",Math.floor(x));

        System.out.printf("Log value of x  is %f%n",Math.log(x));

        System.out.printf("max value of x and y is %d%n",Math.max(x,y));

        System.out.printf("Pow value of x and y  is %f%n",Math.pow(x,y));

        System.out.printf("sin value of x  is %f%n",Math.sin(x));

        System.out.printf("sqrt value of x  is %f%n",Math.sqrt(x));

        System.out.printf("Tan value of x  is %f%n",Math.tan(x));

    }
    
}
