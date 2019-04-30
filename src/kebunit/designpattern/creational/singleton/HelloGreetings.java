package kebunit.designpattern.creational.singleton;

public class HelloGreetings {
    private static HelloGreetings instance = new HelloGreetings();

    private HelloGreetings() {}

    public static HelloGreetings getInstance() {
        return instance;
    }

    public void showMessage(String text) {
        System.out.println(text);
    }

}
