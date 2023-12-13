package ch4;

// this program takes in two inputs, the student's name and the corresponding grade 
// this will  need to store how many students got  what grade and then return the final result later

import java.util.Scanner; 

public class studentGrades
{

    public static void main(String[] args) 
    {
        //initialise scanner 
        Scanner input = new Scanner (System.in);

        int aCount = 0;
        int bCount = 0; 
        int cCount = 0; 
        int dCount = 0; 
        int eCount = 0; 

        String namesA =  "names with A: ";
        String namesB =  "names with B: ";
        String namesC =  "names with C: ";
        String namesD =  "names with D: ";
        String namesE =  "names with E: ";

        //describe how the program works via strings 
        System.out.printf("%s%n,%s%n","when prompted enter the student name", "followed by the student grade");
    
        //loop until there's no more inputs  as indicated by the end-of-file indicator
        while(aCount< 3)
        {
            //read student name
            String name = input.nextLine();
            System.out.print("Enter your student name: \n");
            //String name = input.nextLine();
            
            //read grade
            String grade = input.nextLine();
            System.out.print("Enter the student grade: \n");
            //String grade = input.nextLine();
            
            switch(grade)
            {
                case "A": aCount++; namesA =  namesA +" : "+ name; break;
                /* case "B":
                //     namesB = namesB + " : "+ name;
                //     bCount += 1;
                //     break;
                // case "C":
                //     namesC = namesC + " : "+ name;
                //     cCount += 1;
                //     break;
                // case "D":
                //     namesD = namesD  + " : "+ name;
                //     dCount += 1;
                //     break;
                // case "E":
                //     namesE = namesE + " : "+name;
                //     eCount += 1;
                //     break;// */
                default:
                    break;
            }
        }
        
        // display end on input grade report 

        System.out.printf("%n Grade report:%n %s : received A grades %n %s : received B grades %n %s : received C grades %n %s : received D grades %n %s : received E grades %n",namesA,namesB,namesC, namesD, namesE);
        input.close();
    }
    
}
