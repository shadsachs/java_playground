

import java.security.SecureRandom;

public class rollingDie 
{

    public static void main(String[] args) 
    {
        SecureRandom randomValue = new SecureRandom(); // random numbers object to product random numbers 

        int frequence1 = 0; //dice face is 1
        int frequence2 = 0; //dice face is 2
        int frequence3 = 0; //dice face is 3
        int frequence4 = 0; //dice face is 4
        int frequence5 = 0; //dice face is 5
        int frequence6 = 0; //dice face is 6

        // roll dice 60'000'000 times and count the times each face shows 

        for(int counter=1;counter<= 60_000_000;counter++)
        {
            int face  = 1 + randomValue.nextInt(6); // generate a random number from 1-6

            switch (face) 
            {
                case 1:
                    frequence1++;
                    break;
                case 2:
                    frequence2++;
                    break;
                case 3:
                    frequence3++;
                    break;
                case 4:
                    frequence4++;
                    break;
                case 5:
                    frequence5++;
                    break;
                case 6:
                    frequence6++;
                    break;
                default:
                    break;
            }

        }

        System.out.printf("Face\tFrequency\n");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequence1, frequence2,frequence3, frequence4, frequence5, frequence6);

    }
    
}
