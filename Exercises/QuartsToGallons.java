public class QuartsToGallons {
    public static void main(String[] args){
        int quartsInGallon = 4;
        int quartsNeeded = 18;
        int requireGallon = quartsNeeded/quartsInGallon;
        int requireQuarts = quartsNeeded%quartsInGallon;
        System.out.println("A job that needs "+ quartsNeeded+ " quarts requires "+ requireGallon+ " gallons plus "+ requireQuarts+ " quarts.");
    }
}
