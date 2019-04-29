package kebunit.corelib;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Sabituddin Bigbang";
        e.address = "Jakarta, Indonesia";
        e.SSN = 128319381;
        e.phoneNumber = "10283018321038";
        e.printEmployeeInfo();
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

}


class Employee implements Serializable {
    private static final long serialVersionUID = 1234252L;
    public String name;
    public String address;
    public transient int SSN;
    public String phoneNumber;

    public void printEmployeeInfo() {
        System.out.println("Nama   : "+ name);
        System.out.println("Alamat : "+ address);
        System.out.println("SSN    : "+ SSN);
        System.out.println("Nomor  : "+ phoneNumber);
    }
}
