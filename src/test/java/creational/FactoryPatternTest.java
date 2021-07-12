package creational;

import creational.factory.ShapeFactory;
import creational.factory.shape.Shape;
import org.junit.Test;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:32
 */
public class FactoryPatternTest {
    @Test
    public void factoryPatternTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
