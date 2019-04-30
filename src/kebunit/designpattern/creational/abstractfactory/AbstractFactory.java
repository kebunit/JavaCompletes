package kebunit.designpattern.creational.abstractfactory;

import kebunit.designpattern.creational.factory.Shape;

public abstract class AbstractFactory {
    abstract Printer getPrinter(String type);
    abstract Shape getShape(String shape);
}