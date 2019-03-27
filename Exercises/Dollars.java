import java.util.Scanner;

public class Dollars {
    public static void main(String[] args){
        final int TWENTIES = 20;
        final int TENS = 10;
        final int FIVES = 5;
        final int ONES = 1;
        int dollars, twenties, amount, fives, tens, ones;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the amount of dollars you want to convert.");
        dollars = myObj.nextInt();
        twenties = dollars/TWENTIES;
        amount = dollars - (twenties * TWENTIES);
        tens = amount/TENS;
        amount = amount - (tens * TENS);
        fives = amount/FIVES;
        ones = amount - (fives * FIVES);
        System.out.println("20s - "+ twenties +"\n10s - "+tens+"\n5s - "+fives+"\n1s - "+ ones);


    }
}
