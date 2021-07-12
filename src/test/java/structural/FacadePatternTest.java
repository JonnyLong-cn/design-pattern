package structural;

import org.junit.Test;
import structural.facade.ShapeMaker;

/**
 * @author Jonny Long
 * @date 2021/3/26 19:21
 */
public class FacadePatternTest {
    @Test
    public void facadePatternTest(){
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
