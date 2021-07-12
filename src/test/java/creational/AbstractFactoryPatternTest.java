package creational;

import creational.abstractfactory.FactoryProducer;
import creational.abstractfactory.color.Color;
import creational.abstractfactory.factory.AbstractFactory;
import creational.abstractfactory.shape.Shape;
import org.junit.Test;

/**
 * @author Jonny Long
 * @date 2021/3/26 10:09
 */
public class AbstractFactoryPatternTest {
    @Test
    public void abstractFactoryPatternTest(){
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        try{
            Shape shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();
            Shape shape2 = shapeFactory.getShape("RECTANGLE");
            shape2.draw();
            Shape shape3 = shapeFactory.getShape("SQUARE");
            shape3.draw();
            //获取颜色工厂
            AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
            Color color1 = colorFactory.getColor("RED");
            color1.fill();
            Color color2 = colorFactory.getColor("YELLOW");
            color2.fill();
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }
}
