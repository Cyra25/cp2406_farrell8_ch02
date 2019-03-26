import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int inchesInFeet = 12;
        System.out.println("Please enter the length in inches.");
        int length = myObj.nextInt();
        int inches = length%inchesInFeet;
        int feet = length/inchesInFeet;
        System.out.println(length + " inches equal to "+feet+" feet and "+inches+" inches.");
    }
}
