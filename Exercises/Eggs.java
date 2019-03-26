import java.util.Scanner;

public class Eggs {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of eggs you want.");
        int eggsNeeded = myObj.nextInt();
        int eggsInDozen = eggsNeeded/12;
        int extraEggs = eggsNeeded%12;
        double pricePerDozen = 3.25;
        double pricePerEgg = 45.0;
        double total = (eggsInDozen*pricePerDozen)+(extraEggs*pricePerEgg/100);
        System.out.println("You ordered " + eggsNeeded);
        System.out.println("That's "+eggsInDozen+" dozen at $"+pricePerDozen+" per dozen and "+
                            extraEggs+" loose eggss at "+pricePerEgg+ " cents each for a total of $"+ total);
    }
}
