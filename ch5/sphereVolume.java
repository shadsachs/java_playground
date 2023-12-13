import java.util.Scanner;


//  this program calculates the volume of a sphere based on the radius entered by user 


public class sphereVolume {



    public  static double sphereVol(double radius){

        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);

        return volume;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of a sphere as a double: ");
        double radius =  input.nextDouble();

        System.out.printf("Volume of the sphere based on the radius:%.2f is: %.2f\n",radius, sphereVol(radius));

        input.close();

    }
}
