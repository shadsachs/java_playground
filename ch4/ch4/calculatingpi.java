package ch4.ch4;

public class calculatingpi
{

    public static void main(String[] args) 
    {
        int counter = 3;
        float constant = 4;

        while(counter < 300000)
        {
                constant -= (constant/counter);
                System.out.println(constant);

                counter+=2;

                constant += (constant/counter);
                System.out.println(constant);
                
                counter  += 2; 
        }
    }   
}