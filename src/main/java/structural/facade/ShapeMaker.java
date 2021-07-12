package structural.facade;

import structural.facade.shape.Shape;
import structural.facade.shape.impl.Circle;
import structural.facade.shape.impl.Rectangle;
import structural.facade.shape.impl.Square;

/**
 * @author Jonny Long
 * @date 2021/3/26 19:20
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
