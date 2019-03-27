import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        final double MILES = 1.852;
        final double KILOMETERS = 1.150779;
        System.out.println("Please enter the nautical miles.");
        double nauticalMiles = myObj.nextDouble();
        double calculatedMiles = nauticalMiles*MILES;
        double calculatedKilometer = nauticalMiles*KILOMETERS;
        System.out.println(nauticalMiles+" Nautical miles is equal to "+calculatedMiles +" and "+calculatedKilometer);
    }
}
