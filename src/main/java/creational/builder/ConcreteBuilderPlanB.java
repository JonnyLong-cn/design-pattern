package creational.builder;

/**
 * @author Jonny Long
 * @date 2021/4/21 19:15
 * 构造和装配各种零件
 */
public class ConcreteBuilderPlanB implements Builder {
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("PlanB - 零件A");
    }

    @Override
    public void BuildPartB() {
        product.add("PlanB - 零件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
