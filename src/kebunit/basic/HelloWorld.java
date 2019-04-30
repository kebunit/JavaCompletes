package kebunit.basic;

/**
 *
 * @author Sabituddin Bigbang
 * @since 2019
 *
 */

public class HelloWorld {
    // member of class
    private String message;

    // constructor
    public HelloWorld(String message) {
        this.message = message;
    }

    // getter
    public String getMessage() {
        return message;
    }

    // setter
    public void setMessage(String message) {
        this.message = message;
    }

    // behavior of object | methods
    public void printMessage() {
        System.out.println("Message : "+ message);
    }

    // Main Apps --> for test only
    public static void main(String agrs[]) {
        HelloWorld helloWorld = new HelloWorld("Welcome everybody!");
        helloWorld.printMessage();
    }
}
