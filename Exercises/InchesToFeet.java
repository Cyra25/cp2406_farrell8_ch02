public class InchesToFeet {
    public static void main(String[] args){
        int inchesInFeet = 12;
        int length = 23;
        int inches = length%inchesInFeet;
        int feet = length/inchesInFeet;
        System.out.println(length + " inches equal to "+feet+" feet and "+inches+" inches.");
    }
}
