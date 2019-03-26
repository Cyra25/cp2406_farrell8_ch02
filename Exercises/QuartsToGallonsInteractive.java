import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int quartsInGallon = 4;
        System.out.println("Please enter the number of quarts needed for painting.");
        int quartsNeeded = myObj.nextInt();
        int requireGallon = quartsNeeded/quartsInGallon;
        int requireQuarts = quartsNeeded%quartsInGallon;
        System.out.println("A job that needs "+ quartsNeeded+ " quarts requires "+ requireGallon+ " gallons plus "+ requireQuarts+ " quarts.");
    }
}
