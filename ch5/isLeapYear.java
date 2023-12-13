import java.util.Scanner; 

public class isLeapYear 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:  ");
        int year = input.nextInt();

        leapYearCalculation(year);
        
        input.close();
    }

    public static void leapYearCalculation(int year)
    {

        if(((year % 4) == 0) && ((year%100) != 0))
        {
            System.out.printf("Year %d is a leap year\n", year);
        }

        else if (((year%4)==0)&&((year%100) != 0)&&((year%400) != 0))
        {
            System.out.printf("Year %d is a leap year\n", year);
        }

        else
        {
            System.out.printf("Year %d is a NOT leap year\n", year);

        }
    }



    
}
