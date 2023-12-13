import java.util.Scanner;

public class divisibleBy5 
{



    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int counter = 1;

        for(;counter <=10;counter++)
        {
            System.out.printf("enter integer number %d:  ", counter);
            int x = input.nextInt();

            System.out.printf("Number:%d is %d and  is divisible by 5?: %s%n",  counter, x,divisibleByFive(x));
        }

    }

    public static boolean divisibleByFive(int x)
    {

        if(x >= 5)
        {
            int divisible = x % 5;

            if (divisible == 0) {return true;}

            else {return false;}
        }

        else{return false;}
    }
}

