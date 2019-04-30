package kebunit.designpattern.creational.abstractfactory;

import kebunit.designpattern.creational.factory.Shape;

public class MainApps {
    public static void main(String[] agrs){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory printerFactory = FactoryProducer.getFactory("printer");
        Printer printer1 = printerFactory.getPrinter("paper");
        printer1.print();
        Printer printer2 = printerFactory.getPrinter("web");
        printer2.print();
        Printer printer3 = printerFactory.getPrinter("screen");
        printer3.print();
    }

}

