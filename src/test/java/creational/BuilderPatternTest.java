package creational;

import creational.builder.ConcreteBuilderPlanA;
import creational.builder.ConcreteBuilderPlanB;
import creational.builder.Director;
import creational.builder.Product;
import org.junit.Test;

/**
 * @author Jonny Long
 * @date 2021/4/21 18:47
 */
public class BuilderPatternTest {
    @Test
    public void test(){
        Director director = new Director();
        ConcreteBuilderPlanA planA = new ConcreteBuilderPlanA();
        director.construct(planA);
        Product p1 = planA.getResult();
        p1.show();

        ConcreteBuilderPlanB planB = new ConcreteBuilderPlanB();
        director.construct(planB);
        Product p2 = planB.getResult();
        p2.show();
    }
}
