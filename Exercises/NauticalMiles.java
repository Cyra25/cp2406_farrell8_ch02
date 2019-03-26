public class NauticalMiles {
    public static void main(String[] args){
        double miles = 1.852;
        double kilometers = 1.150779;
        double nauticalMiles = 21;
        double calculatedMiles = nauticalMiles*miles;
        double calculatedKilometer = nauticalMiles*kilometers;
        System.out.println(nauticalMiles+" Nautical miles is equal to "+calculatedMiles +" and "+calculatedKilometer);
    }
}
