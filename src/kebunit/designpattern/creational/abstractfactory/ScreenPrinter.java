package kebunit.designpattern.creational.abstractfactory;

public class ScreenPrinter implements Printer {

    @Override
    public void print() {
        System.out.println("screen");
    }

}
