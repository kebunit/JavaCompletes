package kebunit.designpattern.creational.singleton;

public class MainApps {
    public static void main(String[] args) {
        HelloGreetings object = HelloGreetings.getInstance();
        object.showMessage("Morning Guys!!!");

        // or

        HelloGreetings.getInstance().showMessage("Welcome Everybody");
    }
}
