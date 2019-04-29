package kebunit.basic;
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

        iniFloat = 123;
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