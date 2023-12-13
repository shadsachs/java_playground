/* 
This application inputs 10 numbers, each between 10 -> 100, inclusive.
save each number in an initialised array; 
display the array;
process the array, remove duplicates. 
display the array;
*/

import java.util.Scanner;

import java.util.ArrayList;



public class duplicateElimination 
{

    Scanner input = new Scanner (System.in);

    public static void main(String[] args) 
    {
        //noDuplicates();
        int [][]lst = new int [20][12];
        table(lst);
    }


    public static void noDuplicates()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); 
        Scanner input = new Scanner (System.in);

        
        for (int counter = 1;counter <10;counter++)
        {
            System.out.println("Please enter a number: ");
             numbers.add(input.nextInt());
        }

        for(int i=0;i < numbers.size();i++)
        {
            for(int j=1;  j < numbers.size();j++)
            {
                if(numbers.get(i) == numbers.get(j))
                {
                    numbers.remove(j); /// remove duplicate values 
                }
            }
        }
        System.out.println("\n"+numbers+"\n");
    }

    public static void table(int[][] array)
    {
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array.length;col++)
            {
                System.out.print(array[row][col]);
            }
        }
    }
}
