package kebunit.designpattern.creational.abstractfactory;

import kebunit.designpattern.creational.factory.Circle;
import kebunit.designpattern.creational.factory.Rectangle;
import kebunit.designpattern.creational.factory.Shape;
import kebunit.designpattern.creational.factory.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    Printer getPrinter(String type) {
        return null;
    }

    @Override
    Shape getShape(String shapeType) {
        if( shapeType == null) {
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }


}
