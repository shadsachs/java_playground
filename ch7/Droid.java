/*

1 - this is a robot which will have the states of  a name and a battery level

2 - and will be able to perform a task and also report battery level 
*/

public class Droid {

    int batteryLevel;
    String name;

    // constructor 
    public Droid(String droidName){

        name = droidName;

        batteryLevel = 100; 

    }

    //to string method for an informative presentation of the class 
    public String toString(){

        String hello = "\nHello my name is " + name + " nice to e-meet you! \n";

        return hello;
    }

    public void performTask(String task){

        System.out.println("\nHello I'm Droid: " + name +"!" + " and I am now performing task: " + task +"!\n");

        batteryLevel -= 10;

    }

    public void energyReport(){
    
        System.out.println("Battery update:\nmy battery level is now: " + batteryLevel + " Phew!\n");

    }

    public void energyTransfer(Droid a, Droid b){

        int batteryA = a.batteryLevel; 
        int batteryB = b.batteryLevel; 

        a.batteryLevel = batteryB;

        b.batteryLevel = batteryA; 

        System.out.println("Droid: " + a.name + " has transferred energy with Droid: " + b.name + 
        ".\n Droid: " + a.name + " now has a battery level of: " + a.batteryLevel + 
        "\nDroid: " + b.name + " now has a battery level of: " + b.batteryLevel+ "\n"); 
    }


    //main function
    public static void main(String[] args){

        // droid object named "Codey"
        Droid Codey = new Droid("Codey");

        System.out.println(Codey);

        Codey.performTask("Dancing in the goonlight");

        Codey.energyReport();

        Droid Shad = new Droid("Shad");

        Shad.energyReport();

        // swapping energy levels between Shad and Codey 
        Shad.energyTransfer(Shad, Codey);

    }

}
