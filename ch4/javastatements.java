package ch4;

public class javastatements {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        //int sum = 0;
        for (;count <100; count +=2){
            sum += count;
        }
        System.out.print("\n\n\n\n");
        System.out.println(sum);
        System.out.print("\n\n\n\n");


        double power = Math.pow(2.5,3);

        System.out.println(power);
        System.out.print("\n\n\n");

        int i = 1;
        while (i < 21){

            if  ((i%5) == 0)
            {
                System.out.print(i + " \n");
            }
            else
            {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.print("\nUsing for statement to print 1 - 20 \n");
        for (int ic = 1; ic <= 20; ic++)
        {
            if ((ic % 5 ) == 0)
            {
                System.out.print(ic + " \n");
            }
            else
            {
                System.out.print(ic + " \t");
            }
        }
    }
    
}
