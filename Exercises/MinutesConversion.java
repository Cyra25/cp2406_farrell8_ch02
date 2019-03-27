import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        double MINUTES = 60.0;
        double HOURS = 24.0;
        int numOfMinutes;
        double minsToHours, minsToDays;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the number of minutes.");
        numOfMinutes = myObj.nextInt();
        minsToHours = numOfMinutes/MINUTES;
        minsToDays = numOfMinutes/HOURS;
        System.out.println(numOfMinutes + " minutes equal to "+ minsToHours+" hours and "+ minsToDays+" days.");

    }
}
