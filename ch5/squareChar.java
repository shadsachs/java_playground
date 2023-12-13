import java.util.Scanner; 

public class squareChar 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character:  ");
        char x = input.next().charAt(0);

        System.out.println("Enter an integer:  ");
        int y = input.nextInt();

        printSquare(x, y);
        
        input.close();
    }

    public static void printSquare(char x, int y)
    {
        for(int counter = 1; counter <= y; counter++)
        {
            for (int cols = 1; cols <=y; cols++)
            {
                System.out.print(x+" ");

            }
            System.out.println();
        }

    }
}
