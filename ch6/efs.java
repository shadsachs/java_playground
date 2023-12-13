public class efs 
{

    public static void main(String[] args) 
    {
        if(args.length!=5)
        {
            System.out.println("Error! Please enter a five arguments");
        }

        else
        {
            int max = 0;
            int min = Integer.parseInt(args[0]);

            int[] array = {Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4])};


            for(int number : array)
            {
                System.out.print("\n"+number+"\n");

                if(number >= min)
                {
                    if(number > max)
                    {
                        max = number;
                    }
                }
                if(number < max)
                {
                    if(number<=min)
                    {
                        min = number;
                    }
                }
            }

            System.out.printf("%nMax = %d and min = %d%n", max, min);

        }
        
    }
    
}
