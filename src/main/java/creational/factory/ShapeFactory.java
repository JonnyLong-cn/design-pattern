package creational.factory;

import creational.factory.shape.Shape;
import creational.factory.shape.impl.Circle;
import creational.factory.shape.impl.Rectangle;
import creational.factory.shape.impl.Square;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:37
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
