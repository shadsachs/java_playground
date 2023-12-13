import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // scanner object to accept inputs

        int total = 0; // initialising sum total of grades
        int gradeCounter = 1; // initialising grade counter to keep track of amount of grades entered. 

        while(gradeCounter <= 10){
            System.out.print("Please enter the next grade: "); // enter grade prompt
            int grade = input.nextInt();
            total += grade; // add grade to total amount 

            gradeCounter++;  // increment gradeCounter
        }

        int averageGrade = total/10; 

        System.out.printf("Total grade was %d ", total);
        System.out.printf("Average grade was %d ", averageGrade);

        input.close();

    }
    
}