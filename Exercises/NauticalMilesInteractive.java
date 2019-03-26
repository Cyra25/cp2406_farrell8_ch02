import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        double miles = 1.852;
        double kilometers = 1.150779;
        System.out.println("Please enter the nautical miles.");
        double nauticalMiles = myObj.nextDouble();
        double calculatedMiles = nauticalMiles*miles;
        double calculatedKilometer = nauticalMiles*kilometers;
        System.out.println(nauticalMiles+" Nautical miles is equal to "+calculatedMiles +" and "+calculatedKilometer);
    }
}
