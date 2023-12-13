package ch4;

public class integersbythree 
{
    public static void main(String[] args) 
    
    {
        int sum = 0;
        
        for (int counter = 1; counter <=30;counter++)
        {
            
            if (counter % 3 == 0)
            {
                System.out.println(counter);
                sum += counter;
            }

        }
        System.out.printf("\nSum of integers divisible by 3 is %d\n", sum);
    }

}
