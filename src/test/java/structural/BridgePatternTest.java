package structural;

import org.junit.Test;
import structural.bridge.color.impl.Blue;
import structural.bridge.color.impl.Red;
import structural.bridge.color.impl.Yellow;
import structural.bridge.shape.impl.Rectangle;
import structural.bridge.shape.impl.Round;
import structural.bridge.shape.impl.Triangle;

/**
 * @author Jonny Long
 * @date 2021/3/27 8:35
 */
public class BridgePatternTest {
    @Test
    public void bridgePatternTest(){
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new Red());
        rectangle.draw();

        Round round = new Round();
        round.setColor(new Yellow());
        round.draw();

        Triangle triangle = new Triangle();
        triangle.setColor(new Blue());
        triangle.draw();
    }
}
