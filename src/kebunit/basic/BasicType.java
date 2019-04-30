package kebunit.basic;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

public class BasicType {
    // class member
    private char iniChar;
    private String iniString;

    private int iniInteger;
    private long iniLong;

    private float iniFloat;
    private double iniDouble;

    // constructor
    public BasicType() {
        // karakter
        iniChar = 'A';

        // text
        iniString = "Sabituddin Bigbang";

        // bilangan bulat
        iniInteger = 123; // 32-bit
        iniLong = 123456; // 64-bit

        // bilangan desimal
        iniFloat = 123.888f;  // 32-bit
        iniDouble = 123456.789; // 64-bit
    }

    // method
    public void printAllMember() {
        System.out.println(iniChar + " | " + iniString + " | " + iniInteger +
                " | " + iniLong + " | " + iniFloat + " | " + iniDouble);
    }

    public static void main(String[] args) {
        BasicType tipeDasar = new BasicType();
        tipeDasar.printAllMember();
    }

}