public class NauticalMiles {
    public static void main(String[] args){
        final double MILES = 1.852;
        final double KILOMETERS = 1.150779;
        double nauticalMiles = 21;
        double calculatedMiles = nauticalMiles*MILES;
        double calculatedKilometer = nauticalMiles*KILOMETERS;
        System.out.println(nauticalMiles+" Nautical miles is equal to "+calculatedMiles +" and "+calculatedKilometer);
    }
}
