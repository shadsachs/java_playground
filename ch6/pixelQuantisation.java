

import java.util.Arrays;
import java.util.ArrayList;

/* thiis program uses a one dimentaiion-array to solve the following problems:

1 -  perform basic compression on an  iimage 

2 -  only be operating on  a sinigle row of the image  &  piixels are represented as simple numbers 

3  - quantise the values of the pixeels iin a row 

4 - any pixel values appearing iin a range wiill assume a value in that range

*/

public class pixelQuantisation 
{

    public static void main(String[] args) 
    {

        int [] testArray = {12,34,55,79,80,34,6,5,34,567,34,76,4,2,6,8};

        int [] array2 = new int [30];

        //quantise(testArray);

        for(int counter = 0; counter <21; counter++)
        {
            try
            {
                int [] bestScores = new int[10]; 
                array2[counter] = 20;
                array2[counter] *=2;
                System.out.println(bestScores[counter]);
            }
            catch(ArrayIndexOutOfBoundsException exception)
            {
                System.out.println(exception);
            }
            
        }

        System.out.println(Arrays.toString(array2));

        
    }


    public static void quantise(int[] array)
    {
        for (int counter = 0; counter <array.length; counter++)
        {
            if(array[counter]>= 0 & array[counter] <= 20)
            {
                array[counter] = 10;
            }

            if(array[counter]>= 21 & array[counter] <= 40)
            {
                array[counter] = 30;
            }

            if(array[counter]>= 41 & array[counter] <= 60)
            {
                array[counter] = 50;
            }

            if(array[counter]>= 61 & array[counter] <= 80)
            {
                array[counter] = 70;
            }

            if(array[counter]>= 81 & array[counter] <= 100)
            {
                array[counter] = 90;
            }

            if(array[counter]>= 101 & array[counter] <= 120)
            {
                array[counter] = 110;
            }

            if(array[counter]>= 121 & array[counter] <= 140)
            {
                array[counter] = 130;
            }

            if(array[counter]>= 141 & array[counter] <= 160)
            {
                array[counter] = 150;
            }

            if(array[counter]>= 161 & array[counter] <= 180)
            {
                array[counter] = 170;
            }

            if(array[counter]>=181){array[counter]=190;}

            //System.out.print("\n "+ array[counter]+ "\n");
        }

        System.out.println(Arrays.toString(array));

    }




    
}
