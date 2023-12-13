package ch3;

public class tabularOutput {

    public static void main(String[] args) {

        int count = 1;

        while(count<= 5)
        {
            System.out.printf("%d  %d  %d  %d\n",(count), (count*count),(count*count*count),(count*count*count*count));
            count++;
        }
        
    }
    
}
