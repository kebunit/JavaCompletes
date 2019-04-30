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
        iniChar = 'A';
        iniString = "Sabituddin Bigbang";

        iniInteger = 123;
        iniLong = 123456;

        iniFloat = 123.888f;
        iniDouble = 123456.789;
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