package kebunit.designpattern.creational.singleton;

public class MainApps {
    public static void main(String[] args) {
        MainWindow object = MainWindow.getInstance();
        object.showMessage();
    }
}
