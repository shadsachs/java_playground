import java.util.Scanner;


public class squareAsterisks 
{

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:  ");
        int x = input.nextInt();

        printSquare(x);
        
        input.close();
    }


    public static void printSquare(int x)
    {
        for(int counter =1;counter <= x; counter++)
        {
            for(int cols = 1;cols<=x;cols++)
            {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

}