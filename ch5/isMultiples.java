import java.util.Scanner;



public class isMultiples 
{

    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first integer: ");
        int x = input.nextInt();

        System.out.println("Please enter the second integer: ");
        int y = input.nextInt();


        System.out.printf("Are the pairs #1: %d  and #2: %d pairs?: %s  ", x, y, multiple(x, y));
        

        input.close();
    }

    public static boolean multiple(int x, int y)
    { 
       if (x  >= y)
       {
           int multiples = x%y;

           if(multiples == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        else
        {
            int multiples = y%x;
            if (multiples==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }   
}
