package creational.abstractfactory;

import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.factory.ColorFactory;
import creational.abstractfactory.factory.ShapeFactory;

/**
 * @author Jonny Long
 * @date 2021/3/26 10:06
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
