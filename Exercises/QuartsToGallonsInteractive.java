import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        final int QUARTS_IN_GALLON = 4;
        System.out.println("Please enter the number of quarts needed for painting.");
        int quartsNeeded = myObj.nextInt();
        int requireGallon = quartsNeeded / QUARTS_IN_GALLON;
        int requireQuarts = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs "+ quartsNeeded+ " quarts requires "+ requireGallon+ " gallons plus "+ requireQuarts+ " quarts.");
    }
}
