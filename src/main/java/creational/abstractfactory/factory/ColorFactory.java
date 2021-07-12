package creational.abstractfactory.factory;

import creational.abstractfactory.color.Color;
import creational.abstractfactory.color.impl.Red;
import creational.abstractfactory.color.impl.Yellow;
import creational.abstractfactory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 10:05
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("YELLOW")){
            return new Yellow();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
