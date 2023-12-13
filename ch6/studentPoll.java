public class studentPoll 
{

    public static void main(String[] args) 
    {

        //student reponse array 
                        //  0 1 2 3 4 5 6 7 8 9 10 
        int [] responses = {1,2,3,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14}; // initialised array

        int [] frequency = new int[6]; // array of frequency counters 

        // for  each answer,  select responses element, and use the value as 'frequency' index ie.. frequency[responses[i]] to determine element to increment

        for (int answer = 0; answer < responses.length; answer++)
        {
            try
            {
                ++frequency[responses[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e); // invokes  toString method 
                System.out.printf("   responses[%d] = %d%n%n",answer, responses[answer]);
            }
        }
        
        System.out.printf("%s%10s%n","Rating","Frequency");

        //  out put for each array element's value

        for(int rating = 1; rating < frequency.length; rating++)
        {
            System.out.printf("%6d%10d%n", rating,frequency[rating]);
        }
        
    }
    
}
