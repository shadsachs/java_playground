package ch3;

public class calculateandprintch3 {

    public static void main(String[] args) {
        
        int counter = 1;

        int sum = 0;

        while (counter <=10){

            sum += counter;
            System.out.println(sum);
            System.out.printf("counter is %s\n", counter);
            counter++;
        }
    }
    
}
