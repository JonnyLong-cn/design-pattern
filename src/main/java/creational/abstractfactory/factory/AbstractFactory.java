package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:47
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shapeType) ;
}
