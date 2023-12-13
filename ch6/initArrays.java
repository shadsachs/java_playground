
public class initArrays{

    public static void main(String[] args) 
    {
        
        int[] array = new int[10]; // creates an array object

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings 

        for (int counter =0; counter< array.length; counter++)
        {
            System.out.printf("%5d%8d%n",counter, array[counter]);
        }

        //  initialiser method for creatiing arrays which specifies the initial value for all the index positions 

        int [] arrayTwo = {10,11,12,13,14,15};

        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter < arrayTwo.length; counter++)
        {
            System.out.printf("%5d%8d%n",counter, arrayTwo[counter]);
        }

        int total = 0;

        for (int counter = 0; counter < arrayTwo.length; counter++)
        {
            total += arrayTwo[counter]; // adding array elements together 
        }

        System.out.printf("Total of arrayTwo: %d%n", total);
        

    }

}