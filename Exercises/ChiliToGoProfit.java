import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        double adultChili = 4.35;
        double childChili = 3.10;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of adult meal you want");
        int numOfAdultMeal = myObj.nextInt();
        System.out.println("Please enter the number of child's meal you want.");
        int numOfChildMeal = myObj.nextInt();
        double priceAdult = adultChili * numOfAdultMeal;
        double priceChild = childChili * numOfChildMeal;
        double profit = priceAdult + priceChild;
        System.out.println("Cost for adult meal is $" + priceAdult);
        System.out.println("Cost for child's meal is $" + priceChild);
        System.out.println("Total is $" + profit);
    }
}