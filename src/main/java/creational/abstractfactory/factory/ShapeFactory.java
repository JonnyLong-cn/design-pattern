package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.impl.Circle;
import creational.abstractfactory.shape.impl.Rectangle;
import creational.abstractfactory.shape.impl.Square;
import creational.abstractfactory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:37
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
