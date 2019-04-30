package kebunit.collection;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    // class member
    private Enumeration<String> days;
    private Vector<String> dayName;

    // constructor
    public EnumerationExample() {
        dayName = new Vector<String>();
        dayName.add("Sunday");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        dayName.add("Friday");
        dayName.add("Saturday");
        days = dayName.elements();
    }

    // method
    public void printDays() {
        while(days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }

    // Main Application Test
    public static void main(String[] args) {
        EnumerationExample EE = new EnumerationExample();
        EE.printDays();

    }

}