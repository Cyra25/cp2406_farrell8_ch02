import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args){
        int MINUTES = 60;
        int HOURS = 24;
        int numOfMinutes, minsToHours, minsToDays;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter teh number of minutes.");
        numOfMinutes = myObj.nextInt();
        minsToHours = numOfMinutes/MINUTES;
        minsToDays = numOfMinutes/HOURS;
        System.out.println(numOfMinutes + " minutes equal to "+ minsToHours+" hours and "+ minsToDays+" days.");

    }
}
