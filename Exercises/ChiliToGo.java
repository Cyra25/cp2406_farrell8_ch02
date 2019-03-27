import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args){
        int adultChili = 7;
        int childChili = 4;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of adult meal you want");
        int numOfAdultMeal = myObj.nextInt();
        System.out.println("Please enter the number of child's meal you want.");
        int numOfChildMeal = myObj.nextInt();
        int priceAdult = adultChili * numOfAdultMeal;
        int priceChild = childChili * numOfChildMeal;
        int total = priceAdult + priceChild;
        System.out.println("Cost for adult meal is $"+ priceAdult);
        System.out.println("Cost for child's meal is $" + priceChild);
        System.out.println("Total is $"+ total);
    }
}
